class Main {
  public static void main(String[] args) {
    square(6);
    rectangle(2,4);
    rightTriangle(6);
  }
  public static void square(int s) {
    for(int row=0 ; row<s ; row++) {
      
      for(int col=0 ; col<s ; col++) {
        System.out.print(" * ");
      }// end of col loop
      
      System.out.println();
    }//end of row loop
    
  }//end of stars method
  public static void rectangle(int l, int w) {
    for(int row=0 ; row<l ; row++) {

      for(int col=0 ; col<w ; col++) {
        System.out.print(" * ");
      }// end of col loop
      System.out.println();
    }// end of row loop
  } // end of rectangle method
  public static void rightTriangle(int s) {
    for(int row=0 ; row<=s ; row++) {
      
      for(int col=0 ; col<row ; col++) {
        System.out.print(" * ");
      }// end of col loop
      
      System.out.println("");
    }
  }
  
}// end of class
