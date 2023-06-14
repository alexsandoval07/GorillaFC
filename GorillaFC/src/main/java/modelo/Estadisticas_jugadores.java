
package modelo;

public class Estadisticas_jugadores {
    private int deportista;
    private int numero_pj;
    private int numero_rojas;
    private int numero_amarillas;
    private int numero_asistencias;
    private int numero_goles;

    public Estadisticas_jugadores(int deportista, int numero_pj, int numero_rojas, int numero_amarillas, int numero_asistencias, int numero_goles) {
        this.deportista = deportista;
        this.numero_pj = numero_pj;
        this.numero_rojas = numero_rojas;
        this.numero_amarillas = numero_amarillas;
        this.numero_asistencias = numero_asistencias;
        this.numero_goles = numero_goles;
    }

    public int getDeportista() {
        return deportista;
    }

    public void setDeportista(int deportista) {
        this.deportista = deportista;
    }

    public int getNumero_pj() {
        return numero_pj;
    }

    public void setNumero_pj(int numero_pj) {
        this.numero_pj = numero_pj;
    }

    public int getNumero_rojas() {
        return numero_rojas;
    }

    public void setNumero_rojas(int numero_rojas) {
        this.numero_rojas = numero_rojas;
    }

    public int getNumero_amarillas() {
        return numero_amarillas;
    }

    public void setNumero_amarillas(int numero_amarillas) {
        this.numero_amarillas = numero_amarillas;
    }

    public int getNumero_asistencias() {
        return numero_asistencias;
    }

    public void setNumero_asistencias(int numero_asistencias) {
        this.numero_asistencias = numero_asistencias;
    }

    public int getNumero_goles() {
        return numero_goles;
    }

    public void setNumero_goles(int numero_goles) {
        this.numero_goles = numero_goles;
    }

    @Override
    public String toString() {
        return "Estadisticas_jugadores{" + "deportista=" + deportista + ", numero_pj=" + numero_pj + ", numero_rojas=" + numero_rojas + ", numero_amarillas=" + numero_amarillas + ", numero_asistencias=" + numero_asistencias + ", numero_goles=" + numero_goles + '}';
    }
    
    
}
