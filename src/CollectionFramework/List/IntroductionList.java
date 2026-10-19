package CollectionFramework.List;

import java.util.*;

public class IntroductionList {
    static void main(String[] args) {
//        take 5 input from user
        Collection<Integer> collectionImpl=new HashSet<Integer>();
        collectionImpl.add(1);
        collectionImpl.add(2);
        collectionImpl.add(3);
        collectionImpl.add(4);
        collectionImpl.add(5);
        Scanner sc = new Scanner(System.in);

        List<Integer> alreadyExistList=new ArrayList<Integer>(collectionImpl);
        System.out.println(alreadyExistList);

    }
}
