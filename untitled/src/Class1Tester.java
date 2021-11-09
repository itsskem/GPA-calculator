import java.util.Scanner;
public class Class1Tester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello. Welcome to the GPA Calculator");
        System.out.println("Note that this code only gives a ROUGH average of your GPA and is not entirely correct.");
        System.out.println("All schools are not the same");
        System.out.println("This calculator is meant to calculate 3-7 classes");
        System.out.println("Enter your name: ");
        String userName = input.nextLine();
        System.out.println("Enter your age: ");
        int userAge = input.nextInt();
        System.out.println("What grade are you in?");
        int userGrade = input.nextInt();
        System.out.println("Cool. Now lets calculate your GPA. Credits for your first class?");
        int userCredits1 = input.nextInt();
        System.out.println("Is it honors or AP? 1 = Yes, 2 = No");
        int userAnswer1 = input.nextInt();
        System.out.println("Your grade?");
        double firstClass = input.nextDouble();
        if (userAnswer1 == 1){
            if (firstClass >= 96.5){
                firstClass = 5.3;
            } else if (firstClass >= 92.5){
                firstClass = 5.0;
            } else if (firstClass >= 89.5){
                firstClass = 4.7;
            } else if (firstClass >= 86.5){
                firstClass = 4.3;
            } else if (firstClass >= 82.5){
                firstClass = 4.0;
            } else if (firstClass >= 79.5){
                firstClass = 3.7;
            } else if (firstClass >= 76.5){
                firstClass = 3.3;
            } else if (firstClass >= 73.5){
                firstClass = 3.0;
            } else if (firstClass >= 69.5){
                firstClass = 2.7;
            } else if (firstClass >= 66.5){
                firstClass = 2.3;
            } else if (firstClass >= 62.5){
                firstClass = 2.0;
            } else if (firstClass >= 59.5){
                firstClass = 1.7;
            } else if (firstClass < 59.5){
                firstClass = 0.0;
            } else {
                System.out.println("Couldn't recognize. Please run again.");
            }
        } else if (userAnswer1 == 2){
            if (firstClass >= 96.5){
                firstClass = 4.3;
            } else if (firstClass >= 92.5){
                firstClass = 4.0;
            } else if (firstClass >= 89.5){
                firstClass = 3.7;
            } else if (firstClass >= 86.5){
                firstClass = 3.3;
            } else if (firstClass >= 82.5){
                firstClass = 3.0;
            } else if (firstClass >= 79.5){
                firstClass = 2.7;
            } else if (firstClass >= 76.5){
                firstClass = 2.3;
            } else if (firstClass >= 73.5){
                firstClass = 2.0;
            } else if (firstClass >= 69.5){
                firstClass = 1.7;
            } else if (firstClass >= 66.5){
                firstClass = 1.3;
            } else if (firstClass >= 62.5){
                firstClass = 1.0;
            } else if (firstClass >= 59.5){
                firstClass = 0.7;
            } else if (firstClass < 59.5){
                firstClass = 0.0;
            } else {
                System.out.println("Couldn't recognize. Please run again.");
            }
        }
        double class1 = userCredits1 * firstClass;
        
        
        
        System.out.println("Credits for your second class?");
        int userCredits2 = input.nextInt();
        if (userCredits2 > 0){

        }
        System.out.println("Is it honors or AP? 1 = Yes, 2 = No");
        int userAnswer2 = input.nextInt();
        System.out.println("Your grade?");
        double secondClass = input.nextDouble();
        if (userAnswer2 == 1){
            if (secondClass >= 96.5){
                secondClass = 5.3;
            } else if (secondClass >= 92.5){
                secondClass = 5.0;
            } else if (secondClass >= 89.5){
                secondClass = 4.7;
            } else if (secondClass >= 86.5){
                secondClass = 4.3;
            } else if (secondClass >= 82.5){
                secondClass = 4.0;
            } else if (secondClass >= 79.5){
                secondClass = 3.7;
            } else if (secondClass >= 76.5){
                secondClass = 3.3;
            } else if (secondClass >= 73.5){
                secondClass = 3.0;
            } else if (secondClass >= 69.5){
                secondClass = 2.7;
            } else if (secondClass >= 66.5){
                secondClass = 2.3;
            } else if (secondClass >= 62.5){
                secondClass = 2.0;
            } else if (secondClass >= 59.5){
                secondClass = 1.7;
            } else if (secondClass < 59.5){
                secondClass = 0.0;
            } else {
                System.out.println("Couldn't recognize. Please run again.");
            }
        } else if (userAnswer2 == 2){
            if (secondClass >= 96.5){
                firstClass = 4.3;
            } else if (secondClass >= 92.5){
                secondClass = 4.0;
            } else if (secondClass >= 89.5){
                secondClass = 3.7;
            } else if (secondClass >= 86.5){
                secondClass = 3.3;
            } else if (secondClass >= 82.5){
                secondClass = 3.0;
            } else if (secondClass >= 79.5){
                secondClass = 2.7;
            } else if (secondClass >= 76.5){
                secondClass = 2.3;
            } else if (secondClass >= 73.5){
                secondClass = 2.0;
            } else if (secondClass >= 69.5){
                secondClass = 1.7;
            } else if (secondClass >= 66.5){
                secondClass = 1.3;
            } else if (secondClass >= 62.5){
                secondClass = 1.0;
            } else if (secondClass >= 59.5){
                secondClass = 0.7;
            } else if (secondClass < 59.5){
                secondClass = 0.0;
            } else {
                System.out.println("Couldn't recognize. Please run again.");
            }
        }
        double class2 = userCredits2 * secondClass;


        System.out.println("Credits for your third class?");
        int userCredits3 = input.nextInt();
        System.out.println("Is it honors or AP? 1 = Yes, 2 = No");
        int userAnswer3 = input.nextInt();
        System.out.println("Your grade?");
        double thirdClass = input.nextDouble();
        if (userAnswer3 == 1){
            if (thirdClass >= 96.5){
                thirdClass = 5.3;
            } else if (thirdClass >= 92.5){
                thirdClass = 5.0;
            } else if (thirdClass >= 89.5){
                thirdClass = 4.7;
            } else if (thirdClass >= 86.5){
                thirdClass = 4.3;
            } else if (thirdClass >= 82.5){
                thirdClass = 4.0;
            } else if (thirdClass >= 79.5){
                thirdClass = 3.7;
            } else if (thirdClass >= 76.5){
                thirdClass = 3.3;
            } else if (thirdClass >= 73.5){
                thirdClass = 3.0;
            } else if (thirdClass >= 69.5){
                thirdClass = 2.7;
            } else if (thirdClass >= 66.5){
                thirdClass = 2.3;
            } else if (thirdClass >= 62.5){
                thirdClass = 2.0;
            } else if (thirdClass >= 59.5){
                thirdClass = 1.7;
            } else if (thirdClass < 59.5){
                thirdClass = 0.0;
            } else {
                System.out.println("Couldn't recognize. Please run again.");
            }
        } else if (userAnswer3 == 2){
            if (thirdClass >= 96.5){
                thirdClass = 4.3;
            } else if (thirdClass >= 92.5){
                thirdClass = 4.0;
            } else if (thirdClass >= 89.5){
                thirdClass = 3.7;
            } else if (thirdClass >= 86.5){
                thirdClass = 3.3;
            } else if (thirdClass >= 82.5){
                thirdClass = 3.0;
            } else if (thirdClass >= 79.5){
                thirdClass = 2.7;
            } else if (thirdClass >= 76.5){
                thirdClass = 2.3;
            } else if (thirdClass >= 73.5){
                thirdClass = 2.0;
            } else if (thirdClass >= 69.5){
                thirdClass = 1.7;
            } else if (thirdClass >= 66.5){
                thirdClass = 1.3;
            } else if (thirdClass >= 62.5){
                thirdClass = 1.0;
            } else if (thirdClass >= 59.5){
                thirdClass = 0.7;
            } else if (thirdClass < 59.5){
                thirdClass = 0.0;
            } else {
                System.out.println("Couldn't recognize. Please run again.");
            }
        }
        double class3 = userCredits3 * thirdClass;


        System.out.println("Credits for your fourth class?");
        int userCredits4 = input.nextInt();
        System.out.println("Is it honors or AP? 1 = Yes, 2 = No");
        int userAnswer4 = input.nextInt();
        System.out.println("Your grade?");
        double fourthClass = input.nextDouble();
        if (userAnswer4 == 1){
            if (fourthClass >= 96.5){
                fourthClass = 5.3;
            } else if (fourthClass >= 92.5){
                fourthClass = 5.0;
            } else if (fourthClass >= 89.5){
                fourthClass = 4.7;
            } else if (fourthClass >= 86.5){
                fourthClass = 4.3;
            } else if (fourthClass >= 82.5){
                fourthClass = 4.0;
            } else if (fourthClass >= 79.5){
                fourthClass = 3.7;
            } else if (fourthClass >= 76.5){
                fourthClass = 3.3;
            } else if (fourthClass >= 73.5){
                fourthClass = 3.0;
            } else if (fourthClass >= 69.5){
                fourthClass = 2.7;
            } else if (fourthClass >= 66.5){
                fourthClass = 2.3;
            } else if (fourthClass >= 62.5){
                fourthClass = 2.0;
            } else if (fourthClass >= 59.5){
                fourthClass = 1.7;
            } else if (fourthClass < 59.5){
                fourthClass = 0.0;
            } else {
                System.out.println("Couldn't recognize. Please run again.");
            }
        } else if (userAnswer4 == 2){
            if (fourthClass >= 96.5){
                fourthClass = 4.3;
            } else if (fourthClass >= 92.5){
                fourthClass = 4.0;
            } else if (fourthClass >= 89.5){
                fourthClass = 3.7;
            } else if (fourthClass >= 86.5){
                fourthClass = 3.3;
            } else if (fourthClass >= 82.5){
                fourthClass = 3.0;
            } else if (fourthClass >= 79.5){
                fourthClass = 2.7;
            } else if (fourthClass >= 76.5){
                fourthClass = 2.3;
            } else if (fourthClass >= 73.5){
                fourthClass = 2.0;
            } else if (fourthClass >= 69.5){
                fourthClass = 1.7;
            } else if (fourthClass >= 66.5){
                fourthClass = 1.3;
            } else if (fourthClass >= 62.5){
                fourthClass = 1.0;
            } else if (fourthClass >= 59.5){
                fourthClass = 0.7;
            } else if (fourthClass < 59.5){
                fourthClass = 0.0;
            } else {
                System.out.println("Couldn't recognize. Please run again.");
            }
        }

        double class4 = userCredits4 * fourthClass;


        System.out.println("Credits for your fifth class?");
        int userCredits5 = input.nextInt();
        System.out.println("Is it honors or AP? 1 = Yes, 2 = No");
        int userAnswer5 = input.nextInt();
        System.out.println("Your grade?");
        double fifthClass = input.nextDouble();
        if (userAnswer5 == 1){
            if (fifthClass >= 96.5){
                fifthClass = 5.3;
            } else if (fifthClass >= 92.5){
                fifthClass = 5.0;
            } else if (fifthClass >= 89.5){
                fifthClass = 4.7;
            } else if (fifthClass >= 86.5){
                fifthClass = 4.3;
            } else if (fifthClass >= 82.5){
                fifthClass = 4.0;
            } else if (fifthClass >= 79.5){
                fifthClass = 3.7;
            } else if (fifthClass >= 76.5){
                fifthClass = 3.3;
            } else if (fifthClass >= 73.5){
                fifthClass = 3.0;
            } else if (fifthClass >= 69.5){
                fifthClass = 2.7;
            } else if (fifthClass >= 66.5){
                fifthClass = 2.3;
            } else if (fifthClass >= 62.5){
                fifthClass = 2.0;
            } else if (fifthClass >= 59.5){
                fifthClass = 1.7;
            } else if (fifthClass < 59.5){
                fifthClass = 0.0;
            } else {
                System.out.println("Couldn't recognize. Please run again.");
            }
        } else if (userAnswer5 == 2) if (fifthClass >= 96.5) {
            fifthClass = 4.3;
        } else if (fifthClass >= 92.5) {
            fifthClass = 4.0;
        } else if (fifthClass >= 89.5) {
            fifthClass = 3.7;
        } else if (fifthClass >= 86.5) {
            fifthClass = 3.3;
        } else if (fifthClass >= 82.5) {
            fifthClass = 3.0;
        } else if (fifthClass >= 79.5) {
            fifthClass = 2.7;
        } else if (fifthClass >= 76.5) {
            fifthClass = 2.3;
        } else if (fifthClass >= 73.5) {
            fifthClass = 2.0;
        } else if (fifthClass >= 69.5) {
            fifthClass = 1.7;
        } else if (fifthClass >= 66.5) {
            fifthClass = 1.3;
        } else if (fifthClass >= 62.5) {
            fifthClass = 1.0;
        } else if (fifthClass >= 59.5) {
            fifthClass = 0.7;
        } else if (fifthClass < 59.5) {
            fifthClass = 0.0;
        } else {
            System.out.println("Couldn't recognize. Please run again.");
        }

        double class5 = userCredits5 * fifthClass;

        System.out.println("Credits for your sixth class?");
        int userCredits6 = input.nextInt();
        System.out.println("Is it honors or AP? 1 = Yes, 2 = No");
        int userAnswer6 = input.nextInt();
        System.out.println("Your grade?");
        double sixthClass = input.nextDouble();
        if (userAnswer6 == 1){
            if (sixthClass >= 96.5){
                sixthClass = 5.3;
            } else if (sixthClass >= 92.5){
                sixthClass = 5.0;
            } else if (sixthClass >= 89.5){
                sixthClass = 4.7;
            } else if (sixthClass >= 86.5){
                sixthClass = 4.3;
            } else if (sixthClass >= 82.5){
                sixthClass = 4.0;
            } else if (sixthClass >= 79.5){
                sixthClass = 3.7;
            } else if (sixthClass >= 76.5){
                sixthClass = 3.3;
            } else if (sixthClass >= 73.5){
                sixthClass = 3.0;
            } else if (sixthClass >= 69.5){
                sixthClass = 2.7;
            } else if (sixthClass >= 66.5){
                sixthClass = 2.3;
            } else if (sixthClass >= 62.5){
                sixthClass = 2.0;
            } else if (sixthClass >= 59.5){
                sixthClass = 1.7;
            } else if (sixthClass < 59.5){
                sixthClass = 0.0;
            } else {
                System.out.println("Couldn't recognize. Please run again.");
            }
        } else if (userAnswer6 == 2){
            if (sixthClass >= 96.5){
                sixthClass = 4.3;
            } else if (sixthClass >= 92.5){
                sixthClass = 4.0;
            } else if (sixthClass >= 89.5){
                sixthClass = 3.7;
            } else if (sixthClass >= 86.5){
                sixthClass = 3.3;
            } else if (sixthClass >= 82.5){
                sixthClass = 3.0;
            } else if (sixthClass >= 79.5){
                sixthClass = 2.7;
            } else if (sixthClass >= 76.5){
                sixthClass = 2.3;
            } else if (sixthClass >= 73.5){
                sixthClass = 2.0;
            } else if (sixthClass >= 69.5){
                sixthClass = 1.7;
            } else if (sixthClass >= 66.5){
                sixthClass = 1.3;
            } else if (sixthClass >= 62.5){
                sixthClass = 1.0;
            } else if (sixthClass >= 59.5){
                sixthClass = 0.7;
            } else if (sixthClass < 59.5){
                sixthClass = 0.0;
            } else {
                System.out.println("Couldn't recognize. Please run again.");
            }
        }


        double class6 = userCredits6 * sixthClass;

        System.out.println("Credits in your seventh class?");
        int userCredits7 = input.nextInt();
        System.out.println("Is it honors or AP? 1 = Yes, 2 = No");
        int userAnswer7 = input.nextInt();
        System.out.println("Your grade?");
        double seventhClass = input.nextDouble();
        if (userAnswer7 == 1){
            if (seventhClass >= 96.5){
                seventhClass = 5.3;
            } else if (seventhClass >= 92.5){
                seventhClass = 5.0;
            } else if (seventhClass >= 89.5){
                seventhClass = 4.7;
            } else if (seventhClass >= 86.5){
                seventhClass = 4.3;
            } else if (seventhClass >= 82.5){
                seventhClass = 4.0;
            } else if (seventhClass >= 79.5){
                seventhClass = 3.7;
            } else if (seventhClass >= 76.5){
                seventhClass = 3.3;
            } else if (seventhClass >= 73.5){
                seventhClass = 3.0;
            } else if (seventhClass >= 69.5){
                seventhClass = 2.7;
            } else if (seventhClass >= 66.5){
                seventhClass = 2.3;
            } else if (seventhClass >= 62.5){
                seventhClass = 2.0;
            } else if (seventhClass >= 59.5){
                seventhClass = 1.7;
            } else if (seventhClass < 59.5){
                seventhClass = 0.0;
            } else {
                System.out.println("Couldn't recognize. Please run again.");
            }
        } else if (userAnswer7 == 2){
            if (seventhClass >= 96.5){
                seventhClass = 4.3;
            } else if (seventhClass >= 92.5){
                seventhClass = 4.0;
            } else if (seventhClass >= 89.5){
                seventhClass = 3.7;
            } else if (seventhClass >= 86.5){
                seventhClass = 3.3;
            } else if (seventhClass >= 82.5){
                seventhClass = 3.0;
            } else if (seventhClass >= 79.5){
                seventhClass = 2.7;
            } else if (seventhClass >= 76.5){
                seventhClass = 2.3;
            } else if (seventhClass >= 73.5){
                seventhClass = 2.0;
            } else if (seventhClass >= 69.5){
                seventhClass = 1.7;
            } else if (seventhClass >= 66.5){
                seventhClass = 1.3;
            } else if (seventhClass >= 62.5){
                seventhClass = 1.0;
            } else if (seventhClass >= 59.5){
                seventhClass = 0.7;
            } else if (seventhClass < 59.5){
                seventhClass = 0.0;
            } else {
                System.out.println("Couldn't recognize. Please run again.");
            }
        }


        double class7 = userCredits7 * seventhClass;

        double sumOfUserGrades = class1 + class2 + class3 + class4 + class5 + class6 + class7;
        double sumOfUserCredits = userCredits1 + userCredits2 + userCredits3 + userCredits4 + userCredits5 + userCredits6 + userCredits7;
        Class1 student = new Class1(userName, userAge, userGrade, class1, class2, class3, class4, class5, class6, class7, sumOfUserGrades, sumOfUserCredits);
        System.out.println(student);
        System.out.println("Your GPA: ");
        Class1.printStudent();




    }
}
