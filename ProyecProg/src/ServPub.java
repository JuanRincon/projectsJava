import java.util.Scanner;

public class ServPub {
    public static void main(String[] args) {

        System.out.println("Escriba el valor anterior de la factura");
        Scanner valFacAnt = new Scanner (System.in);
        double facAnt = Integer.valueOf(valFacAnt.nextLine());
        System.out.println("Escriba el valor actual de la factura");
        Scanner valFacAct = new Scanner (System.in);
        double facAct = Integer.valueOf(valFacAct.nextLine());

        //int Consumo = ;
        System.out.println("El valor a pagar es de " +  vFact());
    }
    int Imp = 525;
    int VAL_KVOL = 1000;
    double T_ASEO = 0.1;
    public static double vFact(double facAnt, double facAct){
        return (((facAct - facAnt)*VAL_KVOL)*(1+T_ASEO) + Imp);
    }
}
