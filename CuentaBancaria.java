import javax.swing.*;

public class CuentaBancaria {
    /**Definimos los atributos*/
    private String numero;
    private String nombre;
    private String tipocuenta;
    private double saldo;
    /**Creamos los constructores*/
    public CuentaBancaria(String numero, String nombre, double saldo, String tipocuenta) {
        this.numero = numero;
        this.nombre = nombre;
        this.saldo = saldo;
        this.tipocuenta = tipocuenta;
    }
    /**Metodos propios de java*/
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipocuenta() {
        return tipocuenta;
    }

    public void setTipocuenta(String tipocuenta) {
        this.tipocuenta = tipocuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**Metodos propios del desarrollador*/

    public double depositar(double deposito){

        if (deposito<0){
            JOptionPane.showMessageDialog(null,"No se puede realizar el deposito. (valores negativos)");
            return this.saldo;
        }
        this.saldo += deposito;
        return this.saldo;
    }

    public double retirar(double retiro){
        if (retiro>saldo || retiro <0){
            JOptionPane.showMessageDialog(null,"No se pudo realizar el retiro. (Valores mayores al saldo o menores a 0)");
            return this.saldo;
        }
        this.saldo -= retiro;
        return this.saldo;
    }

    public String mostrarSaldo(){
        return "Su saldo total es: " + this.saldo + "$";
    }
}
