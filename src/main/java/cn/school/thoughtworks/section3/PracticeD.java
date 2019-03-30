package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
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
            Map<String,String> letterAndCount= getLetterCount(currentLetter);

            if(collection3.containsKey(letterAndCount.get("letter"))){
                collection3.put(letterAndCount.get("letter"),
                        collection3.get(letterAndCount.get("letter")) +Integer.parseInt(letterAndCount.get("count")));
            }else{
                collection3.put(letterAndCount.get("letter"), Integer.parseInt(letterAndCount.get("count")));
            }
        }
        return collection3;
    }

    Map<String , String> getLetterCount(String inputString){
        Map<String , String> letterAndCount = new HashMap<>();
        if(inputString.length() > 1){
            String[] splitedInput = inputString.split("-");
            letterAndCount.put("letter",splitedInput[0]);
            letterAndCount.put("count",splitedInput[1]);
        }else{
            letterAndCount.put("letter",inputString);
            letterAndCount.put("count","1");
        }
        return letterAndCount;
    }
}
