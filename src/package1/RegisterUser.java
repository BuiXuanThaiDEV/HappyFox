package package1;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class RegisterUser extends HttpServlet {
    protected void  doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        Integer age = Integer.valueOf(request.getParameter("age"));
        String email = request.getParameter("email");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        DataMysql data = new DataMysql();
        data.insertData(firstName,lastName,age,email,username,password);
        //check
        //put in database
        RequestDispatcher rd = request.getRequestDispatcher("register-success.jsp");
    }
    protected  void doGet(HttpServletRequest req,HttpServletResponse resp)throws  ServletException,IOException{

    }

}
