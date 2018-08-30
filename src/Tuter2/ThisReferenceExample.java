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
public class ThisReferenceExample {

    public void doProcess(int i, Process p) {
        p.process(i);
    }
    
    public void execute(){
        doProcess(10, i -> {
            System.out.println("Value of i is "+i);
            System.out.println(this);
        });
    }

    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
//        thisReferenceExample.doProcess(10, i -> {
//            System.out.println("Value of i is "+i);
////            System.out.println(this); This will not work
//        });
        thisReferenceExample.execute();
    }
    
    public String toString(){
        return "This is the main ThisReferenceExample class instance"; 
    }
}
