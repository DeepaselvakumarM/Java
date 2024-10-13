class Person{
    String name;
    int age;
    String gender;
    String address;
    public void getDetails (){
        System.out.println("Display details");
    }
}

class Doctor{
    String specialization;
    int doctorId;
    void attendPatient(){
        System.out.println("");
    }
    void scheduleAppointment(){
        System.out.println("");
    }
}

class Patient{
    int patientId;
    String medicalHistory;
    String appointments;
    void viewMedicalHistory(){
        System.out.println("");
    }
    void addAppointment(){
        System.out.println("");
    }
}

class Nurse{
    int nurseId;
    void assistDoctor(){
        System.out.println("");
    }
}

class Appoinment{
    int appointmentId;
    int patientId;
    int doctorId;
    int date;
    String status;
    void schedule(){
        System.out.println("");
    }
    void cancel(){
        System.out.println("");
    }
}


public class Hm{
    public static void main(String[] args) {
        
    }
}