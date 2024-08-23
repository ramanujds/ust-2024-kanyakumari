package interfaceexamples;

public class CanonPrinter implements Printable,Scannable{

    public void print() {
        System.out.println("Hello from HP");
    }


    public void scan() {
        System.out.println("Scanning with HP");
    }
}
