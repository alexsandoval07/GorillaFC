
package modelo;

import java.sql.Date;

public class Empleados {
    private int codigo_empleado;
    private String nombre_empleado;
    private String fecha_nacimiento;
    private String direccion;
    private String telefono;
    private int id_empleado;

    public Empleados(int codigo_empleado, String nombre_empleado, String fecha_nacimiento, String direccion, String telefono, int id_empleado) {
        this.codigo_empleado = codigo_empleado;
        this.nombre_empleado = nombre_empleado;
        this.fecha_nacimiento = fecha_nacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.id_empleado = id_empleado;
    }

    public int getCodigo_empleado() {
        return codigo_empleado;
    }

    public void setCodigo_empleado(int codigo_empleado) {
        this.codigo_empleado = codigo_empleado;
    }

    public String getNombre_empleado() {
        return nombre_empleado;
    }

    public void setNombre_empleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    @Override
    public String toString() {
        return "Empleados{" + "codigo_empleado=" + codigo_empleado + ", nombre_empleado=" + nombre_empleado + ", fecha_nacimiento=" + fecha_nacimiento + ", direccion=" + direccion + ", telefono=" + telefono + ", id_empleado=" + id_empleado + '}';
    }
    
   
}
