package repo;

import java.util.*;
import model.*;

public class StaticRepo implements IRepo {

    static List<Patient> pt = new ArrayList<>();

    @Override
    public List<Patient> getPatients() {
        if (pt.isEmpty()) {

            Patient p1 = new Patient();
            p1.setId(1);
            p1.setName("George");
            p1.setGender('M');
            p1.setLastName("Smith");

            Patient p2 = new Patient();
            p2.setId(2);
            p2.setName("Sarah");
            p2.setGender('f');
            p2.setLastName("Smith");

            pt.add(p1);
            pt.add(p2);
        }
        return pt;
    }

    @Override
    public List<Doctor> getDoctors() {
        List<Doctor> doctors = new ArrayList<>();
        Doctor d1 = new Doctor();
        d1.setId(1);
        d1.setName("Bill");
        d1.setLastName("Gary");

        Doctor d2 = new Doctor();
        d2.setId(2);
        d2.setName("John");
        d2.setLastName("Black");

        doctors.add(d1);
        doctors.add(d2);

        return doctors;
    }

}
