package CollectionFramework.List;

import java.util.*;

public class IntroductionList {
    static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        queue.element();

        queue.offer(5);//enueue
        queue.remove(5);
        queue.poll();

        System.out.println(queue);

    }
}
