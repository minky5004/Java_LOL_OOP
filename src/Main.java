public class Main {
    public static void main(String[] args) {

        Garen garen = new Garen("Garen",690,69,38);
        Ashe ashe = new Ashe("Ashe",610,59,26);
        Lux lux = new Lux("Lux",580,54,21);
        Teemo teemo = new Teemo("Teemo",50,54,24);

        System.out.println("==== 소환사의 협곡에 오신 것을 환영합니다. ====");

        System.out.println("=== 전투 시작 ===");

        teemo.basicAttack(garen);
        garen.basicAttack(teemo);

        teemo.useQ(garen);
        garen.useQ(teemo);

        garen.levelUp();

        System.out.println("=== 전투 종료 ===");
        System.out.println("=== 전투 결과 ===");
        System.out.println("전투 횟수 : " + Champion.getBattleCount());

}
}