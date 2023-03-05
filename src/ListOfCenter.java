public class ListOfCenter {
    TuitionCenter list[] = new TuitionCenter[5];
    int currsz =0;

    void addcenter(TuitionCenter n){
        list[currsz ++] = n;
    }

    void deletecenter(TuitionCenter n){
        for (int i=0; i<currsz; i++){
            if (list[i] == n){
                System.out.println("Tuition deleted");
            }
        }

    }
}
