import java.util.ArrayList;
import java.util.Random;

public class CuentaBancaria {
    private double saldo;
    private Persona titular;
    private int numeroCuenta;
    private static ArrayList<CuentaBancaria> listaDeCuentasBancarias = new ArrayList<CuentaBancaria>();

    public CuentaBancaria(double saldo, Persona titular){
        this.saldo = saldo;
        this.titular = titular;
        this.numeroCuenta = generarNumCuenta();
        CuentaBancaria.listaDeCuentasBancarias.add(this);
    }

    private int generarNumCuenta(){
        Random random = new Random();
        int numeroCuenta = 100000 + random.nextInt(900000);
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public static ArrayList<CuentaBancaria> getListaDeCuentasBancarias() {
        return listaDeCuentasBancarias;
    }

    public static void setListaDeCuentasBancarias(ArrayList<CuentaBancaria> listaDeCuentasBancarias) {
        CuentaBancaria.listaDeCuentasBancarias = listaDeCuentasBancarias;
    }

    // Métodos

    public void depositar(double monto){
        this.saldo += monto;
        System.out.println("El usuario " + this.titular.getNombre() + " ha depositado: " + monto + " ahora el saldo es: " + this.saldo);
    }

    public void retirar(double monto){
        if(this.saldo >= monto && monto > 0){
            this.saldo -= monto;
            System.out.println("El usuario " + this.titular.getNombre() + " ha retirado: " + monto + " ahora el saldo es: " + this.saldo);
        }
        System.out.println("No se puede realizar el retiro, fondos insuficientes");
    }

    public void despliegaInformacion(){
        System.out.println("Numero de cuenta: " + this.numeroCuenta);
        System.out.println("Saldo: " + this.saldo);
        this.titular.despliegaInformacion();
        System.out.println("-------------------------");
    }

    public static void imprimeInformacionDeTodasLasCuentas(){
        for(CuentaBancaria cuenta : listaDeCuentasBancarias){
            cuenta.despliegaInformacion();
        }
    }
}
