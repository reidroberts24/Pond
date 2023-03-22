public class Pond {
    // methods:
        // main method
        public static void main(String[] args) {
            Frog peepo = new Frog("Peepo");
            Frog pepe = new Frog("Pepe",10,15);
            Frog peepaw = new Frog("Peepaw",4.6,5);
            Frog kermit = new Frog("Kermit", 25, 25);

            Fly mosquito = new Fly(1,3);
            Fly horsefly = new Fly(6);
            Fly wasp = new Fly(10,10);

            kermit.setSpecies("1331 Frogs");
            System.out.println(peepo.toString());
            peepo.eat(horsefly);
            System.out.println(horsefly.toString());
            peepo.grow(8);
            peepo.eat(horsefly);
            System.out.println(horsefly.toString());
            System.out.println(peepo.toString());
            System.out.println(kermit.toString());
            peepaw.grow(4);
            System.out.println(peepaw.toString());
            System.out.println(pepe.toString());
        }
    
    }
