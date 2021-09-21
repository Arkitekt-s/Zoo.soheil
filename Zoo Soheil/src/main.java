public class main {
  public static void main(String[] args) {

    Animal rabbit = new Animal("Rabbit", 2, 2);
    Animal snake = new Animal("Snake", 9, 9);
    System.out.println(rabbit.toString());
    System.out.println(snake.toString());
    int i = 2;
    while ((i + (rabbit.getX()) <= 7) && (i + (rabbit.getY()) <= 7)) {
      int k = 14;
      while ((k - (snake.getX()) > 1) && (k - (snake.getY()) > 1)) {

        System.out.println(
            "I am the nice rabbit, i am now standing on square" + "(" + (i) + "," + (i) + ")");
        i++;
        System.out.println(
            "I am the evil snake, i am now standing on the square"
                + "("
                + ((k) - 5)
                + ","
                + ((k) - 5)
                + ")");
        k--;
        if ((i) - (k - 5) == 1) {
          System.out.println("noooo Please dont eat me!!");
        }
      }
      System.out.println("I am the evil snake, i am now standing on the square"
      + "("
      + ((k) - 5) + ","
      + ((k) - 5)
      + ")");
      System.out.println("I am eating you");
    }
  }
}







