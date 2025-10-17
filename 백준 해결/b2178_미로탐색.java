import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class b2178_미로탐색 {
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   public static void main(String[] args) throws IOException {
      String[] line = br.readLine().split(" ");
      int N = Integer.parseInt(line[0]);
      int M = Integer.parseInt(line[1]);

      int[][] arr = new int[N][M];

      for(int n=0; n<N; n++) {
         String[] temp = br.readLine().split("");
         for(int m=0; m<M; m++) {
            arr[n][m] = Integer.parseInt(temp[m]);
         }
      }

      int[][] visited = new int[N][M];
      bfs(0, 0, N, M, visited, arr);
      bw.write(String.valueOf(visited[N-1][M-1]));

      bw.flush();
      br.close();
      bw.close();
   }

   public static void bfs(int start_x, int start_y, int N, int M, int[][] visited, int[][] arr) {
      Queue<int[]> q = new LinkedList<>();
      q.add(new int[] {start_x, start_y, 1});

      while(!q.isEmpty()) {
         int now[] = q.poll();
         int x = now[0];
         int y = now[1];
         int move = now[2];

         if(x<N && y<M && x>=0 && y>=0) {
            if(visited[x][y]==0 && arr[x][y]==1) {
               visited[x][y] = move;
               q.add(new int[] {x+1, y, move+1});
               q.add(new int[] {x, y+1, move+1});
               q.add(new int[] {x-1, y, move+1});
               q.add(new int[] {x, y-1, move+1});
            }
         }
      }
   }
}