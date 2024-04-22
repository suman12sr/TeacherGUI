 // Parent Class
public class Teacher{
    // attributes 
   private String teachername;
    private String address;
    private String workingtype;
    private String employmentstatus;
     private int teacherid;
    private  int workinghour;
    // constructor
    Teacher(int teacherid,String teachername,String address,String workingtype,String employmentstatus){
       this.teacherid=teacherid;
        this.teachername=teachername;
        this.address=address;
        this.workingtype=workingtype;
       this.employmentstatus=employmentstatus;

    
    }
    //mutator method to set working hour
    public void setworkinghour(int workinghour){
        this.workinghour=workinghour;
    
    
    }
    //accessor method for teacher id
    public int getteacherid(){
    return this.teacherid;
    
    }
     //accessor method for teacher name
    public String getteachername(){
    return this.teachername;
    }
     //accessor method for address
    public String getaddress(){
    return this.address;
    }
     //accessor method for working type
    public String getworkingtype(){
        return this.workingtype;
    }
     //accessor method for employment status
   public  String getemploymentstatus(){
        return this.employmentstatus;
    }
     //accessor method for working hour
    public int getworkinghour(){
        return this.workinghour;
    }
    //display method to display details of teacher
    public void display(){
    System.out.println(getteacherid());
    System.out.println(getteachername());
    System.out.println(getaddress());
    System.out.println(getworkingtype());
    System.out.println(getemploymentstatus());
    if(getworkinghour()<=0){
  System.out.println("Working Hour is not set");
} else{
      System.out.println("Working Hours is " + getworkinghour() + "hours");
    }    
    }  
    }
    
    


