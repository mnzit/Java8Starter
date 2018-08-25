/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuter2;

/**
 *
 * @author Dell
 */
public class Greeter {
    
    public void greet(){
        System.out.println("Hello World!");
    }
    
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        greeter.greet();
    }
}
