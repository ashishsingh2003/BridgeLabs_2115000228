import java.util.*;

abstract class JobRole {
    private String roleName;
    
    public JobRole(String roleName) {
        this.roleName = roleName;
    }
    
    public String getRoleName() {
        return roleName;
    }
}

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer() {
        super("Software Engineer");
    }
}

class DataScientist extends JobRole {
    public DataScientist() {
        super("Data Scientist");
    }
}

class ProductManager extends JobRole {
    public ProductManager() {
        super("Product Manager");
    }
}

class Resume<T extends JobRole> {
    private String candidateName;
    private T jobRole;

    public Resume(String candidateName, T jobRole) {
        this.candidateName = candidateName;
        this.jobRole = jobRole;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public T getJobRole() {
        return jobRole;
    }
}

class ResumeScreeningSystem {
    private List<Resume<? extends JobRole>> resumes = new ArrayList<>();

    public void addResume(Resume<? extends JobRole> resume) {
        resumes.add(resume);
    }

    public void screenResumes() {
        for (Resume<? extends JobRole> resume : resumes) {
            System.out.println("Candidate: " + resume.getCandidateName() + ", Role: " + resume.getJobRole().getRoleName());
        }
    }
}

public class ResumeScreening {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> alice = new Resume<>("Alice", new SoftwareEngineer());
        Resume<DataScientist> bob = new Resume<>("Bob", new DataScientist());
        Resume<ProductManager> charlie = new Resume<>("Charlie", new ProductManager());

        ResumeScreeningSystem screeningSystem = new ResumeScreeningSystem();
        screeningSystem.addResume(alice);
        screeningSystem.addResume(bob);
        screeningSystem.addResume(charlie);

        screeningSystem.screenResumes();
    }
}
