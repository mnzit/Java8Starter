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
public class RunnableExample {
    public static void main(String[] args) {
        Thread myThread = new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println("Printed inside Runnable");
            }
            
        });
        
        myThread.run();
        
        Thread myLamdbaThread = new Thread(()->System.out.println("Lambda Runnable"));
        myLamdbaThread.run();
    }
}
