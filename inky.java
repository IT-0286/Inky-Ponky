      public class Inky {
      public Inky(String x) {
      System.out.println(x);
    }

    public Inky(String pinky, String blinky, String rinky) 
      {
        System.out.println(blinky + " " + pinky);                     //Print 1
        System.out.println(pinky + " " + rinky);                      //print 2
        System.out.println(blinky + " " + pinky + " " + rinky);      //print 3
    }

      public static void main(String args[]) {
          String pinky = "Donky";

          Inky ponky = new Inky(pinky); 
          String blinky = "pinky";
          String rinky = "Monky";

          Inky ponky2 = new Inky(pinky, blinky, rinky);
    }
}
