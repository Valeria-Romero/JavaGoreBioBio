package clases;

public class ProductoElectrodomestico {
    private String nombre;
    private double precio;
    private int cantidadDisponible;

    // Contructores
    public ProductoElectrodomestico(){
        
    }

    public ProductoElectrodomestico(String nombre, double precio, int cantidadDisponible){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    public ProductoElectrodomestico(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = 0;
        // this(nombre, precio, 0);
    }

    // Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    // Métodos
    public void mostrarInformacion(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Precio: " + this.precio);
        System.out.println("Cantidad disponible: " + this.cantidadDisponible);
    }
}
