import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

/**
 * satellite implement Satellite interface
 * create clockwise and anticlockwise iterator
 */
public class Göktürk3Satellite implements Satellite{
    /**
     * create random number
     */
    private Random random = new Random();
    /**
     * row size
     */
    private int rowSize;
    /**
     * columns size
     */
    private int columnSize;
    /**
     * data
     */
    private int[][] data;
    /**
     * name
     */
    private String name;

    /**
     * constructor
     * generate data
     * @param name is name
     * @param rowSize row size
     * @param columnSize column size
     */
    public Göktürk3Satellite(String name ,int rowSize,int columnSize){
        this.data=new int[rowSize][columnSize];
        this.name=name;
        this.rowSize=rowSize;
        this.columnSize=columnSize;
        generateData();

    }

    /**
     * get row size
     * @return int
      */
    public int getRowSize() {
        return rowSize;
    }

    /**
     * set row size
     * @param rowSize is row size
     */
    private void setRowSize(int rowSize) {
        this.rowSize = rowSize;
    }

    /**
     * get column size
     * @return int
     */
    public int getColumnSize() {
        return columnSize;
    }

    /**
     * set column size
     * @param columnSize is column size
     */
    private void setColumnSize(int columnSize) {
        this.columnSize = columnSize;
    }

    /**
     * get random
     * @return random object
     */
    private Random getRandom() {
        return random;
    }

    /**
     * set random
     * @param random is random
     */
    private void setRandom(Random random) {
        this.random = random;
    }

    /**
     * get data
     * @return int 2D array
     */
    public int[][] getData() {
        return data;
    }

    /**
     * set data
     * @param data int 2D array
     */
    public void setData(int[][] data) {
        this.data = data;
    }

    /**
     * create iterator for clockwise iterator
     * @return Iterator
     */
    @Override
    public Iterator createClockwiseIterator() {
        generateData();
        System.out.println(this);
        return new clock_wise(this.data);
    }
    /**
     * create iterator for anti clockwise iterator
     * @return Iterator
     */

    @Override
    public Iterator createAntiClockwiseIterator() {
        generateData();
        System.out.println(this);
        return new anti_clockwise(this.data);
    }

    /**
     * generate data
     */
    private void generateData(){

        for(int i=0;i<getRowSize();i++){
            for(int j=0;j<getColumnSize();j++){
                data[i][j]=this.random.nextInt(getColumnSize()*getRowSize());
            }
        }
    }


    /**
     * print normal data
     * @return string
     */
    @Override
    public String toString() {
        String res=this.name + "\n";
        for(int i=0;i<getRowSize();i++){
            for(int j=0;j<getColumnSize();j++){
                res = res + " " + data[i][j];
            }
            res = res + "\n";
        }
        return res;
    }


}
