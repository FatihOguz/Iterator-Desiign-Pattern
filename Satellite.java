import java.util.Iterator;

/**
 * interface for satellites
 */
public interface Satellite {
    /**
     * create iterator for clockwise iteration
     * @return iteratot
     */
    Iterator createClockwiseIterator();

    /**
     * create iterator for anti clockwise iteration
     * @return iterator
     */
    Iterator createAntiClockwiseIterator();
}
