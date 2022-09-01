package Student_Challenge;


public class Student_Info {
    String Student_FirstName;
    String Student_MiddleName; 
    String Student_LastName; 
    Integer Student_Number; 
    Double Student_GPA;
    Integer Gradudation_Year;


    public Student_Info(String Student_FirstName, 
                        String Student_MiddleName, 
                        String Student_LastName, 
                        Integer Student_Number, 
                        Double Student_GPA, 
                        Integer Gradudation_Year){
            this.Student_FirstName = Student_FirstName;
            this.Student_MiddleName = Student_MiddleName;
            this.Student_LastName = Student_LastName;
            this.Student_Number = Student_Number;
            this.Student_GPA = Student_GPA;
            this.Gradudation_Year = Gradudation_Year;
        }

    public Integer Change_date(){
        return this.Gradudation_Year + 1;
    }
}
