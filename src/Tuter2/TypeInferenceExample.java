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
public class TypeInferenceExample {
    public static void main(String[] args) {
        StringLengthLamda myLambda =  s -> s.length();
        System.out.println(myLambda.getLength("Manjit"));
        printLambda(myLambda);
    }
    
    public static void printLambda(StringLengthLamda l){
        System.out.println(l.getLength("Shakya"));
    }
    
    interface StringLengthLamda{
        int getLength(String j);
    }
}
