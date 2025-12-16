import java.util.ArrayList;
import java.util.List;

public class Team <T> {

    private String teamName;
    private List<T> teamChampList = new ArrayList<>();

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public void addChamp(T Champion) {
        teamChampList.add(Champion);
    }

    public String getTeamName() {
        return teamName;
    }

    public List<T> getTeamChampList() {
        return teamChampList;
    }

    public void joinTeam(T chmapion){
        teamChampList.add(chmapion);
    }
}
