package days.day69;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cities {
    public static void main(String[] args) {
        List<String >names = new ArrayList<>();
        names.add("");
        names.add("Ali");
        names.add("Mehmet Ali");
        names.add("Ayse");
        names.add("Mehmet");
        names.add("");

        for (int i=0; i<names.size();i++){
            if (names.get(i).contains("Ali")){
                System.out.println(names.get(i));
            }
        }

        names.stream().filter(name-> name.contains("Ali")).forEach(System.out::println);

        List<String> notEmptyNames = new ArrayList<>();
        for (int i=0; i<names.size();i++){
            if (!names.get(i).isEmpty()){
                notEmptyNames.add(names.get(i));
            }
        }

        List<String> notEmptyNames2 = names.stream().filter(x-> !x.isEmpty()).collect(Collectors.toList());
        names.stream().map(name-> "Hello "+name).forEach(System.out::println);    // (name-> return ("Hello"+name))

        names.stream().filter(x-> x.startsWith("A")).forEach(System.out::println);


        names.stream().map(n-> "Hi "+n).filter(x->x.length()>10).forEach(System.out::println);

        // make all elements uppercase
        names.stream().map(n-> n.toUpperCase()).forEach(System.out::println);

        // if element is not empty make upper case and print the first one
        names.stream().filter(x->!x.isEmpty()).map(n->n.toUpperCase()).forEach(System.out::println);

        long ali= names.stream().filter(x-> x.contains("Ali")).count(); // frequency
        System.out.println("ali = " + ali);



    }
}
