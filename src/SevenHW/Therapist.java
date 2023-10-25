package SevenHW;

/**
 * @author Даниил
 * version 1.0
 */

public class Therapist extends Doctor {

    public void heal() {
        System.out.println("Gives pills and sick leave");
    }

    public void assignDoctorToPatient(Patient patient) {
        int treatmentCode = patient.planOfHeal;
        if (treatmentCode == 1) {
            patient.doctor = new Surgeon();
        } else if (treatmentCode == 2) {
            patient.doctor = new Dentist();
        } else {
            patient.doctor = this; // Назначаем терапевта
        }

        patient.doctor.heal();
    }
}