package Collections;

import java.util.Deque;

public class Boss {
    private Deque toDoQueue;// у босса тоже есть ссылка на очередь из заданий
    public Boss(Deque toDoQueue) {
        this.toDoQueue = toDoQueue;// даем ссылку на очередь в конструкторе
    }
    public void giveTask(String task) {
        toDoQueue.add(task); // кладем задание в очередь
        System.out.println("Дал задачу " + task);
    }
}
