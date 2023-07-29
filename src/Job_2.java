public class Job_2 implements Job_1 {
    int age;
    int start;

    public Job_2(){
        start = 0;
        age = 0;
    }
    public int getNext(){
        age += 1;
        return age;
    }

    public void reset(){
        start = 0;
        age = 0;
    }

    public void setNum(int x){
        start = x;
        age = x;
    }
}