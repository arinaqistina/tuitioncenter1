public class TuitionCenter {
    String name;
    String addr;
    String Headmaster;
    Tutor ListTutor[]= new Tutor[2];
    Studentbatch listbatch[] = new Studentbatch[4];
    int currtutor=0;
    int currbatch=0;

    void addbatch(Studentbatch a){
        listbatch[currbatch++] = a;
    }

    void addtutor(Tutor b){
        ListTutor[currtutor++] = b;
    }

    int getcurrbatch(){
        return currbatch;
    }

}
