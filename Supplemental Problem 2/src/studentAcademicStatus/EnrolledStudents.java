package studentAcademicStatus;

/**
 * Base definition of an enrolled student.
 * 
 * @author Amanda Hinchman-Dominguez
 */
public abstract class EnrolledStudents {
	/**************
	// Fields
	/**************/
		/**
		 * firstName
		 */
		protected String firstName;
			//first name of student
		/**
		 * lastName
		 */
		protected String lastName;
			//last name of student
		/**
		 * currentEnrolledCredits
		 */
		protected double currentEnrolledCredits;
			//number of currently enrolled credits for the student
		/**
		 * totalCreditsEarned
		 */
		protected double totalCreditsEarned;
			//number of credits earned so far
	
	/**************
	// Constructors
	/**************/
		/**
		 * EnrolledStudents()
		 * @param none
		 * @preconditions none
		 * @postconditions Instantiates a default constructor
		 */
		public EnrolledStudents() {
			firstName = "";
			lastName = "";
			currentEnrolledCredits = 0.0;
			totalCreditsEarned = 0.0;
		}//EnrolledStudents()
	
		/**
		 * EnrolledStudents(String, String, double, double)
		 * @param firstName
		 * @param lastName
		 * @param currentEnrolledCredits
		 * @param totalCreditEarned
		 * @preconditions the given parameters are not null
		 * @postconditions Instantiates a constructor where the fields are 
		 *                 determined by the user
		 */
		public EnrolledStudents(String firstName, String lastName, 
				double currentEnrolledCredits, double totalCreditsEarned) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.currentEnrolledCredits = currentEnrolledCredits;
			this.totalCreditsEarned = totalCreditsEarned;
		}//EnrolledStudents(String, String, double double)
	
	/**************
	// Methods
	/**************/
		/**
		 * getFirstName()
		 * @param none
		 * @preconditions none
		 * @postconditions returns the first name of the student
		 */
		public String getFirstName() {
			return firstName;
		}//getFirstName()
	
		/**
		 * getLastName()
		 * @param none
		 * @preconditions none
		 * @postconditions returns the last name of the student
		 */
		public String getLastName() {
			return lastName;
		}//getLastName() 
	
		/**
		 * getCurrentEnrolledCredits()
		 * @param none
		 * @preconditions none
		 * @postconditions returns the number of credits the student is 
		 * 					currently enrolled in
		 */
		public double getCurrentEnrolledCredits() {
			return currentEnrolledCredits;
		}//getCurrentEnrolledCredits()
	
		/**
		 * getTotalCredits()
		 * @param none
		 * @preconditions none
		 * @postconditions returns the number of credits the student has 
		 * 					achieved so far
		 */
		public double getTotalCredits() {
			return totalCreditsEarned;
		}//getTotalCreditsEarned()
	
		/**
		 * setFirstName(String)
		 * @param name
		 * @preconditions name should be a valid String
		 * @postconditions changes the original first name of student to the
		 *   			   name given by the user following the call to the 
		 *   			   method
		 */
		public void setFirstName(String name) {
			firstName = name;
		}//setFirstName(String)
	
		/**
		 * setLastName(String)
		 * @param name
		 * @preconditions name should be a valid String
		 * @postconditions changes the original last name of student to the
		 *   			   name given by the user following the call to the 
		 *   			   method
		 */
		public void setLastName(String name) {
			lastName = name;
		}//setLastName(String)
	
		/**
		 * setCurrentEnrolledCredits(double)
		 * @param name
		 * @preconditions name should be a valid String
		 * @postconditions changes the amount of credits for the semester 
		 *                 designated by the user following the call to the 
		 *                 method
		 */
		public void setCurrentEnrolledCredits(double change) {
			currentEnrolledCredits = change;
		}//setCurrentEnrolledCredits(double)
	
		/**
		 * setTotalCreditsEarned(double)
		 * @param name
		 * @preconditions name should be a valid String
		 * @postconditions changes the total amount of credits earned 
		 * 				   designated by the user following the call to
		 * 				   the method
		 */
		public void setTotalCreditsEarned(double change) {
			totalCreditsEarned = change;
		}//setTotalCreditEarned(double)
	
		/**
		 * getStudentCategory()
		 * @param none
		 * @preconditions none
		 * @postconditions N/A (yet)
		 */
		public abstract String getStudentCategory();
	
		/**
		 * getClassStanding()
		 * @param none
		 * @preconditions none
		 * @postconditions N/A (yet)
		 */
		public abstract String getClassStanding() throws Exception;
	
		/**
		 * makingGoodProgress()
		 * @param none
		 * @preconditions none
		 * @postconditions N/A (yet)
		 */
		public abstract boolean makingGoodProgress() throws Exception;
	
		/**
		 * validRegistration()
		 * @param none
		 * @preconditions none
		 * @postconditions N/A (yet)
		 */
		public abstract boolean validRegistration();
	
		/**
		 * getMajor()
		 * @param none
		 * @preconditions none
		 * @postconditions N/A (yet)
		 */
		public abstract String getMajor() throws Exception;
	
		/**
		 * toString()
		 * @param none
		 * @preconditions none
		 * @postconditions returns a nicely formatted output
		 */
		public String toString() {
			return "Name: " + getFirstName() + " " + getLastName()
					+ "\n   Current Enrolled Credits: " 
					+ getCurrentEnrolledCredits() 
					+ "\n   Total Credits Earned: "
					+ getTotalCredits();
		}//toString()
		
}//class EnrolledStudents
