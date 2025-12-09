public class Lux extends Champion implements RangedChampion{

    private String name;
    private int level;
    private int hp;
    private int attackDamage;
    private int defense;

    public Lux(String name, int hp, int attackDamage, int defense) {
        super(name, hp, attackDamage, defense);
    }

    @Override
    public void useQ(Champion target) {
        System.out.println(name + "의 빛의 속박(Q)");
        target.takeDamage(80);
    }

    public void levelUp() {
        level += 1;
        hp += 98;
        attackDamage += 3;
        defense += 5;
    }

    @Override
    public void kite(Champion target) {
        System.out.println(getName() + " 카이팅!");
        target.takeDamage((attackDamage)+1);
    }
}

