import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
public class TeacherGUI{
    JFrame frame1;
    JPanel headerpanel,formbox,buttonpanel;
    JLabel Teacherid,Teachername,Address,Workingtype,Employmentstatus,Workinghours,Department,Yearsofexprience,Gradedscore,Salary,Specialization,Academicqualification,Performanceindex,Header;
    JTextField teacherid,teachername,address,workingtype,employmentstatus,workinghours,department,yearsofexprience,gradedscore,salary,specialization,academicqualification,performanceindex;
    JButton AddLecturer,AddTutor,GradetheAssignment,SetSalary,RemoveTutor,Display,Clear;
    ArrayList<Teacher> listofteacher = new ArrayList<Teacher>();
    Font labelstyling=new Font("Tahoma",Font.BOLD,14);
    Color color1=new Color(253,245,230);// Background color for JTextFields
    Color buttoncolor=new Color(128,0,0);// Background color for JButton
    Color Textfieldfontcolor=new Color(0,0,128);// Font color for JTextFields
    Color Labelfontcolor=new Color(220,20,60); // Font color for JLabels

    TeacherGUI(){
        //Creation of Frame and managing its layout
        frame1=new JFrame("GUI to add information about teaching staff");
        frame1.setSize(800,800);
        frame1.setLayout(new BorderLayout());
        //Creation of JPanel
        headerpanel=new JPanel();
        formbox=new JPanel();
        buttonpanel=new JPanel();
        //Managing the Layouts of the JPanel
        buttonpanel.setLayout(new FlowLayout());
        formbox.setLayout(new GridLayout(0,2,5,5));
        headerpanel.setLayout(new FlowLayout());

        //Managing Layout of JPanel to set in JFrame
        frame1.add(headerpanel,BorderLayout.NORTH);
        frame1.add(formbox,BorderLayout.CENTER);
        frame1.add(buttonpanel,BorderLayout.SOUTH);

        //Creation of heading in JPanel
        Header=new JLabel("Teaching Staff Managing System");
        Header.setFont(new Font("Arial",Font.BOLD,45));
        Header.setForeground(Labelfontcolor);
        headerpanel.add(Header);
        
        // Creating and Adding JLabel and JTextField of teacherid in JPanel
        Teacherid=new JLabel("Teacherid:");
        Teacherid.setFont(labelstyling);
        Teacherid.setForeground(Labelfontcolor);
        formbox.add(Teacherid);
        teacherid=new JTextField();
        teacherid.setFont(labelstyling);
        teacherid.setBackground(color1);
        teacherid.setForeground(Textfieldfontcolor);
        formbox.add(teacherid);

        // Creating and Adding JLabel and JTextField of teachername in JPanel
        Teachername=new JLabel("Teachername:");
        Teachername.setFont(labelstyling);
        Teachername.setForeground(Labelfontcolor);
        formbox.add(Teachername);
        teachername=new JTextField(20);
        teachername.setFont(labelstyling);
        teachername.setBackground(color1);
        teachername.setForeground(Textfieldfontcolor);
        formbox.add(teachername);

        // Creating and Adding JLabel and JTextField of address in JPanel
        Address=new JLabel("Address:");
        Address.setFont(labelstyling);
        Address.setForeground(Labelfontcolor);
        formbox.add(Address);
        address=new JTextField(20);
        address.setFont(labelstyling);
        address.setBackground(color1);
        address.setForeground(Textfieldfontcolor);
        formbox.add(address);

        // Creating and Adding JLabel and JTextField of workingtyoe in JPanel
        Workingtype=new JLabel("Workingtype:");
        Workingtype.setFont(labelstyling);
        Workingtype.setForeground(Labelfontcolor);
        formbox.add(Workingtype);
        workingtype=new JTextField(20);
        workingtype.setFont(labelstyling);
        workingtype.setBackground(color1);
        workingtype.setForeground(Textfieldfontcolor);
        formbox.add(workingtype);

        // Creating and Adding JLabel and JTextField of employmentstatus in JPanel
        Employmentstatus=new JLabel("Employmentstatus:");
        Employmentstatus.setFont(labelstyling);
        Employmentstatus.setForeground(Labelfontcolor);
        formbox.add(Employmentstatus);
        employmentstatus=new JTextField(20);
        employmentstatus.setFont(labelstyling);
        employmentstatus.setBackground(color1);
        employmentstatus.setForeground(Textfieldfontcolor);
        formbox.add(employmentstatus);

        // Creating and Adding JLabel and JTextField of workinghours in JPanel
        Workinghours=new JLabel("Workinghours:");
        Workinghours.setFont(labelstyling);
        Workinghours.setForeground(Labelfontcolor);
        formbox.add(Workinghours);
        workinghours=new JTextField(15);
        workinghours.setFont(labelstyling);
        workinghours.setBackground(color1);
        workinghours.setForeground(Textfieldfontcolor);
        formbox.add(workinghours);

        // Creating and Adding JLabel and JTextField of department in JPanel
        Department=new JLabel("Deparment:");
        Department.setFont(labelstyling);
        Department.setForeground(Labelfontcolor);
        formbox.add(Department);
        department=new JTextField(15);
        department.setFont(labelstyling);
        department.setBackground(color1);
        department.setForeground(Textfieldfontcolor);
        formbox.add(department);

        // Creating and Adding JLabel and JTextField of years of exprience in JPanel
        Yearsofexprience=new JLabel("YearsofExprience:");
        Yearsofexprience.setFont(labelstyling);
        Yearsofexprience.setForeground(Labelfontcolor);
        formbox.add(Yearsofexprience);
        yearsofexprience=new JTextField(15);
        yearsofexprience.setFont(labelstyling);
        yearsofexprience.setBackground(color1);
        yearsofexprience.setForeground(Textfieldfontcolor);
        formbox.add(yearsofexprience);

        // Creating and Adding JLabel and JTextField of gradedScore in JPanel
        Gradedscore=new JLabel("Gradedscore:");
        Gradedscore.setFont(labelstyling);
        Gradedscore.setForeground(Labelfontcolor);
        formbox.add(Gradedscore);
        gradedscore=new JTextField(15);
        gradedscore.setFont(labelstyling);
        gradedscore.setBackground(color1);
        gradedscore.setForeground(Textfieldfontcolor);
        formbox.add(gradedscore);

        // Creating and Adding JLabel and JTextField of salary in JPanel
        Salary= new JLabel("Salary:");
        Salary.setFont(labelstyling);
        Salary.setForeground(Labelfontcolor);
        formbox.add(Salary);
        salary=new JTextField(15);
        salary.setFont(labelstyling);
        salary.setBackground(color1);
        salary.setForeground(Textfieldfontcolor);
        formbox.add(salary);

        // Creating and Adding JLabel and JTextField of specialization in JPanel
        Specialization=new JLabel("Specialization:");
        Specialization.setFont(labelstyling);
        Specialization.setForeground(Labelfontcolor);
        formbox.add(Specialization);
        specialization=new JTextField(15);
        specialization.setFont(labelstyling);
        specialization.setBackground(color1);
        specialization.setForeground(Textfieldfontcolor);
        formbox.add(specialization);

        // Creating and Adding JLabel and JTextField of academicqualification in JPanel
        Academicqualification=new JLabel("Academicqualification:");
        Academicqualification.setFont(labelstyling);
        Academicqualification.setForeground(Labelfontcolor);
        formbox.add(Academicqualification);
        academicqualification=new JTextField(15);
        academicqualification.setFont(labelstyling);
        academicqualification.setBackground(color1);
        academicqualification.setForeground(Textfieldfontcolor);
        formbox.add(academicqualification);

        // Creating and Adding JLabel and JTextField of performanceindex in JPanel
        Performanceindex=new JLabel("PerformanceIndex:");
        Performanceindex.setFont(labelstyling);
        Performanceindex.setForeground(Labelfontcolor);
        formbox.add(Performanceindex);
        performanceindex=new JTextField(15);
        performanceindex.setFont(labelstyling);
        performanceindex.setBackground(color1);
        performanceindex.setForeground(Textfieldfontcolor);
        formbox.add(performanceindex);
        //Buttons
        AddLecturer=new JButton("Add Lecturer");
        AddLecturer.setBackground(buttoncolor);
        AddLecturer.setForeground(Color.WHITE);
        AddLecturer.setFocusPainted(false);
        AddLecturer.setFont(labelstyling);
        AddLecturer.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    if(teacherid.getText().isEmpty()|| teachername.getText().isEmpty()||address.getText().isEmpty()||workingtype.getText().isEmpty()||employmentstatus.getText().isEmpty()||department.getText().isEmpty()|| workinghours.getText().isEmpty()||gradedscore.getText().isEmpty()||yearsofexprience.getText().isEmpty()){
                            JOptionPane.showMessageDialog(frame1,"Some Feild are left empty please fill the empty feild..");
                            }else{
                     try{
                         int Teacherid=Integer.parseInt(teacherid.getText());
                         String Teachername=teachername.getText();
                         String Teacheraddress=address.getText();
                         String Teacherworkingtype=workingtype.getText();
                         String Teacheremploymentstatus=employmentstatus.getText();
                         String Teacherdepartment=department.getText();
                         int Teacherworkinghour=Integer.parseInt(workinghours.getText());
                         int Teachergradedscore=Integer.parseInt(gradedscore.getText());
                         int Teacheryearsofexperience=Integer.parseInt(yearsofexprience.getText());
                         Lecturer lecturer1=new Lecturer( Teacherid,Teachername,Teacheraddress,Teacherworkingtype,Teacheremploymentstatus,Teacherdepartment,Teacheryearsofexperience,Teacherworkinghour);
                         lecturer1.setgradedScore(Teachergradedscore);
                         listofteacher.add(lecturer1);
                         JOptionPane.showMessageDialog(frame1,"You have added Lecturer sucessfully");
     
                    }catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(frame1,"Unacceptable input!!! Please enter vaild values", "Exception" ,JOptionPane.ERROR_MESSAGE);
                    }
                    }
                }
            });
        buttonpanel.add(AddLecturer);

        AddTutor=new JButton("Add Tutor");
        AddTutor.setBackground(buttoncolor);
        AddTutor.setForeground(Color.WHITE);
        AddTutor.setFocusPainted(false);
        AddTutor.setFont(labelstyling);
        AddTutor.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    if(teacherid.getText().isEmpty()||teachername.getText().isEmpty()||address.getText().isEmpty()||workingtype.getText().isEmpty()||employmentstatus.getText().isEmpty()||workinghours.getText().isEmpty()||salary.getText().isEmpty()||specialization.getText().isEmpty()||academicqualification.getText().isEmpty()||performanceindex.getText().isEmpty())
                        {
                        JOptionPane.showMessageDialog(frame1,"Some Feild are left empty please fill the empty feild..");
                        }else{
                     try{
                        int Teacherid=Integer.parseInt(teacherid.getText());
                        String Teachername=teachername.getText();
                        String Teacheraddress=address.getText();
                        String Teacherworkingtype=workingtype.getText();
                        String Teacheremploymentstatus=employmentstatus.getText();
                        int Teacherworkinghours=Integer.parseInt(workinghours.getText());
                        int Teachersalary=Integer.parseInt(salary.getText());
                        String Teacherspecialization=specialization.getText();
                        String academicqualifications=academicqualification.getText();
                        int Teacherperformanceindex=Integer.parseInt(performanceindex.getText());
                        Tutor tutor1=new Tutor(Teacherid,Teachername,Teacheraddress,Teacherworkingtype,Teacheremploymentstatus,Teacherworkinghours,Teachersalary,academicqualifications,Teacherperformanceindex, Teacherspecialization);
                        listofteacher.add(tutor1);
                        JOptionPane.showMessageDialog(frame1,"You have added Tutor sucessfully");
                     
                    }catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(frame1,"Unacceptable input!!! Please enter vaild values", "Exception",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            });
        buttonpanel.add(AddTutor);

        GradetheAssignment=new JButton("GradetheAssignment");
        GradetheAssignment.setBackground(buttoncolor);
        GradetheAssignment.setForeground(Color.WHITE);
        GradetheAssignment.setFocusPainted(false);
        GradetheAssignment.setFont(labelstyling);
        GradetheAssignment.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            if(teacherid.getText().isEmpty()||department.getText().isEmpty()||performanceindex.getText().isEmpty()||gradedscore.getText().isEmpty()){
            JOptionPane.showMessageDialog(frame1,"You have left the input fields empty,Please fill the empty input fields and try agian.");
            
            }else{
                try{ 
                    int Teacherid=Integer.parseInt(teacherid.getText());
                    String Department=department.getText();
                    int Performanceindex=Integer.parseInt(performanceindex.getText());
                    int Gradedscore=Integer.parseInt(gradedscore.getText());
                    JOptionPane.showMessageDialog(frame1,"You have graded the assignment sucessfully.");
                }catch(NumberFormatException ex){
                
                JOptionPane.showMessageDialog(frame1,"Unacceptable input!!! Please enter vaild values", "Exception",JOptionPane.ERROR_MESSAGE);
                }
            
            }
       
        }
        });
        buttonpanel.add(GradetheAssignment);

        SetSalary=new JButton("Set Salary");
        SetSalary.setBackground(buttoncolor);
        SetSalary.setForeground(Color.WHITE);
        SetSalary.setFocusPainted(false);
        SetSalary.setFont(labelstyling);
        buttonpanel.add(SetSalary);
        
        RemoveTutor=new JButton("Remove Tutor");
        RemoveTutor.setBackground(buttoncolor);
        RemoveTutor.setForeground(Color.WHITE);
        RemoveTutor.setFont(labelstyling);
        buttonpanel.add(RemoveTutor);

        Display=new JButton("Display");
        Display.setBackground(buttoncolor);
        Display.setForeground(Color.WHITE);
        Display.setFocusPainted(false);
        Display.setFont(labelstyling);
        buttonpanel.add(Display);

        Clear=new JButton("Clear");
        Clear.setBackground(buttoncolor);
        Clear.setForeground(Color.WHITE);
        Clear.setFocusPainted(false);
        Clear.setFont(labelstyling);
        Clear.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    teacherid.setText("");
                    teachername.setText("");
                    address.setText("");
                    workingtype.setText("");
                    employmentstatus.setText("");
                    workinghours.setText("");
                    department.setText("");
                    yearsofexprience.setText("");
                    gradedscore.setText("");
                    salary.setText("");
                    specialization.setText("");
                    academicqualification.setText("");
                    performanceindex.setText("");
                }
            });
        buttonpanel.add(Clear);
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[]args){
        new TeacherGUI();
    }
}