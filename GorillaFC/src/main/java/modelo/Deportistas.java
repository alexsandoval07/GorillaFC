
package modelo;

import java.sql.Date;

public class Deportistas {
    private int codigo_deportista;
    private int id_deportista;
    private String nombre;
    private Date fecha_nacimiento;
    private String direccion;
    private String telefono;
    private String altura;
    private String peso;
    private String dorsal;
    private String eps;
    private int categoria;
    private int representante_legal;

    public Deportistas(int codigo_deportista, int id_deportista, String nombre, Date fecha_nacimiento, String direccion, String telefono, String altura, String peso, String dorsal, String eps, int categoria, int representante_legal) {
        this.codigo_deportista = codigo_deportista;
        this.id_deportista = id_deportista;
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.altura = altura;
        this.peso = peso;
        this.dorsal = dorsal;
        this.eps = eps;
        this.categoria = categoria;
        this.representante_legal = representante_legal;
    }

    public int getCodigo_deportista() {
        return codigo_deportista;
    }

    public void setCodigo_deportista(int codigo_deportista) {
        this.codigo_deportista = codigo_deportista;
    }

    public int getId_deportista() {
        return id_deportista;
    }

    public void setId_deportista(int id_deportista) {
        this.id_deportista = id_deportista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
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

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getDorsal() {
        return dorsal;
    }

    public void setDorsal(String dorsal) {
        this.dorsal = dorsal;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getRepresentante_legal() {
        return representante_legal;
    }

    public void setRepresentante_legal(int representante_legal) {
        this.representante_legal = representante_legal;
    }

    @Override
    public String toString() {
        return "Deportistas{" + "codigo_deportista=" + codigo_deportista + ", id_deportista=" + id_deportista + ", nombre=" + nombre + ", fecha_nacimiento=" + fecha_nacimiento + ", direccion=" + direccion + ", telefono=" + telefono + ", altura=" + altura + ", peso=" + peso + ", dorsal=" + dorsal + ", eps=" + eps + ", categoria=" + categoria + ", representante_legal=" + representante_legal + '}';
    }
    
    
    
}
