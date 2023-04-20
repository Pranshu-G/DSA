package TopKElements.KClosestPoints;

public class Point{

        int x;
        int y;

        public Point(int x, int y) {
                this.x = x;
                this.y = y;
        }
        public double distanceFromOrigin(){
                return Math.sqrt((x*x)+(y*y));
        }
}
