public class Fly {
    //variables: mass, speed
    private double mass;
    private double speed;
    
    //constructors: (must use chaining in 2 of them)
        // 1) takes in mass and speed
        // 2) takes in only mass (defgault 10 speed)
        // 3) takes no parameters (default 5 mass and 10 speed)
    public Fly(double mass, double speed) {
        this.mass = mass;
        this.speed = speed;
    }
    public Fly(double mass) {
        this(mass, 10.0);
    }
    public Fly() {
        this(5.0, 10.0);
    }
    public double getMass() {
        return mass;
    }
    public double getSpeed() {
        return speed;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }
  // methods:
        // toString (Note: replace the values in brackets [] with the actual value. Do not include the double quotes “” or the square brackets [] in the output. Specify all decimal values to 2 decimal points.)
        // grow
        // isDead
    public String toString() {
        if (this.mass == 0) {
            return "I\'m dead, but I used to be a fly with a speed of " + String.format("%.2f", this.speed) +".";
        } else {
            return "I\'m a speedy fly with " + String.format("%.2f",this.speed) + " speed and " + String.format("%.2f", this.mass)+ " mass.";
        }
    }
    public double grow(int addMass) {
        double newMass = this.mass + addMass;
        double newSpeed = 0;
        if (newMass < 20) {
            newSpeed = this.speed + addMass;
        } else if (newMass >= 20) {
            newSpeed = this.speed + (20 - this.mass) - (0.5 * (newMass - 20));
        }
        this.mass = newMass;
        this.speed = newSpeed;
        return newMass;
    }




    public static void main(String[] args) {
        Fly fly1 = new Fly(0.5, 10);
        Fly fly2 = new Fly(1.5, 8.0);
        fly1.grow(30);
        System.out.println(fly1);
    }
}
