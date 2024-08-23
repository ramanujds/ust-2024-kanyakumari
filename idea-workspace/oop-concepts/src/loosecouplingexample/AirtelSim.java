package loosecouplingexample;

public class AirtelSim implements Sim {

    public void call(){
        System.out.println("Calling with Airtel");
    }

    public void browseInternet(){
        System.out.println("Browsing internet with Airtel");
    }

}
