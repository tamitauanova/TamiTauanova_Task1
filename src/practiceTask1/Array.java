package practiceTask1;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        int candidateId[];
        candidateId = new int[5];

        candidateId[0] = 34;
        candidateId[1] = 16;
        candidateId[2] = 3;
        candidateId[3] = 97;
        candidateId[4] = 250;

        System.out.println(candidateId[3]);

        int[] recruiterId = {56, 48, 2, 100, 4, 390};
        Arrays.sort(recruiterId);

        for (int value : recruiterId) {
            System.out.println("Recruiter ID # " + value);
        }
    }
}
