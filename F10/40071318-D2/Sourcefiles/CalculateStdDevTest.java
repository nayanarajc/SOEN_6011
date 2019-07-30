
import java.math.RoundingMode;
import java.text.DecimalFormat;
import org.junit.Assert;
import org.junit.Test;

public class CalculateStdDevTest {
  StandardDeviation output = new StandardDeviation();

  @Test
  public void test1() {
    DecimalFormat df = new DecimalFormat("#.####");
    df.setRoundingMode(RoundingMode.FLOOR);
    double [] array = {-2,-5,-999,-0.4,-88888,-6,-1099}; 
    double result1 = Double.parseDouble(df.format(output.calculatePopulationStdDev(array)));
    double result2 = Double.parseDouble(df.format(output.calculateSampleStdDev(array)));
    Assert.assertEquals(30984.5537,result1,0.0f);
    Assert.assertEquals(33467.1431, result2,0.0f);
  }

  @Test
  public void test2() {
    double [] array1 = {43,43,43,43}; 
    double res1 = output.calculatePopulationStdDev(array1);
    double res2 = output.calculateSampleStdDev(array1);
    Assert.assertEquals(0,res1,0.0f);
    Assert.assertEquals(0,res2,0.0f);
  }

  @Test
  public void test3() {
    double [] array1 = {}; 
    double res1 = output.calculatePopulationStdDev(array1);
    double res2 = output.calculateSampleStdDev(array1);
    Assert.assertEquals(0,res1,0.0f);
    Assert.assertEquals(0,res2,0.0f);
  }
}
