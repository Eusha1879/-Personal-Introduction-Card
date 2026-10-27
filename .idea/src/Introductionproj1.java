import java.util.Scanner;
public class Introductionproj1 {
    public static void main(String[] args){
        String name;
        int age;
        String course;
        String studyTarget;
        char qualityOfStudy ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Wellcome to Introduction project");
        System.out.println("Enter Your name");
        name = sc.nextLine();
        System.out.println("Enter you Age ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Which Course you're Starting ? ");
        course = sc.nextLine();
        System.out.println("What's Your target");
        studyTarget= sc.nextLine();
        System.out.println("what's your Result ? ");
        qualityOfStudy = sc.next().charAt(0);

        System.out.println("====== Summary ===== ");
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
        System.out.println("Course:  "+ course);
        System.out.println("target: "+ studyTarget);
        System.out.println("Result: " + qualityOfStudy);
        sc.close();

    }
}


