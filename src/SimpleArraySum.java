import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleArraySum {
  /*
   * Complete the 'simpleArraySum' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts INTEGER_ARRAY ar as parameter.
   */
  public static int simpleArraySum(List<Integer> ar) {
    return ar.stream().reduce(0, Integer::sum);
  }

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    var n = scanner.nextInt();
    var ar = new ArrayList<Integer>();

    for (int i = 0; i < n; i++) {
      var number = scanner.nextInt();
      ar.add(number);
    }

    var result = simpleArraySum(ar);
    System.out.println(result);

    scanner.close();
  }
}
