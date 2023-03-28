package code.hw9.T2;

public class Patient {

    private final TreatmentPlan treatmentPlan;

    public Patient (TreatmentPlan treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public Doctor getDoctor() {
        switch (treatmentPlan.getCode()) {
            case 1:
                return new Surgeon();
            case 2:
                return new Dentist();
            default:
                return new Therapist();
        }
    }

}
