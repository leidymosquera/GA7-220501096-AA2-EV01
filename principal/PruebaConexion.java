package principal;

import conexion.ConexionBD;

public class PruebaConexion {

    public static void main(String[] args) {

        if (ConexionBD.conectar() != null) {
            System.out.println("Base de datos conectada correctamente");
        } else {
            System.out.println("No fue posible conectar");
        }

    }
}