package FlyWeight;

/**
 * Created by pawel on 10.05.16.
 */


interface Posilek {
    public String dawajNazwe();
}


class Pizza implements Posilek {
    public String dawajNazwe() {
        return "Pizza";
    }
}


abstract class Zmiana implements Posilek {
    protected Posilek posilek;

    protected Zmiana(Posilek p) {
        this.posilek = p;
    }

    public abstract String dawajNazwe();
}


class Sos extends Zmiana {
    public Sos(Posilek posilek) {
        super(posilek);
    }

    public String dawajNazwe() {
        return posilek.dawajNazwe() + " + sos";
    }
}


class Ser extends Zmiana {
    public Ser(Posilek posilek) {
        super(posilek);
    }

    public String dawajNazwe() {
        return posilek.dawajNazwe() + " + ser";
    }
}


public class Main {
    public static void main(String[] args) {
        Posilek posilek = new Pizza();
        posilek = new Sos(posilek);
        System.out.println(posilek.dawajNazwe());
        posilek = new Ser(posilek);
        System.out.println(posilek.dawajNazwe());
    }
}

