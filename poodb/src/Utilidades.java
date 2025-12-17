import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Utilidades {
    public Connection getConnection(){
        String url = "jdbc:mysql://localhost:3306/ejemplojdbc";
        String user = "root";
        String passwd = "sasa";

        Connection conn = null;

        try{
                conn = DriverManager.getConnection(url, user, passwd);
                return conn;
        } catch (Exception ex){
                    ex.printStackTrace();
        }
        return null;
    }

    public void insetarDatos(Cliente cliente, Connection conn){
        String sql = "INSERT INTO cliente (nombre, apellido, correo, identificacion) VALUES (?,?,?,?)";
        try{

            PreparedStatement ps =conn.prepareStatement(sql);
            ps.setString(1,cliente.getNombre());
            ps.setString(2,cliente.getApellido());
            ps.setString(3,cliente.getCorreo());
            ps.setString(4,cliente.getIdentidicacion());

            int resultado = ps.executeUpdate();

            if(resultado > 0 ){
                System.out.println("El cliente se ha insertado correctamente..");
            }else {
                System.out.println("El Cliente no se inserto..");
            }

        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
}

