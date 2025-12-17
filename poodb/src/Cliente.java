import java.sql.Connection;
import java.sql.PreparedStatement;

public class Cliente {
    private int idcliente;
    private String nombre;
    private String apellido;
    private String correo;
    private String identidicacion;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String correo, String identidicacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.identidicacion = identidicacion;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getIdentidicacion() {
        return identidicacion;
    }

    public void setIdentidicacion(String identidicacion) {
        this.identidicacion = identidicacion;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idcliente=" + idcliente +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", correo='" + correo + '\'' +
                ", identidicacion='" + identidicacion + '\'' +
                '}';
    }


}
