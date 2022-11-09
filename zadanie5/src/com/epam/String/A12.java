package com.epam.String;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
    В стихотворении найти количество слов, начинающихся и заканчивающихся гласной буквой.
*/
public class A12 {

    public void A12(String path) {

        int n=0;

        try{

            FileInputStream fs = new FileInputStream(path);
            BufferedReader br = new BufferedReader(new InputStreamReader(fs));
            String line;

            while ((line = br.readLine()) != null){

                String sbLowercase=line.toLowerCase();
                String[] str = sbLowercase.split("[ —,;:.!?]");

                Pattern pattern = Pattern.compile("^[уеёыаоэяию].*[уеёыаоэяию]$");

                for (String word : str) {
                   Matcher matcher = pattern.matcher(word);
                    if (matcher.find()) {
                        n++;
                        System.out.println(word);
                    }
                }
            }

            System.out.println(n);

            fs.close();
            br.close();
        }catch (IOException e){
            System.out.println("Ошибка");
        }



    }
}
