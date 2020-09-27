 class SeniorDeveloper extends Developer{
    //this is a child class which can inherit the properties of Developer class
    //these are the attributes that are required for this class
    private double salary;
    private String joiningdate;
    private String staffroomnumber;
    private int contractperiod;
    private double advancesalary;
    private boolean appointed;
    private boolean terminated;
    //this will call the constructor
    SeniorDeveloper(String platform, String interviewername, int workinghour, double salary, int contractperiod){
        super(platform, interviewername, workinghour); //this will call the constructor of Developer class
        this.salary=salary;
        this.joiningdate="";
        this.staffroomnumber="";
        this.contractperiod=contractperiod;
        this.advancesalary=0.0;
        this.appointed=false;
        this.terminated=false;
    }
    double getSalary(){
        return this.salary;
    }
    String getJoiningdate(){
        return this.joiningdate;
    }
    String getStaffroomnumber(){
        return this.staffroomnumber;
    }
    int getContractperiod(){
        return this.contractperiod;
    }
    double getAdvancesalary(){
        return this.advancesalary;
    }
    boolean getAppointed(){
        return this.appointed;
    }
    boolean getTerminated(){
        return this.terminated;
    }
    void setSalarychange(double newsalary){
        this.salary=newsalary;
    }   
    void setContractperiodchange(int newcontractperiod){
        this.contractperiod=newcontractperiod;
    }
    //this is a method to hire a developer
    void hireDeveloper(String newdevelopername,String joiningdate,double advancesalary,String staffroomnumber){
        if(appointed==true){
            System.out.println("The developer is already hired.\n" + "Developer name=" + newdevelopername + "\n" + "Staff room number=" + staffroomnumber);
        }
        else{
            super.setNewDevelopername(newdevelopername);
            appointed=true; 
            terminated=false;
            this.joiningdate=joiningdate;
            this.advancesalary=advancesalary;
            this.staffroomnumber=staffroomnumber;
        }
    }
    //this is a method for the developer contract termination
    void Contracttermination(){
        if (terminated==true){
            System.out.println("The developer contract is already terminated");
        }
        else{
            super.setNewDevelopername("");
            this.joiningdate="";
            this.advancesalary=0.0;
            appointed=false;
            terminated=true;
        }
    }
    void Display(){
        System.out.println("Platform: "+super.getPlatform());
        System.out.println("Interviewer name: "+super.getInterviewername());
        System.out.println("Salary: "+salary);
    }
       //this is a method to desplay all the given details
    void DisplayDeveloperDetails(){
        super.Display(); //this will call display method of Developer class
        if (appointed = true){
            System.out.println("Termination: "+terminated);
            System.out.println("Joiningdate: " +joiningdate);
            System.out.println("Advancesalary: " +advancesalary);
            System.out.println("Developer name: " +super.getDevelopername());
        }
        else{
            System.out.println("Not appointed");
        }
    }
}