import java.sql.Connection;
import java.sql.PreparedStatement;

public class Main {
    public static void main(String[] args) {
            Utilidades util = new Utilidades();
            Cliente cli1 = new Cliente("Julio","Jaramillo","jj@correo.com","1234567891");
        Connection conn = null;
        conn = util.getConnection();
        if(conn != null){
            System.out.println("Conectados ..!!");
            util.insetarDatos(cli1, conn);
        }else{
            System.out.println("NO Conectado ...!!");
        }

    }

}