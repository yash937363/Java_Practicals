// Write a Program to take marks of 5 Subjects and Calculate total marks and percentage and display the Grade as Follows : 
class Student {
    public static void main(String[] args) {
        int s1, s2, s3, s4, s5, total;
        float percentage;
        String grade;
        System.out.println("Enter marks of 5 Subjects : ");
        s1 = Integer.parseInt(System.console().readLine());
        s2 = Integer.parseInt(System.console().readLine());
        s3 = Integer.parseInt(System.console().readLine());
        s4 = Integer.parseInt(System.console().readLine());
        s5 = Integer.parseInt(System.console().readLine());
        total = s1 + s2 + s3 + s4 + s5;
        percentage = total / 5f;
        if (percentage >= 75) {
            grade = "O";
        } else if (percentage < 75 && percentage >= 65) {
            grade = "A";
        } else if (percentage < 65 && percentage >= 55) {
            grade = "B";
        } else if (percentage < 55 && percentage >= 45) {
            grade = "C";
        } else {
            grade = "F";
        }
        System.out.println("Total : " + total);
        System.out.println("Percentage : " + percentage+"%");
        System.out.println("Grade : " + grade);
    }
}