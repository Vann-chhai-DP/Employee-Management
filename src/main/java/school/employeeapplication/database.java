package school.employeeapplication;

import java.sql.Connection;
import java.sql.DriverManager;

public class database {

    public static Connection connectDb(){

        try{
            Class.forName("com.mysql.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/employee", "root", "");
            return connection;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
