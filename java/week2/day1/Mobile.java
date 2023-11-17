package week2.day1;

import java.util.HashSet;
import java.util.Set;

public class Mobile {
	public void makecall(){
		System.out.println("Hey Siri call Ragul...");
	}

	public void sendmsg(String app, String name, String msg) {
		System.out.println("Hey siri open a app"+ app+ " and send a msg to "+ name+ "and the msg is "+ msg );
	}
	public void openapp(String app) {
		System.out.println("Hey siri open "+app);
	}
	public int addNum(int num1, int num2) {
		int total = num1+num2;
		return total;
	}
	public int multiply(int num1, int num2) {
		int product = num1*num2;
		return product;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Mobile obj = new Mobile();
        obj.makecall();
        Set<String> var = new HashSet<String>();
       // obj.sendmsg );
	}

}
