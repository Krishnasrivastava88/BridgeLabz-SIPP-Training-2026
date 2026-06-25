class Course{
    private String courseName; private int duration; private double fee;
    static String instituteName="ABC Institute";
    public Course(String c,int d,double f){courseName=c;duration=d;fee=f;}
    public void displayCourseDetails(){System.out.println(courseName+" "+duration+" "+fee+" "+instituteName);}
    public static void updateInstituteName(String n){instituteName=n;}
}