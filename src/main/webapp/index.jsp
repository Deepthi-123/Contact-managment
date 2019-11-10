<!DOCTYPE html>
<html lang="en">
<head>
    <title>CONTACT MANAGEMENT</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
    <link href = "css/style.css" type = "text/css" rel = "stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</head>
<body >

<div class = "area">

<h1> Contact Management System </h1>

<h3 align = "center" style = "color: SlateBlue"> Manage all your contacts in one place with the Contact Management System!</h3>

<div class = "container" align = "center">

<div class ="row">


<div class = "col-md-2" style = "background-color: SlateBlue">


<!-- -------Create first dropdown  ------------>


<div class = "dropdown">
<button type = "button" class = "btn btn-one" data-toggle = "dropdown">Add a new Contact</button>
<div class = "dropdown-menu">
<pre>
    <a class="dropdown-item" href="jsp/family.jsp">Family</a>
    
    <a class="dropdown-item" href="jsp/Work.jsp">Work</a>
    
    <a class="dropdown-item" href="jsp/Friend.jsp">Friend</a>
    
    <a class="dropdown-item" href="jsp/Other.jsp">Other</a>
    
    </pre>
</div>
</div>
</div>



<div class = "col-md-1" style = "background-color: #0000000">

</div>
<div class = "col-md-2" style = "background-color: SlateBlue">

<!-- -------Create second dropdown  ------------>


<div class = "dropdown">
<button type = "button" class = "btn btn-secondary dropdown-toggle" data-toggle = "dropdown">Edit Contact Details</button>
<div class = "dropdown-menu">
<pre>
    <a class="dropdown-item" href="jsp/SearchFirst.jsp">Family</a>
    <a class="dropdown-item" href="#">Work</a>
    <a class="dropdown-item" href="#">Friend</a>
    <a class="dropdown-item" href="#">Other</a>
    </pre>
</div>
</div>
</div>
<div class = "col-md-1" style = "background-color: #0000000">
</div>


<div class = "col-md-2" style = "background-color: SlateBlue">


<!-- -------Create third dropdown  ------------>


<div class = "dropdown">
<button type = "button" class = "btn btn-three" data-toggle = "dropdown">Delete a Contact</button>
<div class = "dropdown-menu">
<pre>
    <a class="dropdown-item" href="jsp/DeleteContact.jsp">Family</a>
    <a class="dropdown-item" href="#">Work</a>
    <a class="dropdown-item" href="#">Friend</a>
    <a class="dropdown-item" href="#">Other</a>
    </pre>
</div>
</div>
</div>

<div class = "col-md-1" style = "background-color: #0000000">


</div>

<div class = "col-md-2" style = "background-color: SlateBlue">


<!-- -------Create fourth dropdown  ------------>


<div class = "dropdown">
<button type = "button" class = "btn btn-foure" data-toggle = "dropdown">View Contact Details</button>
<div class = "dropdown-menu">

<pre>

    <a class="dropdown-item" href="jsp/ViewContacts.jsp">Family</a>
    <a class="dropdown-item" href="#">Work</a>
    <a class="dropdown-item" href="#">Friend</a>
    <a class="dropdown-item" href="#">Other</a>
        
    </pre>

</div>
</div>
</div>

</div>


</div>
</div>
</body>
</html>