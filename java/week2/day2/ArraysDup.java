package week2.day2;

public class ArraysDup {

	public static void main(String[] args) {
		int[] arrNum = {2,5,7,7,5,9,2,3};
		
		int arrLen = arrNum.length;
		
        for (int i=0; i<arrLen; i++) {
        	for(int j=i+1; j<arrLen; j++) {
        		if(arrNum[i] == arrNum[j])
        			System.out.println(arrNum[i]);
        	}
        }
	}

}
