package loosecouplingexample;

public class Phone {

    private Sim sim;

    public void setSim(Sim sim) {
        this.sim = sim;
    }

    public void browseInternet(){
        sim.browseInternet();
    }

    public void call(){
        sim.call();
    }


}
