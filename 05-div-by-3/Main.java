class Main {
  public static void main(String[] args) {
    System.out.println(divByThree(123));
    System.out.println(divByThree(2048));
  }
  public static boolean divByThree(int num) {
    int sum = 0;
    while (num > 0) {
      sum += num%10;
      num /= 10;
      
    }
    if (sum%3==0) {
      return true;
    }
    else {
      return false;
    }
  }
}
