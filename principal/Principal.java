package principal;

import dao.ProductoDAO;

public class Principal {

    public static void main(String[] args) {

        ProductoDAO dao = new ProductoDAO();

        dao.eliminar(2);

        System.out.println("\nLISTA FINAL:");

        dao.listar();
    }
}