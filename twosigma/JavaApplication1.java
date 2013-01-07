package javaapplication1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class JavaApplication1 {
    public static void main(String[] args) {
        //Read from stdin
        Scanner in = new Scanner(System.in);
        
        while(true) {
            System.out.println("\nINPUT:");
            String s = in.nextLine();
            
            //Split the input using space as separator
            String[] arr = s.split("\\s");
            
            int l = arr.length;
            int[] kk = new int[l];
            
            ArrayList<Integer> arrI = new ArrayList<Integer>();
            TreeMap<String, String> arrS = new TreeMap<String, String>();
            
            //Loop through the input to separater words and numbers
            for (int i = 0; i < l; i++)
            {
                if (isNum(arr[i])){
                    arrI.add(Integer.parseInt(arr[i]));
                    kk[i] = 1;
                }
                else arrS.put(arr[i].toLowerCase(), arr[i]);
            }
            
            Collections.sort(arrI);
            
            int w = 0;
            System.out.println("OUTPUT:");
            
            //Reassemble the input
            for (int i = 0; i < l; i++)
            {
                if (kk[i] == 1) System.out.print(arrI.get(w++));
                else {
                    System.out.print(arrS.get(arrS.firstKey()));
                    arrS.remove(arrS.firstKey());
                }
                if(i != l-1) System.out.print(" ");
            }    
        }    
    }

    public static boolean isNum(String str)
    {
        char w = str.charAt(0);
        //if the string does not start with '-' and does not start with letter between 0 and 9
        //then it's not a number.
        if (w != '-' && (w > 57 || w < 48)) return false;
        
        //if any of characters in the string is not a number
        //return false
        for (int i = 1; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c > 57 || c < 48) return false;
        }
        
        //otherwise return true
        return true;
    }
}
