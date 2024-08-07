public class Aplicacion {
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Ana", 20);
        Persona persona2 = new Persona("Juan", 20);
        Persona persona3 = new Persona("Sandra", 30);

        persona1.despliegaInformacion();

        CuentaBancaria cuenta1 = new CuentaBancaria(1000, persona1);
        CuentaBancaria cuenta2 = new CuentaBancaria(500, persona2);
        CuentaBancaria cuenta3 = new CuentaBancaria(100, persona3);

        cuenta1.depositar(500);
        cuenta1.retirar(700);
        cuenta1.retirar(-5000);
        cuenta1.despliegaInformacion();

        CuentaBancaria.imprimeInformacionDeTodasLasCuentas();
    }
}
