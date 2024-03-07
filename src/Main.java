import java.io.BufferedReader;

import java.io.FileReader;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        String filePath = "Z:slowa.txt";
        ArrayList<String> lista_slow = Wczytaj_dane(filePath);
        if(lista_slow!=null){
        //zad 1
        System.out.println("Zad1: "+Zad1(lista_slow));


         //zad 2

        System.out.println("Zad2: "+Zad2(lista_slow));
        }

         }
         //zad3
private static boolean zad3(ArrayList<String> lista_slow){
        for(String i:lista_slow) {
            String[] slowa=i.split(" ");
        }

    int n1 = str1.length;
    int n2 = str2.length;

    // If length of both strings is not
    // same, then they cannot be anagram
    if (n1 != n2)
        return false;

    // Sort both strings
    Arrays.sort(str1);
    Arrays.sort(str2);

    // Compare sorted strings
    for (int i = 0; i < n1; i++)
        if (str1[i] != str2[i])
            return false;

    return true;
}
}
    private static int Zad2(ArrayList<String> lista_slow) {
        int count=0;
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
        int num=0;
        for (String i: lista_slow) {
            String[] slowa=i.split(" ");
            for(int j=0 ;j<2;j++) {
                char[] slowa_char = slowa[j].toCharArray();
                if (slowa_char[slowa_char.length - 1] == 'A') {
                    num++;
                }
            }
        }
        return num;
    }

    private static ArrayList<String> Wczytaj_dane( String filePath) {
        ArrayList<String> lista_slow=new ArrayList<String>();
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