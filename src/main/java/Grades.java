import java.util.ArrayList;

public class Grades {
    protected ArrayList<String> subject = new ArrayList<>();
    protected ArrayList<Integer> grade = new ArrayList<>();

    public void addSubject(String subject){
        int l=0;
        if(!this.subject.contains(subject)) {
            this.subject.add(subject);
            this.grade.add(0);
        }
    }

    public void dropSubject(String subject){
        for(int i=0;i<this.subject.size();i++){
            if(this.subject.get(i).equals(subject)){
                this.subject.remove(i);
                break;
            }
        }
    }

    public String getGrades(){
        String result = "";
        for(int i=0;i<this.subject.size();i++){
            result += this.subject.get(i) + " - " + this.grade.get(i) + "\n";
        }
        return result;
    }
}
