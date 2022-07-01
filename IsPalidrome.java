import java.io.Console;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.awt.SystemColor.text;

public class mycalss {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();

        isPalindrome(text);

    }

    public static boolean  isPalindrome(String text){
        String x = null;

        for(int k=text.length()-1;k>=0;k--){
            x +=text.charAt(k);
        }

        if(x.contains(text))
            return true;
        else
            return false;
    }

}
