
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

public class Lecture {
    private Subject subject;
    private String lectureTime;
    private int lectureNumber;
    public Lecture(String lectureTime,int lectureNumber) {
        this.lectureTime = lectureTime;
        this.lectureNumber = lectureNumber;
    }

    public Subject getSubject() {
        return this.subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public String getlectureTime() {
        return this.lectureTime;
    }

    public void setlectureTime(String lectureTime) {
        this.lectureTime = lectureTime;
    }

    public int getlectureNumber(){
        return this.lectureNumber;
    }

    public void setlectureNumber(int lectureNumber){
        this.lectureNumber = lectureNumber;
    }
    public Lecture setLectureSubject(Division divison, int dayIndex){
        int selected = 0;
        int count = 0;
        try{
            ArrayList<Subject> subjectList = divison.getsubjectList();
            Map<Subject,Teacher> divSubTeacher = divison.divSubTeacher;
            Random selectSubject = new Random();
            while(selected==0 && count<65536){
                if (subjectList.size()>0) {
                    int index = selectSubject.nextInt(subjectList.size());    
                    if (subjectList.get(index)!=null) {
                        Subject subject = subjectList.get(index);
                        if (subject!=null && 
                            divSubTeacher.get(subject)!=null && 
                            subject.getNumberOfLectures()>0 && 
                            divSubTeacher.get(subject).getlectureAllocatedValue(this.getlectureNumber(),dayIndex)!=1 && 
                            Integer.parseInt(divSubTeacher.get(subject).getReportingTime().split(":")[0])<=Integer.parseInt(this.getlectureTime().split(":")[0])) { 
                            this.setSubject(subject);
                            if (this.getSubject()!=null) {
                                selected=1;   
                            }
                        }
                    }
                }
            count++;
            }

        }catch(Exception e){
            System.out.println("Lecture ke andar " + e);
        }
        if (count>=65536) {
               System.out.println("Insufficient subject hours/Give some appropriate teacher timings");
           }   
        return this;
    }
}
