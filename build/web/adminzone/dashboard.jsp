<%-- 
    Document   : index
    Created on : Aug 6, 2019, 1:41:41 PM
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
   <script>$(document).ready(function(){$("#btn").trigger("click");})</script>
   <style>
 #menu ul{
list-style: none
}
#menu ul li a:hover{background-color:red; }
#menu ul li :hover > ul{display:block;}
</style>
    </head>
    <body style="background: teal">
        
        
        <button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal" id="btn" style="display:none" >
  Launch demo modal
</button>
<!-- 
<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" style="background:teal">
  <div class="modal-dialog" role="document">
    <div class="modal-content" style="background:darkorange">
     <div>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>       
	   <div class="modal-footer">
	   <h4 class="modal-title" id="myModalLabel" style="color:white; margin-right:25%">WELCOME TO ADMIN ZONE</h4>
       
	     <button type="button" class="btn btn-default" data-dismiss="modal">OK</button>
      </div>
	 </div>    
    </div>
  </div>
</div>
        
        
        
        
<div class="container-fluid">
         <!--     <div class="row">
                <div class="col-sm-1"><img src="sp3.png" class="img-circle" style="height: 150px;width:150px;"></div>
                <div class="col-sm-11">  
                   <embed src="ba2.swf" style="width:1135px; margin-left: 5%">
                </div>
            </div>  -->
        
        <div class="row" style="color: white">
            <div class="col-sm-3" style="background:tealviolet; height:500px;">
                <h3 style="margin-left: 35%; margin-top: 10%">Admin</h3>
               <!--  <img src="" class="img-circle" style="height: 150px;width:150px; margin-top: 17%; margin-left: 25%; "> <h4 style="margin-left: 25%;  cursor:pointer; color:">Shivam Pandey</h4>
              <!--  <h3 align="center" style="margin-top: 20%; color: "> <u></u></h3> -->
              <div id="menu" style="margin-top: 20%">
              <ul>
                  
                  <li><a href="enquirymgmt.jsp" style="color: white; font-size: 20px">    Enquiry Management    </a><li><br><br><br>
                      <li><a href="reviewmgmt.jsp" style="color: white; font-size: 20px">    Review Management    </a><li><br><br><br>
                      <li><a href="donarmgmt.jsp" style="color: white; font-size: 20px">   Donation Management   </a><li><br><br><br>
                          <li><a href="govtscheme.html" style="color: white; font-size: 20px">   Govt. Scheme    </a><li>
              </ul>
            </div>
            
            </div>
            <div class="col-sm-9" style="background: indigo">
               
        <img href="../adminzone/dashboard.jsp" src="s (10).jpeg" class="img-circle" style="height:100px; width:100px;cursor:pointer; "/> 
             <img src="s (4).png" class="img-circle" style="height:100px; cursor:pointer; width:100px; margin-left: 8%"/> 
                
             <a href="../adminzone/responsive.html">      <img src="s (2).png" class="img-circle" style="height:100px; cursor:pointer;width:100px; margin-left: 8%"/>  </a>
               
              <a href="../adminzone/Events.html">        <img src="s (7).png" class="img-circle" style="height:100px; cursor:pointer;width:100px; margin-left: 8%"/> </a> 
           
             <a href="../adminzone/changepasswordandlogout.html">      <img src="s (5).png" class="img-circle" style="height:100px;  cursor:pointer; width:100px; margin-left: 8%"/>  </a>
             <br>
             <img src="s (8).png"  class="img-circle" style="height:400px; width: 800px; margin-left: 6%;margin-top: 5% "/>
            </div>
        
        </div>
            <div class="row" style="background: white"><div class="col-sm-12"></div></div>
        
        
              <div class="row" style="background: teal; margin-top: 1%; color: white">
         <div class="col-sm-3">
             <h4 style="cursor: pointer">Terms&Conditionds</h4>
                <h4 style="cursor: pointer">Archives</h4>
                   <h4 style="cursor: pointer">Privacy Policy</h4>
                      <h4 style="cursor: pointer">Hyperlink Policy</h4>
                      <h4 style="cursor: pointer">Copyright Policy</h4>
                                            <h4 style="cursor: pointer">Disclaimer</h4>

         </div>
         
         <div class="col-sm-3" style="margin-top:1%;margin-bottom: 1%">
             <span class="fa fa-envelope" style="font-size: 25px; cursor: pointer"> Give Feedback </span>
             <br><br><span class="fa fa-phone"  style="font-size: 25px; cursor: pointer">  Contact Us - 1969 <br><br> @ UP, Gonda, Balharai-271123 </span>
         </div>
         <div class="col-sm-3" style="margin-top:0%;margin-left: 0%">
          <h3 align="center"  style="cursor: pointer"><u>Related Links</u></h3> 
          <h4  style="cursor: pointer">||swachhbharatmission.gov.in||</h4>
          <h4  style="cursor: pointer">||sbm.gov.in||</h4>
          <h4  style="cursor: pointer">||swachhbharat.mygov.in||</h4>
          <h4 style="cursor: pointer">||swachhbharaturban.gov.in||</h4>
         </div>
         
         <div class="col-sm-3">
             <span class="fa fa-share-square" style="font-size:35px; margin-top: 2%;cursor: pointer"> Share It On </span>
        
      <br><br>      <span class="fa fa-facebook" style="font-size:35px; margin-left: 23%;cursor: pointer"> Facebook </span>
         
         <span class="fa fa-google" style="font-size:35px; margin-left: 23%;cursor: pointer"> Google </span>
         
         <span class="fa fa-twitter" style="font-size:35px; margin-left: 23%;cursor: pointer"> Twitter </span>
         
         </div>
          
     </div>
   
               
  </div>
    </body>
</html>
