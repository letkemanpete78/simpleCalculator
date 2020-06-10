package calc.tests;

import calc.Bonus;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class BonusTest {

  @org.junit.Test
  public void nullAdd() {
    int expected = 10;
    Bonus bonus = new Bonus();
    Assert.assertEquals(expected, bonus.Add("5,,3,2"));
  }

  @org.junit.Test
  public void lettersAdd() {
    int expected = 10;
    Bonus bonus = new Bonus();
    Assert.assertEquals(expected, bonus.Add("5,a,3,b,2"));
  }

  @org.junit.Test
  public void emptyAdd() {
    int expected = 0;
    Bonus bonus = new Bonus();
    Assert.assertEquals(expected, bonus.Add(""));
  }

  @org.junit.Test
  public void newLineAdd() {
    int expected = 5;
    Bonus bonus = new Bonus();
    Assert.assertEquals(expected, bonus.Add("5\\n,\\n,3,2"));
  }

  @org.junit.Test
  public void delimiterAdd() {
    int expected = 11;
    Bonus bonus = new Bonus();
    bonus.setDelimiter("a;");
    Assert.assertEquals(expected, bonus.Add("5a;3;2a;1"));
  }

  @org.junit.Test
  public void delimiterAdd2() {
    int expected = 65;
    Bonus bonus = new Bonus();
    Assert.assertEquals(expected, bonus.Add("a;\n50a;3;2a;10"));
  }

  @Rule
  public ExpectedException exceptionRule = ExpectedException.none();

  @Test
  public void whenExceptionThrown() {
    exceptionRule.expect(NumberFormatException.class);
    Bonus bonus = new Bonus();
    exceptionRule.expectMessage("Value of -5 cannot be negative.");
    bonus.Add("-5,3,2");
  }

  /*
Tests using values from the spec sheet provided by 7 Shifts
*/
  @org.junit.Test
  public void sevenShiftsBonus1() {
    int expected = 2;
    Bonus bonus = new Bonus();
    Assert.assertEquals(expected, bonus.Add("2,1001"));
  }

  @org.junit.Test
  public void sevenShiftsBonus2() {
    int expected = 8;
    Bonus bonus = new Bonus();
    Assert.assertEquals(expected, bonus.Add("pete\n1pete3pete4"));
  }
}
