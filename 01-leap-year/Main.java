class Main {
  public static void main(String[] args) {
    System.out.println(isLeapYear(2022));
    System.out.println(isLeapYear(2024));
    System.out.println(isLeapYear(1900));
    System.out.println(isLeapYear(2000));
  }// end of main method
  public static boolean isLeapYear(int year){
    boolean status = true;
    if (year%4==0) {
        status = true;
      
        if (year%100!=0){
          status = true;
        }// end of inner if statement
        else if (year%400==0){
          status = true;
        }// end of else if statement 
        else {
          status = false;
        }// end of inner else statement 
      
    } // end of outter if statement
    else {
        status = false;
    }// end of outter else statement
    return status;
  }// end of isLeapYear method
}// end of main class
