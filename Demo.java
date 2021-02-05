import java.util.ArrayList;

/**
 * control for system
 */
public class Demo {
    /**
     * static main function
     * @param args args command line arguments
     */
    public  static  void  main(String[] args){
        /**
         * satellites array list for TurkishSpaceAgency
         */
        ArrayList<Satellite> satellites = new ArrayList<>();
       satellites.add(new Göktürk3Satellite("A",3,3));
        satellites.add(new Göktürk3Satellite("B",5,5));
        /**
         * turkish space agency system for satellites
         */
        TurkishSpaceAgency turkishSpaceAgency=new TurkishSpaceAgency(satellites);
        turkishSpaceAgency.print();


    }
}
