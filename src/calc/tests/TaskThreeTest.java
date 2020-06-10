package calc.tests;

import calc.TaskThree;
import org.junit.Assert;

public class TaskThreeTest {

  @org.junit.Test
  public void nullAdd() {
    int expected = 10;
    TaskThree taskThree = new TaskThree();
    Assert.assertEquals(expected, taskThree.Add("5,,3,2"));
  }

  @org.junit.Test
  public void lettersAdd() {
    int expected = 10;
    TaskThree taskThree = new TaskThree();
    Assert.assertEquals(expected, taskThree.Add("5,a,3,b,2"));
  }

  @org.junit.Test
  public void emptyAdd() {
    int expected = 0;
    TaskThree taskThree = new TaskThree();
    Assert.assertEquals(expected, taskThree.Add(""));
  }

  @org.junit.Test
  public void newLineAdd() {
    int expected = 5;
    TaskThree taskThree = new TaskThree();
    Assert.assertEquals(expected, taskThree.Add("5\\n,\\n,3,2"));
  }

  @org.junit.Test
  public void delimiterAdd() {
    int expected = 11;
    TaskThree taskThree = new TaskThree();
    taskThree.setDelimiter("a;");
    Assert.assertEquals(expected, taskThree.Add("5a;3;2a;1"));
  }

  @org.junit.Test
  public void delimiterAdd2() {
    int expected = 65;
    TaskThree taskThree = new TaskThree();
    Assert.assertEquals(expected, taskThree.Add("a;\n50a;3;2a;10"));
  }

  /*
Tests using values from the spec sheet provided by 7 Shifts
*/
  @org.junit.Test
  public void sevenShifts4C() {
    int expected = 8;
    TaskThree taskThree = new TaskThree();
    Assert.assertEquals(expected, taskThree.Add(";\n1;3;4"));
  }

  @org.junit.Test
  public void sevenShifts4E() {
    int expected = 6;
    TaskThree taskThree = new TaskThree();
    Assert.assertEquals(expected, taskThree.Add("$\n1$2$3"));
    expected = 13;
    Assert.assertEquals(expected, taskThree.Add("@\n2@3@8"));
  }
}
