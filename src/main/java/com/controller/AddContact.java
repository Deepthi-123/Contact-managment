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
 * Servlet implementation class AddContact
 */
@WebServlet("/AddContact")
public class AddContact extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AddContact() {
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
		String last = request.getParameter("Last_Name");
		
		Contacts contact = new Contacts();
		contact.setFirstName(first);
		contact.setLastName(last);
		
		DatabaseOperations db = new DatabaseOperations();
		db.addContact(contact);
		
	}

}
