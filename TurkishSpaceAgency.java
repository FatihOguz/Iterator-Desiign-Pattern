import java.util.ArrayList;
import java.util.Iterator;

/**
 * Client class for Iterator pattern
 * has print print function
 *  print clockwise and anti clock wise data
 *
 */
public class TurkishSpaceAgency {
    /**
     * hold on satellites
     */
    private ArrayList<Satellite> satellites ;

    /**
     * constructor
     * @param satellites are satellites
     */
    public TurkishSpaceAgency(ArrayList<Satellite> satellites){
        this.satellites=satellites;
    }

    /**
     * print clockwise and anti clock wise data
     */
    public void print(){
        Iterator iterator = satellites.iterator();
        while (iterator.hasNext()){

            print((Satellite) iterator.next());
        }
       iterator = satellites.iterator();
        while (iterator.hasNext()){

            print2((Satellite) iterator.next());
        }
    }

    /**
     * print clock wise data
     * @param satellite is satellite
     */
    private void print(Satellite satellite){
        Iterator iteratorClockWise = satellite.createClockwiseIterator();

        System.out.println("clock wise");
        while(iteratorClockWise.hasNext()){
            System.out.print(iteratorClockWise.next() + " ");
        }
        System.out.println();
    }

    /**
     * print anti clock wise data
     * @param satellite is satellite
     */
    private void print2(Satellite satellite){

         Iterator iteratorAntiClockWise = satellite.createAntiClockwiseIterator();


         System.out.println("anti clock wise");
         while(iteratorAntiClockWise.hasNext()){
         System.out.print(iteratorAntiClockWise.next() + " ");
         }
         System.out.println();

    }
}
