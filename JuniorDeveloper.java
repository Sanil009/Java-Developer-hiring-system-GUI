class JuniorDeveloper extends Developer{
    //this is a child class which can inherit the properties of Developer class
    //these are the attributes that are required for this class
    private double salary;
    private String appointeddate;
    private String evaluationperiod;
    private String terminationdate;
    private String specialization;
    private String appointedby;
    private boolean joined;
    //this will call the constructor
    JuniorDeveloper(String platform, String interviewername, int workinghour, double salary, String appointedby, String terminationdate){
        super(platform, interviewername, workinghour); //this will call the constructor of Developer class
        this.salary=salary;
        this.appointedby=appointedby;
        this.terminationdate=terminationdate;
        this.appointeddate="";
        this.evaluationperiod="";
        this.specialization="";
        this.joined=false;
    }
    double getSalary(){
        return this.salary;
    }
    String getAppointeddate(){
        return this.appointeddate;
    }
    String getEvaluationperiod(){
        return this.evaluationperiod;
    }
    String getTerminationdate(){
        return this.terminationdate;
    }
    String getSpecialization(){
        return this.specialization;
    }
    String getAppointedby(){
        return this.appointedby;
    }
    boolean getJoined(){
        return this.joined;
    }
    //this is a method to change value of a salary 
    void Salarychange(double newsalary){
        if (joined==false){
            this.salary=newsalary;
        }
        else{
            System.out.println("The salary cannot be changed.");
        }
    }
    //this is method to appoint a developer
    void AppointDeveloper(String newdevelopername,String appointeddate,String terminationdate,String specialization,String evaluationperiod){
        if (joined==false){
            super.setNewDevelopername(newdevelopername);
            this.appointeddate=appointeddate;
            this.terminationdate=terminationdate;
            this.specialization=specialization;
            this.evaluationperiod=evaluationperiod;
            joined=true;        
        }
        else{
            System.out.println("The Developer is already appointed.");
            
        }
    }
    //this is a method to display the given details
    void Display(){
        super.Display(); //this will call the Display method of Developer class
        if (joined==true){
            System.out.println("Appointed date: " + appointeddate);
            System.out.println("Developer name: " + super.getDevelopername());
            System.out.println("Evaluation period: " + evaluationperiod);
            System.out.println("Termination date: " + terminationdate);
            System.out.println("Developer salary: " + salary);
            System.out.println("Specialization: " + specialization);
            System.out.println("Developer Appointed by: " + appointedby);
        }
    }
}