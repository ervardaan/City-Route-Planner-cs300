//////////////// FILE HEADER (INCLUDE IN EVERY FILE) //////////////////////////
//
// Title:    PathUtilsTester.java
// Course:   CS 300 Fall 2022
//
// Author:   Sukrut Madhav Chikodikar
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
// Online Sources:  NONE
//
///////////////////////////////////////////////////////////////////////////////

import java.util.ArrayList;

/**
 * Tester class for testing methods in PathUtils class
 */

public class PathUtilsTester {
    /**
     * Tests the case of countPaths() when there are no valid Paths.
     * For example, when the start position is Intersection(1, 1)
     * and the ending position is Intersection(0, 1), there should
     * be no valid Paths, so countPaths() should return 0.
     * @return true if countPath method works as desired
     */
    public static boolean testCountPathNoPath(){
        try{
            // test for testCountPathNoPath()
            if (PathUtils.countPaths(new Intersection(1, 1), new Intersection(0, 0)) != 0) {
                System.out.println(
                "testCountPathNoPath - case 1. Problem detected: Your testCountPathNoPath method "
                + "did not return the expected output.");
                return false;
                }
        }
        catch (Exception e){ // if any exception occurs
            e.printStackTrace(); // prints the stack trace
            return false; // one of the methods didn't work correctly and threw exception
        }
        return true;



//        try {
//            if (PathUtils.countPaths(new Intersection(1, 1), new Intersection(0, 1)) == 0) {
//                return true;
//            } else {
//                return false;
//            }
//        }
//        catch(NoSuchElementException | IllegalArgumentException e)
//        {
//            return false;
//        }
    }


    /**
     * Tests the case of countPaths() when there is a single valid Path. For example, when the start position is Intersection(1, 1) and the ending position is Intersection(1, 2), there should be a single Path, so countPaths() should return 1.
     *
     * @return true if all test cases are passed
     */
    public static boolean testCountPathsOnePath(){
        try{
            // case 1: test for testCountPathsOnePath()
            // When we are just west of the destination
            if (PathUtils.countPaths(new Intersection(5, 6), new Intersection(6, 6)) != 1) {
                System.out.println(
                "testCountPathsOnePath - case 1. Problem detected: Your testCountPathsOnePath method "
                + "did not return the expected output.");
                return false;
                }
        }
        catch (Exception e){ // if any exception occurs
            e.printStackTrace(); // prints the stack trace
            return false; // one of the methods didn't work correctly and threw exception
        }

        try{
            // case 2: test for testCountPathsOnePath() 
            // When we are just south of the destination
            if (PathUtils.countPaths(new Intersection(6, 5), new Intersection(6, 6)) != 1) {
                System.out.println(
                "testCountPathsOnePath - case 2. Problem detected: Your testCountPathsOnePath method "
                + "did not return the expected output.");
                return false;
                } 
        }
        catch (Exception e){ // if any exception occurs
            e.printStackTrace(); // prints the stack trace
            return false; // one of the methods didn't work correctly and threw exception
        }
//        
////scenario 1:when we are just west of the destination
//        try {
//            {
//                if (PathUtils.countPaths(new Intersection(5, 6), new Intersection(6, 6)) != 1) {
//                    return false;
//                }
//            }
//            //scenario 2:when we are just south of the destination
//            {
//                if (PathUtils.countPaths(new Intersection(6, 5), new Intersection(6, 6)) != 1) {
//                    return false;
//                }
//            }
//            return true;
//        }
//        catch(NoSuchElementException | IllegalArgumentException e)
//        {
//            return false;
//        }
        return true; // all test cases passed
    }

