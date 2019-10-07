package teach03;

public class Player {
    String name;
    int health;
    int mana;
    int gold;

    public Player() {
        this.name = "Steve";
        this.health = 100;
        this.mana = 36;
        this.gold = 250;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
}
