package ru.stqa.pft.sandbox;

/**
 * Created by user on 5/18/2016.
 */
public class Voprosy {

    public static void main(String[] args){
    String word = "abcde";
        {
            for (
                    int i = 0;
                    i < 4; i += 2)
                System.out.print(word.charAt(i));
        }
    }
    public static class  ChangeIt   {
        static void doIt(int[] z){
            z[0] = 0;
        }
    }

    public static class TestIt
    {
        public static void main ( String[] args)
        {
            int[] myArray = {1, 2, 3, 4, 5} ;
            ChangeIt.doIt( myArray );
            for (int j=0; j<myArray.length; j++ )
                System.out.print( myArray[j] + " " ) ;
        }
    }


}




