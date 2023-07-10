/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package amelteori270623;

/**
 *
 * @author hp
 */
public class Latihan2 {
  public static void main(String[] args) {
    try {
        System.out.println(args[0]);
        System.out.println(1 / 0);
    } catch (ArithmeticException ex) {
        System.err.println(ex.getMessage());
    } catch (ArrayIndexOutOfBoundsException ex) {
        System.out.println(ex.getMessage());
    } finally {
        System.out.println("Ini selalu dieksekusi");
    }
}
}



