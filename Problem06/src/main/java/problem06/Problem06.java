package problem06;
public class Problem06 {
  public static boolean isReminderEqual(int A, int B, int givenReminder) {
        if (B == 0) {
            throw new IllegalArgumentException("Cannot divide by zero (B cannot be zero)");
        }
        return (A % B) == givenReminder;
    }
}
