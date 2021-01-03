package practiceTask1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Candidate candidate1 = new Candidate(); {
            System.out.println("Candidate # 1 information : ");
            System.out.println("First name - " + candidate1.firstName);
            System.out.println("Last name - " + candidate1.lastName);
            System.out.println("Age - " + candidate1.age);
            System.out.println("Role - " + candidate1.role);
            System.out.println("Does he / she have experience in this field - " + candidate1.isExperience);
            System.out.println("In what currency the payment should be - " + candidate1.paymentIn);
            System.out.println("Expected salary - " + candidate1.expectedSalary);
            System.out.println("Offered salary - " + candidate1.offeredSalary);
            System.out.println("Difference between expected salary and offered salary is " + candidate1.getSalary(candidate1.expectedSalary, candidate1.offeredSalary));
            System.out.println("Is the offered salary suitable for Candidate # 1 - " + candidate1.matchSalary);
            candidate1.writeEssay("Write essay about yourself and previous experience...");

            if (candidate1.age >= 18 && candidate1.isExperience == true) {
                System.out.println(candidate1.firstName + " Welcome");
            } else {
                System.out.println(candidate1.firstName + " You are not good for this role");
            }

            switch (candidate1.dayInterview) {
                case 1 : System.out.println("Best day for interview - " + "Monday");
                    break;
                case 2 : System.out.println("Best day for interview - " + "Tuesday");
                    break;
                case 3 : System.out.println("Best day for interview - " + "Wednesday");
                    break;
                case 4 : System.out.println("Best day for interview - " + "Thursday");
                    break;
                case 5 : System.out.println("Best day for interview - " + "Friday");
                    break;
                default: System.out.println("Best day for interview - " + "No options");
            }

            while (candidate1.expectedSalary > candidate1.offeredSalary) {
                System.out.println("Salary is low");
                candidate1.offeredSalary++;
            }

            for (int i = 1; i < 3; i++) {
                System.out.println(i + "." + " put your signature ________");
            }
        }

        System.out.println(" ");

        Candidate candidate2 = new Candidate("Adam", "Brown", 35, "teacher", true, '$');
        System.out.println("Candidate # 2 information : ");
        System.out.println("First name - " + candidate2.firstName);
        System.out.println("Last name - " + candidate2.lastName);
        System.out.println("Age - " + candidate2.age);
        System.out.println("Role - " + candidate2.role);
        System.out.println("Does he / she have experience in this field - " + candidate2.isExperience);
        System.out.println("In what currency the payment should be - " + candidate2.paymentIn);
        candidate2.writeEssay("Write essay about yourself and previous experience...");

        if (candidate2.age <= 25) {
            System.out.println("Sorry");
        } else {
            System.out.println("You are a good candidate" + ", " + candidate2.firstName + " " + candidate2.lastName);
        }

        System.out.println(" ");

        Recruiter recruiter1 = new Recruiter(); {
            System.out.println("Recruiter # 1 information : ");
            System.out.println("First name - " + recruiter1.getFirstName());
            System.out.println("Last name - " + recruiter1.getLastName());
            System.out.println("Age - " + recruiter1.getAge());
            System.out.println("Is he / she available now - " + recruiter1.getIsAvailable());
            recruiter1.writeQuestions("Write questions, which are supposed to be asked...");
        }

        System.out.println(" ");

        int candidateId[];
        candidateId = new int[5];

        candidateId[0] = 34;
        candidateId[1] = 16;
        candidateId[2] = 3;
        candidateId[3] = 97;
        candidateId[4] = 250;

        System.out.println("Candidate # 3 has ID - " + candidateId[3]);

        System.out.println(" ");

        int[] recruiterId = {56, 48, 2, 100, 4, 390};
        Arrays.sort(recruiterId);

        for (int value : recruiterId) {
            System.out.println("Recruiter ID - " + value);
        }
    }
}

