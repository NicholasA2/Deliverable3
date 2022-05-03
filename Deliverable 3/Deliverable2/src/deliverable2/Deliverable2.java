/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverable2;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author 2145747
 */
public class Deliverable2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
                // Testing all class methods
        
        Teacher dean = new Teacher("Dean", "PhD", 1000, 20, 30, "Jeanne", "Lovelace", 22, "F", "Married");
        Staff lunchLady = new Staff("Lunchlady", 30, 200, "Joanne", "Jone", 45, "F", "Single");
        
//        System.out.println("Test of teacher class ComputePayRoll");
//        dean.ComputePayRoll();
//        System.out.println("Test of teacher class assignDep()");
//        dean.assignDep();
//        System.out.println("Test of teacher class talk()");
//        dean.talk();

//        System.out.println("Test of staff class ComputePayRoll()");
//        lunchLady.ComputePayRoll();
//        System.out.println("Test of staff class assignDep()");
//        lunchLady.assignDep();
//        System.out.println("Test of staff class talk()");
//        lunchLady.talk();

        FullTimeTeacher ftt = new FullTimeTeacher("Math", "PhD", 0, 0, 0, "Bob", "Harris", 23, "M", "Single");
//        System.out.println("Test of FullTimeTeacher class ComputePayRoll()");
//        ftt.ComputePayRoll();
//        System.out.println("Test of FullTimeTeacher class assignDep()");
//        ftt.assignDep();
//        System.out.println("Test of FullTimeTeacher class talk()");
//        ftt.talk();
        
        PartTimeTeacher ptt = new PartTimeTeacher("Math", "PhD", 0, 0, 0, "Bob", "Harris", 23, "M", "Single");
//        System.out.println("Test of PartTimeTeacher ComputePayRoll()");
//        ptt.ComputePayRoll();
//        System.out.println("Test of PartTimeTeacher assignDep()");
//        ptt.assignDep();
//        System.out.println("Test of PartTimeTeacher class talk()");
//        ptt.talk();
        
        Department d = new Department();
//        System.out.println("Test of checkDep() function from department");
//        d.checkDep();
//        System.out.println("Test of writeToFile() function from department");
//        d.writeToFile();
    }
    
}
