package days.day16_REVIEW_Week4;

public class Switch {
    public static void main(String[] args) {
        String book = "Anna Karenina";
        String writer = "Writer of ";
        switch (book) { // byte short int String char
            case "Miserables":
                writer = writer + "Miserables is Victor Hugo.";
                break;
            case "Anna Karenina":
            case "Tolstoy's Life":
            case "War and Peace":
                writer = writer + "these books is Tolstoy.";
                break;
            case "Crime and Punishment":
                writer = writer + "Crime and Punishment is Dostoevsky.";
                break;
            default:
                System.out.println("Invalid");

        }

        System.out.println(writer);
    }
}
