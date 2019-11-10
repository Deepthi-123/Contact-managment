package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Operations.DatabaseOperations;
import com.contacts.Contacts;



/**
 * Servlet implementation class AddSearchFirst
 */
@WebServlet("/AddSearchFirst")
public class AddSearchFirst extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddSearchFirst() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
       String first = request.getParameter("First_Name");
		
       DatabaseOperations db = new DatabaseOperations();
       
       

       if(db.searchSuccess(first) != false) {
    	   
    	   DatabaseOperations.index = db.getIndexOfContact(first);
    	   request.getRequestDispatcher(request.getContextPath()+"/jsp/updateFamily.jsp")
           .forward(request, response);
			
       }else {
    	   response.getWriter().append("Contact unavailable!").append(request.getContextPath());
       }
	}

}
