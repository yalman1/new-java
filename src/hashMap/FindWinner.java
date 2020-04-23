package hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class FindWinner {
    public static void main(String[] args) {
        String[] candidates = {"Ferhat","Shohrat","Birsen","Ferhat","Shohrat","Birsen","Birsen","Birsen","Birsen"};
        System.out.println(findWinner(candidates));
    }
    public static String findWinner(String[] candidates){
        String winner="";
        HashMap<String,Integer> votes = new HashMap<>(10);
        for(String person : candidates){
            if(votes.containsKey(person)){
                votes.put(person,votes.get(person)+1);
            }
            else{
                votes.put(person,1);
            }
        }
        //System.out.println(votes);
        Iterator totalVotes = votes.entrySet().iterator();
        String index="";
        int maxVote=0;
        String key;
        int value;
        while(totalVotes.hasNext()){
            Map.Entry mapEl = (Map.Entry)totalVotes.next(); //fetch the elements
            key = mapEl.getKey().toString();
            value = (int)mapEl.getValue();
            if(value>maxVote){
                maxVote=value;
                index=key;
            }
        }
        //System.out.println(index+"="+maxVote);
        winner="Winner is... "+ index+" with total "+maxVote + " votes ";
        return winner;
    }
}
