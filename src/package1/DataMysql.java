package package1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

class DataMysql {

     void insertData(String first_name, String last_name,int age1, String email2, String username1, String password1){
        Connection connect1 = null;
        PreparedStatement prepStmt =null;
        try{
            // Feature login
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/test");
            String query = "insert into user_login_hf (`username`,`password`,first_name,last_name,age,email) value (?,?,?,?,?,?)";
            prepStmt = connect1.prepareStatement(query);
            prepStmt.setString(1, username1);
            prepStmt.setString(2,password1);
            prepStmt.setString(3,first_name);
            prepStmt.setString(4,last_name);
            prepStmt.setInt(5,age1);
            prepStmt.setString(6,email2);
            prepStmt.execute();
            connect1.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
