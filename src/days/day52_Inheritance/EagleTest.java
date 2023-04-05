package days.day52_Inheritance;

public class EagleTest {
    public static void main(String[] args) {
        Eagles eagles = new Eagles("Querasma");
        Eagles eagles1 = new Eagles("Ronaldo");
        Eagles eagles2 = new Eagles("Messi");
        eagles.scoredOne(); // Querasma
        eagles.scoredOne(); // second
        eagles1.scoredOne(); //
        eagles1.scoredOne(); //
        eagles1.scoredOne(); //
        System.out.println("eagles.getPlayerScore() = " + eagles.getPlayerScore());
        System.out.println("Eagles.getTeamScore() = " + Eagles.getTeamScore());
        eagles1.printScore();
        eagles2.scoredOne();
        Eagles.scorers();
    }
}
