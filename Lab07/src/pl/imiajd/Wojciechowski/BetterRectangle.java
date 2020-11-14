package pl.imiajd.Wojciechowski;

public class BetterRectangle extends java.awt.Rectangle{
    BetterRectangle(){
        super();
        setLocation(5,6);
        setSize(10,12);
    }
    public double getPerimeter(){
        return this.height*2+this.width*2;
    }
    public double getArea(){
        return this.height*this.width;
    }
}
