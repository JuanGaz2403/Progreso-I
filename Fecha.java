public class Fecha {
    /**Definicion de atributos*/
    private int dia;
    private int mes;
    private int ano;

    /**Creacion de constructores*/
    public Fecha(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    /**Metodos de java*/
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    /**Metodos del desarrollador*/

    public String CalcularEdad(){
        int diaa = 18;
        int mesa = 10;
        int anoa = 2025;
        String edad;
        int anoc = anoa-this.ano;
        int mesc = mesa -this.mes;
        int diac = diaa -this.dia;


        if (diac < 0) {
            mesc--;
            diac += 30;
        }

        if (mesc < 0) {
            anoc--;
            mesc += 12;
        }

        edad = anoc + "anos, " + mesc + "meses, " + diac + "dias.";
        return edad;
    }

    public int MostrarAno(){
        int diaa = 18;
        int mesa = 10;
        int anoa = 2025;
        String edad;
        int anoc = anoa-this.ano;
        int mesc = mesa -this.mes;
        int diac = diaa -this.dia;


        if (diac < 0) {
            mesc--;
            diac += 30;
        }

        if (mesc < 0) {
            anoc--;
            mesc += 12;
        }


        return anoc;
    }
}
