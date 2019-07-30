

import org.junit.Assert;
import org.junit.Test;



public class CalculateMeanTest {

  StandardDeviation output = new StandardDeviation();
  
  @Test
  public  void test1() {
    double [] array = {-2,-5,0,7.3,8}; 
    double result = output.calculateMean(array);
    Assert.assertEquals(1.6600000000000001, result,0.0f);
  }
  
  /** test for negative real numbers */
  @Test
  public  void test2() {
    double [] array = {-2,-5,-999,-0.4,-88888,-6,-1099}; 
    double result = output.calculateMean(array);
    Assert.assertEquals(-12999.914285714285, result,0.0f);
  }

  @Test
  public  void test3() {
    double [] array = {}; 
    double result = output.calculateMean(array);
    Assert.assertEquals(0, result,0.0f);
  }
}
