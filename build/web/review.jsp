<%-- 
    Document   : reivew
    Created on : 8 Aug, 2019, 1:36:44 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <link href="css/bootstrap.min.css" rel="stylesheet"/>
<link href="css/font-awesome.min.css" rel="stylesheet"/>
<link href="css/hover.css" rel="stylesheet"/>
<script src="js/jquery-2.1.0.min.js"></script>
<script src="js/bootstrap.min.js"></script> 
       <script> 
        $(document).ready(function(){
    
        $(".im").click(function (){
          var d=$(this).attr("data");
          $("#hdn1").val(d);
          for(var i=1;i<=5;i++)
          {
            if(i<=d)
            {
              $("#img"+i).attr("src","star3.png");   
            }
            else
            {
                $("#img"+i).attr("src","star.png"); 
            }
            
          }
        })
             }) </script> 
             <style>   #menu ul li a:hover{background-color:red; border-radius: 10px;}
                 #menu ul li :hover > ul{display:block;} </style>
</head>
    <body style="background:"> 
        
        
         <!-- NavBar Start Here -->
        <div class="container-fluid">
              <div class="row" style="margin-top:1%">
        <nav class="navbar navbar-default" style="background: teal; border-radius: 20px; font-size: 16px;">
            <div class="container-fluid"  id="menu">
       <ul  class="nav navbar-nav">
           <li><a href="website.html" Style="color:white">HOME</a></li> 
           <li><a href="About us.html" Style="color:white">ABOUT US</a></li> 
        <li>
          <a href="#"  style="color: white" data-toggle="dropdown">LOGIN</a>
          <ul class="dropdown-menu">
          <!--  <li><a href="userlogin.html">USER LOGIN</a></li> -->
            <li><a href="adminlogin.html">ADMIN LOGIN</a></li>
          </ul>
        </li>
          <li><a href="Enquiry.html" Style="color:white">CONNECT</a></li>
            <li><a href="#" Style="color:white" data-toggle="dropdown">SETTING</a>
             <ul class="dropdown-menu">
            <li><a href="changepassword.html">CHANGE PASSWORD</a></li>
            <li><a href="logout.html">LOGOUT</a></li>
          </ul>
                <li><a href="Registration.html" Style="color:white">REGISTRATION</a></li>
         <li><a href="Events.html" Style="color:white">IMAGE GALLERY</a>   </li> 
          <li><a href="review.jsp" Style="color:white">REVIEW</a>   </li>
           <li><a href="donar.html" Style="color:white">DONATION</a>   </li> 
           <li><a href="social.html" Style="color:white">SOCIAL MEDIA</a>   </li> 
      </ul>
            </div>
            </nav>
</div>    
            <!-- NavBar End Here -->    
        <div class="container-fluid">
            <div class="row">
                 <div class="col-sm-12" style="min-height:100px;font-size:70px;text-align:center;color:teal;font-weight:bold; text-shadow: 1px 2px 2px red;background:">
                    <marquee direction="right" behavior="alternate" scrollamount="15">SWACHH BHARAT ABHIYAN</marquee>
                </div></div>
            </div>
        <div class="row">
             <div class="col-sm-3" style="margin-top: 2%;margin-left: 40%; border-radius: 20px; color:teal"> 
                        <h1><u>GIVE REVIEW</u></h1></div></div>
            
            <div class="row">
             <form action="codes/reviewcode.jsp"  method="post">
            <div class="col-sm-4" style="min-height: 400px;  background: teal; border: 5px solid black; margin-top: 3%; margin-left: 35%">
                  
            name
            <input type="text"name="name" placeholder="enter name" class="form-control"><br>
             mobile
            <input type="number" placeholder="enter mobile" value="Send Review" name="mob" class="form-control"/><br>
            <img src="star.png" class="im" id="img1" data="1" width="10%">
            <img src="star.png" class="im" id="img2" data="2" width="10%">
            <img src="star.png" class="im" id="img3" data="3" width="10%">
            <img src="star.png" class="im" id="img4" data="4" width="10%">
            <img src="star.png" class="im" id="img5" data="5" width="10%"><br>
            <br>
            <input type="hidden" name="hdn1" id="hdn1"/><br>
            <button class="btn btn-success" type="submit">Submit</button>
       </div>
            </form>
            </div>
            
             <!-- footer start here -->
     <div class="row" style="background: teal; margin-top: 5px; color: white">
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
      <!--     <div class="col-sm-12">
      <h4 style="color:white;background: teal" align="center"><u>This Website is Hosted by Shivam Pandey</u></h4>  </div> -->
     </div>
     <!-- footer end here -->
      
            </div>
    </body>
</html>
