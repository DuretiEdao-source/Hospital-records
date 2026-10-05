import hospital.admin.Finance;
import hospital.records.Patient;
public class HospitalSystem extends Patient {
    public static void main(String[] args) {
        HospitalSystem doctor = new HospitalSystem();
        System.out.println("Receptionist sees: " + doctor.name);
        System.out.println("Doctor sees: " + doctor.diagnosis);
        System.out.println(new Finance().report());
    }
}