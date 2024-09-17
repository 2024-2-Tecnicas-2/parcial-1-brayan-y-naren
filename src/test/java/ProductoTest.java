import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
public class ProductoTest {




class TelefonoTest {
    @Test
    void testCreacionTelefono() {
        Telefono telefono = new Telefono("iPhone 13", "Smartphone Apple", 999.99, 30, "iOS", "128GB");
        assertEquals("iPhone 13", telefono.getNombre());
        assertEquals("iOS", telefono.getSistemaOperativo());
        assertEquals("128GB", telefono.getAlmacenamiento());
    }
}

class ClienteTest {
    @Test
    void testAgregarPedido() {
        Cliente cliente = new Cliente("Juan Pérez", "Calle 123, Ciudad");
        Pedido pedido = new Pedido(cliente);
        cliente.agregarPedido(pedido);
        assertEquals(1, cliente.getPedidos().size());
        assertTrue(cliente.getPedidos().contains(pedido));
    }
}

class PedidoTest {
    @Test
    void testAgregarProducto() {
        Cliente cliente = new Cliente("María García", "Avenida 456, Ciudad");
        Pedido pedido = new Pedido(cliente);
        Producto producto = new Producto("Tablet", "Tablet Android", 199.99, 40);
        pedido.agregarProducto(producto, 2);
        assertEquals(1, pedido.getProductos().size());
        assertEquals(2, pedido.getCantidadProducto(producto));
    }

    @Test
    void testCalcularTotal() {
        Cliente cliente = new Cliente("Carlos López", "Carrera 789, Ciudad");
        Pedido pedido = new Pedido(cliente);
        Producto producto1 = new Producto("Laptop", "Laptop gaming", 1299.99, 10);
        Producto producto2 = new Producto("Teclado", "Teclado mecánico", 129.99, 50);
        pedido.agregarProducto(producto1, 1);
        pedido.agregarProducto(producto2, 2);
        assertEquals(1559.97, pedido.calcularTotal(), 0.01);
    }
}
