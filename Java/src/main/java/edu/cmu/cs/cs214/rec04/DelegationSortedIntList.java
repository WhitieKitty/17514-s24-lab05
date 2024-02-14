package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class DelegationSortedIntList implements IntegerList {
    // Write your implementation below with API documentation
    private SortedIntList list;
    private int totalAdded;

    /**
     * Constructor for DelegationSortedIntList
     */
    public DelegationSortedIntList() {
        list = new SortedIntList();
        totalAdded = 0;
    }

    /**
     * Adds a value to the list and increments the totalAdded count
     * @param value the value to be added to the list
     * @return true if the value was added to the list, false otherwise
     */
    public boolean add(int value) {
        boolean added = list.add(value);
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
    public boolean addAll(IntegerList values) {
        boolean added = list.addAll(values);
        totalAdded += values.size();
        return added;
    }

    /**
     * Accessor for the totalAdded count
     * @return the totalAdded count
     */
    public int getTotalAdded() {
        return totalAdded;
    }

    /**
     * get the integer at the given index
     * @param index
     * @return the integer at the given index
     */
    public int get(int index) {
        return list.get(index);
    }

    /**
     * get the size of the list
     * @return the size of the list
     */
    public int size() {
        return list.size();
    }

    /**
     * remove the integer at the given index
     * @param index
     * @return true if the integer was removed, false otherwise
     */
    public boolean remove(int index) {
        return list.remove(index);
    }

    /**
     * remove the given integer from the list
     * @param value
     * @return true if the integer was removed, false otherwise
     */
    public boolean removeAll(IntegerList values) {
        return list.removeAll(values);
    }





}