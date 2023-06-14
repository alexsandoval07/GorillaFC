
package modelo;

import java.sql.Date;

public class Salario_empleado {
    private int numero_factura;
    private double valor;
    private Date fecha_pago;
    private int codigo_empleado;

    public Salario_empleado(int numero_factura, double valor, Date fecha_pago, int codigo_empleado) {
        this.numero_factura = numero_factura;
        this.valor = valor;
        this.fecha_pago = fecha_pago;
        this.codigo_empleado = codigo_empleado;
    }

    public int getNumero_factura() {
        return numero_factura;
    }

    public void setNumero_factura(int numero_factura) {
        this.numero_factura = numero_factura;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(Date fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public int getCodigo_empleado() {
        return codigo_empleado;
    }

    public void setCodigo_empleado(int codigo_empleado) {
        this.codigo_empleado = codigo_empleado;
    }

    @Override
    public String toString() {
        return "Salario_empleado{" + "numero_factura=" + numero_factura + ", valor=" + valor + ", fecha_pago=" + fecha_pago + ", codigo_empleado=" + codigo_empleado + '}';
    }
    
    
}
