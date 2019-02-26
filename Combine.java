class Combine implements Combinable {

  // YOUR CODE UNDER THIS COMMENT
	public boolean validateChar(char ch) {
		
		if(ch == '2') {
			return true;
		}
		if(ch =='4') {
			return true;
		}
		else {
			
		return false;
		
		}
	}

	public boolean validateRow(String row) {
		// TODO Auto-generated method stub
		
		if(row.length()!=3) {
			return false;
		}
		if(row.contains("2")!=true) {
			if(row.contains("4")!=true) {
				if(row.contains("_")!=true) {
					return false;
				}
			}
		}
		if(row.contains("6")==true) {
			return false;
		}

		
		return true;
	
	}

	public String moveLeft(String row) {
		if(validateRow(row)==false) {
			return row;
		}
		
		if(row.indexOf('_')<0) {
			return row;
		}
		
		int space;
		space = row.indexOf('_');
		row = row.substring(0,space) + row.substring(space+1);
		
		if(row.indexOf('_')<0) {
			return row+"_";
		}

		else {
			space = row.indexOf('_');
			row = row.substring(0,space) + row.substring(space+1);
		}
		
		
		return row+"_"+"_";
	}

	public String combineLeft(String row) {
		// TODO Auto-generated method stub
		int index = 0;
		int num = 0;
		int flag = 11;
		int num2;
		char comb;
		char comb2 = 0;
		
		if(validateRow(row)==false) {
			return row;
		}
		
		
		if(row.charAt(index)==row.charAt(index+1)) {
			if(row.substring(1,2).equals(row.substring(2,3))) {
				
				comb = row.charAt(0);
				num = comb - '0';
				num2 = num+num;
				row = num2+row.substring(1,2)+"_";
				return row;
			}
			
			comb = row.charAt(0);
			num = comb - '0';
			num2 = num+num;
			row = row.substring(1,2);
			row = num2+"__";
			
			return row;
		}
		index = 1;
		if(row.charAt(index)==row.charAt(index+1)) {
			flag = 1;
			
		}
		
		
		if(flag==1) {
			comb = row.charAt(1);
			num = comb - '0';
			num2 = num+num;
			row = row.substring(0,1);
			row = row+=num2+"_";
			
		}
		
		
		
		return row;
	}
  

  // The main is used to test your code
  public static void main(String[] args)
  {
    // The following are asserts used to test your code
    Combine A = new Combine(); 
    
    assert A.validateChar('2')    : "2 should be a valid char";
    assert A.validateChar('4')    : "4 should be a valid char";
    assert A.validateRow("242")   : "242 should be valid";
    assert !A.validateRow("246")   : "246 should NOT be valid";
    assert "4__".equals(A.moveLeft("__4")) : "__4 doesn't change to 4__";
    assert "24_".equals(A.moveLeft("2_4")) : "2_4 doesn't change to 24_";
    assert "242".equals(A.combineLeft("242")) : "242 doesn't change to 242";
    assert "4__".equals(A.combineLeft("22_")) : "22_ doesn't change to 4__";
    assert "8__".equals(A.combineLeft(A.combineLeft("422"))) : "Double invocation doesn't work!";
    assert "84_".equals(A.combineLeft(A.combineLeft("444"))) : "Double invocation doesn't work!";
    
    //You should be using your own validation asserts to check for erroneous inputs!
    assert "__".equals(A.combineLeft("__"))     : "__ should be invalid!";
    
    System.out.println("All tests passed.  VICTORY!");
  }


}

