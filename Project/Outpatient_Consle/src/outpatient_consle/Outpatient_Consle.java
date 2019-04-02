package outpatient_consle;

import java.util.List;
import model.Patient;
import patientBL.PatientManegment;

public class Outpatient_Consle {

    static PatientManegment pm;

    public static void main(String[] args) {
        pm = new PatientManegment();
        List<Patient> paitents = pm.getPatients();

        for (Patient p : paitents) {
            System.out.println(p.getName());
        }

    }

}