    /**
     * Tests the case of countPaths() when there are multiple possible paths. For example, when the start position is Intersection(0, 0) and the ending position is Intersection(1, 2), there should be three possible Paths, so countPaths() should return 3.
     *
     * @return true if all test cases are passed
     */
    public static boolean testCountPathsRecursive() {
        try{
            // case 1: test for testCountPathsRecursive()
            // countPaths((2, 2), (3, 3)) = 2
            if (PathUtils.countPaths(new Intersection(2, 2), new Intersection(3, 3)) != 2) {
                System.out.println(
                "testCountPathsRecursive - case 1. Problem detected: Your testCountPathsRecursive method "
                + "did not return the expected output.");
                return false;
                } 
        }
        catch (Exception e){ // if any exception occurs
            e.printStackTrace(); // prints the stack trace
            return false; // one of the methods didn't work correctly and threw exception
        }
         
        try{
            // case 2: test for testCountPathsRecursive()
            // countPaths((2, 2), (4, 3)) = 3
            if (PathUtils.countPaths(new Intersection(2, 2), new Intersection(4, 3)) != 3) {
                System.out.println(
                "testCountPathsRecursive - case 2. Problem detected: Your testCountPathsRecursive method "
                + "did not return the expected output.");
                return false;
                } 
        }
        catch (Exception e){ // if any exception occurs
            e.printStackTrace(); // prints the stack trace
            return false; // one of the methods didn't work correctly and threw exception
        }
             
        try{
            // case 3: test for testCountPathsRecursive()
            // countPaths((2, 1), (4, 4)) = 10
            if (PathUtils.countPaths(new Intersection(2, 1), new Intersection(4, 4)) != 10) {
                System.out.println(
                "testCountPathsRecursive - case 3. Problem detected: Your testCountPathsRecursive method "
                + "did not return the expected output.");
                return false;
                } 
        }
        catch (Exception e){ // if any exception occurs
            e.printStackTrace(); // prints the stack trace
            return false; // one of the methods didn't work correctly and threw exception
        }
             
        try{
            // case 4: test for testCountPathsRecursive()
            // countPaths((2, 2), (5, 5)) = 20
            if (PathUtils.countPaths(new Intersection(2, 2), new Intersection(5, 5)) != 20) {
                System.out.println(
                "testCountPathsRecursive - case 4. Problem detected: Your testCountPathsRecursive method "
                + "did not return the expected output.");
                return false;
                } 
        }
        catch (Exception e){ // if any exception occurs
            e.printStackTrace(); // prints the stack trace
            return false; // one of the methods didn't work correctly and threw exception
        }

        return true;
    }

    /**
     * Tests the case of findAllPaths() when there are no valid Paths. 
     * For example, when the start position is Intersection(1, 1) and the ending position
     * is Intersection(0, 1), there should be no valid Paths, so findAllPaths() 
     * should return an empty ArrayList.
     *
     * @return true if all test cases are passed
     */
    public static boolean testFindAllPathsNoPath(){

        try{
            // case 1: test for testFindAllPathsNoPath()
            // west of start
            Intersection start= new Intersection(2,2);
            Intersection stop= new Intersection(1,2);
            if (PathUtils.findAllPaths(start,stop).size() != 0) {
                System.out.println(
                "testFindAllPathsNoPath - case 1. Problem detected: Your testFindAllPathsNoPath method "
                + "did not return the expected output.");
                return false;
            }
        }
        catch (Exception e){ // if any exception occurs
            e.printStackTrace(); // prints the stack trace
            return false; // one of the methods didn't work correctly and threw exception
        }


        try{
            // case 2: test for testFindAllPathsNoPath()
            // south of start
            Intersection start= new Intersection(2,2);
            Intersection stop= new Intersection(2,1);
            if (PathUtils.findAllPaths(start,stop).size() != 0) {
                System.out.println(
                "testFindAllPathsNoPath - case 2. Problem detected: Your testFindAllPathsNoPath method "
                + "did not return the expected output.");
                return false;
            }
        }
        catch (Exception e){ // if any exception occurs
            e.printStackTrace(); // prints the stack trace
            return false; // one of the methods didn't work correctly and threw exception
        }

        try{
            // case 3: test for testFindAllPathsNoPath()
            // negative number as end
            Intersection start= new Intersection(2,2);
            Intersection stop= new Intersection(-1,-2);
            if (PathUtils.findAllPaths(start,stop).size() != 0) {
                System.out.println(
                "testFindAllPathsNoPath - case 3. Problem detected: Your testFindAllPathsNoPath method "
                + "did not return the expected output.");
                return false;
                } 
        }
        catch (Exception e){ // if any exception occurs
            e.printStackTrace(); // prints the stack trace
            return false; // one of the methods didn't work correctly and threw exception
        }
        
        return true; // all tests cases passed
    }

