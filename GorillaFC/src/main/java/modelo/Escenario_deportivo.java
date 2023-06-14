
package modelo;

public class Escenario_deportivo {
    private int id_escenario;
    private String nombre;
    private String ubicacion;
    private String tipo_escenario;

    public Escenario_deportivo(int id_escenario, String nombre, String ubicacion, String tipo_escenario) {
        this.id_escenario = id_escenario;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.tipo_escenario = tipo_escenario;
    }

    public int getId_escenario() {
        return id_escenario;
    }

    public void setId_escenario(int id_escenario) {
        this.id_escenario = id_escenario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTipo_escenario() {
        return tipo_escenario;
    }

    public void setTipo_escenario(String tipo_escenario) {
        this.tipo_escenario = tipo_escenario;
    }

    @Override
    public String toString() {
        return "Escenario_deportivo{" + "id_escenario=" + id_escenario + ", nombre=" + nombre + ", ubicacion=" + ubicacion + ", tipo_escenario=" + tipo_escenario + '}';
    }
    
    
}
