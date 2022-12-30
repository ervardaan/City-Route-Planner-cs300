/////////////// FILE HEADER (INCLUDE IN EVERY FILE) //////////////////////////
//
// Title:    Path.java
// Course:   CS 300 Fall 2022
//
// Author:   Sukrut Chikodikar
// Email:    chikodikar@wisc.edu
// Lecturer: Hobbes LeGault
//
//////////////////// PAIR PROGRAMMERS COMPLETE THIS SECTION ///////////////////
//
// Partner Name:    VARDAAN KAPOOR
// Partner Email:   vkapoor5@wisc.edu
// Partner Lecturer's Name: Hobbes LeGault
//
// VERIFY THE FOLLOWING BY PLACING AN X NEXT TO EACH TRUE STATEMENT:
//   _X_ Write-up states that pair programming is allowed for this assignment.
//   _X_ We have both read and understand the course Pair Programming Policy.
//   _X_ We have registered our team prior to the team registration deadline.
//
///////////////////////// ALWAYS CREDIT OUTSIDE HELP //////////////////////////
//
// Persons:         NONE
// Online Sources: NONE
//
///////////////////////////////////////////////////////////////////////////////


import java.util.ArrayList;
import java.util.NoSuchElementException;


/**
 * This class represents a path through a city grid which ONLY
 * moves exactly one step up, or one step to the right at each step
 */

public class Path {
    private ArrayList<Intersection> intersections;

    /**
     * Initializes this Path to start as empty
     */
    public Path() {
        intersections = new ArrayList<Intersection>();//initializing the arraylist
    }


    /**
     * Returns the number of Intersections in this Path
     *
     * @return the number of Intersections in this Path
     */

    public int length() {
        return intersections.size();//accessor to get size
    }

    /**
     * Returns the first Intersection in this Path, if it is not empty.
     * Otherwise, throws a NoSuchElementException.
     *
     * @return the first Intersection in this Path, if it is not empty
     * @throws NoSuchElementException - if this Path is empty
     */
//    public Intersection getHead() {
//        //returning the first intersection in the arraylist
//        Intersection i1 = intersections.get(0);
//        if(i1==null) {
//            throw new NoSuchElementException();//throwing exception if first element is null
//        }
//        return i1;
//    }
    public Intersection getHead() {
        if (length() == 0 || intersections.get(0) == null) { // if path is empty
            throw new NoSuchElementException("Path is empty");
        }
        return intersections.get(0); // returns first element of the arraylist
    }


    /**
     * Returns the last Intersection in this Path, if it is not empty. Otherwise, throws a NoSuchElementException.
     *
     * @return i1 the last element of the arraylist
     * @throws NoSuchElementException if last element is empty
     */
    public Intersection getTail() {
        if (length() == 0 || intersections.get(length() - 1) == null) { // if path is empty
            throw new NoSuchElementException("Path is empty");
        }
        return intersections.get(length() - 1); // returns first element of the arraylist
    }

    /**
     * Adds the given Intersection to the end of this Path if it is a valid addition.
     * A Intersection is a valid addition if the current Path is empty, or the Intersection
     * to add is one step directly east, or one step directly north of the current
     * tail Intersection in this Path. Should throw an IllegalArgumentException if
     * the given Intersection is not a valid addition.
     *
     * @param toAdd - Intersection to add to the end of this Path
     * @throws IllegalArgumentException - if the Intersection to add is not valid
     */
    public void addTail(Intersection toAdd) {
        if (length() == 0) { // if path is empty
            intersections.add(toAdd);
            return; // exits the method without doing the operations after it
        }
        Intersection currTail = getTail();
        if (toAdd.getX() == currTail.getX() + 1 && toAdd.getY() == currTail.getY())
        { // one step directly east - valid
            intersections.add(toAdd);
        } else if (toAdd.getX() == currTail.getX() && toAdd.getY() == currTail.getY() + 1)
        { // one step directly north - valid
            intersections.add(toAdd);
        } else {
            throw new IllegalArgumentException("The given Intersection is not a valid addition");
        }

    }



    /**
     * Adds the given Intersection to the front of this Path if it is a valid addition.
     *
     * @param toAdd takes the first intersection
     */
    public void addHead(Intersection toAdd) {
//        if (toAdd.getX() < 0 || toAdd.getY() < 0) {
//            throw new IllegalArgumentException();
//        }
        if (length() == 0) { // if path is empty
            intersections.add(toAdd);
            return; // exits the method without doing the operations after it
        }
        Intersection currTail = getHead();
        if (toAdd.getX() == currTail.getX() - 1 && toAdd.getY() == currTail.getY())
        { // one step directly west - valid
            intersections.add(0, toAdd);
        } else if (toAdd.getX() == currTail.getX() && toAdd.getY() == currTail.getY() - 1)
        { // one step directly south - valid
            intersections.add(0, toAdd);
        } else {
            throw new IllegalArgumentException("The given Intersection is not a valid addition");
        }
    }



    /**
     * Returns a String representing the coordinates taken in this Path. An empty Path should return the String "Empty",
     * while a non-empty Path should return the coordinates of the Intersections it visits separated by a "->".
     *
     * @return s the string representation
     */
    @Override
    public String toString() {
        String path = "";
        if (length() == 0) return "Empty";
        for (int i = 0; i < length(); i++) {
            path += intersections.get(i).toString() + "->";
        }
        return path.substring(0, path.length() - 2); // removes the "->" at the end
    }
}


