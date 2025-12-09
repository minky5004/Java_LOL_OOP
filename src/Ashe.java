public class Ashe extends Champion implements RangedChampion {

    private String name;
    private int level;
    private int hp;
    private int attackDamage;
    private int defense;

    public Ashe(String name, int hp, int attackDamage, int defense) {
        super(name, hp, attackDamage, defense);
    }

    @Override
    public void useQ(Champion target) {
        System.out.println(getName() + "의 연사(Q)!");
        target.takeDamage((attackDamage) * 2);
    }

    public void levelUp() {
        System.out.println(getName()+"의 레벨업!");
        level += 1;
        hp += 101;
        attackDamage += 3;
        defense +=5;
    }

    @Override
    public void kite(Champion target) {
        System.out.println(getName() + " 카이팅!");
        target.takeDamage((attackDamage)+10);
    }
}
