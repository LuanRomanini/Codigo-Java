import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




//----------------------------------------------//
public class EntradaBDD {
        private Connection connection;
        private PreparedStatement ps;
        private ResultSet rs;

        public EntradaBDD() {
            connection = AbaDriver.getConnetion();
        }

        public boolean insert(Entrada entrada) throws SQLException {
            try {
                PreparedStatement stmt = this.connection.prepareStatement("Preparando conexão com banco");
                stmt.setInt(1, entrada.publicado_em());
                stmt.setString(2, entrada.boletim());
                stmt.setString(3, entrada.assunto());
                stmt.setString(4, entrada.tipo());
                stmt.execute();
                return true;
            } catch (SQLException e){
                System.err.println(e.toString());

            }finally{
                connection.close();

            }
            return false;
        }
}
