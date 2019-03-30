package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String , Integer> collection3 = new HashMap<>();
        collection3 = calculateLetterNumber(collectionA,collection3);

        for (String item : object.get("value")){
            if(collection3.containsKey(item)){
                int reduceNumber = (int)Math.floor(collection3.get(item) / 3);
                collection3.put(item , collection3.get(item)-reduceNumber);
            }
        }

        return collection3;
    }

    Map<String , Integer> calculateLetterNumber(List<String> collectionA,Map<String,Integer> collection3){
        for (String currentLetter : collectionA){
            if(collection3.containsKey(currentLetter)){
                collection3.put(currentLetter, collection3.get(currentLetter)+1);
            }else{
                collection3.put(currentLetter, 1);
            }
        }
        return collection3;
    }
}
