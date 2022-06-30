import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListoRikiavimas {
    public static void main(String[] args) {
        ArrayList<Double> skaiciai = listoNuskaitymas();

        Collections.sort(skaiciai);

        System.out.println("skaiciai = " + skaiciai);

        Collections.sort(skaiciai, Collections.reverseOrder());

        System.out.println("skaiciai = " + skaiciai);

    }


    /**
     * FUnkcija nuskaito listą iš konsolės
     * @return nuskaitytą listą
     */
    public static ArrayList<Double> listoNuskaitymas() {
        Scanner skaitytuvas = new Scanner(System.in);
        ArrayList<Double> listas = new ArrayList<>();
        System.out.println("Įveskite kiek bus list'e skaičių: ");
        int n = skaitytuvas.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Įveskite listo " + i + "-ąjį skaičių");
            listas.add(skaitytuvas.nextDouble());
        }
        return listas;
    }
}
