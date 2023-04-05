package days.day23_Methods;

public class voting {
    public static void main(String[] args) {
        //eligible for voting
        voting("Ali", 16);
        String n= "Nihan";
        int ageX = 18;
        voting(n,ageX);
        voting("aaa", 30);
        checkingVoting("ali", 4);
        boolean ali = checkingVoting("ali", 4);
        System.out.println(ali);

    }
    public static void voting(String name,int age){

        if (age>=18){
            System.out.println(name +  "is eligible to voting");
        }else {
            System.out.println(name + "isn't eligible for voting" + "Please try " + (18-age) + " years later");
        }
    }
    public static boolean checkingVoting(String name,int age){
        boolean voteOrNot = true;
        if (age>=18){
            System.out.println(name +  "is eligible to voting");
            voteOrNot = true;
        }else {
            System.out.println(name + " isn't eligible for voting" + "Please try " + (18-age) + " years later");
            voteOrNot = false;
        }
        return voteOrNot;
    }
}
