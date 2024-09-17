package interfacesegregation;

public class HPPrinter implements Printer,Scanner{
    @Override
    public void print() {
        System.out.println("Printing with HP Printer");
    }

    @Override
    public void scan() {
        System.out.println("Scanning with HP Printer");
    }
}
