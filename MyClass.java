public class MyClass {
    public static void main(String args[]) {
        
      String[] rolls_one = new String[]{"X","X","X","X","X","X","X","X","X","X","X","X"};
      Dashboard.showScore(rolls_one);
      
      String[] rolls_two = new String[]{"9-", "9-", "9-", "9-", "9-", "9-", "9-", "9-", "9-", "9-"};
      Dashboard.showScore(rolls_two);
      
      
      String[] rolls_three = new String[]{"5/", "5/", "5/", "5/", "5/", "5/", "5/", "5/", "5/", "5/", "5/."};
      Dashboard.showScore(rolls_three);
      
      String[] rolls_four = new String[]{"5/", "5/", "X", "5/", "5/", "9-", "5/", "5/", "5/", "5/", "9-"};
      Dashboard.showScore(rolls_four);
      
      String[] rolls_five = new String[]{"5/", "5/", "5/", "5/", "5/", "5/", "5/", "5/", "5/", "5/"};
      Dashboard.showScore(rolls_five);
      
      System.out.println("isFrame: " + FrameValidator.isStrike("X"));
      System.out.println("isFrame: " + FrameValidator.isSquare("5/"));
      System.out.println("isFrame: " + FrameValidator.isMiss("9-"));
      
      
    }
}