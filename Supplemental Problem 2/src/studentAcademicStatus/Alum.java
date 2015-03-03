package studentAcademicStatus;

/**
 * Alum is a subclass of NonRegular and describes the definition of 
 * an enrolled Alum student
 * @author Amanda Hinchman-Dominguez
 *
 */

public class Alum extends NonRegular{
	/**************
	// Field
	/**************/
		/**
		 * major
		 */
		String major;
			//major for the student
		
	/**************
	// Constructors
	/**************/
		/**
		 * Alum()
		 * @param none
		 * @preconditions none
		 * @postconditions Instantiates a default constructor
		 */
		public Alum() {
			super();
			major = "";
		}//Alum()
		
		/**
		 * Alum(String, String, double, double, String)
		 * @param firstName
		 * @param lastName
		 * @param currentEnrolledCredits
		 * @param totalCreditEarned
		 * @param major
		 * @preconditions the given parameters are not null
		 * @postconditions Instantiates a constructor where the fields are 
		 *                 determined by the user
		 */
		public Alum(String firstName, String lastName, 
				double currentEnrolledCredits, double totalCreditsEarned,
				String major) {
			super(firstName, lastName, currentEnrolledCredits, 
					totalCreditsEarned);
			this.major = major;
		}//Alum(String, String, double, double, String)
		
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
			return "Alum";
		}//getStudentCategory()
		
		/**
		 * getMajor()
		 * @param none
		 * @preconditions none
		 * @postconditions checks for the major the current 
		 * 					student is
		 */
		public String getMajor() {
			return major;
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
					+ "\n   Major: " 
					+ getMajor();
		}//toString()
		
}//class Alum
