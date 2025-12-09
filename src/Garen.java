public class Garen extends Champion implements MeleeChampion{

    private String name;
    private int level;
    private int hp;
    private int attackDamage;
    private int defence;

    public Garen(String name, int hp, int attackDamage, int defense) {
        super(name, hp, attackDamage, defense);
    }

    @Override
    public void useQ(Champion target) {
        System.out.println(getName() + "의 결정타(Q)");
        target.takeDamage((attackDamage)+30);
    }

    public void levelUp() {
        System.out.println(getName()+"의 레벨업!");
        level += 1;
        hp += 99;
        attackDamage += 3;
        defence += 5;
    }


    @Override
    public void dash(Champion target) {
        System.out.println(getName() + " 돌진!");
        target.takeDamage((attackDamage)-10);
    }
}
