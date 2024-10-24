public class Luminaire implements Eclairage{
    private  AmpouleLED ampoule1;
    private  AmpouleLED ampoule2;
    private  AmpouleLED ampoule3;
    private  AmpouleLED ampoule4;

    public Luminaire() {
        ampoule1 = new AmpouleLED("incandesance",10);
        ampoule2 = new AmpouleLED("incandesance",10);
        ampoule3 = new AmpouleLED("tube",5);
        ampoule4 = new AmpouleLED();
    }

    @Override
    public void allumer() {
        ampoule1.allumer();
        ampoule2.allumer();
        ampoule3.allumer();
        ampoule4.allumer();
    }

    @Override
    public void eteindre() {
        ampoule1.eteindre();
        ampoule2.eteindre();
        ampoule3.eteindre();
        ampoule4.eteindre();
    }

    @Override
    public void intensifier() {
        ampoule1.intensifier();
        ampoule2.intensifier();
        ampoule3.intensifier();
        ampoule4.intensifier();

    }

    @Override
    public void diminuer() {
        ampoule1.diminuer();
        ampoule2.diminuer();
        ampoule3.diminuer();
        ampoule4.diminuer();

    }

    @Override
    public int etat() {
     //   int produit=ampoule1.etat()*ampoule2.etat();
     //   int produit2=ampoule3.etat()*ampoule4.etat();
     //   if (produit<0 && produit2<0)
     //       return -1;
     //  int et=1;
     //  if(ampoule1.etat()<0)
     //      et=ampoule1.etat();
     //  if(ampoule2.etat()<0)
     //      et=ampoule2.etat();
       // if(ampoule3.etat()<0)
      //      et=ampoule3.etat();
      //  if(ampoule4.etat()<0)
      //      et=ampoule4.etat();
      //

        return ampoule1.etat();
    }

    @Override
    public String toString() {
        return "Luminaire{" +
                "ampoule1=" + ampoule1 +
                ", ampoule2=" + ampoule2 +
                ", ampoule3=" + ampoule3 +
                ", ampoule4=" + ampoule4 +
                '}';
    }
}
