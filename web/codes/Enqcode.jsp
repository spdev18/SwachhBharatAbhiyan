<%@page import="mypack.ConnectionManager"%>
<%@page import="java.io.*, java.util.*, org.apache.commons.fileupload.*, org.apache.commons.fileupload.disk.*, org.apache.commons.fileupload.servlet.*"%>

<%
    if(ServletFileUpload.isMultipartContent(request)){
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        String name = "";
        String mobile = "";
        String email = "";
        String massage = "";
        String uploadFilePath = "";
        
        try {
            List<FileItem> items = upload.parseRequest(request);
            for (FileItem item : items) {
                if (item.isFormField()) {
                    String fieldName = item.getFieldName();
                    String fieldValue = item.getString();
                    
                    if (fieldName.equals("name")) {
                        name = fieldValue;
                    } else if (fieldName.equals("mob")) {
                        mobile = fieldValue;
                    } else if (fieldName.equals("email")) {
                        email = fieldValue;
                    } else if (fieldName.equals("msg")) {
                        massage = fieldValue;
                    }
                } else {
                    // Process the uploaded file
                    String fileName = new File(item.getName()).getName();
                    String uploadDir = getServletContext().getRealPath("/") + "uploads";
                    File uploadDirFile = new File(uploadDir);
                    if (!uploadDirFile.exists()) {
                        uploadDirFile.mkdir();
                    }
                    uploadFilePath = uploadDir + File.separator + fileName;
                    File uploadFile = new File(uploadFilePath);
                    item.write(uploadFile);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        // Save form data and file path to the database
        String command = "INSERT INTO enquiry (name, mob, email, msg, Uploadfile) VALUES ('"+name+"', '"+mobile+"', '"+email+"', '"+massage+"', '"+uploadFilePath+"')";
        ConnectionManager cm = new ConnectionManager();
        boolean x = cm.ExecuteInsertUpdateOrDelete(command);
        if (x == true)
            out.print("Record saved");
        else
            out.print("Record not saved");
    } else {
        out.print("Form is not multipart");
    }
%>
