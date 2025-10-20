public class Factura {
    /**Definimos los atributos*/
    private String nombrep;
    private String codigop;
    private  int piezasven;
    private double preciop;

    /**Creamos los constructores*/

    public Factura(String nombrep, String codigop, int piezasven, double preciop) {
        this.nombrep = nombrep;
        this.codigop = codigop;
        this.piezasven = piezasven;
        this.preciop = preciop;
    }

    /**Metodos propios de java*/

    public String getNombrep() {
        return nombrep;
    }

    public void setNombrep(String nombrep) {
        this.nombrep = nombrep;
    }

    public String getCodigop() {
        return codigop;
    }

    public void setCodigop(String codigop) {
        this.codigop = codigop;
    }

    public int getPiezasven() {
        return piezasven;
    }

    public void setPiezasven(int piezasven) {
        this.piezasven = piezasven;
    }

    public double getPreciop() {
        return preciop;
    }

    public void setPreciop(double preciop) {
        this.preciop = preciop;
    }

    /**Metodos del programador*/

    public double montofinal(int piezasven, double preciop){
        double montof;
        montof = (this.piezasven * this.preciop);
        return montof;
    }
}
