<%-- 
    Document   : message2
    Created on : Aug 18, 2019, 6:18:07 PM
    Author     : Shivam Pandey
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link href="css/bootstrap.min.css" rel="stylesheet"/>
<link href="css/font-awesome.min.css" rel="stylesheet"/>
<link href="css/hover.css" rel="stylesheet"/>
<script src="js/jquery-2.1.0.min.js"></script>
<script src="js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container-fluid">
            <div class="row">
                <form action="../codes/sendmsg2.jsp" method="post">
                <div class="col-sm-3" style="min-height: 130px; background: teal; border: 5px solid black; margin-top: 3%; margin-left: 30%; width:500px; color: white">
                  <br> Mobile Number<input type="number" name="mobile" class="form-control" placeholder="Enter Mobile Number"/>
                <br> Message   <input type="text" style="min-height: 130px" name="message" class="form-control" placeholder="Enter message" />  
                <br><br>
        <button type="submit" class="btn btn-success" style="margin-left: 2%">  Submit  </button><br><br>
       
                </div>
                    </form>
            </div>
        </div>
    </body>
</html>
