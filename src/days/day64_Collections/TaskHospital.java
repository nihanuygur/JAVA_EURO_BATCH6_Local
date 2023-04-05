package days.day64_Collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TaskHospital {
    public static void main(String[] args) {
        String[] a = {"Cardiology", "Orthopaedics", "Neurology", "Cardiology", "Orthopaedics", "Cardiology"};
        patient(a);
        String[] b= {"Oncology", "Gynaecology", "Orthopaedics", "Oncology", "Gynaecology", "Orthopaedics"};
        patient(b);
        String[] c= {"Neurology", "Cardiology", "Oncology"};
        patient(c);
        System.out.println("solution(a) = " + solution(a));
        System.out.println("solution(b) = " + solution(b));
        System.out.println("solution(c) = " + solution(c));
    }
    public static int patient(String [] arr) {
        HashMap<String, Integer> departments = new HashMap<>();
        for (String s : arr) {
            if (departments.containsKey(s)) {
                departments.put(s, departments.get(s) + 1);
            } else
                departments.put(s, 1);
        }
        return Collections.max(departments.values());
    }
    public static int maxPatient2(String [] arr){
        HashMap<String,Integer> departments =new HashMap<>();
        departments.put("Cardiology",0);
        departments.put("Neurology",0);
        departments.put("Orthopaedics",0);
        departments.put("Gynecology",0);
        departments.put("Oncology",0);

        for (String s : arr) {
            if (departments.containsKey(s)){
                departments.put(s,departments.get(s)+1);
            }
        }
        return Collections.max(departments.values());
    }
    public static int solution(String[] arr){
        //Step1
        Map<String,Integer> map = new HashMap<>();

        //Step2
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])) map.put(arr[i],map.get(arr[i])+1);
            else map.put(arr[i],1);
        }

        //Step3
        return Collections.max(map.values());
    }

}
