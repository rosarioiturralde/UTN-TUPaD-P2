/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp6_1;

/**
 *
 * @author Usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Inventario inventario = new Inventario();

        // 1️⃣ Crear productos
        Producto p1 = new Producto("P001", "Manzanas", 800, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Celular", 250000, 10, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Remera", 3000, 25, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Sillón", 180000, 5, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Leche", 1200, 100, CategoriaProducto.ALIMENTOS);

        // Agregar al inventario
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        // 2️⃣ Listar productos
        System.out.println("=== LISTA DE PRODUCTOS ===");
        inventario.listarProductos();

        // 3️⃣ Buscar producto
        System.out.println("=== BUSCAR PRODUCTO P003 ===");
        Producto buscado = inventario.buscarProductoPorId("P003");
        if (buscado != null) buscado.mostrarInfo();

        // 4️⃣ Filtrar por categoría
        System.out.println("=== PRODUCTOS DE ALIMENTOS ===");
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);

        // 5️⃣ Eliminar un producto
        System.out.println("=== ELIMINAR PRODUCTO P004 ===");
        inventario.eliminarProducto("P004");
        inventario.listarProductos();

        // 6️⃣ Actualizar stock
        System.out.println("=== ACTUALIZAR STOCK P002 ===");
        inventario.actualizarStock("P002", 15);

        // 7️⃣ Total de stock
        System.out.println("=== TOTAL DE STOCK DISPONIBLE ===");
        System.out.println("Total: " + inventario.obtenerTotalStock());

        // 8️⃣ Producto con mayor stock
        System.out.println("=== PRODUCTO CON MAYOR STOCK ===");
        Producto mayor = inventario.obtenerProductoConMayorStock();
        if (mayor != null) mayor.mostrarInfo();

        // 9️⃣ Filtrar por precio
        System.out.println("=== PRODUCTOS ENTRE $1000 Y $3000 ===");
        inventario.filtrarProductosPorPrecio(1000, 3000);

        // 🔟 Categorías disponibles
        System.out.println("=== CATEGORÍAS DISPONIBLES ===");
        inventario.mostrarCategoriasDisponibles();
    }
    
}
