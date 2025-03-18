package Questions.OOPs;
public class Patient {
    String patientName;
    int patientAge;
    String doa;
    String disease;
    Information info;
    Payment pay;
    public Patient(String patientName, int patientAge, String doa, String disease,
                   Information info, Payment pay) {
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.doa = doa;
        this.disease = disease;
        this.info = info;
        this.pay = pay;
    }
    void patientDetails(){
        System.out.println("The details of the patient are: ");
        System.out.println("Name: " + this.patientName);
        System.out.println("Age: " + this.patientAge);
        System.out.println("Date of Arrival: " + this.doa);
        System.out.println("Disease: " + this.disease);
        System.out.println("Block Number: " + this.info.blockNo);
        System.out.println("Floor Number: " + this.info.floorNo);
        System.out.println("Room Number: " + this.info.roomNo);
        System.out.println("Bed Number: " + this.info.bedNo);
        System.out.println("Admission Fees: " + this.pay.admFees);
        System.out.println("Registration Fees: " + this.pay.regFees);
        System.out.println("Balance Amount: " + this.pay.balAmt);
    }

    public static void main(String[] args) {
        Information info1 = new Information("A", 3, 301, 2);
        Payment pay1 = new Payment(10000, 20000, 5000);
        Patient patient1 = new Patient
                ("ABC", 23, "18th March", "Malaria",
                        info1, pay1);
        patient1.patientDetails();
    }

}
