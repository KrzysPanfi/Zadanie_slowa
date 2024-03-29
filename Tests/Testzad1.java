import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class Testzad1 {
    public void testzad1() {
        String filePath = "Z:slowa.txt";
        ArrayList<String> lista_slow = Wczytaj_dane(filePath);
        int num = 0;
        for (String i : lista_slow) {
            char[] slowa_char = i.toCharArray();
            if (slowa_char[slowa_char.length - 1] == 'A') {
                num++;
            }
        }
        assertEquals(71,num);
    }
    private static ArrayList<String> Wczytaj_dane(String filePath) {
        ArrayList<String> lista_slow=new ArrayList<String>();
        try {


            FileReader fileReader = new FileReader(filePath);


            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;


            while ((line = bufferedReader.readLine()) != null) {
                String[] lines = line.split(" ");
                String word1=lines[0];
                String word2=lines[1];
                lista_slow.add(word1);
                lista_slow.add(word2);
            }

            bufferedReader.close();
            return lista_slow;

        } catch (IOException e) {

            e.printStackTrace();
            return null;
        }
    }
}
