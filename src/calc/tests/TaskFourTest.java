package calc.tests;

import calc.TaskFour;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TaskFourTest {

  @org.junit.Test
  public void nullAdd() {
    int expected = 10;
    TaskFour taskFour = new TaskFour();
    Assert.assertEquals(expected, taskFour.Add("5,,3,2"));
  }

  @org.junit.Test
  public void lettersAdd() {
    int expected = 10;
    TaskFour taskFour = new TaskFour();
    Assert.assertEquals(expected, taskFour.Add("5,a,3,b,2"));
  }

  @org.junit.Test
  public void emptyAdd() {
    int expected = 0;
    TaskFour taskFour = new TaskFour();
    Assert.assertEquals(expected, taskFour.Add(""));
  }

  @org.junit.Test
  public void newLineAdd() {
    int expected = 5;
    TaskFour taskFour = new TaskFour();
    Assert.assertEquals(expected, taskFour.Add("5\\n,\\n,3,2"));
  }

  @org.junit.Test
  public void delimiterAdd() {
    int expected = 11;
    TaskFour taskFour = new TaskFour();
    taskFour.setDelimiter("a;");
    Assert.assertEquals(expected, taskFour.Add("5a;3;2a;1"));
  }

  @org.junit.Test
  public void delimiterAdd2() {
    int expected = 65;
    TaskFour taskFour = new TaskFour();
    Assert.assertEquals(expected, taskFour.Add("a;\n50a;3;2a;10"));
  }

  @Rule
  public ExpectedException exceptionRule = ExpectedException.none();

  @Test
  public void whenExceptionThrown() {
    exceptionRule.expect(NumberFormatException.class);
    TaskFour taskFour = new TaskFour();
    exceptionRule.expectMessage("Value of -5 cannot be negative.");
    taskFour.Add("-5,3,2");
  }

  /*
Tests using values from the spec sheet provided by 7 Shifts
*/
  @org.junit.Test
  public void sevenShifts4C() {
    int expected = 8;
    TaskFour taskFour = new TaskFour();
    Assert.assertEquals(expected, taskFour.Add(";\n1;3;4"));
  }

  @org.junit.Test
  public void sevenShifts4E() {
    int expected = 6;
    TaskFour taskFour = new TaskFour();
    Assert.assertEquals(expected, taskFour.Add("$\n1$2$3"));
    expected = 13;
    Assert.assertEquals(expected, taskFour.Add("@\n2@3@8"));
  }
}
