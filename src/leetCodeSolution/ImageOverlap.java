package leetCodeSolution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ImageOverlap {

        public static void main(String[] args) {
                int[][] img1 = {{1,1,0},{0,1,0},{0,1,0}};
                int[][] img2 = {{0,0,0},{0,1,1},{0,0,1}};
                largestOverlap(img1,img2);

        }
        
        public static int largestOverlap(int[][] img1, int[][] img2) {
                if(img1.length==1&&img2.length==1&&img1[0][0]==1&&img2[0][0]==1) {
                        return 1;
                }
                else if(img1.length==1&&img2.length==1&&img1[0][0]==0&&img2[0][0]==0) {
                        return 0;
                }
                
                int count1 = 0;
                int count2 = 0;
                ArrayList<int[]> coor1 = new ArrayList<int[]>();
                ArrayList<int[]> coor2 = new ArrayList<int[]>();
                for(int i=0;i<img1.length;i++) {
                        for(int j=0;j<img1[0].length;j++) {
                                if(img1[i][j]==1) {
                                        int[] xy1 = new int[2];
                                        xy1[0] = j;
                                        xy1[1] = i;
                                        coor1.add(xy1);
                                        count1++;
                                        System.out.println("x "+xy1[0]);
                                        System.out.println("y "+xy1[1]);
                                }
                                if(img2[i][j]==1) {
                                        int[] xy2 = new int[2];
                                        xy2[0] = j;
                                        xy2[1] = i;
                                        coor2.add(xy2);
                                        count2++;
                                        System.out.println("x2 "+xy2[0]);
                                        System.out.println("y2 "+xy2[1]);
                                }
                        }
                }
                int max = 0;
                if(count1>count2) {
                         max = helper(coor1,coor2);
                }
                else{
                        max = helper(coor2,coor1);
                }
                return max;
        }
        
        public static int helper(ArrayList<int[]> coor1,ArrayList<int[]> coor2) {
                Map<String,Integer> map = new HashMap<String,Integer>();
                for(int[] xy2:coor2) {
                        for(int[] xy1:coor1) {
                                int num1 = xy2[0] - xy1[0];
                                int num2 = xy2[1] - xy1[1];
                                String rel = num1+","+num2;
                                map.put(rel, map.getOrDefault(rel, 0)+1);                                
                        }
                }
                System.out.println(map);
                int max = 0;
                for (String key: map.keySet()) {
                        if(map.get(key)>max) {
                                max = map.get(key);
                        }
                }
                return max;
        }
        


}
