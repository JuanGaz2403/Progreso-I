import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*Cree una clase llamada CuentaBancaria que un banco podría utilizar para gestionar las cuentas de sus clientes.
Una CuentaBancaria debe incluir cuatro variables de instancia: número de cuenta (tipo String), nombre del titular (tipo String),
saldo actual (tipo double) y tipo de cuenta (tipo String - puede ser "Ahorro" o "Corriente").
Su clase debe tener un constructor que inicialice las cuatro variables de instancia. Proporcione un método establecer y
un método obtener para cada variable de instancia. Además, proporcione dos métodos:
depositar(double monto): que añada el monto al saldo. Si el monto no es positivo, no debe realizar ninguna operación.
retirar(double monto): que reste el monto del saldo. Si el monto es mayor al saldo o no es positivo, no debe realizar ninguna operación.
obtenerSaldo(): que devuelva el saldo actual.

Escriba una aplicación de prueba llamada PruebaCuentaBancaria que demuestre las capacidades de la clase CuentaBancaria, realizando varios depósitos y retiros.
*/
public class Main {
    public static void main(String[] args) {
    /**Creamos el objeto*/
    CuentaBancaria cuenta = new CuentaBancaria("","",0.0,"");

    /**Leemos los datos*/
        cuenta.setNumero(JOptionPane.showInputDialog("Ingrese el numero de cuenta: "));
        cuenta.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del Titular: "));
        cuenta.setTipocuenta(JOptionPane.showInputDialog("Ingrese el tipo de cuenta (Ahorros o corriente: )"));
        cuenta.setSaldo(Double.parseDouble(JOptionPane.showInputDialog("Ingrese su saldo actual: ")));

        /**Inicializamos valores para las opciones*/
        int opcs;
        int opcn;
        /**Entramos a un bucle para poder solicitar al usuario una opcino de deposito o retiro por ello tambien usamos switch*/
        do {

            opcn = Integer.parseInt(JOptionPane.showInputDialog("Desea realizar un retiro o deposito? 1) si 0) no"));
            if (opcn == 1){
            opcs = Integer.parseInt(JOptionPane.showInputDialog("1) Retiro\n2) Deposito"));
            switch (opcs){
                case 1:
                    double retiro;
                    retiro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a retirar: "));
                    cuenta.setSaldo(cuenta.retirar(retiro));
                    break;
                case 2:
                    double deposito;
                    deposito = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a depositar: "));
                    cuenta.setSaldo(cuenta.depositar(deposito));
                    break;
                }

            }else if (opcn == 0){
                break;
            } else {
                JOptionPane.showMessageDialog(null,"Opcion invalida ingrese 1 o 0");
            }

        }while (opcn != 0);

        /**Imprimimos la informacion*/

        JOptionPane.showMessageDialog(null,"Numero de cuenta: " + cuenta.getNumero() +
                "\nNombre del titular: " + cuenta.getNombre() + "\nTipo de cuenta: "+ cuenta.getTipocuenta() + "\n" +
                cuenta.mostrarSaldo());

    }
}