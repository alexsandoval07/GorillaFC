
package modelo;

public class Horarios {
    private int id_horario;
    private int categoria;
    private String dia;
    private String hora_inicio;
    private String hora_finalizacion;
    private int escenario_deportivo;

    public Horarios(int id_horario, int categoria, String dia, String hora_inicio, String hora_finalizacion, int escenario_deportivo) {
        this.id_horario = id_horario;
        this.categoria = categoria;
        this.dia = dia;
        this.hora_inicio = hora_inicio;
        this.hora_finalizacion = hora_finalizacion;
        this.escenario_deportivo = escenario_deportivo;
    }

    public int getId_horario() {
        return id_horario;
    }

    public void setId_horario(int id_horario) {
        this.id_horario = id_horario;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(String hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public String getHora_finalizacion() {
        return hora_finalizacion;
    }

    public void setHora_finalizacion(String hora_finalizacion) {
        this.hora_finalizacion = hora_finalizacion;
    }

    public int getEscenario_deportivo() {
        return escenario_deportivo;
    }

    public void setEscenario_deportivo(int escenario_deportivo) {
        this.escenario_deportivo = escenario_deportivo;
    }

    @Override
    public String toString() {
        return "Horarios{" + "id_horario=" + id_horario + ", categoria=" + categoria + ", dia=" + dia + ", hora_inicio=" + hora_inicio + ", hora_finalizacion=" + hora_finalizacion + ", escenario_deportivo=" + escenario_deportivo + '}';
    }
    
}
