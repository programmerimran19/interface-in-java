/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package display;

//import java.util.Scanner;

import java.util.Scanner;


/**
 *
 * @author Programmer Imran
 */
public class Display {
    
    /*void show()
    {
        System.out.println("Java Interface Implementation");
    }*/

    
    public static void main(String[] args) {
        
        //Display D = new Display();
        //D.show();
        
        System.out.println("Addition Input:");
        Scanner Add = new Scanner (System.in);
        int i = Add.nextInt();
        int j = Add.nextInt();
        
        Addition A = new Addition();
        //A.calculate(10, 10);
        A.calculate(i, j);
        
        /*System.out.println("Subtraction Input:");
        Scanner Sub = new Scanner (System.in);
        int a = Sub.nextInt();
        int b = Sub.nextInt();*/
        Subtraction S = new Subtraction();
        S.calculate(10, 5);
        //S.calculate(a, b);
        
        /*System.out.println("Multiplication Input:");
        Scanner Mul = new Scanner (System.in);
        int c = Mul.nextInt();
        int d = Mul.nextInt();*/
        Multiplication M = new Multiplication();
        M.calculate(10, 10);
        //M.calculate(c, d);
        
    }
    
}
