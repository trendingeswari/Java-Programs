/*
 A table called mobile is created with the following DDL command:
create table mobile (id int, brandname varchar(20), modelname varchar(20), price
Write the Java code using JDBC APIs to select the id, brandname, modelname and price from the
table mobile.
Note:
The order of the columns in the result set must be id, brandname, modelname and price.
The result set must be ordered by the column brandname in ascending order.
IMPORTANT:
1. Place your code inside the execute method. You need not code/implement the main method.
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC_SelectMobile{
    public static void execute(Connection conn, Scanner sc) throws SQLException {
        String sql="SELECT id, brandname,modelname,price FROM mobile ORDER BY brandname ASC";
        System.out.println();
        try
        {
            PreparedStatement pstmt=conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next())
            {
                int id = rs.getInt("id");
                String brandname=rs.getString("brandname");
                String modelname=rs.getString("modelname");
                int price = rs.getInt("price");
                System.out.println(id+" "+brandname+" "+modelname+" "+price);
            }
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
        finally{
            conn.close();
        }
     }
// end of execute method }//end of Hello class
}