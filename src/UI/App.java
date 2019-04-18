package UI;

/**
 * Welcome to my program! \o/
 * We are on the big league now right?
 * This is my first try on Project's Patterns.
 * on this program I am practicing about Abstract Factory pattern. My favorite as far as I got.
 * ============================================SPECS======================================================
 * We need to use the Abstract design pattern to print a 'Hello World' for you but in two different ways.
 * And that is where the design pattern comes in handy!
 * Randomly, we need to choose between weather printing the message on your screen,
 * weather we print the sentence on a file (but that does not matter).
 * Enjoy!
 * Date - 04.18.2019
 *        mm.dd.yyyy
 */

import FXSystem.*;
import Factory.ConcretePrinterFactory;

import java.util.Random;

public class App {
    private static void showMessage(){
        try {
            System.out.println("0.K, without further do, let's start de program!");
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        PrinterOutput printer;
        boolean answer;
        answer = random.nextBoolean();

        System.out.println("==================START==================");

        App.showMessage();
        printer = new ConcretePrinterFactory().createPrinter(answer);
        printer.printMsg();

        System.out.println("===================END===================");
    }
}
