package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        for (String currentLetter : object.get("value")){
            if(collectionA.containsKey(currentLetter)){
                int reduceNumber = (int)Math.floor(collectionA.get(currentLetter) / 3);
                collectionA.put(currentLetter,collectionA.get(currentLetter)-reduceNumber);
            }
        }
        return collectionA;
    }
}
