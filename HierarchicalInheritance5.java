
class India {
    void countryInfo() {
        System.out.println("Country: India");
        System.out.println("Capital: New Delhi");
    }
}
class Maharashtra extends India {
    void stateInfo() {
        System.out.println("State: Maharashtra");
        System.out.println("Capital: Mumbai");
        System.out.println("Language: Marathi");
    }
}
class Karnataka extends India {
    void stateInfo() {
        System.out.println("State: Karnataka");
        System.out.println("Capital: Bengaluru");
        System.out.println("Language: Kannada");
    }
}
class TamilNadu extends India {
    void stateInfo() {
        System.out.println("State: Tamil Nadu");
        System.out.println("Capital: Chennai");
        System.out.println("Language: Tamil");
    }
}
public class HierarchicalInheritance5 {
    public static void main(String[] args) {
        System.out.println("Hierarchical Inheritance Example: Indian States");

        Maharashtra mh = new Maharashtra();
        mh.countryInfo();
        mh.stateInfo();

        Karnataka ka = new Karnataka();
        ka.countryInfo();
        ka.stateInfo();

        TamilNadu tn = new TamilNadu();
        tn.countryInfo();
        tn.stateInfo();
    }
}
