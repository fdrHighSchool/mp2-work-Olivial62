class Main {
  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      System.out.println(fizzBuzz(i));
    }
    /*
    System.out.println(fizzBuzz(3));
    System.out.println(fizzBuzz(5));
    System.out.println(fizzBuzz(15));
    System.out.println(fizzBuzz(1));
    */
  }
  public static String fizzBuzz(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            return "fizzbuzz";
        }
        else if (num % 3 == 0) {
            return "fizz";
        }
         else if (num % 5 == 0) {
            return "buzz";
        }
        else {
            return String.valueOf(num);
         }
    }
   /*
   for (int i = 1; i <= num; i++) {
      if (((i % 3) == 0) && ((i % 5) == 0)) 
        System.out.println("fizzbuzz");
      else if ((i % 3) == 0) 
        System.out.println("fizz");
      else if ((i % 5) == 0) 
        System.out.println("buzz");
      else
        System.out.println(i); 
    }  
   }
   */
  

}
