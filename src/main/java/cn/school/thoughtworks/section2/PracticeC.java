package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> result = new HashMap<>();
        Map<String , String> currentLetterAndCount = null;

        for (String currentLetter : collection1){
            currentLetterAndCount = getLetterCount(currentLetter);
            if(result.containsKey(currentLetterAndCount.get("letter"))){
                result.put(currentLetterAndCount.get("letter"),result.get(currentLetterAndCount.get("letter"))+Integer.parseInt(currentLetterAndCount.get("count")));
            }else{
                result.put(currentLetterAndCount.get("letter"),Integer.parseInt(currentLetterAndCount.get("count")));
            }
        }
        return result;
    }

    Map<String , String> getLetterCount(String inputString){
        Map<String , String> letterAndCount = new HashMap<>();
        if(inputString.length() > 1){
            String[] splitedInput = inputString.split("[-:]");
            if(splitedInput[0].length() > 1){
                int startIndex = inputString.indexOf("[");
                int endIndex = inputString.indexOf("]");
                letterAndCount.put("letter",inputString.substring(0,startIndex));
                letterAndCount.put("count",inputString.substring(startIndex+1,endIndex));
            }else {
                letterAndCount.put("letter",splitedInput[0]);
                letterAndCount.put("count",splitedInput[1]);
            }
        }else{
            letterAndCount.put("letter",inputString);
            letterAndCount.put("count","1");
        }
        return letterAndCount;
    }
}
