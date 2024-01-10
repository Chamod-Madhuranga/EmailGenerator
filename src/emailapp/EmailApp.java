/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package emailapp;

/**
 *
 * @author Chamod
 */
public class EmailApp {

    public static void main(String[] args) {
        Email ema1 = new Email(" Chamod " , " Madhuranga ");
        
        ema1.setalternateEmail("abc@gmail.com");
        System.out.println(ema1.getinfo());
    }
    
}
