
class stringMethods {
   public String findChar (String text,int ind){
   
   //Write your Code here
	  int length = text.length();
	  if (ind > length) {
		  return "none";
	  }
	   
      return "" + text.charAt(ind) + "";
   }
   
   
   public boolean userChecker (String newUser, String oldUser) {
	   
	   //Check to make sure contains a number
	   int i;
	   String num;
	   for(i=1; i<=4; i++) {
		   num = ""+i;
		   if(newUser.contains(num)==true) {
			   i=4;
		   }
	   }
	   if(i!=4) {
		   return false;
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
		char spec = 'i';
		for(i=1; i<=3; i++) {
			switch(i) {
				case 1:
					spec = '!';
					break;
				case 2:
					spec = '?';
					break;
				case 3:
					spec = '@';
					break;
			}
			//System.out.println(str.indexOf(spec));
		if(newUser.indexOf(spec)<=0) {
			
			//System.out.println("Passed");
		}
		else {
			return false;
			//Failure Condition
		}
		
		}
	   
	   //Check does not match the old name
	   if(newUser.contains(oldUser)==true) {
		   return false;
	   
	   }
	
	   return true;
	
	}
   
   public boolean urlChecker (String url){
      
      //Write your Code here
	   if(url.contains(" ")==true) {
		   return false;
	   }
	   
	   int len;
	   String urlending = null;
	   len=url.length();
	   for(int i=1; i<4; i++) {
		   switch(i) {
		   	case 1:
		   		urlending = ".com";
		   		break;
		   	case 2:
		   		urlending = ".edu";
		   		break;
		   	case 3:
		   		urlending = ".net";
		   		break;
		   }
	   if(url.subSequence(len-4, len).equals(urlending)==true) {
		   return true;
	   }
	   }

      return false;
   }
   
   public String lengString (String text){
      
   //Write your Code here
	   int length;
	   length = text.length();
	   
      return Integer.toString(length);
   
   }
   
   public String emailGen (String text){
   
         //Write your Code here
	   String firstLetter;
	   String lastName;
	   int space;
	   int length;
	   
	   firstLetter = text.substring(0, 1);
	   space = text.indexOf(' ');
	   length = text.length();
	   lastName = text.substring(space+1,length);
	   
	   

      return "info@"+firstLetter+lastName+".com";
   }
   
   public String domainGen (String text){
   
	   String firstName;
	   String lastName;
	   int space;
	   int length;
	   
	   text = text.toLowerCase();
	   space = text.indexOf(' ');
	   length = text.length();
	   firstName = text.substring(0, space);
	   lastName = text.substring(space+1,length);
   
      return  "www."+firstName+"-"+lastName+".com";
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
      assert !M1.userChecker(username,""): "user is accepted";
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
      
      //String 
      String name ="Magic Johnson";
      assert "info@MJohnson.com".equals(M1.emailGen(name)): "name is not converted to the email address properly";
      assert "www.magic-johnson.com".equals(M1.domainGen(name)):"name is not converted to the domain address properly";
   }
}