
import java.math.RoundingMode;
import java.text.DecimalFormat;
import org.junit.Assert;
import org.junit.Test;


public class CalculateSqrtRootTest {
  StandardDeviation output = new StandardDeviation();
  DecimalFormat df = new DecimalFormat("#.###");

  @Test
  public void test1() { 
    df.setRoundingMode(RoundingMode.FLOOR);
    double number = 6;
    double result = Double.parseDouble(df.format(output.squareRoot(number)));
    Assert.assertEquals(2.449, result,0.0f);
  }

  @Test
  public void test2() { 
    df.setRoundingMode(RoundingMode.FLOOR);
    double number = 99.3;
    double result = Double.parseDouble(df.format(output.squareRoot(number)));
    Assert.assertEquals(9.964,result,0.0f);
  }

  @Test
  public void test3() { 
    df.setRoundingMode(RoundingMode.FLOOR);
    double number = 0;
    double result = Double.parseDouble(df.format(output.squareRoot(number)));
    Assert.assertEquals(0,result,0.0f);
  }

  /** Square root of negative value */
  @Test
  public void test4() { 
    df.setRoundingMode(RoundingMode.FLOOR);
    double result = Double.parseDouble(df.format(output.squareRoot(-3)));
    Assert.assertEquals(1.732,result,0.0f);
  }

}
