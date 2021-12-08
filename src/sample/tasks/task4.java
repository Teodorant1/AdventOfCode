package sample.tasks;

import sample.AuxilaryClasses.task3submarine;

public class task4 {

    task3submarine task3submarine = new task3submarine();
    int aim=0;
    public void downX (int x)
    { setAim(getAim()+x); }
    public void upX (int x)
    { setAim(getAim()-x);}
    public void forwardX (int x)
    {this.task3submarine.setHorizontal(this.task3submarine.getHorizontal()+x);
     this.task3submarine.setVertical(this.task3submarine.getVertical()+(getAim()*x));}


    public int calculateTrajectory ( String [] directions )
    { for (int i = 0; i < directions.length; i++) {
        String[] onedirection = directions[i].split(" ");
        System.out.println(onedirection[0]+"  "+onedirection[1]);

        if (onedirection[0].equals("forward")) {
            forwardX(Integer.parseInt(onedirection[1]));
        } else if (onedirection[0].equals("down")) {
            downX(Integer.parseInt(onedirection[1]));
        } else if (onedirection[0].equals("up")) {
           upX(Integer.parseInt(onedirection[1]));

        }}
        System.out.println(this.task3submarine.getHorizontal()*this.task3submarine.getVertical());
    return this.task3submarine.getHorizontal()*this.task3submarine.getVertical();
    }

    public sample.AuxilaryClasses.task3submarine getTask3submarine() {
        return task3submarine;
    }

    public void setTask3submarine(sample.AuxilaryClasses.task3submarine task3submarine) {
        this.task3submarine = task3submarine;
    }

    public int getAim() {
        return aim;
    }

    public void setAim(int aim) {
        this.aim = aim;
    }
}
