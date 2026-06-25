class Circle {
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    public void area(){
        System.out.println("Area = "+(3.14*radius*radius));
    }

    public void circumference(){
        System.out.println("Circumference = "+(2*3.14*radius));
    }
}
