package FXSystem;

import java.io.*;

public class FileOutput implements PrinterOutput {
    @Override
    public void printMsg() {

        try {
            FileWriter file = new FileWriter("output.txt", false);
            PrintWriter printer = new PrintWriter(file);

            printer.write("Hello World!");
            printer.close();
            System.out.println("Checkout 'output.txt' file :D");

        } catch (IOException e) {
            e.getCause();
        }
    }
}
