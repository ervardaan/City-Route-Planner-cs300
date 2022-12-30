//////////////// FILE HEADER (INCLUDE IN EVERY FILE) //////////////////////////
//
// Title:    PathUtils.java
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



/**
 * Utility methods for planning a trip through a grid of city intersections
 */

public class PathUtils {



    /**
     * Finds the number of valid Paths between the given start and end Intersections.
     * If it is not possible to get from the start to the end intersection by moving up
     * or right, then 0 should be returned.
     *
     * For example, if start is Intersection(0, 0) and end is Intersection(2, 1), this method
     * should return 3. If start is Intersection(1, 0) and end is Intersection(0, 0), this
     * method should return 0.
     *
     * MUST be implemented recursively. If you wish, you can use a call to a private static
     * helper method which is recursive.
     *
     * @param start - Intersection to start at
     * @param end - Intersection to end at
     * @return the number of valid Paths which start and end at the given Intersections
     */

    public static int countPaths(Intersection start,
                                 Intersection end){
        ArrayList<Path> collect_path=new ArrayList<Path>(); // making arraylist of paths
        // arraylist of intersections which is in the path
        ArrayList<Intersection> intersection=new ArrayList<Intersection>();
        return findPaths(start,end,collect_path,intersection).size();
    }



    /**
     * Finds all valid Paths between the given start and end Intersections.
     * @param start the current intersection we are on
     * @param end the end result intersection we want to go
     * @return the arraylist containing all intersections in a path object
     */

    public static ArrayList<Path> findAllPaths(Intersection start,Intersection end){
        ArrayList<Path> collect_path=new ArrayList<Path>(); // making arraylist of paths
        // arraylist of intersections which is in the path
        ArrayList<Intersection> intersection=new ArrayList<Intersection>();
        return findPaths(start,end,collect_path,intersection);
    }

    /**
     * Private recursive helper method that goes from start to stop intersection and adds
     * each new path to the arraylist of paths
     * @param start the current intersection we are on
     * @param end the end result intersection we want to go
     * @param collect_path making arraylist of paths
     * @param intersection arraylist of intersections which is in the path
     * @return the arraylist containing all intersections in a path object
     */
    private static ArrayList<Path> findPaths(Intersection start,Intersection end
            ,ArrayList<Path> collect_path,ArrayList<Intersection> intersection)
    {
        intersection.add(start); // adds the current intersection to the path
        int start_x=start.getX();
        int start_y=start.getY();
        int end_x=end.getX();
        int end_y=end.getY();

        if(start_x==end_x && start_y==end_y)
        {
            // path that will be added to the arraylist of paths
            Path path=new Path();
            // making a path using arraylist of intersections
            for(int i=0;i<intersection.size();i++)
            {
                path.addTail(intersection.get(i)); // adds to the end of the path
            }
            //Path p1=new Path(collect_i);//make new path by giving it all its intersections
            collect_path.add(path);//adding this one path to arraylist of paths

        }



       // preference given to go east then north
        // checks if it can go east
        if(start_x < end_x)
        {
            // call to move forward in the grid to intersection that is east of the current one
            // start.goEast(); is the intersection just east of the current one
            findPaths(start.goEast(),end,collect_path,intersection);
        }

        // checks if it can go north
        if(start_y < end_y)
        {
            // call to move forward in the grid to intersection that is north of the current one
            // start.goNorth(); is the intersection just north of the current one
            findPaths(start.goNorth(),end,collect_path,intersection);
        }

        //removing the last added intersection from path when backtracing
        intersection.remove(intersection.size()-1);
        // returning the full arraylist fo paths for all recursive calls,
        // it gets ignored but for last recursive call,
        // For the last call, it sends the path arraylist back to the calling method findAllPaths

        return collect_path;
    }

}
