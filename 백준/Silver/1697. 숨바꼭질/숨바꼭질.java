import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.LinkedList;
        import java.util.Queue;
        import java.util.StringTokenizer;

        public class Main {

                static int n,k,answer=Integer.MAX_VALUE;
                static int[] arr;
                static void bfs(int n) {
                        Queue<Integer> q= new LinkedList<>();
                        q.add(n);
                        arr[n] =1;
                        while (!q.isEmpty()) {
                                int num = q.remove();
                                if(num==k){
                                        answer = Math.min(answer,arr[num]-1);
                                        break;
                                }

                                if(num-1>=0 &&arr[num-1]==0) {
                                        arr[num-1] =arr[num]+1;
                                        q.add(num-1);
                                }

                                if (num+1<=100000 && arr[num+1]==0) {
                                        arr[num+1] = arr[num]+1;
                                        q.add(num+1);

                                }
                                if (2*num<=100000 && arr[2*num]==0) {
                                        arr[2*num] = arr[num]+1;
                                        q.add(2*num);
                                }
                        }

                }

                public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                StringTokenizer st = new StringTokenizer(br.readLine());
                arr= new int[100001];
                n= Integer.parseInt(st.nextToken());
                k= Integer.parseInt(st.nextToken());
                bfs(n);
                System.out.println(answer);

            }
        }