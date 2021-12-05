package sample.tasks;

public class task2 {



    int increments=0;

    public task2() {}

    public String reportincrease ( int [] numbers )
    {
        for (int i = 0; i < numbers.length+1; i++) {
            if (i > 3) {
                          //4 3 2 > 3 2 1 index
                if (numbers[i]+numbers[i-1]+numbers[i-2] > numbers[i - 1]+numbers[i-2]+numbers[i-3]) {
                    increments++;
                }
            }
        }
        System.out.println(increments);
        return "The number of times is" + increments;
    }


}
