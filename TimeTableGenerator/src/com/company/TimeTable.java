
import java.util.ArrayList;

public class TimeTable {

    public void getTimeTable(Division div){
           ArrayList<Lecture> lectures = new ArrayList<>();

            System.out.println("");
            System.out.println("Lectures of  monday:");
            Day monday = new Day("Monday",null,0);
            lectures = new ArrayList<>();
            lectures = monday.getLectureArrayList(div);
            for (int i=0;i<lectures.size();i++) {
                Lecture lecture = lectures.get(i);
                if (lecture.getSubject()!=null && div.divSubTeacher.get(lecture.getSubject())!=null) {
                    div.divSubTeacher.get(lecture.getSubject()).setlectureAllocated(i,0,1);
                    lecture.getSubject().setNumberOfLectures(lecture.getSubject().getNumberOfLectures()-1);   
                    System.out.println(lecture.getSubject().getName() + "===>" + lecture.getSubject().getNumberOfLectures());
                }            
            }
            monday.setLectureList(lectures);

            System.out.println("");
            System.out.println("Lectures of  tuesday:");
            Day tuesday = new Day("Tuesday",null,1);
            lectures = new ArrayList<>();
            lectures = tuesday.getLectureArrayList(div);
            for (int i=0;i<lectures.size();i++) {
                Lecture lecture = lectures.get(i);
                if (lecture.getSubject()!=null && div.divSubTeacher.get(lecture.getSubject())!=null) {
                    div.divSubTeacher.get(lecture.getSubject()).setlectureAllocated(i,1,1);
                    lecture.getSubject().setNumberOfLectures(lecture.getSubject().getNumberOfLectures()-1);   
                    System.out.println(lecture.getSubject().getName() + "===>" + lecture.getSubject().getNumberOfLectures());
                }            
            }
            tuesday.setLectureList(lectures);

            System.out.println("");
            System.out.println("Lectures of  wednesday:");
            Day wednesday = new Day("Wednesday",null,2);
            lectures = new ArrayList<>();
            lectures = wednesday.getLectureArrayList(div);
            for (int i=0;i<lectures.size();i++) {
                Lecture lecture = lectures.get(i);
                if (lecture.getSubject()!=null && div.divSubTeacher.get(lecture.getSubject())!=null) {
                    div.divSubTeacher.get(lecture.getSubject()).setlectureAllocated(i,2,1);
                    lecture.getSubject().setNumberOfLectures(lecture.getSubject().getNumberOfLectures()-1);   
                    System.out.println(lecture.getSubject().getName() + "===>" + lecture.getSubject().getNumberOfLectures());
                }            
            }
            wednesday.setLectureList(lectures);

            System.out.println("");
            System.out.println("Lectures of  thursday:");
            Day thursday = new Day("Thursday",null,3);
            lectures = new ArrayList<>();
            lectures = thursday.getLectureArrayList(div);
            for (int i=0;i<lectures.size();i++) {
                Lecture lecture = lectures.get(i);
                if (lecture.getSubject()!=null && div.divSubTeacher.get(lecture.getSubject())!=null) {
                    div.divSubTeacher.get(lecture.getSubject()).setlectureAllocated(i,3,1);
                    lecture.getSubject().setNumberOfLectures(lecture.getSubject().getNumberOfLectures()-1);   
                    System.out.println(lecture.getSubject().getName() + "===>" + lecture.getSubject().getNumberOfLectures());
                }            
            }
            thursday.setLectureList(lectures);

            System.out.println("");
            System.out.println("Lectures of  friday:");
            Day friday = new Day("Friday",null,4);
            lectures = new ArrayList<>();
            lectures = friday.getLectureArrayList(div);
            for (int i=0;i<lectures.size();i++) {
                Lecture lecture = lectures.get(i);
                if (lecture.getSubject()!=null && div.divSubTeacher.get(lecture.getSubject())!=null) {
                    div.divSubTeacher.get(lecture.getSubject()).setlectureAllocated(i,4,1);
                    lecture.getSubject().setNumberOfLectures(lecture.getSubject().getNumberOfLectures()-1);   
                    System.out.println(lecture.getSubject().getName() + "===>" + lecture.getSubject().getNumberOfLectures());
                }            
            }
            friday.setLectureList(lectures);

            System.out.println("");
            System.out.println("Lectures of  saturday:");
            Day saturday = new Day("Saturday",null,5);
            lectures = new ArrayList<>();
            lectures = saturday.getLectureArrayList(div);
            for (int i=0;i<lectures.size();i++) {
                Lecture lecture = lectures.get(i);
                if (lecture.getSubject()!=null && div.divSubTeacher.get(lecture.getSubject())!=null) {
                    div.divSubTeacher.get(lecture.getSubject()).setlectureAllocated(i,5,1);
                    lecture.getSubject().setNumberOfLectures(lecture.getSubject().getNumberOfLectures()-1);   
                    System.out.println(lecture.getSubject().getName() + "===>" + lecture.getSubject().getNumberOfLectures());
                }            
            }
            saturday.setLectureList(lectures);
    }
}
