public class Main {
    public static void main(String[] args) {

        Garen garen = new Garen("Garen",690,69,38);
        Ashe ashe = new Ashe("Ashe",610,59,26);
        Lux lux = new Lux("Lux",580,54,21);
        Teemo teemo = new Teemo("Teemo",50,54,24);

        Team<Champion> red = new Team<>("레드팀");
        Team<Champion> purple = new Team<>("퍼플팀");

        red.addChamp(garen);
        red.addChamp(lux);

        purple.addChamp(garen);
        purple.addChamp(teemo);


        fight.oneVsOne(red,purple);

}
}