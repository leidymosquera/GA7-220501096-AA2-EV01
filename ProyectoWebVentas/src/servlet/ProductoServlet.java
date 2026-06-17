package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/producto")
public class ProductoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.getWriter().println("Metodo GET funcionando");
    }

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String nombre = request.getParameter("nombre");
        String precio = request.getParameter("precio");

        request.setAttribute("nombre", nombre);
        request.setAttribute("precio", precio);

        request.getRequestDispatcher("resultado.jsp")
               .forward(request, response);
    }
}
