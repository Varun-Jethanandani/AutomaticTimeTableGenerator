import java.util.ArrayList;

public class Teacher {
    private int teacherId;
    private String name;
    private String reportTime;
    private int lectureAllocated[][] = lectureAllocated = new int[6][6];;
    public Teacher(String name) {
        this.name = name;
        this.reportTime = reportTime;
    }

    public Teacher(int teacherId, String name,String reportTime) {
        this.teacherId = teacherId;
        this.name = name;
        this.reportTime = reportTime;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReportingTime(){
        return this.reportTime;
    }

    public void setReportingTime(String reportTime){
        this.reportTime = reportTime;
    }

    public int getlectureAllocatedValue(int row,int column){
        return this.lectureAllocated[row][column];
    }

    public void setlectureAllocated(int row,int column,int value){
        this.lectureAllocated[row][column] = value;
    }
}
