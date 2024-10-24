

public class AmpouleLED extends Ampoile implements Eclairage {

    public AmpouleLED() {
        super("LED",1);
    }

    public AmpouleLED(String nom, double probaP) {
        super(nom, probaP);
    }
}