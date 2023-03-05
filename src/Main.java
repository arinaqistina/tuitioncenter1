import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Tutor details
        Tutor Kelly = new Tutor();
        Kelly.name = "Kelly York";
        Kelly.IC= "701231-45-6768";
        Kelly.addr= "Batu Pahat, Johor";
        Kelly.quali = "Degree";
        Kelly.yearExp= 15;
        Kelly.datejoined = "20 Jan 2014";
        Kelly.years= 9;

        //Add student
        Student Sarah = new Student();
        Sarah.name= "Sarah Tom";
        Sarah.IC= "040404-10-1884";
        Sarah.addr= "No. 9, Tangkak, Johor.";
        Sarah.addscore();
        float avg = Sarah.calcAvg();
        System.out.println("Average mark= " + avg);
        float min = Sarah.calcMin();
        System.out.println("Minimum mark= " + min);
        float max = Sarah.calcMax();
        System.out.println("Maximum mark= " + max);
        Sarah.assign(Kelly);    //assign student Sarah to tutor Kelly.

        //Update batch
        Studentbatch g2 = new Studentbatch();
        g2.batchname= "Grade 2.";
        g2.addstudents(Sarah);

        //Updating a tuition center
        TuitionCenter OOPClinic = new TuitionCenter();
        OOPClinic.name = "OOP Clinic";
        OOPClinic.addr = "Tangkak, Johor.";
        OOPClinic.Headmaster = "Puan Atikah";
        OOPClinic.addtutor(Kelly);
        OOPClinic.addbatch(g2);

        TuitionCenter DCNClinic = new TuitionCenter();
        DCNClinic.name = "DCN Clinic";

        //Open and closes tuition center.
        ListOfCenter list = new ListOfCenter();
        list.addcenter(OOPClinic);
        list.addcenter(DCNClinic);
        list.deletecenter(DCNClinic);

        System.out.println("Pandai SDN BHD Data");

        System.out.println("Choose center: \n1.OOP Clinic \n2.DCN Clinic");
        int c = in.nextInt();
        if (c == 1){
            System.out.println(OOPClinic.name);
            System.out.println(OOPClinic.addr);
            System.out.println("Headmaster = " + OOPClinic.Headmaster);
            System.out.println("Student and Batch data:");

            for (int j=0; j<(OOPClinic.getcurrbatch()); j++){
                System.out.println(OOPClinic.listbatch[j].batchname);

                for (int m=0; m<(OOPClinic.listbatch[j].getcurrStud()); m++){
                    System.out.println((m+1)+". "+ OOPClinic.listbatch[j].batch[m].name);
                }
            }
            System.out.println("Performance = GOOD.");
        }
    }
}