package ba.unsa.etf.rs;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);

        String str = "";
        System.out.println("Unesite jednu recenicu: ");
        str = ulaz.nextLine();

        //rastavlja recenicu
        String[] strArr = str.split(" ");

        //ispis promjenjene recenice
        System.out.println(najvecaRijec(strArr));
    }

    private static String najvecaRijec(String[] strArr) {
        //posljednja najduza rijec
        String max = "";

        //nalazi najvecu rijec
        for(String item : strArr){
            if(max.length()<item.length()) max=item;
        }

        String s = "";
        //indeksiranje forloop-a
        int i = 0;
        for (String item : strArr) {
            if (max.equals(item)) {
                s += item.toUpperCase();
            } else {
                s += item;
            }
            if (i < strArr.length - 1) s += ' ';
            i = i + 1;
        }

        return s;
    }
}
