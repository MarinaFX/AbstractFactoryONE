package Factory;

import FXSystem.*;

public class ConcretePrinterFactory implements PrintFactory {
    @Override
    public PrinterOutput createPrinter(boolean bool) {
        if (bool){
            return new Screen();
        }
        else{
            return new FileOutput();
        }
    }
}
