public class MadLib {

public static void main(String[] arge) {
    System.out.println("hello world");
    MadLib myStory = new MadLib();
} // main method

public String classmate = "Jordan";
public String city = "Toronto";
public String noun = "Bko's Computer";
public String adjective = "funny";
public String pluralNoun = "phones";
public String pluralAnimal = "Lions";
boolean trueOrFalse = true;
double decimalBiggerThan1 = 20.5;
public int number1 = 40;
public int number2 = 60;
public int wholeNumberBetween1And4 = 2;
public String miltonTeacher = "Ms. lockwood";
public String miltonDean = "Mr. Ruiz";
public String letterGrade = "A";
public String season = "fall";




    public MadLib() {
    System.out.println("halo world");

        String story = "This weekend I am going camping with "
                +classmate+ ". We are going to a campsite in "
                +city+ ". I packed my "+noun+ " and "
                +pluralNoun + ".  The forecast is calling for a high of "
                +decimalBiggerThan1+ " degrees fahrenheit. So it should be a "
                +adjective+" day! This year, the park rangers have seen "
                +number1+ " " +pluralAnimal + " which seems kind of dangerous. "
                +miltonTeacher+" said it's " + trueOrFalse + " that "+pluralAnimal+ " eat class "
                +wholeNumberBetween1And4+ " students in the " +season+ ". But, "
                +miltonDean+ " said it actually has only happened "
                + number2+" times. Wish us luck! If we survive, we will earn a "
                +letterGrade+ "- in P.E. class.";

        System.out.println(story);
}// constructor method

}