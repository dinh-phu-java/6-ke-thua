class Main{
    public static void main(String[] args) {
        Triangle trigle1= new Triangle(2,4,5);
        double myArea= trigle1.getArea();
        System.out.println(myArea);
    }
}
class Shape {
    private String color;
    private boolean filled;
    public Shape(){
        this.color="green";
        this.filled=false;
    }
    public Shape(String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return this.color;
    }
    public void setFilled(boolean filled){
        this.filled=filled;
    }
    public boolean getFilled(){
        return this.filled;
    }
    @Override
    public String toString(){
        String filled= this.filled ? "filled" : "not filled";
        return "A Shape with color of "+this.color+" and "+filled;
    }
}

class Triangle extends Shape{
    private double side1;
    private double side2;
    private double side3;
    public Triangle(){
        super();
        this.side1=1.0;
        this.side2=1.0;
        this.side3=1.0;
    }
    public Triangle(double side1,double side2,double side3){
        super();
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    public Triangle(String color,boolean filled,double side1,double side2,double side3){
        super(color,filled);
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    public void setSide1(double side1){
        this.side1=side1;
    }
    public double getSide1(){
        return this.side1;
    }
    public void setSide2(double side2){
        this.side2=side2;
    }
    public double getSide2(){
        return this.side2;
    }
    public void setSide3(double side3){
        this.side3=side3;
    }
    public double getSide3(){
        return this.side3;
    }
    public double getPerimeter(){
        return this.side1+this.side2+this.side3;
    }
    public double getArea(){
        double p= this.getPerimeter()/2;
        double area= Math.sqrt(Math.abs(p*(this.side1-p)*(this.side2-p)*(this.side3-p)));
        return area;
    }
    @Override
    public String toString(){
        return "The Triangle with side1="+this.side1+"  side2="+this.side2+"  side3="+this.side3+" ";
    }
}


