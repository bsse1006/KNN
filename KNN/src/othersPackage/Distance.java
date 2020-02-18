package othersPackage;

import java.util.Comparator;

public class Distance
{
    private double distance;
    private String className;

    private DataPoint testPoint;
    private DataPoint trainingPoint;

    public Distance(DataPoint testPoint, DataPoint trainingPoint) {
        this.testPoint = testPoint;
        this.trainingPoint = trainingPoint;

        calcDistance();
    }

    private void calcDistance ()
    {
        distance = Math.sqrt(Math.pow(testPoint.getAttr1()-trainingPoint.getAttr1(),2)+
                Math.pow(testPoint.getAttr2()-trainingPoint.getAttr2(),2)+
                Math.pow(testPoint.getAttr3()-trainingPoint.getAttr3(),2)+
                Math.pow(testPoint.getAttr4()-trainingPoint.getAttr4(),2));

        className = trainingPoint.getClassName();
    }

    public double getDistance() {
        return distance;
    }

    public String getClassName() {
        return className;
    }

    public static Comparator<Distance> distanceComparator = new Comparator<Distance>() {

        public int compare(Distance d1, Distance d2) {
            //ascending order
            if(d1.getDistance()-d2.getDistance()>0)
                return 1;
            else
                return -1;
            //descending order
        }};
}
