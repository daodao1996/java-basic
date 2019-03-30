package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> flattenedCollection2 = new ArrayList<>();
        List<String> result = new ArrayList<>();
        ListIterator<String> collention1Iter = collection1.listIterator();
        flattenedCollection2 = flattenCollection(flattenedCollection2,collection2);

        while(collention1Iter.hasNext()){
            String currentLetter = collention1Iter.next();
            if(flattenedCollection2.contains(currentLetter)){
                result.add(currentLetter);
            }
        }

        return result;
    }

    List<String> flattenCollection(List<String> flattenedCollection,List<List<String>> collection){
        for(List<String> item : collection){
            ListIterator<String> iter = item.listIterator();
            while(iter.hasNext()){
                flattenedCollection.add(iter.next());
            }
        }
        return flattenedCollection;
    }
}
