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
public class MethodReferenceExample1 {

    public static void main(String[] args) {
        Thread t = new Thread( MethodReferenceExample1:: printMsg); // () -> printMsg()
        t.start();
    
    }

    public static void printMsg() {
        System.out.println("Hello");
    }
}
