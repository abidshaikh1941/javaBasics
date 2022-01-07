package com.company;

public class Box {
    private final double length;
    private final double width;
    private  final double height;
    Box()
    {
        length = 1;
        width = 1;
        height = 1;
    }
    Box(double length,double width,double height)
    {
        if(length>0 && width>0 && height>0) {
            this.length = length;
            this.width = width;
            this.height = height;
        }
        else{
            this.length = 1;
            this.width = 1;
            this.height = 1;
        }

    }
    public double volume()
    {
        // calculate volume of box
        return this.length * this.width * this.height;
    }
    public double surfaceArea()
    {
        // calculate surface area of box
        return 2*(this.length * this.width) + 2*(this.width * this.height) + 2*(this.length*this.height);
    }
}
