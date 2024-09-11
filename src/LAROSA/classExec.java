//La Rosa
package LAROSA;

import java.util.Scanner;

public class classExec {

    public static void fitInput() {

        classImplement[] ci = new classImplement[10];
        Scanner sc = new Scanner(System.in);

        int app;

        System.out.print("Enter number of Applications: ");
        app = sc.nextInt();

        for (int i = 0; i < app; i++) {

            System.out.print("\nEnter details of application " + (i + 1) + " ");

            System.out.print("\n\tID: ");
            int id = sc.nextInt();

            System.out.print("\tName: ");
            String name = sc.next();

            System.out.print("\tAge: ");
            int age = sc.nextInt();

            System.out.print("\tBMI: ");
            double bmi = sc.nextDouble();

            System.out.print("\tFitness Goals (Weight Loss, Muscle Gain, General Fitness): ");
            String fitGoal = sc.next();

            ci[i] = new classImplement();
            ci[i].addFitness(id, name, age, bmi, fitGoal);

        }

        System.out.printf("%-10s  %-12s  %-8s  %-8s  %-10s  %-16s\n", "ID", "Name", "Age", "BMI", "Fitness Goal", "Eligibility Status");

        for (int i = 0; i < app; i++) {
            ci[i].viewFitness();
        }

    }

}


