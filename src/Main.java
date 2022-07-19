public class Main {
    public static void main(String[] args) {

        var resultant = suma(23,56,76);
        System.out.println(resultant);

        Coche miCoche = new Coche();
        miCoche.SummaryPuerto();
        System.out.println(miCoche.puerta);
    }

    public static int suma (int a,int b,int c){
        return a + b + c;
    }


}

 class Coche {
    public int puerta = 4;

    public void SummaryPuerto() {
        this.puerta++;
    }
}