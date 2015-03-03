package studentAcademicStatus;

/**
 * Employee is a subclass of Regular and describes the definition of 
 * an enrolled Employee student
 * 
 * @author Amanda Hinchman-Dominguez
 */

public class Employee extends Regular {
	/**************
	// Constructors
	/**************/
		/**
		 * Employee()
		 * @param none
		 * @preconditions none
		 * @postconditions instantiates a default class object
		 */
		public Employee() {
			super();
		}//Employee 
	
		/**
		 * Employee(String, String, double, double, double, double, double,
		 *          double, String)
		 * @param firstName
		 * @param lastName
		 * @param currentlyEnrolledCredits
		 * @param totalCreditsEarned
		 * @param humantiesCredits
		 * @param socialStudiesCredits
		 * @param scienceCredits
		 * @param generalCredits
		 * @param major
		 * @preconditions the given parameters are not null
		 * @postconditions Instantiates a constructor where the fields are 
		 *                 determined by the user
		 */
		public Employee(String firstName, String lastName, 
					double currentlyEnrolledCredits, double totalCreditsEarned,
					double humanitiesCredits, double socialStudiesCredits,
					double scienceCredits, double generalCredits, 
					String major) {
				super(firstName, lastName, currentlyEnrolledCredits, 
						totalCreditsEarned, humanitiesCredits, 
						socialStudiesCredits, scienceCredits, generalCredits,
						major);
		}//Employee(String, String, double, double, double, double, double
				// double, String)
	
	/**************
	// Methods
	/**************/
		/**
		 * getStudentCategory()
		 * @param none
		 * @preconditions none
		 * @postconditions checks for the type of student the current 
		 * 					student is
		 */
		public String getStudentCategory() {
			return "Employee";
		}//getStudentCategory()
		
		/**
		 * validRegistration()
		 * @param none
		 * @preconditions none
		 * @postconditions determines whether the student is registered by
		 * 				   checking if the student is achieving full-time
		 * 				   status.  For an Employee, the maximum is 4 credits
		 */
		public boolean validRegistration() {
			if ((getCurrentEnrolledCredits() >= 0.0) && 
					(getCurrentEnrolledCredits() <= 4.0)) {
				return true;
			}//if
			else return false;
		}//validRegistration()
		
		/**
		 * toString()
		 * @param none
		 * @preconditions none
		 * @postconditions returns a nicely formatted output
		 */
		@Override
		public String toString() {
			return super.toString() 
					+ "\n   Category: "
					+ getStudentCategory()
					+ "\n   Class Standing: "
					+ "\n   Progress: "
					+ "\n   Registration: "
					+ validRegistration()
					+ "\n   Major: ";
		}//toString()
		
}//class Employee
