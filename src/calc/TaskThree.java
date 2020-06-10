package calc;

public class TaskThree {

  private static final int ZERO = 0;

  private String numbers;

  private String delimiter;

  public String getNumbers() {
    return numbers;
  }

  public void setNumbers(String numbers) {
    this.numbers = numbers;
  }

  public String getDelimiter() {
    return delimiter;
  }

  public void setDelimiter(String delimiter) {
    if ((delimiter == null) || (delimiter.length() == 0) || (delimiter.trim().length() == 0)) {
      this.delimiter = ",";
    } else {

      this.delimiter = delimiter;

    }
  }

  public TaskThree(String numbers, String delimeter) {
    this.numbers = numbers;
    this.delimiter = delimeter;
  }

  public TaskThree() {
    this.delimiter = ",";
  }

  public TaskThree(String numbers) {
    this.numbers = numbers;
    this.delimiter = ",";
  }

  public int Add(String numbers) {

    if (isEmptyString(numbers)) {
      return ZERO;
    }

    final int endIndex = numbers.indexOf("\n");
    if (endIndex > 0) {
      String d = numbers.substring(0, endIndex);
      this.setDelimiter(d);
      numbers = numbers.substring(endIndex + 1);
    }

    if (!numbers.contains(getDelimiter())) {
      return getIntegerValue(numbers);
    }

    String[] strings = numbers.split("[(" + getDelimiter() + ")]");
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
