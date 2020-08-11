/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary2decimal;

import java.util.Scanner;

/**
 *
 * @author Lenovo ThinkPad L520
 */
public class Binary2Decimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean isTrue = false;
        Scanner kb = new Scanner(System.in);

        do {
            System.out.print("Binary : ");
            String bin = kb.nextLine();
            if (String.valueOf(bin).length() < 8) {
                if (bin.matches("^[01]+$")) {
                    System.out.println("Decimal : " + Integer.parseInt(bin, 2));
                    isTrue = true;
                } else {
                    System.out.println("Please enter a binary number(0 or 1)");
                }
            } else {
                System.out.println("Binary can't be more than 8 digits.");
            }
        } while (!isTrue);
    }
}
