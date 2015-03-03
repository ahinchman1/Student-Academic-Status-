package studentAcademicStatus;

/**
 * NonRegular is a subclass of Enrolled Student.  Base definition of a 
 * NonRegular student.
 * @author Amanda Hinchman-Dominguez
 *
 */

public abstract class NonRegular extends EnrolledStudents {
	
	/**************
	// Constructor
	/**************/
		/**
		 * NonRegular()
		 * @param none
		 * @preconditions none
		 * @postconditions Instantiates a default class object
		 */
		public NonRegular() {
			super();
		}//NonRegular()
	
		/**
		 * NonRegular(String, String, double, double)
		 * @param firstName
		 * @param lastName
		 * @param currentlyEnrolledCredits
		 * @param totalCreditsEarned
		 * @preconditions the given parameters are not null
		 * @postconditions Instantiates a constructor where the fields are 
	     *                 determined by the user
		 */
		public NonRegular(String firstName, String lastName, 
				double currentlyEnrolledCredits, double totalCreditsEarned) {
			super(firstName, lastName, currentlyEnrolledCredits, 
					totalCreditsEarned);
		}//NonRegular(String, String, double, double)
	
	/**************
	// Methods
	/**************/
		/**
		 * getClassStanding()
		 * @param none
		 * @preconditions none
		 * @postconditions checks the class standing of the student
		 * @throws Exception
		 */
		public String getClassStanding() throws Exception {
			throw new Exception("");
		}//getClassStanding()
	
		/**
		 * makingGoodProgress()
		 * @param none
		 * @preconditions none
		 * @postconditions checks whether student is on track towards completing 
		 *                 his/her/zhi major
		 * @throws Exception
		 */
		public boolean makingGoodProgress() throws Exception {
			throw new Exception("");
		}//makingGoodProgress()
	
		/**
		 * validRegistration()
		 * @param none
		 * @preconditions none
		 * @postconditions checks currentEnrolledCredits between 0 and 4 
		 *                 (inclusive)
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
		public String toString(){
			try {
				return super.toString() 
						+ "\n   Category: "
						+ getStudentCategory()
						+ "\n   Class Standing: "
						+ "\n   Progress: "
						+ "\n   Registration: "
						+ validRegistration()
						+ "\n   Major: " 
						+ getMajor();
			}//try 
			catch (Exception e) {
				return super.toString()
						+ "\n   Category: "
						+ getStudentCategory()
						+ "\n   Class Standing: "
						+ "\n   Progress: "
						+ "\n   Registration: "
						+ validRegistration()
						+ "\n   Major: "; 
			}//catch
		}//toString()
		
}//class NonRegular
