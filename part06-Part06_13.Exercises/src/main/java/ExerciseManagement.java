
import java.util.ArrayList;

public class ExerciseManagement {
   private ArrayList<Exercise> exerciseList;
   
   public ExerciseManagement() {
        this.exerciseList = new ArrayList<>();
    }
   
   public ArrayList<String> exerciseList() {
        ArrayList<String> list = new ArrayList<>();
        for (Exercise i : exerciseList) {
            list.add(i.getName());
        }
        return list;
    }
   
    public void add(String exercises) { 
        this.exerciseList.add(new Exercise(exercises));
    }
   
   public void markAsCompleted(String someExercise) {
        for (Exercise i : exerciseList) {
            if (i.getName().equals(someExercise)) {
                i.setCompleted(true);
            }
        }
    }
   
   public boolean isCompleted(String someExercise) {
        for (Exercise i : exerciseList) {
            if (i.getName().equals(someExercise)) {
                return i.isCompleted();
            }
        }
        return false;
    }

}
       
    

