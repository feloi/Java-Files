package Rectangle;

public class rectangle {
    public double width;
    public double height;

    public double Area(){
        return height * width;
    }
    public double Perimeter(){
        return 2 * (height + width);
    }
    public double Diagonal(){
        return Math.sqrt(width * width + height * height);
    }

}
