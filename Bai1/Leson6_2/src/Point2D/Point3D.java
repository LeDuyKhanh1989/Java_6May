package Point2D;

public class Point3D extends Point2D{
    private float z=0;
    public Point3D(){}
    public Point3D(float x, float y, float z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public float[] getXYZ(){
        float[] arrXYZ = new float[3];
      arrXYZ[0]=this.x;
      arrXYZ[1]=this.y;
      arrXYZ[2]=this.z;
        return arrXYZ;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
