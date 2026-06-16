package dao;

import conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.Producto;

public class ProductoDAO {

    public void insertar(Producto producto) {

        String sql = "INSERT INTO producto(nombreProducto, precio, stock) VALUES (?, ?, ?)";

        try {

            Connection conexion = ConexionBD.conectar();

            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setString(1, producto.getNombre());
            ps.setDouble(2, producto.getPrecio());
            ps.setInt(3, producto.getStock());

            ps.executeUpdate();

            System.out.println("Producto guardado correctamente");

        } catch (Exception e) {

            System.out.println("Error al guardar: " + e.getMessage());

        }
    }

    public void listar() {

        String sql = "SELECT * FROM producto";

        try {

            Connection conexion = ConexionBD.conectar();

            PreparedStatement ps = conexion.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println(
                        rs.getInt("idProducto") + " | " +
                        rs.getString("nombreProducto") + " | " +
                        rs.getDouble("precio") + " | " +
                        rs.getInt("stock"));

            }

        } catch (Exception e) {

            System.out.println("Error al consultar: " + e.getMessage());

        }
    }

    public void actualizar(int id, double nuevoPrecio) {

        String sql = "UPDATE producto SET precio=? WHERE idProducto=?";

        try {

            Connection conexion = ConexionBD.conectar();

            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setDouble(1, nuevoPrecio);
            ps.setInt(2, id);

            ps.executeUpdate();

            System.out.println("Producto actualizado correctamente");

        } catch (Exception e) {

            System.out.println("Error al actualizar: " + e.getMessage());

        }
    }

    public void eliminar(int id) {

        String sql = "DELETE FROM producto WHERE idProducto=?";

        try {

            Connection conexion = ConexionBD.conectar();

            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("Producto eliminado correctamente");

        } catch (Exception e) {

            System.out.println("Error al eliminar: " + e.getMessage());

        }
    }
}