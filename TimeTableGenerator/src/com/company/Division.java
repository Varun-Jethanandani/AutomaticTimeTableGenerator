import java.util.Map;
import java.util.ArrayList;
import java.util.Random;
import java.util.Set;
import java.util.HashMap;

public class Division{
	String divisionName;
	public ArrayList<Subject> subjectList;
	String startTime;
	Map<Subject,Teacher> divSubTeacher;
	private Map<Teacher,Integer> subjectTeacher;
	public Division(String divisionName,ArrayList<Subject> subjectList,String startTime){
		this.divisionName = divisionName;
		this.subjectList  = subjectList;
		this.startTime    = startTime;
		this.divSubTeacher = new HashMap<Subject,Teacher>();
	}

	public String getdivisionName(){
		return this.divisionName;
	}

	public void setdivisionName(String divisionName){
		this.divisionName = divisionName;
	}

	public ArrayList<Subject> getsubjectList(){
		return new ArrayList<Subject>(this.subjectList);
	}

	public void setsubjectList(ArrayList<Subject> subjectList){
		this.subjectList = subjectList;
	}

	public String getstartTime(){
		return this.startTime; 
	}

	public void setstartTime(String startTime){
		this.startTime = startTime;
	}


	public Map<Subject,Teacher> getSubjectTeacher(){ 
		try{
			for (int i=0;i<subjectList.size() ;i++ ) {
				Subject subject = subjectList.get(i);
				subjectTeacher  = subject.getSubjectTeachers();
				Set<Teacher> teachers =  subjectTeacher.keySet();
				ArrayList<Teacher> availableTeachers = new ArrayList<>();
				Random selectSubjectTeacher = new Random();
				for (Teacher teacher : teachers) {
					if (subjectTeacher.get(teacher)>0 && (Integer.parseInt(this.getstartTime().split(":")[0])+6)>(Integer.parseInt(teacher.getReportingTime().split(":")[0]))) {
						availableTeachers.add(teacher);
					}
				}
				if (availableTeachers.size()>0) {
					int index = selectSubjectTeacher.nextInt(availableTeachers.size());
					Teacher selectedTeacher = availableTeachers.get(index);
					subjectTeacher.put(selectedTeacher,subjectTeacher.get(selectedTeacher)-1);
					subject.setSubjectTeachers(subjectTeacher);
					divSubTeacher.put(subject,selectedTeacher);	
				}else{
					System.out.println("We need more teachers for subject " + subject.getName());
				}
			}
		}catch(Exception e){
			System.out.println("Division ke andar" + e);
		}
		return divSubTeacher;
	}
}
