/*
    You have been given a string. You have to obtain different combinations of the string or in other words permutations of the given string and all the sub-strings in alphabetical order.
   
   Note: The characters within the sub-string can be repeated.
    */
   
   import java.util.*;
   public class lexicographic {
       // Recursive function to print permutations
       static void printLexicographicOrder(String s, String result) {
           // Base condition: if the result length matches input string
           if (result.length() == s.length()) {
               System.out.print(result + " ");
               return;
           }
           // Generate all permutations by appending each character
           for (char c : s.toCharArray()) {
               printLexicographicOrder(s, result + c);
           }
       }
       // Wrapper function
       static void findLexicographic(String s) {
           if (s == null || s.isEmpty()) {
               return;
           }
           // Sort the string to ensure lexicographic order
           char[] chars = s.toCharArray();
           Arrays.sort(chars);
           // Call recursive function
           printLexicographicOrder(new String(chars), "");
       }
       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           String s = scanner.next();
           findLexicographic(s);
       }
   }
   
   /*
       OUTPUT : 
       input: abc
       output: aaa aab aac aba abb abc aca acb acc baa bab bac bba bbb bbc bca bcb bcc caa cab cac cba cbb cbc cca ccb ccc
    */
   
    