    /**
     * Tests the case of findAllPaths() when there is a single valid Path.
     * For example, when the start position is Intersection(1, 1) and the
     * ending position is Intersection(1, 2), there should be a single Path.
     * For each of your cases, ensure that there is only a single path,
     * and that the Path exactly matches what you expect to see.
     *
     * @return true if all test cases are passed
     */
    public static boolean testFindAllPathsOnePath(){

        try{
            // case 1: test for testFindAllPathsOnePath()
            // east of the start
            Intersection start= new Intersection(2,2);
            Intersection stop= new Intersection(3,2);

            if (PathUtils.findAllPaths(start,stop).size()!=1) {
                System.out.println(
                "testFindAllPathsOnePath - case 1. Problem detected: Your testFindAllPathsOnePath method "
                + "did not return the expected output.");
                return false;
            }
        }
        catch (Exception e){ // if any exception occurs
            e.printStackTrace(); // prints the stack trace
            return false; // one of the methods didn't work correctly and threw exception
        }


        try{
            // case 2: test for testFindAllPathsOnePath()
            // north of start
            Intersection start= new Intersection(2,2);
            Intersection stop= new Intersection(2,3);
            if (PathUtils.findAllPaths(start,stop).size()!=1) {
                System.out.println(
                "testFindAllPathsOnePath - case 2. Problem detected: Your testFindAllPathsOnePath method "
                + "did not return the expected output.");
                return false;
            }
        }
        catch (Exception e){ // if any exception occurs
            e.printStackTrace(); // prints the stack trace
            return false; // one of the methods didn't work correctly and threw exception
        }


        // negative numbers
        try{
            // case 3: test for testFindAllPathsOnePath()
            Intersection start= new Intersection(-1,-3);
            Intersection stop= new Intersection(-1,-2);
            if (PathUtils.findAllPaths(start,stop).size()!=1) {
                System.out.println(
                "testFindAllPathsOnePath - case 3. Problem detected: Your testFindAllPathsOnePath method "
                + "did not return the expected output.");
                return false;
                } 
        }
        catch (Exception e){ // if any exception occurs
            e.printStackTrace(); // prints the stack trace
            return false; // one of the methods didn't work correctly and threw exception
        }
        

        return true; // all test cases pass
    }

    /**
     * Tests the case of findAllPaths() when there are multiple possible paths.
     * For example, when the start position is Intersection(0, 0) and the ending position
     * is Intersection(1, 2), there should be three possible Paths. For each of your cases,
     * ensure that there is both the correct number of Paths, and that the returned Paths
     * exactly match what you expect to see.
     *
     * Remember: The order the Paths appear in the output of findAllPaths()
     * will not necessarily match your own implementation.
     *
     * @return true if all test cases are passed
     */

