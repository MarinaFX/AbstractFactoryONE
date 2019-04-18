package Factory;

import FXSystem.PrinterOutput;

public interface PrintFactory {
    PrinterOutput createPrinter(boolean bool);
}
