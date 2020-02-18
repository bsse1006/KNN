package mainPackage;

import othersPackage.CrossValidation;
import othersPackage.Testing;

import java.io.File;
import java.io.FileNotFoundException;

public class MainClass
{
    public static void main(String[] args) {

        try {

            double accurate = 0;

            for(int i=0; i<10; i++)
            {
                CrossValidation crossValidation = new CrossValidation();
                crossValidation.getTestAndTrainingData(new File("/home/yasinsazid/Downloads/iris.txt"));
                Testing testing = new Testing(crossValidation.getTrainingPoints(),crossValidation.getTestPoints());
                accurate = accurate +testing.getAccuracy();
            }

            System.out.println("Accuracy: " + accurate*100/10.0);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}