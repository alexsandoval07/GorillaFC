
package modelo;

import java.sql.Date;

public class Torneos {
    private int codigo_torneo;
    private String lugar;
    private double valor_inscripcion;
    private double valor_viaje;
    private double valor_sanciones;
    private double valor_ganancias;
    private Date fecha;
    private int club_convenio;

    public Torneos(int codigo_torneo, String lugar, double valor_inscripcion, double valor_viaje, double valor_sanciones, double valor_ganancias, Date fecha, int club_convenio) {
        this.codigo_torneo = codigo_torneo;
        this.lugar = lugar;
        this.valor_inscripcion = valor_inscripcion;
        this.valor_viaje = valor_viaje;
        this.valor_sanciones = valor_sanciones;
        this.valor_ganancias = valor_ganancias;
        this.fecha = fecha;
        this.club_convenio = club_convenio;
    }

    public int getCodigo_torneo() {
        return codigo_torneo;
    }

    public void setCodigo_torneo(int codigo_torneo) {
        this.codigo_torneo = codigo_torneo;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public double getValor_inscripcion() {
        return valor_inscripcion;
    }

    public void setValor_inscripcion(double valor_inscripcion) {
        this.valor_inscripcion = valor_inscripcion;
    }

    public double getValor_viaje() {
        return valor_viaje;
    }

    public void setValor_viaje(double valor_viaje) {
        this.valor_viaje = valor_viaje;
    }

    public double getValor_sanciones() {
        return valor_sanciones;
    }

    public void setValor_sanciones(double valor_sanciones) {
        this.valor_sanciones = valor_sanciones;
    }

    public double getValor_ganancias() {
        return valor_ganancias;
    }

    public void setValor_ganancias(double valor_ganancias) {
        this.valor_ganancias = valor_ganancias;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getClub_convenio() {
        return club_convenio;
    }

    public void setClub_convenio(int club_convenio) {
        this.club_convenio = club_convenio;
    }

    @Override
    public String toString() {
        return "Torneos{" + "codigo_torneo=" + codigo_torneo + ", lugar=" + lugar + ", valor_inscripcion=" + valor_inscripcion + ", valor_viaje=" + valor_viaje + ", valor_sanciones=" + valor_sanciones + ", valor_ganancias=" + valor_ganancias + ", fecha=" + fecha + ", club_convenio=" + club_convenio + '}';
    }
    
    
}
