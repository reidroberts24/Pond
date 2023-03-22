public class Frog {
    //variables: name, age, tongueSpeed, isFroglet, species

    private String name;
    private int age;
    private double tongueSpeed;
    protected boolean isFroglet;
    private static String species = "Rare Pepe";

    //constructors:

    public Frog(String name, int age, double tongueSpeed) {
        this.name = name;
        this.age = age;
        this.tongueSpeed = tongueSpeed;
        this.updateIsFroglet();

    }
    public Frog(String name, double ageInYears, double tongueSpeed) {
        this.age = (int)(ageInYears * 12);
        this.name = name;
        this.tongueSpeed = tongueSpeed;
        this.updateIsFroglet();
    }
    public Frog(String name) {
        this(name, 5, 5);
        this.updateIsFroglet();
    }
    private void updateIsFroglet() {
        if (this.age >1 && this.age < 7) {
            this.isFroglet = true;
        } else {
            this.isFroglet = false;
        }
    
        // takes name, age, and tongueSpeed
        // takes name, ageInYears (as double), tongueSpeed
        // takes name (default 5 months old and tongueSpeed 5)
    //methods:
    }
    public void grow(int growAmount) {
        //System.out.println("Current age: " +this.age);
        for (int i = 1; i <= growAmount; i++) {
            if (this.age < 12) {
                this.tongueSpeed += 1;
            } else if (this.age >= 30) {
                if (this.tongueSpeed == 5) {
                    this.age += 1;
                    continue;
                } else {
                    this.tongueSpeed -= 1;
                }
            }
            this.age += 1;
        }
        updateIsFroglet();
        }
    public void grow() {
        this.grow(1);
    }
 
        // eat
        // toString
        // setter and getter for species 

    public void eat(Fly fly) {
        if (fly.isDead() == true) {
            return;
        } else if (this.tongueSpeed > fly.getSpeed()) {
            if (fly.getMass() >= this.age/2) {
                this.grow(1);
            }
            fly.setMass(0);
        } else if (this.tongueSpeed <= fly.getSpeed()) {
            fly.grow(1);
        }
    }
    public String toString() {
        String str;
        if (this.isFroglet == true) {
            str = "My name is " + this.name + " and I'm a rare froglet! I'm " + this.age + " months old and my tongue has a speed of " + this.tongueSpeed + ".";
        } else {
            str =  "My name is " + this.name + " and I'm a rare frog. I'm " + this.age + " months old and my tongue has a speed of " + this.tongueSpeed + ".";
        }
        return str;
    }
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
    public static void main(String[] args) {
        Frog test = new Frog("test",59,5);
        System.out.println(test.toString());
        test.grow(8);
        System.out.println(test.toString());

    }

}
