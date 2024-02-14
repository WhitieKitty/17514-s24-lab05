package edu.cmu.cs.cs214.rec04;

/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class InheritanceSortedIntList extends SortedIntList {
    // Write your implementation below with API documentation
    private int totalAdded;

    /**
     * Constructor for InheritanceSortedIntList
     */
    public InheritanceSortedIntList() {
        super();
        totalAdded = 0;
    }

    @Override
    /**
     * Adds a value to the list and increments the totalAdded count
     * @param value the value to be added to the list
     * @return true if the value was added to the list, false otherwise
     */
    public boolean add(int value) {
        boolean added = super.add(value);
        if (added) {
            totalAdded++;
        }
        return added;
    }

    /**
     * Adds all the values from the given IntegerList to the list and increments the totalAdded count
     * @param values the IntegerList containing the values to be added to the list
     * @return true if the values were added to the list, false otherwise
     */
    @Override
    public boolean addAll(IntegerList values) {
        boolean added = super.addAll(values);
        return added;
    }

    /**
     * Accessor for the totalAdded count
     * @return the totalAdded count
     */
    public int getTotalAdded() {
        return totalAdded;
    }
}