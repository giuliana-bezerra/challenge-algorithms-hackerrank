import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class ExtraLongFactorials {
  /*
   * Complete the 'extraLongFactorials' function below.
   *
   * The function accepts INTEGER n as parameter.
   */

  public static void extraLongFactorials(int n) {
    BigInteger factorial = BigInteger.ONE;
    for (int i = 1; i <= n; i++) {
      factorial = factorial.multiply(BigInteger.valueOf(i));
    }
    System.out.println(factorial);
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    extraLongFactorials(n);

    bufferedReader.close();
  }
}
