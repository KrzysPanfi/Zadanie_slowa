import java.io.BufferedReader;

import java.io.FileReader;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> lista_slow = new ArrayList<String>();
        String filePath = "Z:slowa.txt";
        int num=0;

        try {


            FileReader fileReader = new FileReader(filePath);


            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;


            while ((line = bufferedReader.readLine()) != null) {

                String[] lines = line.split(",");
               String word1=lines[0];
               String word2=lines[1];
                lista_slow.add(word1);
                lista_slow.add(word2);
            }
            for (String i:lista_slow) {
                char[] slowa_char=i.toCharArray();
                if(slowa_char[slowa_char.length-1]=='A'){
                    num++;
                }
            }
            System.out.println("Zad1: "+num);

            bufferedReader.close();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}