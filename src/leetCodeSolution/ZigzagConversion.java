package leetCodeSolution;

public class ZigzagConversion {

	public static void main(String[] args) {
		String s = "PAYPALISHIRING";
		/*
		 *  3,PAHNAPLSIIGYIR
		 *  4,PINALSIGYAHRPI
		 * */
		int numRows = 4;
		System.out.println(convert(s, numRows));

	}

	public static String convert(String s, int numRows) {
		if (numRows ==1) return s;
		String result="";
		int divide = numRows*2-2;
		for(int i=0;i<s.length();i=i+divide) {
			result += s.charAt(i);
		}
		for(int row=1;row<numRows-1;row++) {		
			int inter = 2*row;
			int i = row;
			while(i<s.length()) {
				result += s.charAt(i);
				inter = divide - inter;
				i += inter;
			}
		}
		for(int i=numRows-1;i<s.length();i=i+divide) {
			result += s.charAt(i);
		}
		return result;
	}

}
