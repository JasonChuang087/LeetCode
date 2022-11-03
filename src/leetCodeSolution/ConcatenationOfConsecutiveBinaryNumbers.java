package leetCodeSolution;

public class ConcatenationOfConsecutiveBinaryNumbers {

        public static void main(String[] args) {
                int n = 12;
                System.out.println(concatenatedBinary(n));

        }

        public static int concatenatedBinary(int n) {
                long M = 1000000007;
                String result = "";
                for (int i = 1; i <= n; i++) {
                        result = result + Integer.toBinaryString(i);

                }
                long l = Long.parseLong(result, 2);
                Long num = l % M;
                return num.intValue();
        }

}