    public static boolean testFindAllPathsRecursive(){
        try{
            // case 1: test for testFindAllPathsRecursive()
            // 2 paths
            Intersection start= new Intersection(2,2);
            Intersection stop= new Intersection(3,3);
            ArrayList<Path> numPaths=PathUtils.findAllPaths(start,stop);
            ArrayList<String> stringPaths=new ArrayList<>();
            for (int i=0;i<numPaths.size();i++){
                stringPaths.add(numPaths.get(i).toString());
            }
            if (!stringPaths.contains("(2,2)->(3,2)->(3,3)") ||
                    !stringPaths.contains("(2,2)->(2,3)->(3,3)")) {
                System.out.println(
                        "testFindAllPathsRecursive - case 1. Problem detected: " +
                                "Your testFindAllPathsRecursive method "
                                + "did not return the expected output.");
                return false;
            }
        }
        catch (Exception e){ // if any exception occurs
            e.printStackTrace(); // prints the stack trace
            return false; // one of the methods didn't work correctly and threw exception
        }
             
        
        try {
            // case 2: test for testFindAllPathsRecursive()
            // 3 paths
            Intersection start = new Intersection(2, 2);
            Intersection stop = new Intersection(4, 3);
            ArrayList<Path> numPaths = PathUtils.findAllPaths(start, stop);
            ArrayList<String> stringPaths = new ArrayList<>();
            for (int i = 0; i < numPaths.size(); i++) {
                stringPaths.add(numPaths.get(i).toString());
            }


            if (!stringPaths.contains("(2,2)->(3,2)->(4,2)->(4,3)") ||
                    !stringPaths.contains("(2,2)->(3,2)->(3,3)->(4,3)") ||
                    !stringPaths.contains("(2,2)->(2,3)->(3,3)->(4,3)")
            ) {
                System.out.println(
                        "testFindAllPathsRecursive - case 2. Problem detected: " +
                                "Your testFindAllPathsRecursive method "
                                + "did not return the expected output.");
                return false;
            }

        }
        catch (Exception e){ // if any exception occurs
            e.printStackTrace(); // prints the stack trace
            return false; // one of the methods didn't work correctly and threw exception
        }
             
        
        try{
            // case 3: test for testFindAllPathsRecursive()
            // 10 paths
            Intersection start= new Intersection(2,1);
            Intersection stop= new Intersection(4,4);
            ArrayList<Path> numPaths=PathUtils.findAllPaths(start,stop);
            ArrayList<String> stringPaths=new ArrayList<>();
            for (int i=0;i<numPaths.size();i++) {
                stringPaths.add(numPaths.get(i).toString());
            }
            if (!stringPaths.contains("(2,1)->(3,1)->(4,1)->(4,2)->(4,3)->(4,4)") ||
                    !stringPaths.contains("(2,1)->(3,1)->(3,2)->(3,3)->(4,3)->(4,4)") ||
                    !stringPaths.contains("(2,1)->(3,1)->(3,2)->(3,3)->(3,4)->(4,4)") ||
                    !stringPaths.contains("(2,1)->(2,2)->(3,2)->(4,2)->(4,3)->(4,4)") ||
                    !stringPaths.contains("(2,1)->(3,1)->(3,2)->(4,2)->(4,3)->(4,4)") ||
                    !stringPaths.contains("(2,1)->(2,2)->(3,2)->(3,3)->(4,3)->(4,4)") ||
                    !stringPaths.contains("(2,1)->(2,2)->(3,2)->(3,3)->(3,4)->(4,4)") ||
                    !stringPaths.contains("(2,1)->(2,2)->(2,3)->(3,3)->(4,3)->(4,4)") ||
                    !stringPaths.contains("(2,1)->(2,2)->(2,3)->(3,3)->(3,4)->(4,4)") ||
                    !stringPaths.contains("(2,1)->(2,2)->(2,3)->(2,4)->(3,4)->(4,4)")){
                System.out.println(
                        "testFindAllPathsRecursive - case 3. Problem detected: " +
                                "Your testFindAllPathsRecursive method "
                                + "did not return the expected output.");
                return false;

            }
        }
        catch (Exception e){ // if any exception occurs
            e.printStackTrace(); // prints the stack trace
            return false; // one of the methods didn't work correctly and threw exception
        }
             
        
        try{
            // case 4: test for testFindAllPathsRecursive()
            // 20 paths
            Intersection start= new Intersection(2,2);
            Intersection stop= new Intersection(5,5);
            ArrayList<Path> numPaths=PathUtils.findAllPaths(start,stop);
            ArrayList<String> stringPaths=new ArrayList<>();
            for (int i=0;i<numPaths.size();i++) {
                stringPaths.add(numPaths.get(i).toString());
            }
            if (!stringPaths.contains("(2,2)->(3,2)->(4,2)->(5,2)->(5,3)->(5,4)->(5,5)") ||
                    !stringPaths.contains("(2,2)->(3,2)->(4,2)->(4,3)->(5,3)->(5,4)->(5,5)") ||
                    !stringPaths.contains("(2,2)->(3,2)->(4,2)->(4,3)->(4,4)->(5,4)->(5,5)") ||
                    !stringPaths.contains("(2,2)->(3,2)->(4,2)->(4,3)->(4,4)->(4,5)->(5,5)") ||
                    !stringPaths.contains("(2,2)->(3,2)->(3,3)->(4,3)->(5,3)->(5,4)->(5,5)") ||
                    !stringPaths.contains("(2,2)->(3,2)->(3,3)->(4,3)->(4,4)->(5,4)->(5,5)") ||
                    !stringPaths.contains("(2,2)->(3,2)->(3,3)->(4,3)->(4,4)->(4,5)->(5,5)") ||
                    !stringPaths.contains("(2,2)->(3,2)->(3,3)->(3,4)->(4,4)->(5,4)->(5,5)") ||
                    !stringPaths.contains("(2,2)->(3,2)->(3,3)->(3,4)->(4,4)->(4,5)->(5,5)") ||
                    !stringPaths.contains("(2,2)->(3,2)->(3,3)->(3,4)->(3,5)->(4,5)->(5,5)") ||
                    !stringPaths.contains("(2,2)->(2,3)->(3,3)->(4,3)->(5,3)->(5,4)->(5,5)") ||
                    !stringPaths.contains("(2,2)->(2,3)->(3,3)->(4,3)->(4,4)->(5,4)->(5,5)") ||
                    !stringPaths.contains("(2,2)->(2,3)->(3,3)->(4,3)->(4,4)->(4,5)->(5,5)") ||
                    !stringPaths.contains("(2,2)->(2,3)->(3,3)->(3,4)->(4,4)->(5,4)->(5,5)") ||
                    !stringPaths.contains("(2,2)->(2,3)->(3,3)->(3,4)->(4,4)->(4,5)->(5,5)") ||
                    !stringPaths.contains("(2,2)->(2,3)->(3,3)->(3,4)->(3,5)->(4,5)->(5,5)") ||
                    !stringPaths.contains("(2,2)->(2,3)->(2,4)->(3,4)->(4,4)->(5,4)->(5,5)") ||
                    !stringPaths.contains("(2,2)->(2,3)->(2,4)->(3,4)->(4,4)->(4,5)->(5,5)") ||
                    !stringPaths.contains("(2,2)->(2,3)->(2,4)->(3,4)->(3,5)->(4,5)->(5,5)") ||
                    !stringPaths.contains("(2,2)->(2,3)->(2,4)->(2,5)->(3,5)->(4,5)->(5,5)")
            ) {
                System.out.println(
                "testFindAllPathsRecursive - case 4. Problem detected: " +
                        "Your testFindAllPathsRecursive method "
                + "did not return the expected output.");
                return false;
                } 
        }
        catch (Exception e){ // if any exception occurs
            e.printStackTrace(); // prints the stack trace
            return false; // one of the methods didn't work correctly and threw exception
        }
             
        
        
        return true; // if all test cases pass
    }

    public static void main(String[] args) {
        System.out.println("testCountPathNoPath():"+testCountPathNoPath());
        System.out.println("testCountPathsOnePath():"+testCountPathsOnePath());
        System.out.println("testCountPathsRecursive():"+testCountPathsRecursive());
        System.out.println("testFindAllPathsNoPath():"+testFindAllPathsNoPath());
        System.out.println("testFindAllPathsOnePath():"+testFindAllPathsOnePath());
        System.out.println("testFindAllPathsRecursive():"+testFindAllPathsRecursive());
        System.out.println(testCountPathNoPath() &&
                testCountPathsOnePath() && testCountPathsRecursive() &&
                testFindAllPathsNoPath() && testFindAllPathsOnePath() &&
                testFindAllPathsRecursive());
    }


}

