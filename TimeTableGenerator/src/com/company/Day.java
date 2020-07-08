import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Day{
	private String day;
	private int dayIndex;
	private ArrayList<Lecture> lectureList;

	public Day(String day, ArrayList<Lecture>lectureList, int dayIndex){
		this.day = day;
		this.lectureList = lectureList;
		this.dayIndex = dayIndex;
	}

	public void setDay(String day){
		this.day = day;
	}

	public String getDay(){
		return this.day;
	}

	public ArrayList<Lecture> getLectureList(){
		return this.lectureList;
	}
	public void setLectureList(ArrayList<Lecture>lectureList){
		this.lectureList = lectureList;
	}

	public ArrayList<Lecture> getLectureArrayList(Division divison){
       	ArrayList<Lecture> lectures = new ArrayList<>();
       	Set<Subject> setlectures = new HashSet<>();
       	int count = 0;
       	while(setlectures.size()<5 && count<Integer.MAX_VALUE){
       		count++;
       		setlectures = new HashSet<>();
       	    lectures = new ArrayList<>();
	        Lecture lecture = new Lecture("8:10",0).setLectureSubject(divison,this.dayIndex);
	        if (lecture!=null) {
	        	setlectures.add(lecture.getSubject());
	        	lectures.add(lecture);	
	        }

	        lecture = new Lecture("9:10",1).setLectureSubject(divison,this.dayIndex);
			if (lecture!=null) {
	        	setlectures.add(lecture.getSubject());	
	        	lectures.add(lecture);
	        }
	     
	        lecture = new Lecture("10:25",2).setLectureSubject(divison,this.dayIndex);
			if (lecture!=null) {
	        	setlectures.add(lecture.getSubject());	
	        	lectures.add(lecture);
	        }

	        lecture = new Lecture("11:25",3).setLectureSubject(divison,this.dayIndex);
			if (lecture!=null) {
	        	setlectures.add(lecture.getSubject());	
	        	lectures.add(lecture);
	        }
	     													
	        lecture = new Lecture("12:45",4).setLectureSubject(divison,this.dayIndex);
	        if (lecture!=null) {
	        	setlectures.add(lecture.getSubject());
	        	lectures.add(lecture);	
	        }

	        lecture = new Lecture("13:45",5).setLectureSubject(divison,this.dayIndex);
			if (lecture!=null) {
	        	setlectures.add(lecture.getSubject());	
	        	lectures.add(lecture);
	        } 	      
	    }
	    return lectures;
    }
}