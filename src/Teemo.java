public class Teemo extends Champion {

    private String name;
    private int level;
    private int hp;
    private int attackDamage;
    private int defense;

    public Teemo(String name, int hp, int attackDamage, int defense) {
        super(name, hp, attackDamage, defense);
    }

    public void levelUp() {
        level += 1;
        hp += 98;
        attackDamage += 69;
    }
}
