//La Rosa
package LAROSA;

public class classImplement {

    int id, age;
    String name, fitGoal;
    double bmi;
    boolean isEligible;

    public void addFitness(int ID, String Name, int Age, double BMI, String fGoal) {

        this.id = ID;
        this.name = Name;
        this.age = Age;
        this.bmi = BMI;
        this.fitGoal = fGoal;

        // Determine eligibility status
        this.isEligible = (age >= 18 && age <= 65) && (bmi >= 18.5 && bmi <= 30.0) &&
                          (fGoal.equals("Weight Loss") || fGoal.equals("Muscle Gain") || fGoal.equals("General Fitness"));
    }

    public void viewFitness() {

        String eligibilityStatus = isEligible ? "Eligible" : "Not Eligible";
        System.out.printf("%-10d  %-12s  %-8d  %-8.2f  %-10s  %-16s\n", this.id, this.name, this.age, this.bmi, this.fitGoal, eligibilityStatus);

    }

}