package interfacesegregation;

public class BasicHPPrinter implements Printer{
    @Override
    public void print() {
        System.out.println("Printing with HP Printer");
    }

  }
