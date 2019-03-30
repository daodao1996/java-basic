package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        ListIterator<String> collection1Iter = collection1.listIterator();
        Map<String, Integer> result = new HashMap<>();

        while(collection1Iter.hasNext()){
            String currentLetter = collection1Iter.next();
            if(result.containsKey(currentLetter)){
                result.put(currentLetter,result.get(currentLetter)+1);
            }else{
                result.put(currentLetter,1);
            }
        }
        return result;
    }
}
