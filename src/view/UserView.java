/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import model.Data;
import util.InputUtils;

/**
 *
 * @author nhs
 */
public class UserView {
    public static String getUserInput(){
        System.out.println("===== Analysis String program ====");
        System.out.print("Input String: ");
        String inputString = InputUtils.inputString();
        return inputString;
    }
    
    public static void displayResult(Data data){
        System.out.println("-----Result AnaLysis------");
        System.out.println("Perfect Square Number: " + data.getSquareList());
        System.out.println("Even Numbers: "+ data.getEvenList());
        System.out.println("Odd Numbers" + data.getOddList());
        System.out.println("Uppercase Characters: " + data.getUpperChar());
        System.out.println("Lowercase Characters: " + data.getLowerChar());
        System.out.println("Special Characters: "+ data.getSpecialChar());
        System.out.println("All Characters: "+ data.getAllChar());
    }
}
