public class Main {
    public static void main(String[] args) {

        var resultado = suma(10,30,40);
        System.out.println(resultado);

        Coche MiCoche = new Coche();
        MiCoche.SumarPuerta();
        MiCoche.SumarPuerta();
        System.out.println(MiCoche.puerta);




        int numeroIf = 3;
        if (numeroIf == 0){
            System.out.println("Es igual a 0");
        } else if (numeroIf < 0) {
            System.out.println("Es negativo");
        } else {
            System.out.println("Es positivo");
        }

        int numeroWhile = 0;
        while (numeroWhile < 3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        int numeroDo = 0;
        do {
            numeroDo++;
        }while (numeroDo < 3) ;{
            System.out.println(numeroDo);
        }

        for (int i = 0; i <=3; i++){
            System.out.println(i);
        }

        var estacion = "verano";
        switch (estacion){
            case "verano":
                System.out.println("es verano");
                break;
            case "otonio":
                System.out.println("es otonio");
                break;
            case "invierno":
                System.out.println("es invierno");
                break;
            case "primavera":
                System.out.println("es primavera");
                break;
            default:
                System.out.println("no hay una estacion definida");
        }

    }
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}

class Coche {
    public int puerta = 1;

    public void SumarPuerta(){
        this.puerta++;
    }
}