import java.util.InputMismatchException;

public class StandardDeviation {
  static double[] array;

  /**
 * calculating mean.
 * @param for m
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
  @param for stdDev
  @return
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
  @param for stdDev
  @return
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
 * @param for number
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

  }
}
