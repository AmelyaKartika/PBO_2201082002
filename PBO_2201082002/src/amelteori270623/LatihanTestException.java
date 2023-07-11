/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package amelteori270623;

/**
 *
 * @author hp
 */
public class LatihanTestException {
    public static void main(String[] args) {
        try {
            for (int i = 3; true; i++) {
                System.out.println("args[" + i + "]=" + args[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught:");
            System.out.println(e);
            System.out.println("Quitting...");
        } catch (Exception e) {
            System.out.println("Exception caught:");
            System.out.println(e);
            System.out.println("Quitting...");
        }
    }
}
