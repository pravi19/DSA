package GFG.HashMap;

import java.util.*;

/*Q:- find the candidate with maximum votes received in the election. If 2 person have equal then return
        lexicographically return name as output.Here Even though Nick and Ted have same votes Nick is output due lexicographically*/
public class TieBreaker {

    public static void main(String[] args){
        ArrayList<String>arr=new ArrayList<>();
        arr.add("Nick");
        arr.add("Ted");
        arr.add("Nick");arr.add("Ted");

        System.out.print(TieBreak(arr,arr.size()));

    }
    static String TieBreak(ArrayList<String> names, int n) {
        TreeMap<String, Integer> tm = new TreeMap<>();

        ArrayList<String> hs = new ArrayList<>();

        int max = Integer.MIN_VALUE;

        for (String name : names) {
            if (tm.containsKey(name)) {
                tm.put(name, tm.get(name) + 1);
            } else {
                tm.put(name, 1);
            }
        }


        for (int i = 0; i < names.size(); i++) {
            if (tm.containsKey(names.get(i))) {
                max = Math.max(max, tm.get(names.get(i)));
            }
        }


        for (Map.Entry<String, Integer> em : tm.entrySet()) {
            if (em.getValue() == max) {
                hs.add(em.getKey());
            }
        }

        Collections.sort(hs);

        return hs.get(0);

    }

}