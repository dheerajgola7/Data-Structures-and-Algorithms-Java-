package classProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
// vowels occurrence count by using the  HashMap collection class
public class vowelsOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character,Integer> obj = new HashMap<>();
        obj.put('a',0);
        obj.put('e',0);
        obj.put('i',0);
        obj.put('o',0);
        obj.put('u',0);
        System.out.println("Enter the string to count vowels: ");
        String str = sc.nextLine().toLowerCase();
        for (int i = 0; i <str.length() ; i++)
        {
            if(obj.containsKey(str.charAt(i)))
            {
                int ctr= obj.get(str.charAt(i));
                obj.put(str.charAt(i),++ctr);
            }
        }
        System.out.println(obj);
    }
}
