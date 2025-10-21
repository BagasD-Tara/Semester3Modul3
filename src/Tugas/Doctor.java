package Tugas;

public class Doctor {
    private static final double BONUS_RATE = 0.08;
    private String name;
    private int id;
    private double salary;
    private String specializaion;

    public Doctor(String name, int id, double salary, String specializaion) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.specializaion = specializaion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void apllyBonus(){
        salary += calculateBonus();
        System.out.println("Bonus applied ! New salary : " +salary);
    }

    private double calculateBonus()  {
        double bonus = salary * BONUS_RATE;
        return bonus;
    }

    public void printDetails(){
        System.out.println("Doctor id: " +id);
        System.out.println("Name: " +name);
        System.out.println("Specialization: " +specializaion);
        System.out.println("Salary: $" +salary);
    }

    public void updateSpecialization(String newSpecialization){
        specializaion = newSpecialization;
        System.out.println("Specialization update to: " +specializaion);
    }
}

class Patient {
    public String name;
    public int recordNumber;
    public Doctor doctor;
    public String disease;

    public Patient(String name, int recordNumber, Doctor doctor, String disease) {
        this.name = name;
        this.recordNumber = recordNumber;
        this.doctor = doctor;
        this.disease = disease;
    }

    public void printPatientDetails(){
        System.out.println("Patient name: " +name);
        System.out.println("Record number: " +recordNumber);
        System.out.println("Disease: " +disease);
        System.out.println("Doctor in Charge: " +doctor.getName());
    }

    public void updateDisease(String newDisease){
        disease = newDisease;
        System.out.println("Disease updated to: " +disease);
    }
}

class Hospital {
    public String hospitalName;
    public String address;
    public Patient patient;

    public Hospital(String hospitalName, String address, Patient patient) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.patient = patient;
    }

    public void printHospitalDetails(){
        System.out.println("Hospital name: " +hospitalName);
        System.out.println("Address: " +address);
        patient.printPatientDetails();
    }
}


