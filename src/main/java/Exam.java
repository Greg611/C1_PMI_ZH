public class Exam extends Grades {
    public void registGradeToSubject(String subject,int grade){
        if(!this.subject.contains(subject)){
            System.out.println("Nincsen ilyen tárgy!");
        }
        else{
            this.grade.set(this.subject.indexOf(subject),grade);
        }
    }
}
