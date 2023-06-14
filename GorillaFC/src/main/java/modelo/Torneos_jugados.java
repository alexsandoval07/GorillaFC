
package modelo;

public class Torneos_jugados {
    private int codigo_categoria;
    private int codigo_torneo;

    public Torneos_jugados(int codigo_categoria, int codigo_torneo) {
        this.codigo_categoria = codigo_categoria;
        this.codigo_torneo = codigo_torneo;
    }

    public int getCodigo_categoria() {
        return codigo_categoria;
    }

    public void setCodigo_categoria(int codigo_categoria) {
        this.codigo_categoria = codigo_categoria;
    }

    public int getCodigo_torneo() {
        return codigo_torneo;
    }

    public void setCodigo_torneo(int codigo_torneo) {
        this.codigo_torneo = codigo_torneo;
    }

    @Override
    public String toString() {
        return "Torneos_jugados{" + "codigo_categoria=" + codigo_categoria + ", codigo_torneo=" + codigo_torneo + '}';
    }
    
    
    
}
