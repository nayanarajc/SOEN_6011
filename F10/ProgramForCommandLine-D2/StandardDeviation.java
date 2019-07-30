
import java.util.InputMismatchException;
import java.util.Scanner;


public class StandardDeviation {
  private static double[] array;
  
  /* Program begins here. */
  public static void execute() {
    input();
    final double stdDev = calculatePopulationStdDev(array);
    final double stdDev1 = calculateSampleStdDev(array);
    System.out.println("Population Standard deviation=" + stdDev);
    System.out.print("Sample Standard deviation=" + stdDev1);
  }

  /* Taking input from user */
  public static void input() {
    try {
      final Scanner sc = new Scanner(System.in);
      System.out.print("Enter length of input : ");
      final int length = Integer.parseInt(sc.next());
      array = new double[length];
      if (length >= 2) {
        System.out.print("Enter " + length + " values by providing one space after each value: ");
        for (int i = 0; i < length; i++) {
          array[i] = sc.nextDouble();
        }
      }
      else if (length == 0) {
        System.out.println("exit..."); 
        System.exit(0);
      }
      else {
        System.out.print("Enter the value greater than or equal to 2");
        input();
      }
      sc.close();
    } 
    /***Handling errors*/
    catch (NumberFormatException e) {
      System.out.println("Please enter a valid Number or Press 0 to quit");
      input();
    } 
    catch (InputMismatchException e) {
      System.out.println("Please enter a valid Number or Press 0 to quit");
      input();
    }
  }

  /**
 * calculating mean.
 * @return
 */
  public static double calculateMean(double [] m) {
    if (m.length == 0) {  
      return 0; 
    }
    double total = 0; 
    for (int i = 0; i < m.length; i++) {
      total += m[i]; // this is the calculation for summing up all the values
    }
    final double mean = total / m.length;
    return mean;
  }

  /***calculating Population standard deviation.
 * 
 * @return
 */
  public static double calculatePopulationStdDev(double[] stdDev) {
    if (stdDev.length == 0) { 
      return 0;
    }
    double sum = 0;
    double mean = calculateMean(stdDev);
    for (int i = 0; i < stdDev.length; i++) {
      sum = sum + (stdDev[i] - mean) * (stdDev[i] - mean); 
    }
    final double variance = sum / (stdDev.length); 
    final double result = squareRoot(variance); 
    return result; 
  }
  /**
  Calculate Sample Standard deviation.
  */
  
  public static double calculateSampleStdDev(double[] stdDev) {
    if (stdDev.length == 0) {
      return 0; 
    }
    double sum = 0;
    double mean = calculateMean(stdDev);
    for (int i = 0; i < stdDev.length; i++) {
      sum = sum + (stdDev[i] - mean) * (stdDev[i] - mean); 
    }
    final double variance = sum / ((stdDev.length) - 1); 
    final double output = squareRoot(variance); 
    return output; 
  }

  /**calculate squareRoot of number.
 * 
 * @return
 */
  public static double squareRoot(double number) {
    /* Below if statement is written only to cover negative scenario  
* under unit Test.But in the actual implementation, this scenario 
* it is handled by Standard Deviation function
*/
    if (number < 0) {  
      number = number * -1; 
    }
    double temp;
    double sqrt = number / 2;
    if (sqrt != 0) {
      do {
        temp = sqrt;
        sqrt = (temp + (number / temp)) / 2;
      } while (temp - sqrt != 0);
    }
    else {
      sqrt = 0; 
    }
    return sqrt;
  }
  
  /* Program execution starts here */
  public static void main (String[] args) {
    System.out.println("****WELCOME TO CALCULATOR F10 FUNCTION****");
    System.out.println("Lets begin.....");
    System.out.println("Press 0(Zero) to exit");
    execute(); 
  }
}
