/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.revature.eval.java.core;

/**
 *
 * @author James
 */
public class Main {
    
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.reverse("revature"));
    }
    
    public String reverse(String string) {
        String newString = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            newString += string.charAt(i);
        }
        return newString;
    }
    
    
}
