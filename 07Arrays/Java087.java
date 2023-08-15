//arrays call by refrance

public class Java087 {
    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String args[]){
        int marks[] = {96, 75, 85};
        update(marks);
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+ " ");
        }
    }
}
