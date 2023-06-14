
package modelo;
 
import java.sql.Date;

public class Patrocinios {
    private int id_patrocinio;
    private int codigo_categoria;
    private int id_patrocinador;
    private Date fecha_patrocinio;
    private double valor;

    public Patrocinios(int id_patrocinio, int codigo_categoria, int id_patrocinador, Date fecha_patrocinio, double valor) {
        this.id_patrocinio = id_patrocinio;
        this.codigo_categoria = codigo_categoria;
        this.id_patrocinador = id_patrocinador;
        this.fecha_patrocinio = fecha_patrocinio;
        this.valor = valor;
    }

    public int getId_patrocinio() {
        return id_patrocinio;
    }

    public void setId_patrocinio(int id_patrocinio) {
        this.id_patrocinio = id_patrocinio;
    }

    public int getCodigo_categoria() {
        return codigo_categoria;
    }

    public void setCodigo_categoria(int codigo_categoria) {
        this.codigo_categoria = codigo_categoria;
    }

    public int getId_patrocinador() {
        return id_patrocinador;
    }

    public void setId_patrocinador(int id_patrocinador) {
        this.id_patrocinador = id_patrocinador;
    }

    public Date getFecha_patrocinio() {
        return fecha_patrocinio;
    }

    public void setFecha_patrocinio(Date fecha_patrocinio) {
        this.fecha_patrocinio = fecha_patrocinio;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Patrocinios{" + "id_patrocinio=" + id_patrocinio + ", codigo_categoria=" + codigo_categoria + ", id_patrocinador=" + id_patrocinador + ", fecha_patrocinio=" + fecha_patrocinio + ", valor=" + valor + '}';
    }
    
    
    
}
