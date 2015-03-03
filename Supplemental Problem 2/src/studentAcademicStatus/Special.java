package studentAcademicStatus;

/**
 * Special is a subclass of NonRegular and describes the definition of 
 * an enrolled Special student
 * @author Amanda Hinchman-Dominguez
 *
 */

public class Special extends NonRegular 
{
	/**************
	// Constructors
	/**************/
		/**
		 * Special()
		 * @param none
		 * @preconditions none
		 * @postconditions Instantiates a default class object
		 */
		public Special() {
			super();
		}//Special()

		/**
		 * Special(String, String, double, double)
		 * @param firstName
		 * @param lastName
		 * @param currentlyEnrolledCredits
		 * @param totalCreditsEarned
		 * @preconditions the given parameters are not null
		 * @postconditions Instantiates a constructor where the fields are 
		 *                 determined by the user
		 */
		public Special(String firstName, String lastName, 
				double currentlyEnrolledCredits, double totalCreditsEarned) {
			super(firstName, lastName, currentlyEnrolledCredits, 
					totalCreditsEarned);
		}//Special(String, String, double, double)

	/**************
	// Method
	/**************/
		/**
		 * getStudentCategory()
		 * @param none
		 * @preconditions none
		 * @postconditions checks for the type of student the current 
		 * 					student is
		 */
		 public String getStudentCategory() {
			return "Special";
		 }//getStudentCategory()
		
		/**
		 * getMajor()
		 * @param none
		 * @preconditions none
		 * @postconditions checks for the major the current 
		 * 					student is
		 * @throws Exception
		 */
		public String getMajor() throws Exception {
			throw new Exception("Special students do not have a major");
		}//getMajor()
			
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

}//class Special
