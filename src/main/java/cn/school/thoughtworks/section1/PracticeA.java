package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> result = new ArrayList<>();
        ListIterator<String> iter = collection1.listIterator();
        while(iter.hasNext()){
            String letter = iter.next();
            if(collection2.contains(letter)){
                result.add(letter);
            }
        }
        return result;
    }
}
