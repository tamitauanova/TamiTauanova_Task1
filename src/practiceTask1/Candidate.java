package practiceTask1;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

public class Candidate {

    public String firstName;
    public String lastName;
    public int age;
    public String role;
    public boolean isExperience;
    public char paymentIn;
    public int expectedSalary;
    public int offeredSalary;
    public boolean matchSalary;
    public int dayInterview;

    public Candidate() {
        firstName = "Allison";
        lastName = "Levy";
        age = 25;
        role = "teacher";
        isExperience = false;
        paymentIn = '$';
        expectedSalary = 60000;
        offeredSalary = 59995;
        dayInterview = 4;

        if (expectedSalary > offeredSalary) {
            matchSalary = false;
        } else matchSalary = true;
    }

    public Candidate(String firstName, String lastName, int age, String role, boolean isExperience, char paymentIn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.role = role;
        this.isExperience = isExperience;
        this.paymentIn = paymentIn;
    }

    public void writeEssay(String text) {
        System.out.println(text);
    }

    public int getSalary(int expectedSalary, int offeredSalary) {
        return expectedSalary - offeredSalary;
    }
}


