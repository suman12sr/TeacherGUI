// Child Class of Teacher 
public class Tutor extends Teacher{
    // attributes
private double salary;
private String specialization;
private String academicqualifications;
private boolean isCertified;
int performanceIndex;
//constructor
 Tutor(int teacherid,String teachername,String address,String workingtype,String employmentstatus,int workinghour,double salary,String academicqualifications,int performanceIndex,String specialization){
   super(teacherid,teachername,address,workingtype,employmentstatus); // A Call is made to super class constructor
    this.salary=salary;
    this.specialization=specialization;
    this.academicqualifications=academicqualifications;
    this.performanceIndex=performanceIndex;
    this.isCertified=false; // Default value for isCertified
    super.setworkinghour(workinghour); // Made call to super class mutator method
}

//accessor method for salary
public double getsalary(){
    return this.salary;
}
//accessor method for specialization
public String getspecialization(){
    return this.specialization;
}
//accessor method for academic qualification
public String getacademicqualifications(){
    return this.academicqualifications;
}
//accessor method for isCertified
public boolean getisCertified(){
    return this.isCertified;
}
//accessor method for performance Index
public int getperformanceIndex(){
    return this.performanceIndex;
}
    
//Mutator method to set salary and performanceIndex 

public void setsalary(double salary,int performanceIndex){
this.salary=salary;
this.performanceIndex=performanceIndex;
  if (isCertified==false) {
            if (performanceIndex > 5 && super.getworkinghour() > 20) {
                double Percentageofappraisal; // Declaration of the varaible Percentageofapprasail
                if (performanceIndex >= 5 && performanceIndex <= 7) {
                    Percentageofappraisal = 0.05;
                }else if (performanceIndex >= 8 && performanceIndex <= 9) {
                    Percentageofappraisal = 0.1;
                }else { 
                    // PerformanceIndex is 10
                Percentageofappraisal= 0.2;
                }

                double Amountofappraisal = salary * Percentageofappraisal; //declaring and setting value to varaible Amountofapprasail
                this.salary = salary + Amountofappraisal;
                this.isCertified = true; // Sets new value to isCertified after tutor is provided with salary
            }else {
                System.out.println("Salary cannot be approved. Tutor doesnot meet the minimal requirements.");
            }
        }else {
            System.out.println(" Tutor already Certified cannot be updated with salary.");
        }
    
}

//remove tutor method if tutor is not certified yet
public void removeTutor(){
if(isCertified==false){
salary=0;
specialization="";
academicqualifications="";
performanceIndex=0;

}else{ 
    System.out.println("Certified Tutor cannot be removed");
}
this.isCertified=false; // Sets new value to isCertified if Tutor is Removed
}
//display method of tutor
public void display()//Method Override
{
if(isCertified==true){
    super.display();// calling super class display method.
    System.out.println("Salary is:"+ this.salary);
    System.out.println("Specialization is:" + getspecialization());
    System.out.println("Academic Qualification is:" + getacademicqualifications());
    System.out.println("Performance Index is:" + getperformanceIndex());  
 
}else{
    super.display();// calling super class display method.
    }

}

}