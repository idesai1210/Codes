import java.util.LinkedList;
import java.util.Queue;

public class NoOfSteps {
	static class Point{
		int x;
		int y;
		public Point(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	static int countSteps(int [][] island){
		int steps = 0;
		int dirs[][] = {{1,0}, {-1,0}, {0,1}, {0,-1}};
		boolean visited[][] = new boolean[island.length][island[0].length];
		visited[0][0] = true;
		Queue<Point> q = new LinkedList<>();
		q.add(new Point(0,0));
		while(!q.isEmpty()){
			Point temp = q.poll();
			int x = temp.x;
			int y = temp.y;
			if (island[x][y] == 9)
				return steps;
			for(int [] dir: dirs){
				int newX = x + dir[0];
				int newY = y + dir[1];
				
				if (newX >= 0 && newX < island.length && newY >= 0 && newY < island[0].length && island[newX][newY] != 0 && !visited[newX][newY]) {
					q.add(new Point(newX, newY));
					visited[newX][newY] = true;
				}
			}
			steps++;
		}
		return steps;
	}
	public static void main(String[] args) {
		int[][] island = new int[][]{
			{1, 0, 0},
			{1, 0, 0},
			{1, 9, 1}
		};
		System.out.println(countSteps(island));
	}
}
