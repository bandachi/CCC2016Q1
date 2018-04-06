import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    public static void main (String args[]) {
        int i = 0;
        int j = 0;
        int counter = 0;
        Scanner input = new Scanner(System.in);
        String line[] = input.nextLine().split("");
        String anagram[] = input.nextLine().split("");
        Arrays.sort(line, Collections.reverseOrder());
        Arrays.sort(anagram, Collections.reverseOrder());
        int N = line.length;
        if (line.length!=anagram.length){
            System.out.print("N");
        }
        for (i=0;i<line.length;i++){
            if ("*".equals(anagram[i])){
                counter++;
            }
        }
        for (i=0;i<N;i++){
            if (line[j].equals(anagram[i])){
            } else {
                counter--;
                i--;
                N--;
            }
            j++;
        }
        if (counter>=0){
            System.out.print("A");
        }
        else{
            System.out.print("N");
        }
    
    }
}