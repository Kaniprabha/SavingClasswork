package week3day2;

public class Safari extends Edge{
	   public void readerMode() {
	    	 System.out.println("readerMode");
	   }
	   public void fullScreenMode() {
	    	 System.out.println("fullScreenMode");
	   }
	   public static void main(String[] args) {
		  Safari object = new Safari();
		  object.openURL();
    	  object.closeBrowser();
    	  object.navigateBack();
    	  object.openIncognito();
    	  object.clearCache();
    	  object.takeSnap();
    	  object.clearCookies();
    	  object.readerMode();
    	  object.fullScreenMode();
		  
	  }

}
