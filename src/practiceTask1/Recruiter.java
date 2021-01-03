package practiceTask1;

public class Recruiter {

    private String firstName;
    private String lastName;
    private int age;
    private boolean isAvailable;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Recruiter() {
        firstName = "Tom";
        lastName = "Ford";
        age = 30;
        isAvailable = true;
    }

    public void writeQuestions(String text) {
        System.out.println(text);
    }
}
