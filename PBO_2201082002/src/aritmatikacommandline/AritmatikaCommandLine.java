/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aritmatikacommandline;

/**
 *
 * @author hp
 */
public class AritmatikaCommandLine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        if (args.length != 2) {
            System.out.println("Usage: java ArithmeticOperation <number1> <number2>");
            return;
        }
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
    
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
        System.out.println("Product   = " + product);
        System.out.println("Quotient   = " + quotient);
    // TODO code application logic here
    }
    
}
