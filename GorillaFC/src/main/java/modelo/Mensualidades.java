
package modelo;

import java.sql.Date;

public class Mensualidades {
    private int numero_factura;
    private Date fecha_pago;
    private double valor;
    private int deportista;

    public Mensualidades(int numero_factura, Date fecha_pago, double valor, int deportista) {
        this.numero_factura = numero_factura;
        this.fecha_pago = fecha_pago;
        this.valor = valor;
        this.deportista = deportista;
    }

    public int getNumero_factura() {
        return numero_factura;
    }

    public void setNumero_factura(int numero_factura) {
        this.numero_factura = numero_factura;
    }

    public Date getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(Date fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getDeportista() {
        return deportista;
    }

    public void setDeportista(int deportista) {
        this.deportista = deportista;
    }

    @Override
    public String toString() {
        return "Mensualidades{" + "numero_factura=" + numero_factura + ", fecha_pago=" + fecha_pago + ", valor=" + valor + ", deportista=" + deportista + '}';
    }
    
    
    
}
