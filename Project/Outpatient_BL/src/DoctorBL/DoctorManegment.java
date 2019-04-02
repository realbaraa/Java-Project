package DoctorBL;

import repo.*;
import factory.RepoFactoy;
import java.util.List;
import model.Doctor;
import repo.RepoTypeEnum;

public class DoctorManegment {

    IRepo repo;

    public DoctorManegment() {
        repo = RepoFactoy.getRepo(RepoTypeEnum.MemoryRepo);
         
    }
    public List<Doctor> getDoctors() {
        return repo.getDoctors();
    }
}


