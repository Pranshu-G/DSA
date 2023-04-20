package TopKElements.KClosestPoints;

import java.util.*;

public class ClosestPoints {

    public static List<Point> kClosest(Point[] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0]-b[0]);
        List<Point> result = new ArrayList<>();

        for(Point p: points){
            double distance = Math.sqrt((p.x*p.x) + (p.y*p.y));
            pq.offer(new int[]{(int)distance,p.x,p.y});
        }
        int j=0;
        while(j<k){
            int[] temp = pq.poll();
            result.add(new Point(temp[1],temp[2]));
            j++;
        }

        return result;
    }


    public static List<Point> kClosestOptimized(Point[] points, int k){
        PriorityQueue<Point> pq = new PriorityQueue<>((a,b)-> (int) (b.distanceFromOrigin()- a.distanceFromOrigin()));

        for(int i=0;i<k;i++){
            pq.add(points[i]);
        }

        for(int i=k;i<points.length;i++){
            if(points[i].distanceFromOrigin()<pq.peek().distanceFromOrigin()){
                pq.poll();
                pq.offer(points[i]);
            }
        }

        return new ArrayList<>(pq);
    }



    public static void main(String[] args) {
        Point[] p = new Point[]{new Point(-1,-3),new Point(-4,-5),new Point(-2,-2),new Point(-2,-3)};
        int k =3;
        List<Point> res = kClosestOptimized(p,k);
        for(Point t: res){
            System.out.print(t.x + " " + t.y);
            System.out.println();
        }

    }
}
