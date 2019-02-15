class Combine implements Combinable {

  // YOUR CODE UNDER THIS COMMENT
  

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
