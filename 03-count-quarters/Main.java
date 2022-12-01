class Main {
  public static void main(String[] args) {
    System.out.println(countQuaters(1278));
    System.out.println(countQuaters(546));
    System.out.println(countQuaters(0));
  }
  public static int countQuaters(int coins) {
    String c= String.valueOf(coins);
    if (c.length() < 2) {
      return 0;
    }
    String co=(c.substring(c.length()-2));
    int coin= Integer.parseInt(co);
    return coin /25;
  }
}
