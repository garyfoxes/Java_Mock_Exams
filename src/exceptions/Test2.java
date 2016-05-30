package exceptions;

import javax.naming.NamingException;
import java.sql.SQLException;

/**
 * Created by gfox on 23/10/2014.
 */
public class Test2 {
    static void test()  throws SQLException, NamingException{
         try{
             if(1 != 3){
                 throw new SQLException();
             }
             else{
                 throw new NamingException();
             }
         }
         catch(SQLException e){
             System.out.println("Hello");
         }
         finally{
             System.out.println("Hello");
         }
     }

    public static void main(String[] args) {
        try {
            test();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }

}
