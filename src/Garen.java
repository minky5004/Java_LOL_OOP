public class Garen extends Champion{

    private String name;
    private int level;
    private int hp;
    private int attackDamage;
    private int defence;

    public Garen(String name, int hp, int attackDamage, int defense) {
        super(name, hp, attackDamage, defense);
    }

    public void levelUp() {
        level += 1;
        hp += 98;
        attackDamage += 69;
    }


}
