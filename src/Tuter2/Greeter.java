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

    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        Greeting helloworldgreeting = new HelloWorldGreeting();
        greeter.greet(helloworldgreeting);

        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello World From inner class");
            }
        };
        innerClassGreeting.perform();
        
        Greeting myLambdaFunction = () -> System.out.println("Hello World From Lambda!");
        myLambdaFunction.perform();
        
        greeter.greet(() -> System.out.println("Hello World From Lambda!"));
    }
}
