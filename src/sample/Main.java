package sample;

import sample.AuxilaryClasses.task3submarine;
import sample.tasks.task1;
import sample.tasks.task2;
import sample.tasks.task3;
import sample.tasks.task4;

public class Main {

    public static void main(String[] args) {

        task3 task3 = new task3();
       // task3submarine task3submarine = new sample.AuxilaryClasses.task3submarine();
       // task3submarine.calculateTrajectory(task3.getInputs());
        task4 task4 = new task4();
        task4.calculateTrajectory(task3.getInputs());
        System.out.println(2*3);


    }
}
