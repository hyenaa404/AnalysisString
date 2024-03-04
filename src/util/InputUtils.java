/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class InputUtils {

    public static Scanner sc = new Scanner(System.in);

    public static String inputString() {
        String str;
        while (true) {
            try {
                str = sc.nextLine();
                if (str.isBlank()) {
                    throw new Exception("Invalid input.");
                }
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return str;
    }
}
