class Student {
    private String name;
    private int roll;
    private int marks;

    public Student(String name,int roll,int marks){
        this.name=name;
        this.roll=roll;
        this.marks=marks;
    }

    public String calculateGrade(){
        if(marks>=90) return "A";
        else if(marks>=75) return "B";
        else if(marks>=50) return "C";
        return "Fail";
    }

    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Grade: "+calculateGrade());
    }
}
