package days.day41_WrapperClasses;

public class MixCodingQuestions {
    public static void main(String[] args) {
        //Q1
passwordM("123ABC+AAa");
fiveFlag("123ABC+AAa");




    }

    public static void fiveFlag (String password){
        String result ="";
        Boolean rule1=false; // length
        Boolean rule2=false; // upper case
        Boolean rule3=false; // lower case
        Boolean rule4=false; // Special character
        Boolean rule5=false; // numeric digit
        rule1 = password.length()>=10 && password.length()<=15 && !password.contains(" ");
        for (char c : password.toCharArray()) {
            if (!rule1){
                break;
            }
            if (Character.isUpperCase(c)){
                rule2=true;
            }else if (Character.isLowerCase(c)){
                rule3=true;
            }else if (Character.isDigit(c)){
                rule4=true;
            }else {
                rule5=true;
            }if (rule1&&rule2&&rule3&&rule4&&rule5){
                break;
            }
        }
        if (rule1&&rule2&&rule3&&rule4&&rule5){
            result="Valid Password!!";
        } else if (!rule1) {
            result="Invalid Password!! Password must be between 10-15 character and shouldn't contain space!";
        }else if (!rule2) {
            result="Invalid Password!! Password must include at least 1 uppercase character! ";
        }else if (!rule3) {
            result="Invalid Password!! Password must include at least 1 lowercase character! ";
        }else if (!rule4) {
            result="Invalid Password!! Password must include at least 1 special character! ";
        }else {
            result="Invalid Password!! Password must include at least 1 symbol! ";
        }

        System.out.println(result);
    }
    public static void passwordM(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.contains(" ")){
                System.out.println("Invalid !! Password must not include space! ");
                break;
            }else{
                count ++;
            }
             if(s.length()<10||s.length()>15){
                 System.out.println("Invalid !! Password must be between 10-15 character! ");
                 break;
             }else{
                 count ++;
             }if (!Character.isUpperCase(s.charAt(i))){
                System.out.println("Invalid !! Password must include at least 1 uppercase character! ");
                break;
            }else{
                count ++;
            }if (!Character.isLowerCase(s.charAt(i))){
                System.out.println("Invalid !! Password must include at least 1 lowercase character! ");
                break;
            }else{
                count ++;
            }if (!Character.isLetter(s.charAt(i))&&!!Character.isDigit(s.charAt(i))){
                System.out.println("Invalid !! Password must include at least 1 symbol! ");
                break;
            }else{
                count ++;
            }
             if (count>=6){
                 System.out.println("valid!!");
             }

        }

    }
}
