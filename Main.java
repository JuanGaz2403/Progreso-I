import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**Creacion del objeto con parametros vacios*/
        Factura fact1 = new Factura("","",0,0.0);

        /**Lectura de Datos con ventanas emergentes*/
        fact1.setCodigop(JOptionPane.showInputDialog("Ingrese El codigo de la píeza: "));
        fact1.setNombrep(JOptionPane.showInputDialog("Ingrese el nombre de la pieza: "));
        fact1.setPiezasven(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de la pieza: ")));
        fact1.setPreciop(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio de la pieza: ")));

        /**Impresion de la factura*/
    JOptionPane.showMessageDialog(null, "----Factura Generada---- \n" + "El codigo de su producto es: " + fact1.getCodigop() + "\n" +
                    "El  nombre de su producto es: " + fact1.getNombrep() + "\n" + "La cantidad comprada es: " + fact1.getPiezasven() + "\n" +"El precio de su producto es: "
                    + fact1.getPreciop() + "\n" + "Total a pagar de su factura: " + fact1.montofinal(fact1.getPiezasven(), fact1.getPreciop()));
    }
}
