 public class Developer{
    //these are the four attributes that are required for this class
    private String platform;
    private String interviewername;
    private String developername;
    private int workinghour;
    //this will call the constructor
    Developer(String platform, String interviewername, int workinghour){
        this.platform=platform;
        this.interviewername=interviewername;
        this.developername= "";
        this.workinghour=workinghour;
    }
    public String getPlatform(){
        return this.platform;
    }
    public String getInterviewername(){
        return this.interviewername;
    }
    public String getDevelopername(){
        return this.developername;
    }
    public int getWorkinghour(){
        return this.workinghour;
    }
    public void setNewDevelopername(String newdevelopername){
        this.developername = newdevelopername;
    }
    //this a method to display all the given details
    void Display(){
        System.out.println("Platform:" +platform);
        System.out.println("Working hour: " +workinghour);
        System.out.println("Interviewer name: " +interviewername);
        if (developername!=""){
            System.out.println("Developer name: " +developername);
        }
    }
}