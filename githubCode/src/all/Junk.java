package all;

public class Junk {

    public static void main(String[] args) {
        Stuff stuff = new Stuff();
        System.out.println("Is there stuff in here? " + stuff.isStuff());
        boolean barney = true;
        if(barney == true) {
            System.out.println("Barney speaks the truth");
        }
        else
            System.out.println("Hello git");
        newStuff();
    }

    static void newStuff() {
        System.out.println("Kevin, this is you from the future");
    }
}

