/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package github;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Mnozenie{
    public static void main(String[] args){
        System.out.println("Podaj a * b");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.println("Wynik: " + x*y);
    }
    
}
