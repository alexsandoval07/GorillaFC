
package com.mycompany.gorillafc;

import controlador.Conexion;
import controlador.Controlador_pantalla;

public class GorillaFC {

    public static void main(String[] args) {
        Conexion.conectar();
        Controlador_pantalla.abrir_pantalla();
    }
}
