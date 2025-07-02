package Day3_this_static;

class Patient {
    private final int patientID;
    private String name, ailment;
    private int age;
    static String hospitalName = "City Hospital";
    static int totalPatients = 0;

    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    public void displayPatient() {
        if (this instanceof Patient) {
            System.out.println("Patient ID: " + patientID + ", Name: " + name + ", Age: " + age + ", Ailment: " + ailment + ", Hospital: " + hospitalName);
        }
    }

    public static void main(String[] args) {
        Patient p1 = new Patient(501, "Rahul", 34, "Fever");
        Patient p2 = new Patient(502, "Neha", 28, "Fracture");
        p1.displayPatient();
        p2.displayPatient();
        Patient.getTotalPatients();
    }
}

