package sample.AuxilaryClasses;

public class task3submarine {


    int horizontal = 0;
    int vertical = 0;

    public task3submarine() {
    }

    public void calculateTrajectory(String[] directions) {
        System.out.println(directions.length);
        for (int i = 0; i < directions.length; i++) {
            String[] onedirection = directions[i].split(" ");
            System.out.println(onedirection[0]+"  "+onedirection[1]);

            if (onedirection[0].equals("forward")) {
              this.setHorizontal(this.getHorizontal()+Integer.parseInt(onedirection[1]));
           } else if (onedirection[0].equals("down")) {
             this.setVertical(this.getVertical() + Integer.parseInt(onedirection[1]));
           } else if (onedirection[0].equals("up")) {
             this.setVertical(this.getVertical() - Integer.parseInt(onedirection[1]));
           if (getVertical() < 0) {                    setVertical(0);                }
       System.out.println(i);
            }

      }
        System.out.println("The final destination is " + this.getHorizontal() + " and " + this.getVertical() );
    }


    public int getHorizontal() {
        return horizontal;
    }

    public void setHorizontal(int horizontal) {
        this.horizontal = horizontal;
    }

    public int getVertical() {
        return vertical;
    }

    public void setVertical(int vertical) {
        this.vertical = vertical;
    }


}
