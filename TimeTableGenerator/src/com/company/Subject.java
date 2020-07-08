import java.util.HashMap;
import java.util.Map;

public class Subject {
    private String name;
    private int numberOfHours;
    private int numberOfLectures;
    private Map<Teacher,Integer> subjectTeachers;
    public Subject(String name, int numberOfHours,Map<Teacher,Integer> subjectTeachers) {
        this.name = name;
        this.numberOfHours = numberOfHours;
        this.numberOfLectures = (numberOfHours/13);
        this.subjectTeachers = subjectTeachers;
    }
    public Subject(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public int getNumberOfLectures() {
        return this.numberOfLectures;
    }

    public void setNumberOfLectures(int numberOfLectures){ 
        this.numberOfLectures = numberOfLectures;
    }

    public Map<Teacher,Integer> getSubjectTeachers(){
        try{
            return new HashMap<Teacher,Integer>(this.subjectTeachers);
        }catch(Exception e){
            System.out.println("Subject ke andar" + e);
        }
        return  new HashMap<Teacher,Integer>();
    }

    public void setSubjectTeachers(Map<Teacher,Integer> subjectTeachers){
        this.subjectTeachers = subjectTeachers;
    }
}
