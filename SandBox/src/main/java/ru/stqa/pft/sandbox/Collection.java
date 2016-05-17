package ru.stqa.pft.sandbox;

/**
 * Created by Dmitry on 17.05.2016.
 */
public class Collection {

    public static void main(String[] args){
        String[] langs = new String [4];
        langs[0] = "Java";
        langs[1] = "c#";
        langs[2] = "python";
        langs[3] = "php";

        for (String l : langs){
            System.out.println("Я хочу выучить " + l);
        }

    }
}
