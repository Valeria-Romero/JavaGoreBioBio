package clases;
import java.util.ArrayList;

public class TiendaElectronica {
    private static ArrayList<ProductoElectrodomestico> listaDeProductos = new ArrayList<>();

    public TiendaElectronica(){
    }

    public void agregarProducto(ProductoElectrodomestico producto){
        TiendaElectronica.listaDeProductos.add(producto);
    }

    public void mostrarProductosDisponibles(){
        for(ProductoElectrodomestico producto : listaDeProductos){
            if(producto.getCantidadDisponible() > 0){
                producto.mostrarInformacion();
            }
        }
    }

    public ProductoElectrodomestico buscarProducto(String nombre){
        for(ProductoElectrodomestico producto : listaDeProductos){
            if(producto.getNombre().equals(nombre)){
                producto.mostrarInformacion();
                return producto;
            }
        }
        System.out.println("Producto no encontrado");
        return null;
    }

    public void venderProducto(String nombre){
        ProductoElectrodomestico producto = buscarProducto(nombre);
        if(producto != null){
            if (producto.getCantidadDisponible() >= 1) {
                producto.setCantidadDisponible(producto.getCantidadDisponible()-1);
                System.out.println("Gracias por su compra");
            }
            System.out.println("Producto agotado");
        }
    }
}
