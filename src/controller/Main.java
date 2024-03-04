/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Data;
import view.UserView;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        Data data = new Data(UserView.getUserInput());
        Controller.setData(data);
        UserView.displayResult(data);
    }
    
    
}
