package days.day52_Inheritance;

import java.util.ArrayList;

public class Eagles {
    // ali scored two goals,
    // Veli scored one goal,
    // team scored 3 goals
    // static arraylist put the name of the scorers
    private int playerScore;
    private static int teamScore;
    private String name;
    static ArrayList<String> nameOfScorers=new ArrayList<>();

    Eagles(String name){
        this.name=name;
    }
    public  void scoredOne(){
        // increase value of the fields
        // teamscore playerscore
        teamScore++;
        this.playerScore++;
        if (!nameOfScorers.contains(name)){
        nameOfScorers.add(this.name);}
    }
    public void printScore(){
        System.out.println(this.name + " scored " + this.playerScore + " goals." );
        System.out.println("Team scored " + teamScore + " goals." );

    }
    public static void scorers(){
        System.out.println("Scorers : " + nameOfScorers );
    }
    public int getPlayerScore() {
        return playerScore;
    }
    public static int getTeamScore() {
        return teamScore;
    }
}
