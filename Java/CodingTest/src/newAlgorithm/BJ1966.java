package newAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BJ1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i =0; i<n; i++) {
            int count = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());

            LinkedList<int[]> queue = new LinkedList<>();
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            int documentCount = Integer.parseInt(st.nextToken());
            int index = Integer.parseInt(st.nextToken());

            for(int j =0; j < documentCount; j++){
                int temp = Integer.parseInt(st2.nextToken());
                queue.offer(new int[] {j,temp});
            }

            while(!queue.isEmpty()) {
                int[] front = queue.poll();	//
                boolean isMax = true;	//

                for(int k = 0; k < queue.size(); k++) {
                    if(front[1] < queue.get(k)[1]){
                        queue.offer(front);
                        for (int z= 0; z <k; z++) {
                            queue.offer(queue.poll());
                        }

                        isMax = false;
                        break;
                    }

                }
                if(!isMax) continue;

                count++;
                if(front[0] == index) break;
            }
            arr[i]=count;

        }
        for(int s : arr) {
            System.out.println(s);
        }
    }
}

// 9 1 1 1 1 1
//
