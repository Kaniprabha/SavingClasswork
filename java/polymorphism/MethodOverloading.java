package polymorphism;

public class MethodOverloading {
	public void reportStep(String msg, String status){
		System.out.println(msg+" "+status);
	
	}
    public void reportStep(String msg, String status, boolean snap){
    	System.out.println(msg+" "+status+" "+snap);
	}
    

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.reportStep("Message", "Status");
		obj.reportStep("Msg2", "Status2", false);
		

	}

}
