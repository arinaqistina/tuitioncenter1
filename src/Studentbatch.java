public class Studentbatch {
    Student batch[] = new Student[3];
    int currstudent=0;
    String batchname;

    void addstudents(Student n){
        batch[currstudent++]= n;
    }

    int getcurrStud(){
        return currstudent;
    }
}
