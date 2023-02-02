package ControlFlowExamples;

public class GradeCheckerIfElse {
  public static void main(String[] args) {
    int score = 75;
    if (score >= 90) {
      System.out.println("Your grade is A.");
    } else if (score >= 80) {
      System.out.println("Your grade is B.");
    } else if (score >= 70) {
      System.out.println("Your grade is C.");
    } else if (score >= 60) {
      System.out.println("Your grade is D.");
    } else {
      System.out.println("Your grade is F.");
    }
  }

}