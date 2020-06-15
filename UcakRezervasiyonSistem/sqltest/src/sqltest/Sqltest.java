package sqltest;



import java.sql.*;

public class Sqltest {
    public static final String USERNAME="root";
    public static final String PASSWORD="";
    public static final String CONN_STRING="jdbc:mysql://localhost:3306/mydata22";

    public static void main(String[] args) {
        Connection conn=null;
        try{
            
            conn=DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
            System.out.println("Connected");
        }catch(SQLException x){
        }
        
        
    }
    
}
