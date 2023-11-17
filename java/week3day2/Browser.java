package week3day2;

public class Browser {
      String browserName="ChromeBrowser";
      int browserVerision= 15;
      public void openURL() {
    	  System.out.println("openURL");
      }
      public void closeBrowser() {
    	  System.out.println("closeBrowser");
      }
      public void navigateBack() {
    	  System.out.println("navigateBack");
      }
      public static void main(String[] args) {
    	  Browser object = new Browser();
    	  
	}
}
