package loosecouplingexample;

public class App {

    public static void main(String[] args) {
        Phone phone = new Phone();
        JioSim sim1 = new JioSim();
        AirtelSim sim2 = new AirtelSim();
        phone.setSim(sim2);
        phone.call();
    }
}
