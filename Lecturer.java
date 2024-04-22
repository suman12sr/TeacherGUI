// Child class of Teacher
public class Lecturer extends Teacher{
   // attributes
private String department;
private int YearsOfExperience;
private int gradedScore;
private boolean hasGraded;
// constructor
  Lecturer(int teacherid,String teachername,String address,String workingtype,String employmentstatus,String department, int YearsOfExperience,int workinghour)
 {
     super(teacherid,teachername,address,workingtype,employmentstatus); // A Call is made to super class constructor.
     this.gradedScore=0;// Default value for gradedScore
     this.YearsOfExperience=YearsOfExperience;
     this.hasGraded=false; // Default value for hasgraded
     this.department=department;
     super.setworkinghour(workinghour); // Made call to super class mutator method
            
}
// acessor method for deparment
 public  String getdepartment()
  {
    return this.department;
    }
    // acessor method for Years of Exprience
public int getYearsOfExperience()
  {
    return this.YearsOfExperience;
    }
    // acessor method for graded Score
public int getgradedScore()
  {
    return this.gradedScore;
    }
    // acessor method for hasGraded
public boolean gethasGraded()
  {
    return this.hasGraded;
    }

// Mutator method to set grade Score
public void setgradedScore(int gradedScore){
this.gradedScore=gradedScore;

}
// Method to grade assignment of Students
public void gradeAssignment(int gradedScore ,String department,int YearsOfExperience)
{
    
    if(hasGraded==false){
    if(YearsOfExperience>=5 && this.department==department){
    if(gradedScore>=70){
          this.gradedScore=gradedScore;
     System.out.println("Grade score is A");
    }else if(gradedScore>=60){
         this.gradedScore=gradedScore;
        System.out.println("Grade score is B" );
    }else if(gradedScore>=50){
        this.gradedScore=gradedScore;  
        System.out.println("Grade score is C" );
    }else if(gradedScore>=40){
        this.gradedScore=gradedScore; 
        System.out.println("Grade score is D");
    }else{
        this.gradedScore=gradedScore;
        System.out.println("Grade score is E");
     }
    hasGraded=true; // Sets new value to hasgraded if teacher has completed the grading of assignment
    }else{System.out.println("Particular lecturer can not check the assignment");}


}else{ System.out.println("Assignment already graded");}

  }
 
  //Method to display details of Lecturer 
public void display() // Method Override
{

super.display(); // Made call to superclass method
System.out.println("Department is:"+ getdepartment());
System.out.println("Year of exprience is:" + getYearsOfExperience() + "years");
if(hasGraded==false){

System.out.println("Assignment not graded yet");
}
else{
    System.out.println("Grade score:" + gradedScore);
}
    
}

}




    
    
    


