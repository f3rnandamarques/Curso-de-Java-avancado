package controle;

public class For3 {
    public static void main(String[] args) {

      // for(int i = 30; i <50; i++) {
      //    System.out.println(i);
      // }
        for(int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++)
                System.out.print("[" + i + " " + j + "]");

        }
        System.out.println();

        for(int i =0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.printf("[%d %d]", i, j);
            }
            System.out.println();
        }
    }
}
