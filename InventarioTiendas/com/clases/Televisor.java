package clases;

public class Televisor extends ProductoElectrodomestico {
    private int tamañoPantalla;
    private String resolucion;

    public Televisor(String nombre, double precio, int cantidadDisponible, int tamañoPantalla, String resolucion ){
        super(nombre, precio, cantidadDisponible);
        this.tamañoPantalla = tamañoPantalla;
        this.resolucion = resolucion;
    }

    public Televisor(int tamañoPantalla, String resolucion){
        super(resolucion, tamañoPantalla);
        // this.resolucion = resolucion
        // this.tamañoPantalla = tamañoPantalla;
    }

    // Getters & Setters
    public int getTamañoPantalla() {
        return tamañoPantalla;
    }

    public void setTamañoPantalla(int tamañoPantalla) {
        this.tamañoPantalla = tamañoPantalla;
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
        System.out.println("Tamaño de la pantalla: " + this.tamañoPantalla);
    }
}
