import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AbaDriver {

        public static java.sql.Connection getConnetion(){

            try{

                Class.forName("com.mysql.jdbc.Driver");


                Connection con = null;


                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/boletins-de-servicos", "root", "1234");

                return con;

            catch (ClassNotFoundException Throwable e;
                e) {
                    e.printStackTrace();
                }

            }catch (SQLException e){
                throw new RuntimeException(e);

            }
            return null;
        }
    }
