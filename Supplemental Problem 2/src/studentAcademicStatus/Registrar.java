    /*****************************************************************
     * Amanda Hinchman-Dominguez                                     *
     * PO Box 3608                                                   *
     * Program for CSC 207                                           *
     *   Student Academic Status                                     *
     * Assignment for Tuesday, March 3rd                              *
     *****************************************************************/


    /* ***************************************************************
     * Academic honesty certification:                               *
     *   Written/online sources used:                                *
     *     [include textbook(s),                                     *
     *       CSC 207 labs or readings;                               *
     *       complete citations for Web or other written sources]    *
     *     [write "none" if no sources used]                         *
     *   Help obtained                                               *
     *     [indicate names of instructor, class mentors              *
     *      or evening lab tutors, consulted                         *
     *      according to class policy]                               *
     *     [write "none" if none of these sources used]              *
     *   My signature below confirms that the above list of sources  *
     *   is complete AND that I have not talked to anyone else       *
     *   [e.g., CSC 161 students] about the solution to this problem *
     *                                                               *
     *   Signature:                                                  *
     *****************************************************************/

package studentAcademicStatus;

import java.util.ArrayList;

public class Registrar {
	/********************************
	// ArrayList of Enrolled Students
	/*******************************/
	static ArrayList<EnrolledStudents> registrar = 
			new ArrayList<EnrolledStudents>();
	
	/**************
	// Methods
	/**************/
	public static void printStudentRegistrar() {
		System.out.println("Registrar");
		for (int i = 0; i < registrar.size(); i++) {
			//iterate through the arraylist of registrar and print the list
			System.out.println(registrar.get(i));
			}//for
	}//printStudentRegistrar()
	
	public static void printStudentInformation() throws Exception {
		System.out.println("Registry Information");
		for (int i = 0; i < registrar.size(); i++) {
			//iterate through the arraylist of registar
			try {
				System.out.println((registrar.get(i)).toString());
			}//try
			catch(Exception e) {
				//do nothing
			}//catch
		}
	}//printStudentInformation()
	
	/**
	 * main(String[])
	 * @param args
	 * @throws Exception
	 */
	public static void main (String [] args) throws Exception {

		// Declarations
		Regular regular = new Regular("Amanda", "Hinchman", 16, 42, 12, 
				12, 20, 14, "Computer Science");
		Regular regular2 = new Regular("Vernon", "Jackson", 20, 20, 20, 
				32, 24, 12, "French and Economics"); 
		Alum alum = new Alum("Kim", "Spasaro", 4, 132, "Philosophy");
		Alum alum2 = new Alum("Sam", "MacDonald", 5, 144, "Psychology");
		Special special = new Special("Drew", "Cooper", 4, 8);
		Employee employee = new Employee("Terri", "Wilson", 4, 120, 30, 
				25, 25, 40, "English");
		Employee employee2 = new Employee("John", "Hammond", 5, 130, 32, 
				26, 27, 40, "Music"); //expected credit problems
		Employee employee3 = new Employee();//expected null outcomes

		// Add EnrolledStudents to Registrar list 
		registrar.add(regular);
		registrar.add(regular2);
		registrar.add(alum);
		registrar.add(alum2);
		registrar.add(special);
		registrar.add(employee);
		registrar.add(employee2);
		registrar.add(employee3);

		// Print EnrolledStudents and details
		printStudentRegistrar();
		
		printStudentInformation();
	}//main(String[])
	
	
}//class Registrar
