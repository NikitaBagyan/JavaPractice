public class LimitingRectangle {

    int[][] points;

    public LimitingRectangle(int[][] points) {
        this.points = points;
    }
    public  int getWidth(){
     return Math.abs(points[0][1] - points[1][1]);
    }
    public int getHeight(){
        return Math.abs(points[0][0] - points[1][0]);
    }

    public String getBorders(){


        return points[0][1]+points[1][1] + points[0][0] + points[1][0];
    }
}
