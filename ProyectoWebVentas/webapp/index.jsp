<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>Registro de Producto</title>
</head>
<body>

    <h2>Formulario de Producto</h2>

    <form action="producto" method="post">

        Nombre:
        <input type="text" name="nombre" required>
        <br><br>

        Precio:
        <input type="number" name="precio" required>
        <br><br>

        <input type="submit" value="Guardar">

    </form>

</body>
</html>