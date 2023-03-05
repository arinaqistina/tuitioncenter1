import java.util.Scanner;
public class Student {
    Scanner sc = new Scanner(System.in);

    String name;
    String IC;
    String addr;
    int year;
    String schoolname;
    float score[]= new float [4];
    float sum;
    Tutor AssignTutor;

    void addscore(){
        System.out.println("Enter marks for each subject");
        for (int i=0; i<4; i++){
            System.out.print("Subject #"+ (i+1)+": ");
            score[i] = sc.nextFloat();
            sum = sum + score[i];
        }
    }
    void assign(Tutor t){
        AssignTutor=t;
    }
    public float calcAvg() {
        float sum = 0;
        for (int i = 0; i<4; i++) {
            sum += score[i];
        }
        return sum / 4;
    }

    public float calcMin() {
        float min = Float.MAX_VALUE;
        for (int i = 1; i < 4; i++) {
            if (score[i] < min) {
                min = score[i];
            }
        }
        return min;
    }

    public float calcMax() {
        float max = Float.MIN_VALUE;
        for (int i = 1; i < 4; i++) {
            if (score[i] > max) {
                max = score[i];
            }
        }
        return max;
    }
}
