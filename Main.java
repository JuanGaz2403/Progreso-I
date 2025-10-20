import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Fecha fechanacimiento = new Fecha(0,0,0);
        PerfilMedico persona1 = new PerfilMedico("","","",0,0.0,0.0);


        /**Leemos los datos*/
        persona1.setNombre(JOptionPane.showInputDialog("Ingrese el nombre: "));
        persona1.setApellido(JOptionPane.showInputDialog("Ingrese el apellido: "));
        persona1.setSexo(JOptionPane.showInputDialog("Ingrese el sexo: "));
        fechanacimiento.setDia(Integer.parseInt(JOptionPane.showInputDialog("Ingrese su dia de nacimiento: ")));
        fechanacimiento.setMes(Integer.parseInt(JOptionPane.showInputDialog("Ingrese su mes de nacimiento: ")));
        fechanacimiento.setAno(Integer.parseInt(JOptionPane.showInputDialog("Ingrese su ano de nacimiento: ")));
        persona1.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura: ")));
        persona1.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso: ")));


        /**Calculamos la edad*/
        String edad = fechanacimiento.CalcularEdad();

        /**Asignamos el valor unicamente del año al objeto persona*/
        persona1.setFechan(fechanacimiento.MostrarAno());
        /**Calculamos FCM*/
        int FCM = persona1.CalcularFCM(persona1.getFechan());
        String RanfoFC = persona1.CalcularRangoFrecuencia(FCM);
        double BMIC = persona1.CalculoBMI(persona1.getPeso(), persona1.getAltura());

        /**imprimimos*/
        JOptionPane.showMessageDialog(null, "------Datos del Paciente------\n"+
                "Nombre: "+ persona1.getNombre() + "\nApellido: "+ persona1.getApellido() + "\nSexo: " + persona1.getSexo()
                + "\nAltura: "+ persona1.getAltura() + "cm" + "\nPeso: "+ persona1.getPeso() + "Kg"+"\nSu fecha de nacimiento es: " +
                edad + "\nSu FMC es: " + FCM + " lpm" + "\nEl rango de su FC es: " + RanfoFC + " lpm"+
                "\nBMI (Indice masa corporal): " + BMIC + "\nTabla de Indice Corporal"+ persona1.TablaBMI());
    }
}
