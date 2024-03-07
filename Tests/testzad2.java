import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class testzad2 {

    @Test
    public void testzad2() {
        String filePath = "Z:slowa.txt";
        ArrayList<String> lista_slow = Wczytaj_dane(filePath);
        int count = 0;
        for (int i = lista_slow.size() - 1; i > 0; i--) {

            if (lista_slow.get(i).contains(lista_slow.get(i - 1))) {
                count++;
            }
        }
        Assert.assertEquals(234,count);
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