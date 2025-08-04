import java.util.*;

// Abstract job role
abstract class JobRole {
    private String title;
    public JobRole(String title) { this.title = title; }
    public String getTitle() { return title; }
    public abstract String requiredSkills();
}

// Concrete job roles
class SoftwareEngineer extends JobRole {
    public SoftwareEngineer() { super("Software Engineer"); }
    @Override
    public String requiredSkills() { return "Java, OOP, Algorithms"; }
}

class DataScientist extends JobRole {
    public DataScientist() { super("Data Scientist"); }
    @Override
    public String requiredSkills() { return "Python, ML, Statistics"; }
}

class ProductManager extends JobRole {
    public ProductManager() { super("Product Manager"); }
    @Override
    public String requiredSkills() { return "Leadership, Communication, Strategy"; }
}

// Generic Resume class
class Resume<T extends JobRole> {
    private String candidateName;
    private T jobRole;
    private List<String> skills;

    public Resume(String candidateName, T jobRole, List<String> skills) {
        this.candidateName = candidateName;
        this.jobRole = jobRole;
        this.skills = skills;
    }

    public String getCandidateName() { return candidateName; }
    public T getJobRole() { return jobRole; }
    public List<String> getSkills() { return skills; }
}

// Screening utility with wildcard method
class ResumeScreening {
    public static void screenResumes(List<? extends Resume<? extends JobRole>> resumes) {
        for (Resume<? extends JobRole> resume : resumes) {
            System.out.println("Candidate: " + resume.getCandidateName());
            System.out.println("Applied for: " + resume.getJobRole().getTitle());
            System.out.println("Skills: " + resume.getSkills());
            System.out.println("Required: " + resume.getJobRole().requiredSkills());
            System.out.println("---");
        }
    }
}

// Demo
public class ResumeScreeningSystem {
    public static void main(String[] args) {
        List<Resume<? extends JobRole>> resumes = new ArrayList<>();
        resumes.add(new Resume<>( "Alice", new SoftwareEngineer(), Arrays.asList("Java", "Spring", "OOP")));
        resumes.add(new Resume<>( "Bob", new DataScientist(), Arrays.asList("Python", "ML", "Data Analysis")));
        resumes.add(new Resume<>( "Carol", new ProductManager(), Arrays.asList("Leadership", "Strategy", "Agile")));

        ResumeScreening.screenResumes(resumes);
    }
}
