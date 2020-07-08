
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Constraints{
    private String constraintName;
    public Constraints(String constraintName){

        this.constraintName= constraintName;
        initComponents();

    }
    private void initComponents(){

        Teacher yugchaaya = new Teacher(1,"Yugchaaya","8:10");
        Teacher indudokare = new Teacher(2,"InduDokare","8:10");
        Teacher kavita = new Teacher(3,"Kavita","8:10");
        Teacher kanade = new Teacher(4,"Kanade","8:10");
        Teacher poojakundu = new Teacher(5,"Pooja Kundu","8:10");
        Teacher nupur = new Teacher(6,"Nupur","8:25");
        Teacher vidyazope = new Teacher(7,"Vidya Zope","8:10");
        Teacher sunitasuralkar = new Teacher(8,"Sunita Suralkar","8:10");
        Teacher pallavi = new Teacher(9,"Pallavi","8:10");
        Teacher sunitasahu = new Teacher(10,"Sunita Sahu","8:10");
        Teacher anjaliYeole = new Teacher(10,"Anjali Yeole","8:10");
        Teacher priyarl = new Teacher(10,"Priya RL","8:10");

        Map<Teacher,Integer> subjectTeachers = new HashMap<>();
        subjectTeachers.put(yugchaaya,2);
        // subjectTeachers.put(indudokare,1);
        Subject mp = new Subject("Microprocessor",78*2,subjectTeachers);

        subjectTeachers = new HashMap<>();
        subjectTeachers.put(kavita,2);
        // subjectTeachers.put(kanade,1);
        Subject cn = new Subject("Computer Networks",78*2,subjectTeachers);

        subjectTeachers = new HashMap<>();
        subjectTeachers.put(poojakundu,2);
        Subject bce = new Subject("BCE",52*2,subjectTeachers);


        subjectTeachers = new HashMap<>();
        subjectTeachers.put(nupur,2);
        // subjectTeachers.put(kanade,1);
        Subject aoa = new Subject("Analysis of Algorithms",78*2,subjectTeachers);
       
        subjectTeachers = new HashMap<>();
        subjectTeachers.put(vidyazope,2);
        // subjectTeachers.put(sunitasuralkar,1);
        Subject tcs = new Subject("Theory of Computer Science",52*2,subjectTeachers);

        subjectTeachers = new HashMap<>();
        subjectTeachers.put(pallavi,2);
        // subjectTeachers.put(sunitasahu,1);
        Subject dbms = new Subject("DataBase Management Systems ",78*2,subjectTeachers);

        subjectTeachers = new HashMap<>();
        subjectTeachers.put(anjaliYeole,2);
        // subjectTeachers.put(priyarl,1);
        Subject wt = new Subject("Web Technology",52*2,subjectTeachers);       
    
        ArrayList<Subject> subject = new ArrayList<>();
        subject.add(mp);
        subject.add(cn);
        subject.add(bce);
        subject.add(tcs);
        subject.add(aoa);
        subject.add(wt);
        subject.add(dbms);
        try{
            Division d12a = new Division("D12A",subject,"8:10");
            Map<Subject,Teacher> divsubjectTeachers = d12a.getSubjectTeacher();  
            System.out.println(d12a.getdivisionName());    
            for (Subject s: subject) {
                System.out.println(s.getName() + "====>" + divsubjectTeachers.get(s).getName()); 
            }
            TimeTable tt = new TimeTable();
            tt.getTimeTable(d12a);
            System.out.println("***********************************************");
            System.out.println("***********************************************");
        }catch(Exception e){
            System.out.println("Constraints ke andar " + e);
        }
    
        try{
            Division d12b = new Division("D12B",subject,"8:10");
            Map<Subject,Teacher> divsubjectTeachers = d12b.getSubjectTeacher();  
            System.out.println(d12b.getdivisionName());    
            for (Subject s: subject) {
                System.out.println(s.getName() + "====>" + divsubjectTeachers.get(s).getName()); 
            }
            TimeTable tt = new TimeTable();
            tt.getTimeTable(d12b);

        }catch(Exception e){
            System.out.println("Constraints ke andar " + e);
        }
    }
    public String getConstraintName() {
        return constraintName;
    }

    public void setConstraintName(String constraintName) {
        this.constraintName = constraintName;
    }
}