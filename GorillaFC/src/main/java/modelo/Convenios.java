
package modelo;

public class Convenios {
    private int codigo_club;
    private String club_profesional;
    private int ojeador;

    public Convenios(int codigo_club, String club_profesional, int ojeador) {
        this.codigo_club = codigo_club;
        this.club_profesional = club_profesional;
        this.ojeador = ojeador;
    }

    public int getCodigo_club() {
        return codigo_club;
    }

    public void setCodigo_club(int codigo_club) {
        this.codigo_club = codigo_club;
    }

    public String getClub_profesional() {
        return club_profesional;
    }

    public void setClub_profesional(String club_profesional) {
        this.club_profesional = club_profesional;
    }

    public int getOjeador() {
        return ojeador;
    }

    public void setOjeador(int ojeador) {
        this.ojeador = ojeador;
    }

    @Override
    public String toString() {
        return "Convenios{" + "codigo_club=" + codigo_club + ", club_profesional=" + club_profesional + ", ojeador=" + ojeador + '}';
    }
    
    
}
