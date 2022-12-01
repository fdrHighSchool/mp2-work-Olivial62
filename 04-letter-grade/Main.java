class Main {
  public static void main(String[] args) {
    System.out.println(letterGrade(90));
    System.out.println(letterGrade(0));
    System.out.println(letterGrade(100));
    System.out.println(letterGrade(67));
    System.out.println(letterGrade(73));
  }
  
  public static String letterGrade(int grade) {
    String status="";
    if (grade==100) {
      return "A+";
    }
    else if (grade==0) {
     return "F";
    }
    if (grade>=90) {
      //a
      status+="A";
      if (grade%10==7 || grade%10==8 || grade%10==9) {
        status+="+";
      }
      else if (grade%10==0 ||grade%10==1 ||grade%10==2) {
        status+="-";
      } 
    }
  
    else if (grade>=80 && grade<90) {
      //b
      status+="B";
      if (grade%10==7 || grade%10==8 || grade%10==9) {
        status+="+";
      }
      else if (grade%10==0 ||grade%10==1 ||grade%10==2) {
        status+="-";
      } 
    }
    else if (grade>=70 && grade<80) {
      //c 
      status+="C";
      if (grade%10==7 || grade%10==8 || grade%10==9) {
        status+="+";
      }
      else if (grade%10==0 ||grade%10==1 ||grade%10==2) {
        status+="-";
      } 
    } 
    else if (grade>=60 && grade <70) {
      //d
      status+="D";
      if (grade%10==7 || grade%10==8 || grade%10==9) {
        status+="+";
      }
      else if (grade%10==0 ||grade%10==1 ||grade%10==2) {
        status+="-";
    } else {
      //f
      status+="F";
    }
  }
  return status;
}
  
}
