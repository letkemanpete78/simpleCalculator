package calc.tests;


import calc.TaskOne;
import org.junit.Assert;

public class TaskOneTest {

  @org.junit.Test
  public void nullAdd() {
    int expected = 10;
    TaskOne taskOne = new TaskOne();
    Assert.assertEquals(expected, taskOne.Add("5,,3,2"));
  }

  @org.junit.Test
  public void lettersAdd() {
    int expected = 10;
    TaskOne taskOne = new TaskOne();
    Assert.assertEquals(expected, taskOne.Add("5,a,3,b,2"));
  }

  @org.junit.Test
  public void emptyAdd() {
    int expected = 0;
    TaskOne taskOne = new TaskOne();
    Assert.assertEquals(expected, taskOne.Add(""));
  }

  /*
  Tests using values from the spec sheet provided by 7 Shifts
   */
  @org.junit.Test
  public void sevenShifts1A() {
    int expected = 10;
    TaskOne taskOne = new TaskOne();
    Assert.assertEquals(expected, taskOne.Add("10"));
  }

  @org.junit.Test
  public void sevenShifts1B() {
    int expected = 0;
    TaskOne taskOne = new TaskOne();
    Assert.assertEquals(expected, taskOne.Add(""));
  }

  @org.junit.Test
  public void sevenShifts1D() {
    int expected = 8;
    TaskOne taskOne = new TaskOne();
    Assert.assertEquals(expected, taskOne.Add("1,2,5"));
  }
}
