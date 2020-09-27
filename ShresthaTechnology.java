import javax.lang.model.util.ElementScanner6;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public class ShresthaTechnology implements ActionListener{
    ArrayList<Developer> developer = new ArrayList<Developer>();

    JFrame myFrame;

    JPanel platformPanel, seniorDevPanel, juniorDevPanel;

    //for panel1
    JTextField txtPlatform, txtInterviewerName, txtWorkingHours, txtSalary, txtContractPeriod, txtTerminationDate, txtAppointedBy;
    JButton btnSenior, btnJunior;

    //for panel2
    JTextField txtName, txtJoiningDate, txtStaffRoomNo, txtAdvanceSalary, txtDeveloperNo;
    JButton btnApp, btnTer;

    //for panel3 
    JTextField txtName1, txtSpecialization, txtEvaluationPeriod, txtAppointedDate, txtTerminationDate1, txtDeveloperNo1;
    JButton btnAppoint, btnDisplay, btnClear;
    
    public static void main(String [] args){
        new ShresthaTechnology().myApplication();
    }                   

    public void myApplication(){
    
        myFrame = new JFrame("Shrestha Technology");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(900,650);
        myFrame.setLayout(null);
        myFrame.setVisible(true);


        //Panel1
        platformPanel=new JPanel();
        platformPanel.setBounds(10, 60, 1000, 200);
        platformPanel.setBackground(Color.LIGHT_GRAY);
        platformPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        platformPanel.setBorder(BorderFactory.createTitledBorder("Appoint Platform for Senior/Junior Developer"));
        
        
        JLabel lblPlatform = new JLabel("Platform:");
        lblPlatform.setBounds(20,80,60,30);
        myFrame.add(lblPlatform);
        
        txtPlatform = new JTextField();
        txtPlatform.setBounds(80,80,300,30);
        myFrame.add(txtPlatform);
        
        JLabel lblWorkingHours = new JLabel("Working Hours:");
        lblWorkingHours.setBounds(400,80,200,30);
        myFrame.add(lblWorkingHours);
        
        txtWorkingHours = new JTextField();
        txtWorkingHours.setBounds(500,80,200,30);
        myFrame.add(txtWorkingHours);
        
        JLabel lblSalary = new JLabel("Salary:");
        lblSalary.setBounds(720, 80, 60, 30);
        myFrame.add(lblSalary);
        
        txtSalary = new JTextField();
        txtSalary.setBounds(790, 80, 100, 30);
        myFrame.add(txtSalary);
        
        JLabel lblInterviewerName = new JLabel("Interviewer Name:");
        lblInterviewerName.setBounds(20,130,230,30);
        myFrame.add(lblInterviewerName);
        
        txtInterviewerName = new JTextField();
        txtInterviewerName.setBounds(140,130,565,30);
        myFrame.add(txtInterviewerName);
        
        JLabel lblContractPeriod = new JLabel("Contract Period:");
        lblContractPeriod.setBounds(20,180, 230, 30);
        myFrame.add(lblContractPeriod);
        
        txtContractPeriod = new JTextField();
        txtContractPeriod.setBounds(140,180,100,30);
        myFrame.add(txtContractPeriod);
        
        JLabel lblAppointedBy = new JLabel("Appointed By:");
        lblAppointedBy.setBounds(300,180, 230, 30);
        myFrame.add(lblAppointedBy);
        
        txtAppointedBy = new JTextField();
        txtAppointedBy.setBounds(400,180, 200, 30);
        myFrame.add(txtAppointedBy);
        
        JLabel lblTerminationDate = new JLabel("Termination Date:");
        lblTerminationDate.setBounds(670, 180, 230, 30);
        myFrame.add(lblTerminationDate);
        
        txtTerminationDate = new JTextField();
        txtTerminationDate.setBounds(790, 180, 100, 30);
        myFrame.add(txtTerminationDate);
        
        btnSenior = new JButton("ADD Senior");
        btnSenior.setBounds(400, 220, 100, 30);
        btnSenior.setBackground(Color.yellow);
        myFrame.add(btnSenior);
        
        btnJunior = new JButton("ADD Junior");
        btnJunior.setBounds(550, 220, 100, 30);
        btnJunior.setBackground(Color.yellow);
        myFrame.add(btnJunior);
        myFrame.add(platformPanel);

        
        //Panel2
        seniorDevPanel=new JPanel();
        seniorDevPanel.setBounds(10, 270, 1000, 175);
        seniorDevPanel.setBackground(Color.white);
        seniorDevPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        seniorDevPanel.setBorder(BorderFactory.createTitledBorder("Appoint/Terminate Platform for Senior"));
        
        JLabel lblName = new JLabel("Name:");
        lblName.setBounds(20, 300, 60, 30);
        myFrame.add(lblName);
        
        txtName = new JTextField();
        txtName.setBounds(80, 300, 300, 30);
        myFrame.add(txtName);
        
        JLabel lblJoiningDate = new JLabel("Joining Date:");
        lblJoiningDate.setBounds(400, 300 , 150, 30);
        myFrame.add(lblJoiningDate);
        
        txtJoiningDate = new JTextField();
        txtJoiningDate.setBounds(490, 300, 200, 30);
        myFrame.add(txtJoiningDate);
        
        JLabel lblDeveloperNo = new JLabel("Developer No:");
        lblDeveloperNo.setBounds(20, 350, 100, 30);
        myFrame.add(lblDeveloperNo);
        
        txtDeveloperNo = new JTextField();
        txtDeveloperNo.setBounds(130, 350, 60, 30);
        myFrame.add(txtDeveloperNo);
        
        JLabel lblStaffRoomNo = new JLabel("Staff Room No:");
        lblStaffRoomNo.setBounds(210, 350, 90, 30);
        myFrame.add(lblStaffRoomNo);
        
        txtStaffRoomNo = new JTextField();
        txtStaffRoomNo.setBounds(320, 350, 60, 30);
        myFrame.add(txtStaffRoomNo);
        
        JLabel lblAdvanceSalary = new JLabel("Advance Salary:");
        lblAdvanceSalary.setBounds(400, 350, 130, 30);
        myFrame.add(lblAdvanceSalary);
        
        txtAdvanceSalary = new JTextField();
        txtAdvanceSalary.setBounds(530, 350, 100, 30);
        myFrame.add(txtAdvanceSalary);
        
        btnApp = new JButton("APPOINT");
        btnApp.setBounds(400, 400, 100, 30);
        btnApp.setBackground(Color.yellow);
        myFrame.add(btnApp);
        
        btnTer = new JButton("TERMINATE");
        btnTer.setBounds(550, 400, 100, 30);
        btnTer.setBackground(Color.yellow);
        myFrame.add(btnTer);
        
        myFrame.add(seniorDevPanel);

        //Panel3
        juniorDevPanel=new JPanel();
        juniorDevPanel.setBounds(10, 460, 1000, 230);
        juniorDevPanel.setBackground(Color.LIGHT_GRAY);
        juniorDevPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        juniorDevPanel.setBorder(BorderFactory.createTitledBorder("Appoint Platform for Junior Developer"));
        
        
        JLabel lblName1 = new JLabel("Name:");
        lblName1.setBounds(20, 490, 60, 30);
        myFrame.add(lblName1);
        
        txtName1 = new JTextField();
        txtName1.setBounds(80, 490, 300, 30);
        myFrame.add(txtName1);
        
        JLabel lblSpecialization = new JLabel("Specialization:");
        lblSpecialization.setBounds(400, 490, 150, 30);
        myFrame.add(lblSpecialization);
        
        txtSpecialization = new JTextField();
        txtSpecialization.setBounds(490, 490, 200, 30);
        myFrame.add(txtSpecialization);
        
        JLabel lblEvaluationPeriod = new JLabel("Evaluation Period:");
        lblEvaluationPeriod.setBounds(20, 540, 115, 30);
        myFrame.add(lblEvaluationPeriod);
        
        txtEvaluationPeriod = new JTextField();
        txtEvaluationPeriod.setBounds(140, 540, 50, 30);
        myFrame.add(txtEvaluationPeriod);
        
        JLabel lblAppointedDate = new JLabel("Appointed Date:");
        lblAppointedDate.setBounds(230, 540, 150, 30);
        myFrame.add(lblAppointedDate);
        
        txtAppointedDate = new JTextField();
        txtAppointedDate.setBounds(350, 540, 100, 30);
        myFrame.add(txtAppointedDate);
        
        JLabel lblTerminationDate1 = new JLabel("Termination Date:");
        lblTerminationDate1.setBounds(490, 540, 160, 30);
        myFrame.add(lblTerminationDate1);
        
        txtTerminationDate1 = new JTextField();
        txtTerminationDate1.setBounds(630, 540, 100, 30);
        myFrame.add(txtTerminationDate1);
        
        JLabel lblDeveloperNo1 = new JLabel("Developer No:");
        lblDeveloperNo1.setBounds(20, 600, 100, 30);
        myFrame.add(lblDeveloperNo1);
        
        txtDeveloperNo1 = new JTextField();
        txtDeveloperNo1.setBounds(120, 600, 55, 30);
        myFrame.add(txtDeveloperNo1);
        
        btnAppoint = new JButton("APPOINT Junior Developer");
        btnAppoint.setBounds(400, 600, 250, 30);
        btnAppoint.setBackground(Color.yellow); 
        myFrame.add(btnAppoint);
        
        btnDisplay = new JButton("DISPLAY ALL");
        btnDisplay.setBounds(400, 650, 120, 30);
        btnDisplay.setBackground(Color.WHITE); 
        myFrame.add(btnDisplay);
        
        btnClear = new JButton("CLEAR ALL");
        btnClear.setBounds(550 ,650 ,100 , 30);
        btnClear.setBackground(Color.PINK); 
        myFrame.add(btnClear);

        myFrame.add(juniorDevPanel);

        btnSenior.addActionListener(this);
        btnJunior.addActionListener(this);
        btnApp.addActionListener(this);
        btnTer.addActionListener(this);
        btnAppoint.addActionListener(this);
        btnDisplay.addActionListener(this);
        btnClear.addActionListener(this);
    }
        
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btnClear){
            txtPlatform.setText("");
            txtWorkingHours.setText("");
            txtInterviewerName.setText("");
            txtSalary.setText("");
            txtContractPeriod.setText("");
            txtTerminationDate.setText("");
            txtAppointedBy.setText("");
            txtName.setText("");
            txtJoiningDate.setText("");
            txtStaffRoomNo.setText("");
            txtAdvanceSalary.setText("");
            txtDeveloperNo.setText("");
            txtName1.setText("");
            txtSpecialization.setText("");
            txtEvaluationPeriod.setText("");
            txtAppointedDate.setText("");
            txtTerminationDate1.setText("");
            txtDeveloperNo1.setText("");
        }
        else if(e.getSource()==btnSenior){
            try{
                String platform=txtPlatform.getText();
                int workingHours=Integer.parseInt(txtWorkingHours.getText());
                String interviewerName=txtInterviewerName.getText();
                int contractPeriod=Integer.parseInt(txtContractPeriod.getText());
                double salary=Double.parseDouble(txtSalary.getText());
                Developer Sendev=new SeniorDeveloper(platform, interviewerName, workingHours, salary, contractPeriod);
                developer.add(Sendev);
                JOptionPane.showMessageDialog(null, "Senior Developer has been successfully added to platform");
            } catch(Exception a){
                JOptionPane.showMessageDialog(null,"Please enter a valid value", "Error!",JOptionPane.ERROR_MESSAGE);
            }
        }   
        else if(e.getSource()==btnJunior){
            try{
                String platform=txtPlatform.getText();
                String interviewerName=txtInterviewerName.getText();
                int workingHours=Integer.parseInt(txtWorkingHours.getText());
                double salary=Double.parseDouble(txtSalary.getText());
                String appointedBy=txtAppointedBy.getText();
                String terminationDate=txtTerminationDate.getText();
                Developer Jundev=new JuniorDeveloper(platform, interviewerName, workingHours, salary, appointedBy, terminationDate);
                developer.add(Jundev);
                JOptionPane.showMessageDialog(null, "Junior Developer has been successfully added to platform"); 
            } catch (Exception b){
                JOptionPane.showMessageDialog(null, "Please enter a valid value.","Error!",JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(e.getSource()==btnApp){
            try{
                String name=txtName.getText();
                String joiningDate=txtJoiningDate.getText();
                int developerNo=Integer.parseInt(txtDeveloperNo.getText());
                String staffRoomNo=txtStaffRoomNo.getText();
                double advanceSalary=Double.parseDouble(txtAdvanceSalary.getText());
                if(developerNo<developer.size()){
                    Developer dev=developer.get(developerNo);
                    if (dev instanceof SeniorDeveloper){
                        SeniorDeveloper dev1=(SeniorDeveloper) developer.get(developerNo);
                        dev1.hireDeveloper(name, joiningDate, advanceSalary, staffRoomNo);
                        JOptionPane.showMessageDialog(null, "Senior Developer has been successfully appointed.");

                    } else{
                        JOptionPane.showMessageDialog(null, "Platform is not for Senior Developer.");
                    }
                } else{
                    JOptionPane.showMessageDialog(null, "Platform is not available.");
                }
            } catch(Exception c){
                JOptionPane.showMessageDialog(null, "Please enter a valid value.", "Error!",JOptionPane.ERROR_MESSAGE);
            }
        }
        else if(e.getSource()==btnTer){
            try{
                int developerNo=Integer.parseInt(txtDeveloperNo.getText());
                if (developerNo<developer.size()){
                    Developer dev=developer.get(developerNo);
                    if (dev instanceof SeniorDeveloper){
                        SeniorDeveloper dev1=(SeniorDeveloper) developer.get(developerNo);
                        dev1.Contracttermination();
                        JOptionPane.showMessageDialog(null, "Senior Developer has been successfully terminated.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Platform is not for Senior Developer.");
                    } 
                } else{
                    JOptionPane.showMessageDialog(null, "Platform is not available.");
                }
            } catch (Exception c){
                JOptionPane.showMessageDialog(null, "Please enter a valid value.", "Error!",JOptionPane.ERROR_MESSAGE);
            }
        } 
        else if (e.getSource()==btnAppoint){
            try{
                String name=txtName1.getText();
                String specialization=txtSpecialization.getText();
                int developerNo=Integer.parseInt(txtDeveloperNo1.getText());
                String appointedDate=txtAppointedDate.getText();
                if (developerNo<developer.size()){
                    Developer dev=developer.get(developerNo);
                    if(dev instanceof JuniorDeveloper){
                        JuniorDeveloper dev1=(JuniorDeveloper) developer.get(developerNo);
                        dev1.AppointDeveloper(name, specialization, appointedDate, txtTerminationDate.getText(), txtEvaluationPeriod.getText());
                        JOptionPane.showMessageDialog(null, "Junior developer has been successfully appointed.");
                    } else{
                        JOptionPane.showMessageDialog(null, "Platform is not for Junior Developer.");
                    }
                } else{
                    JOptionPane.showMessageDialog(null, "Platform is not available.");
                }
            } catch (Exception d){
                JOptionPane.showMessageDialog(null, "Please enter a valid value.", "Error!",JOptionPane.ERROR_MESSAGE);
            }
        }
        
        else if (e.getSource()==btnDisplay){
            try{
                int a=developer.size();
                for(int i=0; i<a; i++){
                    Developer dev=developer.get(i);
                    if(dev instanceof SeniorDeveloper){
                        int developerNo=Integer.parseInt(txtDeveloperNo.getText());
                        SeniorDeveloper dev1=(SeniorDeveloper) developer.get(developerNo);
                        dev1.DisplayDeveloperDetails();
                    }
                    else if (dev instanceof JuniorDeveloper){
                        int developerNo1=Integer.parseInt(txtDeveloperNo.getText());
                        JuniorDeveloper dev1=(JuniorDeveloper) developer.get(developerNo1);
                        dev1.Display();
                    }
                }
            } catch (Exception f){
                JOptionPane.showMessageDialog(null, "Please enter a valid value.", "Error!",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}