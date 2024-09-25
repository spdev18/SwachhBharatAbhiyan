/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mypack;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author DELL
 */
@MultipartConfig
@WebServlet(name = "registration", urlPatterns = {"/registration"})
public class registration extends HttpServlet {
    

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/reg.html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet registratation</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> Servlet registration at</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @param Encyrptpass
     * @return 
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String Name=request.getParameter("name");
        String gender=request.getParameter("gender");
        String checkGender="";
        if(gender.equals("male"))
        {
            checkGender="male";
        }
        else 
        {
            checkGender="female";
        }
        String mobile=request.getParameter("mob");
        String Qualification=request.getParameter("quali");
        String Email=request.getParameter("email");
        String password=request.getParameter("pass");
        Part file=request.getPart("profile");
        String fileName=file.getSubmittedFileName();
        InputStream is=file.getInputStream();
        File f=new File(request.getRealPath("/userpics"),Email+fileName);
        Files.copy(is, f.toPath());
         EncryptionManager em=new EncryptionManager();
        String Encryptpass=em.encryptData(password);
        java.util.Date dt=new java.util.Date();
        String Captcha=request.getParameter("hdn1");
        String ConfirmCaptcha=request.getParameter("cc1");
        if(Captcha.equals(ConfirmCaptcha))
        {
            
        
        
        String command1="insert into registration values('"+Name+"','"+checkGender+"','"+mobile+"','"+Qualification+"','"+Email+"','"+password+"','"+Email+fileName+"','"+dt.toString()+"')";
        String command2="insert into login values('"+Email+"','"+Encryptpass+"','user')";
        ConnectionManager cm=new ConnectionManager();
        PrintWriter out = response.getWriter();
        if(cm.ExecuteInsertUpdateOrDelete(command1))
        {
          if(cm.ExecuteInsertUpdateOrDelete(command2))  
          {
             
             out.print("<script> alert('Your Registration complited successfully');window.location.href='8084/swachhbharatabhiyan/registration.html'</script>");
          }
        
          else
          {
              out.print("<script> alert('Login failed');window.location.href='8084/swachhbharatabhiyan/registration.html'</script>");
          }
        }  
    }
        else
        {
            PrintWriter out=response.getWriter();
        out.print("<script> alert(' Invalid captcha code ');window.location.href='8084/swachhbharatabhiyan/registration.html'</script>");
        }
    }
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
      public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    }


