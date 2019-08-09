import java.util.TreeMap;
import java.util.TreeSet;
import java.util.*;

class Point {
	int x, y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class KNearestPost {
	public static List<List<Integer>> kClosest(int[][] points, int K) {
        Point initial = new Point(0, 0);
        TreeMap<Double, Point> map = new TreeMap<>(); 
        for (int i = 0; i< points.length; i++) {
            Point temp = new Point(points[i][0], points[i][1]);
            double distance = distance(initial, temp);
            map.put(distance, temp);
        }
        
        int i = 0;
        Iterator it = map.entrySet().iterator();
        List<List<Integer>> ls = new ArrayList<>(); 
        while (it.hasNext() && i <= K) {
        	Map.Entry mapElement = (Map.Entry)it.next();
        	List<Integer> temp = new ArrayList<>();
        	Point p = (Point)mapElement.getValue();
        	temp.add(p.x);
        	temp.add(p.y);
        	ls.add(temp);
        	i++;
        }
        return ls;
    }
	
	public static double distance(Point p1, Point p2) {
		//((m - p) * (m - p) + (n - q) * (n - q)).
		return Math.sqrt(((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y)));
	}
	
	public static void main(String args[]) {
		//
		int [][] points = {{-16, 5}, {-1, 2}, {4, 3}, {10, -2}, {0, 3}, {-5, -9}};
		//int [][] points = {{3,3},{5,-1},{-2,4}};
		System.out.println(KNearestPost.kClosest(points, 2));
	}
}

