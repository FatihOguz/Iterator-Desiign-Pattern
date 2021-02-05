import java.util.ArrayList;
import java.util.Iterator;

/**
 * implement Iterator
 * iterate clock wise
 */
public class clock_wise implements Iterator {
    /**
     * data
     */
    private int[][] data;
    /**
     * row size
     */
    private int R ;
    /**
     * columns size
     */
    private int C ;
    /**
     * array list iterable anticlockwise
     */
    private ArrayList dataList=new ArrayList();
    /**
     * iterator
     */
    Iterator iterator;

    /**
     *
     * @param arr data
     * @param i row index
     * @param j column index
     * @param m row
     * @param n column
     */
    private void print(int arr[][], int i, int j, int m,
               int n)
    {
        // If i or j lies outside the matrix
        if (i >= m || j >= n) {
            return;
        }

        // Print First Row
        for (int p = i; p < n; p++) {

            this.dataList.add(arr[i][p]);
        }

        // Print Last Column
        for (int p = i + 1; p < m; p++) {
            this.dataList.add(arr[p][n - 1]);
        }

        // Print Last Row, if Last and
        // First Row are not same
        if ((m - 1) != i) {
            for (int p = n - 2; p >= j; p--) {
                this.dataList.add(arr[m - 1][p]);
            }
        }

        // Print First Column, if Last and
        // First Column are not same
        if ((n - 1) != j) {
            for (int p = m - 2; p > i; p--) {

                this.dataList.add(arr[p][j]);
            }
        }
        print(arr, i + 1, j + 1, m - 1, n - 1);
    }

    /**
     * constructor
     * @param data is data
     */
    public clock_wise(int[][] data){
        this.data=data;
        this.R=data.length;
        this.C=data[0].length;

        print(data,0,0,R,C);
        this.iterator = dataList.iterator();

    }

    /**
     * check next
     * @return boolean
     */
    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    /**
     * move iterate
     * @return object
     */
    @Override
    public Object next() {
        return iterator.next();
    }
}
