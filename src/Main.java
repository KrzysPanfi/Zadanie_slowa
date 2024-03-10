import java.io.BufferedReader;

import java.io.FileReader;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String filePath = "C:\\Users\\PC\\Desktop\\prace szkolne\\slowa.txt";
        ArrayList<String> lista_slow = Wczytaj_dane(filePath);
        if (lista_slow != null) {
            //zad 1
            System.out.println("Zad1: " + Zad1(lista_slow));

            //zad 2

            System.out.println("Zad2: " + Zad2(lista_slow));

            //zad3
            for (String i : Zad3(lista_slow)) {
                System.out.println(i);
            }
        }

    }

    private static ArrayList<String> Zad3(ArrayList<String> lista_slow) {
        ArrayList<String> Wynik = new ArrayList<String>();
        Wynik.add("Zad3:");
        for (String i : lista_slow) {
            String[] slowa = i.split(" ");
            char[] str1 = slowa[0].toCharArray();
            char[] str2 = slowa[1].toCharArray();

            Arrays.sort(str1);
            Arrays.sort(str2);
            if (Arrays.equals(str1, str2)) {
                Wynik.add(i);
            }
        }
        return Wynik;
    }

    private static int Zad2(ArrayList<String> lista_slow) {
        int count = 0;
        for (String s : lista_slow) {
            String[] slowa = s.split(" ");
            String slowo1 = slowa[0];
            String slowo2 = slowa[1];
            if (slowo2.contains(slowo1)) {
                count++;
            }
        }
        return count;
    }

    private static int Zad1(ArrayList<String> lista_slow) {
        int num = 0;
        for (String i : lista_slow) {
            String[] slowa = i.split(" ");
            for (int j = 0; j < 2; j++) {
                char[] slowa_char = slowa[j].toCharArray();
                if (slowa_char[slowa_char.length - 1] == 'A') {
                    num++;
                }
            }
        }
        return num;
    }

    private static ArrayList<String> Wczytaj_dane(String filePath) {
        ArrayList<String> lista_slow = new ArrayList<String>();
        try {


            FileReader fileReader = new FileReader(filePath);


            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;


            while ((line = bufferedReader.readLine()) != null) {
                lista_slow.add(line);
            }

            bufferedReader.close();
            return lista_slow;

        } catch (IOException e) {

            e.printStackTrace();
            return null;
        }
    }
}