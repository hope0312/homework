package BoxTester;

public class Box {
    float length;
    float width;
    float height;

    public Box(float length, float width, float height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public boolean validate(float length, float width,float height){
        return (this.length >= length && this.height>= height && this.width >= width) ? true : false;
    }


}