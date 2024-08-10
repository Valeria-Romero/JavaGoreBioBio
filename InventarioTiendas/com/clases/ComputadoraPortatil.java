package clases;

public class ComputadoraPortatil extends ProductoElectrodomestico {
    private String marca;
    private String memoriaRAM;
    private int numeroSerie;

    public ComputadoraPortatil(String nombre, double precio, int cantidadDisponible, String marca, String memoriaRAM, int numeroSerie){
        super(nombre, precio, cantidadDisponible);
        this.marca = marca;
        this.memoriaRAM = memoriaRAM;
        this.numeroSerie = numeroSerie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(String memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Memoria RAM: " +  this.memoriaRAM);
        System.out.println("Número de serie: " + this.numeroSerie);
    }

}
