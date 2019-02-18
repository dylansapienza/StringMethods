class stringMethods {
   public String findChar (String text,int ind){
   
   //Write your Code here
	  
      System.out.println(text.charAt(ind));
      return "" + text.charAt(ind) + "";
   }
   
   
   public boolean userChecker (String newUser, String oldUser) {
	   
	   //Check to make sure username contains a number
	   int i;
	   String num;
	   for(i=1; i<=4; i++) {
		   num = ""+i;
		   if(newUser.contains(num)==true) {
			   i=4;
		   }
	   }
	   
	   
	   //Make sure the number does not start the string
	   String str1 = "";
	   for(i=0; i<=9; i++) {
		   str1 =""+i;
		   if(newUser.startsWith(str1)==true) {
			   return false;
			
		   }
		   else {
			   //System.out.println("Success 2");
		   }
	   }
	   
	   //Check the special chars
	   for(i=1; i<=3; i++) {
		   switch(i) {
			   case 1:
				   str1 = "!";
				   break;
			   case 2:
				   str1 = "@";
				   break;
			   case 3:
				   str1 = "?";
				   break;
			   }
			   if(newUser.contains(str1)==true) {
				   return false;
			   }
		
		   }
	   
	   //Check username does not match the old name
	   if(newUser.contains(oldUser)==true) {
		   return false;
	   
	   }
	
	   return true;
	
	}
   
   public boolean urlChecker (String url){
      
      //Write your Code here

      return false;
   }
   
   public String lengString (String text){
      
   //Write your Code here
   
      return "100";
   }
   
   public String emailGen (String text){
   
         //Write your Code here

      return "";
   }
   
   public String domainGen (String text){
   
   
      return  "";
   }
}
public class Stringfunc{
   public static void main(String[] args){
      
	   stringMethods M1=new stringMethods();

      String s="CS1111 is the best class that I have ever taken.";
      M1.findChar(s,2);
      assert "none".equals(M1.findChar(s,100)) : "100 is larger than the length of the string";
      assert "t".equals(M1.findChar(s,10)) : "The character in the 10th place should be S";
      assert "1".equals(M1.findChar(s,2)) : "The character in the 3d place should be 1";
      
      //User Check
      
      String username="user one 23";
      assert !M1.userChecker(username,""): "User has space and not accepted";
      username="userone1234?!";
      assert M1.userChecker(username,""): "user is accepted";
      username="";
      assert !M1.userChecker(username,""): "Empty username is not accepted";
      username="User1";
      assert !M1.userChecker(username,"User1"): "username is already taken";

      //URL Check
      String url="http:\\www.gwu. edu";
      assert !M1.urlChecker(url): "url contains a space";
      url="http:\\www.gwu.edu";
      assert M1.urlChecker(url): "url not verfied";
      url="www.gwu.edu";
      assert M1.urlChecker(url): "url not verfied";
      url="ww.gwuedu";
      assert !M1.urlChecker(url): "url verfied by mistake";
      url="http:\\ww.gwuedu";
      assert !M1.urlChecker(url): "url verfied by mistake";
      //casting 
      
      assert "3".equals(M1.lengString("ABC")): "ABC length is 3";
      assert "6".equals(M1.lengString("ABCDEF")): "ABCDEF length is 6";
      assert "7".equals(M1.lengString("ABCDEF1")): "ABCDEF1 length is 7";
      
      //String gen
      String name ="Magic Johnson";
      assert "info@MJohnson.com".equals(M1.emailGen(name)): "name is not converted to the email address properly";
      assert "www.magic-johnson.com".equals(M1.domainGen(name)):"name is not converted to the domain address properly";
   }
}