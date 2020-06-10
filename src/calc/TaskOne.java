package calc;

public class TaskOne {

  private static final int ZERO = 0;

  private String numbers;

  public String getNumbers() {
    return numbers;
  }

  public void setNumbers(String numbers) {
    this.numbers = numbers;
  }

  public TaskOne() {
  }

  public TaskOne(String numbers) {
    this.numbers = numbers;
  }

  public int Add(String numbers) {

    if (isEmptyString(numbers)) {
      return ZERO;
    }

    if (!numbers.contains(",")) {
      return getIntegerValue(numbers);
    }

    String[] strings = numbers.split(",");
    int sum = 0;
    for (String s : strings) {
      if (!isEmptyString(s)) {
        sum += getIntegerValue(s);
      }
    }
    return sum;

  }

  private boolean isEmptyString(String numbers) {
    return (numbers == null) || (numbers.length() == 0) || (numbers.trim().length() == 0);
  }

  private Integer getIntegerValue(String s) {
    try {
      return Integer.parseInt(s.trim());
    } catch (NumberFormatException e) {
      return ZERO;
    }
  }
}
