package src.baekjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Main1362 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        while (true){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int o = Integer.parseInt(st1.nextToken());
            int w = Integer.parseInt(st1.nextToken());
            String status = "";

            if(o == 0 && w == 0) break;

            while (true){
                StringTokenizer st2 = new StringTokenizer(br.readLine());
                String move = st2.nextToken();
                int time = Integer.parseInt(st2.nextToken());

                if(move.equals("#") && time == 0){
                    count++;
                    break;
                }
                if(status.equals("RIP")){
                    continue;
                }
                if(move.equals("E")){
                    w -= time;
                }
                else {
                    w += time;
                }
                if(w<=0){
                    status = "RIP";
                }

            }
            if(status.equals("RIP")){
                System.out.println(count+ " " + "RIP");
                continue;
            }

            else if(w<(o*2) && (float)o/2 < (float)w){
                status = ":-)";
            }
            else {
                status = ":-(";
            }
            System.out.println(count+ " " + status);

        }
    }
}


