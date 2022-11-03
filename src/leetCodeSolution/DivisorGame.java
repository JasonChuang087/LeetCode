package leetCodeSolution;

public class DivisorGame {

        public static void main(String[] args) {
                int n = 3;
                System.out.println(divisorGame(n));
        }
        
        public static boolean divisorGame(int n) {
                int count = 0;
                while(n!=1) {
                        if(n%2==0) {
                                n = n-1;
                                count++;
                        }
                        else if(n%2==1) {
                                n = n-1;
                                count++;
                        }
                        System.out.println(n);
                }
                return count%2==0?false:true;
        }

}
