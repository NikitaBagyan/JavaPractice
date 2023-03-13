package Collections;

import java.util.*;


import java.util.ArrayDeque;
import java.util.Deque;

    public class Main {
        public static void main(String[] args) {

            Queue queue = new LinkedList();
            queue.add("Hola and Hello");
            for (int i = 1; i <= 24; i++) {
                queue.add(i);
            }
            queue.add(new Date());
            queue.add(new Date());
            String element = (String) queue.poll();
        }
    }