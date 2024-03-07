import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class Testzad3 {
    @Test
    public  void testzad3() {
        String filePath = "Z:slowa.txt";
        ArrayList<String>lista_slow=Wczytaj_dane(filePath);
        if(lista_slow!=null){
            assertEquals(38,Zad3(lista_slow));
        }

    }
        private static int Zad3(ArrayList<String> lista_slow) {
            int count =0;
            for (String i : lista_slow) {
                String[] slowa = i.split(" ");
                char[] str1=slowa[0].toCharArray();
                char[] str2=slowa[1].toCharArray();

                Arrays.sort(str1);
                Arrays.sort(str2);
                if(Arrays.equals(str1,str2)){
                    count++;
                }
            }
            return count;
        }


    private static ArrayList<String> Wczytaj_dane(String filePath) {
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