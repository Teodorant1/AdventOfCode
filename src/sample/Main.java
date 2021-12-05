package sample;

import sample.tasks.task1;
import sample.tasks.task2;

public class Main {

    public static void main(String[] args) {
        task1 task1 = new task1();
        task2 task2 = new task2();
        task2.reportincrease(task1.getInputs());
    }
}
