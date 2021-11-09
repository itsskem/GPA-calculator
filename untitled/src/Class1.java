public class Class1{
    private static double sum;
    private static double credits;
    private static String score;
    private String name;
    private int age;
    private int grade;
    private double class1credits;
    private double class2credits;
    private double class3credits;
    private double class4credits;
    private double class5credits;
    private double class6credits;
    private double class7credits;





    public Class1(String userName, int userAge, int userGrade, double class1, double class2, double class3, double class4, double class5, double class6, double class7, double sumOfUserGrades, double sumOfUserCredits) {
        name = userName;
        age = userAge;
        grade = userGrade;
        class1credits = class1;
        class2credits = class2;
        class3credits = class3;
        class4credits = class4;
        class5credits = class5;
        class6credits = class6;
        class7credits = class7;
        sum = sumOfUserGrades;
        credits = sumOfUserCredits;


    }




    public static void printStudent(){
        double GPA = sum / credits;
        System.out.println(GPA);
        if (GPA < 3.0){
            System.out.println("Keep trying mate.");
        } else if (GPA < 4.0){
            System.out.println("Pretty good");
        } else if (GPA >= 4.0){
            System.out.println("EINSTEIN");
        }

    }



    public String toString(){
        return "You must be " + name + ". You are " + age + " years old and you are in grade, " + grade + ".";
    }


}


