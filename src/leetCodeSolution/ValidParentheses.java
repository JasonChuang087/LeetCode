package leetCodeSolution;

import java.util.Stack;

public class ValidParentheses {

        public static void main(String[] args) {
                String s = ")[([]])";
                System.out.println(isValid(s));
        }
        
        public static boolean isValid(String s) {
                Stack<Character> stack = new Stack<Character>();
                
                int countS1 = 0;
                int countS2 = 0;
                int countM1 = 0;
                int countM2 = 0;
                int countL1 = 0;
                int countL2 = 0;
                for(int i=0;i<s.length()-1;i++) {
                        if(s.charAt(i)=='(') {
                                countS1 += 1;
                                stack.add(')');
                                if(s.charAt(i+1)==']'||s.charAt(i+1)=='}') {
                                        return false;
                                }
                        }
                        else if(s.charAt(i)=='[') {
                                countM1 += 1;
                                stack.add(']');
                                if(s.charAt(i+1)==')'||s.charAt(i+1)=='}') {
                                        return false;
                                }
                        }
                        else if(s.charAt(i)=='{') {
                                countL1 += 1;
                                stack.add('}');
                                if(s.charAt(i+1)==')'||s.charAt(i+1)==']') {
                                        return false;
                                }
                        }
                        else if(s.charAt(i)==')') {
                                if(!stack.empty()&&s.charAt(i)!=stack.pop()) {
                                        return false;
                                }
                                countS2 += 1;
                        }
                        else if(s.charAt(i)==']') {
                                if(!stack.empty()&&s.charAt(i)!=stack.pop()) {
                                        return false;
                                }
                                countM2 += 1;
                        }
                        else if(s.charAt(i)=='}') {
                                if(!stack.empty()&&s.charAt(i)!=stack.pop()) {
                                        return false;
                                }
                                countL2 += 1;
                        }
                }
                
                char last = s.charAt(s.length()-1);
                switch (last) {
                case '(':
                        return false;
                case '[':
                        return false;
                case '{':
                        return false;
                case ')':
                        countS2 += 1;
                        break;
                case ']':
                        countM2 += 1;
                        break;
                case '}':
                        countL2 += 1;
                        break;
                default:
                    break;
                }
                if(countS1!=countS2||countM1!=countM2||countL1!=countL2) {
                        return false;
                }
                return true;
        }

}
