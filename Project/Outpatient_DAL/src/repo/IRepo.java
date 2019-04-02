
package repo;

import java.util.*;
import model.*;


public interface IRepo {
     List<Patient> getPatients();
     List<Doctor> getDoctors();
}
