package outpatient_consle;

import DoctorBL.DoctorManegment;
import java.util.List;
import model.Doctor;
import model.Patient;
import patientBL.PatientManegment;

public class Outpatient_Consle {

    static PatientManegment pm;
    static DoctorBL.DoctorManegment dm;
    
    public static void main(String[] args) {
        pm=new PatientManegment();
        List<Patient> paitents= pm.getPatients();
        
        for (Patient p : paitents) {
            System.out.println(p.getName());
        }
        
        dm=new DoctorManegment();
        List<Doctor> doctors= dm.getDoctors();
        
        for (Doctor d : doctors) {
            System.out.println(d.getName());
        }
        
    }
    
}
