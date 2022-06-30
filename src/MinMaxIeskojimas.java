import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinMaxIeskojimas {
    public static void main(String[] args) {
        ArrayList<Integer> skaiciai = listoNuskaitymas();

        System.out.println("skaiciai = " + skaiciai);

        System.out.println("listoMaximumas(skaiciai) = " + listoMaximumas(skaiciai));
        System.out.println("listoMinimumas(skaiciai) = " + listoMinimumas(skaiciai));


    }

    /**
     * FUnkcija nuskaito listą iš konsolės
     * @return nuskaitytą listą
     */
    public static ArrayList<Integer>listoNuskaitymas() {
        Scanner skaitytuvas = new Scanner(System.in);
        ArrayList<Integer> listas = new ArrayList<>();
        System.out.println("Įveskite kiek bus list'e skaičių: ");
        int n = skaitytuvas.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Įveskite listo " + i + "-ąjį skaičių");
            listas.add(skaitytuvas.nextInt());
        }
        return listas;
    }


    public static int listoMaximumas(ArrayList<Integer> listas) {
        int laikinasMaximumas = listas.get(0);
        for (Integer skaicius : listas) {         // skaicius = listas.get(i)
            if (skaicius > laikinasMaximumas) {
                laikinasMaximumas = skaicius;
            }
        }
        return laikinasMaximumas;
    }


    public static int listoMinimumas(ArrayList<Integer> listas) {
        int laikinasMinimumas = listas.get(0);
        for (Integer skaicius : listas) {         // skaicius = listas.get(i)
            if (skaicius < laikinasMinimumas) {
                laikinasMinimumas = skaicius;
            }
        }
        return laikinasMinimumas;
    }

}
