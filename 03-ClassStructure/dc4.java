public class dc4 {
    static float rectangle(float length, float width){
        return length*width;
    }
    static float cirkle(float radius){
        return (float)(radius*radius*Math.PI);
    }
    static float triangle(float hight, float base){
        return (float)((hight*base)*0.5);
    }
    static float cuboid(float length, float hight, float width){
        return (float)(2*(length*width+length*hight+hight*width));
    }
    static float sphere(float radius){
        return (float)(4*(radius*radius)*Math.PI);
    }
    static float cone(float radius, float length_slant){
        return (float)(Math.PI*radius*(radius+length_slant));
    }
}
