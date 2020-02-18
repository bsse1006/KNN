package othersPackage;

public class DataPoint
{
    private double attr1;
    private double attr2;
    private double attr3;
    private double attr4;
    private String className;

    public DataPoint() {
    }

    public DataPoint(double attr1, double attr2, double attr3, double attr4, String className) {
        this.attr1 = attr1;
        this.attr2 = attr2;
        this.attr3 = attr3;
        this.attr4 = attr4;
        this.className = className;
    }

    public void setAttr1(double attr1) {
        this.attr1 = attr1;
    }

    public void setAttr2(double attr2) {
        this.attr2 = attr2;
    }

    public void setAttr3(double attr3) {
        this.attr3 = attr3;
    }

    public void setAttr4(double attr4) {
        this.attr4 = attr4;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getAttr1() {
        return attr1;
    }

    public double getAttr2() {
        return attr2;
    }

    public double getAttr3() {
        return attr3;
    }

    public double getAttr4() {
        return attr4;
    }

    public String getClassName() {
        return className;
    }

    @Override
    public String toString() {
        return "DataPoint{" +
                "attr1=" + attr1 +
                ", attr2=" + attr2 +
                ", attr3=" + attr3 +
                ", attr4=" + attr4 +
                ", className='" + className + '\'' +
                '}';
    }
}
