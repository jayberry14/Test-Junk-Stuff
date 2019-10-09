package all;

public class Stuff implements Junkable{
    boolean stuff;
    @Override
    public boolean canJunk() {
        return false;
    }

    public boolean isStuff() {
        return stuff;
    }

    public void setStuff(boolean stuff) {
        this.stuff = stuff;
    }
}
