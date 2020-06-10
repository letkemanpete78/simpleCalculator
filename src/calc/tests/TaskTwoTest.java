package calc.tests;

import calc.TaskTwo;
import org.junit.Assert;

public class TaskTwoTest {

  @org.junit.Test
  public void newLineAdd() {
    int expected = 10;
    TaskTwo taskTwo = new TaskTwo();
    Assert.assertEquals(expected, taskTwo.Add("5\n,\n,3,2"));
  }

    /*
  Tests using values from the spec sheet provided by 7 Shifts
   */

  @org.junit.Test
  public void sevenShifts2A() {
    int expected = 6;
    TaskTwo taskTwo = new TaskTwo();
    Assert.assertEquals(expected, taskTwo.Add("1\n,2,3"));
  }

  @org.junit.Test
  public void sevenShifts2B() {
    int expected = 7;
    TaskTwo taskTwo = new TaskTwo();
    Assert.assertEquals(expected, taskTwo.Add("1,\n2,4"));
  }
}
