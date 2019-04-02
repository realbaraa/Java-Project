package patientBL;

import factory.RepoFactoy;
import java.util.List;
import model.Patient;
import repo.IRepo;
import repo.RepoTypeEnum;

public class PatientManegment {

    IRepo repo;

    public PatientManegment() {
        repo = RepoFactoy.getRepo(RepoTypeEnum.MemoryRepo);
    }

    public List<Patient> getPatients() {
        return repo.getPatients();
    }

}
