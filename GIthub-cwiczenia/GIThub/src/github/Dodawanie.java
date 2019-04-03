
package github;

import java.util.Scanner;

public class Dodawanie {
   public static void main(String[] args){
       int a,b;
       Scanner sc = new Scanner(System.in);
       System.out.println("Dodawanie");
       System.out.println("Podaj a:");
       a = sc.nextInt();
       
       System.out.println("Podaj b:");
       b = sc.nextInt();
       
       System.out.println("Wynik:"+(a+b));
   }
    
    
}
