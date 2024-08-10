package clases;

public class Televisor extends ProductoElectrodomestico {
    private int tamanoPantalla;
    private String resolucion;

    public Televisor(String nombre, double precio, int cantidadDisponible, int tamanoPantalla, String resolucion ){
        super(nombre, precio, cantidadDisponible);
        this.tamanoPantalla = tamanoPantalla;
        this.resolucion = resolucion;
    }

    // Getters & Setters
    public int getTamanoPantalla() {
        return tamanoPantalla;
    }

    public void setTamanoPantalla(int tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("Resolución: " + this.resolucion);
        System.out.println("Tamaño de la pantalla: " + this.tamanoPantalla);
    }
}
