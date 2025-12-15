public abstract class Champion {

    private String name;
    private int level;
    private int hp;
    private int attackDamage;
    private int defense;

    public Champion(String name, int hp, int attackDamage, int defense) {
        this.name = name;
        this.level = 1;
        this.hp = hp;
        this.attackDamage = attackDamage;
        this.defense = defense;
    }

    public void basicAttack(Champion target) {
        System.out.println(name + " → " + target.name + " 기본 공격!");
        target.takeDamage(attackDamage);
    }


    public abstract void useQ(Champion target);

    public void takeDamage(int damage) {
        int actualDamage = damage - defense;
        if (actualDamage < 0) actualDamage = 0;

        hp -= actualDamage;
        if (hp <= 0){
            System.out.println(name + "이(가) 사망하였습니다.");
            setBattleCount();
        }
        else{
            System.out.println(name + "이(가) " + actualDamage + " 피해를 입음! (남은 HP: " + hp + ")");

        }

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Ashe{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", hp=" + hp +
                ", attackDamage=" + attackDamage +
                ", defense=" + defense +
                '}';
    }

    private static int battleCount = 0;

    public static int getBattleCount() {
        return battleCount;
    }

    public static void setBattleCount() {
        Champion.battleCount = battleCount++;
    }

    public final void resurrect() {
        hp+= 1;
    }

}
