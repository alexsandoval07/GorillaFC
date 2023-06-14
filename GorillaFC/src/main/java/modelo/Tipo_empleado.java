
package modelo;

public class Tipo_empleado {
    private int codigo_tipo_empleado;
    private int codigo_empleado;
    private int codigo_categoria;
    private String tipo_empleado;

    public Tipo_empleado(int codigo_tipo_empleado, int codigo_empleado, int codigo_categoria, String tipo_empleado) {
        this.codigo_tipo_empleado = codigo_tipo_empleado;
        this.codigo_empleado = codigo_empleado;
        this.codigo_categoria = codigo_categoria;
        this.tipo_empleado = tipo_empleado;
    }

    public int getCodigo_tipo_empleado() {
        return codigo_tipo_empleado;
    }

    public void setCodigo_tipo_empleado(int codigo_tipo_empleado) {
        this.codigo_tipo_empleado = codigo_tipo_empleado;
    }

    public int getCodigo_empleado() {
        return codigo_empleado;
    }

    public void setCodigo_empleado(int codigo_empleado) {
        this.codigo_empleado = codigo_empleado;
    }

    public int getCodigo_categoria() {
        return codigo_categoria;
    }

    public void setCodigo_categoria(int codigo_categoria) {
        this.codigo_categoria = codigo_categoria;
    }

    public String getTipo_empleado() {
        return tipo_empleado;
    }

    public void setTipo_empleado(String tipo_empleado) {
        this.tipo_empleado = tipo_empleado;
    }

    @Override
    public String toString() {
        return "Tipo_empleado{" + "codigo_tipo_empleado=" + codigo_tipo_empleado + ", codigo_empleado=" + codigo_empleado + ", codigo_categoria=" + codigo_categoria + ", tipo_empleado=" + tipo_empleado + '}';
    }
    
    
}
