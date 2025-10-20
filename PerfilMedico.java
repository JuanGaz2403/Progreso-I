public class PerfilMedico {
    /**Definicion de atributos*/
    private String nombre;
    private String apellido;
    private String sexo;
    private int fechan;
    private double altura;
    private double peso;

    /**Creacion de constructores*/
    public PerfilMedico(String nombre, String apellido, String sexo, int fechan, double altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.fechan = fechan;
        this.altura = altura;
        this.peso = peso;
    }

    /**Metodos propios de java*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getFechan() {
        return fechan;
    }

    public void setFechan(int fechan) {
        this.fechan = fechan;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**Metodos del desarrollador*/

    public int CalcularFCM(int anoc){
        int FCM= 200-anoc;

        return FCM;
    }

    public String CalcularRangoFrecuencia(int FCM){
        double FCmin = 0.5 * FCM;
        double FCmax = 0.85 * FCM;

        return "("+FCmin + "-" + FCmax+")";
    }
    public double CalculoBMI(double peso, double altura){
        double alturaNew = altura/100;
        double BMI = (peso)/((alturaNew * alturaNew));
        BMI = Math.round(BMI * 100.0) / 100.0;
        return BMI;
    }

    public String TablaBMI(){
        String tableBMI = "\nRango-----Condicion\n";
        tableBMI +=       ">18.5-------Baja\n";
        tableBMI +=       "18.5-24.9---Normal\n";
        tableBMI +=       "25-29.9-----Sobrepeso\n";
        tableBMI +=       "<30---------Obeso\n";
        return tableBMI;
    }

}
