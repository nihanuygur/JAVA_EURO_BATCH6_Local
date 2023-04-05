package codeBat;

public class one {
    public static void main(String[] args) {
//        int caughtSpeeding= 50;
//        int speed;
//        boolean isBirthday= caughtSpeeding += 5
//        if (isBirthday) {
//            if (caughtSpeeding <)
//            }
        int teaParty;
        int tea= 10;
        int candy = 5;

        if (tea >= 5 && candy >= 5 ){
            if (tea >= candy*2 || candy >= tea*2) {
                teaParty = 2;
                System.out.println(teaParty);
            }else {
                teaParty = 1;
                System.out.println(teaParty);
            }
        } else if (tea < 5  || candy < 5 ) {
            teaParty = 0;
            System.out.println(teaParty);
        } else if (tea >= candy*2 || candy >= tea*2) {
            teaParty = 2;
            System.out.println(teaParty);
        }



    }
}
