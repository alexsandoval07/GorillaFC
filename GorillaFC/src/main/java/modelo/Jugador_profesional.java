
package modelo;

public class Jugador_profesional {
    private int deportista;
    private String club_profesional;
    private double valor_fichaje;
    private double comision_escuela;

    public Jugador_profesional(int deportista, String club_profesional, double valor_fichaje, double comision_escuela) {
        this.deportista = deportista;
        this.club_profesional = club_profesional;
        this.valor_fichaje = valor_fichaje;
        this.comision_escuela = comision_escuela;
    }

    public int getDeportista() {
        return deportista;
    }

    public void setDeportista(int deportista) {
        this.deportista = deportista;
    }

    public String getClub_profesional() {
        return club_profesional;
    }

    public void setClub_profesional(String club_profesional) {
        this.club_profesional = club_profesional;
    }

    public double getValor_fichaje() {
        return valor_fichaje;
    }

    public void setValor_fichaje(double valor_fichaje) {
        this.valor_fichaje = valor_fichaje;
    }

    public double getComision_escuela() {
        return comision_escuela;
    }

    public void setComision_escuela(double comision_escuela) {
        this.comision_escuela = comision_escuela;
    }

    @Override
    public String toString() {
        return "Jugador_profesional{" + "deportista=" + deportista + ", club_profesional=" + club_profesional + ", valor_fichaje=" + valor_fichaje + ", comision_escuela=" + comision_escuela + '}';
    }
    
    
}
