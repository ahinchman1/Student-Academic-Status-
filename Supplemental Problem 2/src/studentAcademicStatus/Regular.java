package studentAcademicStatus;

/**
 * Regular is a subclass of Enrolled Student.  Base definition of a 
 * Regular student.
 * @author Amanda Hinchman-Dominguez
 *
 */

public class Regular extends EnrolledStudents{
	/**************
	// Fields
	/**************/
		/**
		 * humanitiesCredits
		 */
		double humanitiesCredits;
			//humanities credits recorded for the enrolled student
		/**
		 * socialStudiesCredits
		 */
		double socialStudiesCredits;
			//social studies credits recorded for the enrolled student
		/**
		 * scienceCredits
		 */
		double scienceCredits;
			//science credits recorded for the enrolled student
		/**
		 * generalCredits
		 */
		double generalCredits;
			//science credits recorded for the enrolled student
		/**
		 * major
		 */
		String major;
			//student's major
		
	/**************
	// Constructors
	/**************/
		/**
		 * Regular()
		 * @param none
		 * @preconditions none
		 * @postconditions Instantiates a default class object
		 */
		public Regular() {
			super();
			humanitiesCredits = 0.0;
			socialStudiesCredits = 0.0;
			scienceCredits = 0.0;
			generalCredits = 0.0;
			major = "";
		}//Regular
		
		/**
		 * Regular(String, String, double, double, double, double, double, 
		 *         String)
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
		public Regular(String firstName, String lastName, 
				double currentlyEnrolledCredits, double totalCreditsEarned,
				double humanitiesCredits, double socialStudiesCredits,
				double scienceCredits, double generalCredits, String major) {
			super(firstName, lastName, currentlyEnrolledCredits, 
					totalCreditsEarned);
			this.humanitiesCredits = humanitiesCredits;
			this.socialStudiesCredits = socialStudiesCredits;
			this.scienceCredits = scienceCredits;
			this.generalCredits = generalCredits;
			this.major = major;
		}//Regular(double, double, double, double, String)
		
	/**************
	// Methods
	/**************/
		/**
		 * setHumanitiesCredits(double)
		 * @param credits
		 * @preconditions credits should be a valid double value
		 * @postconditions changes the total amount of humanities credits
		 *                 earned designated by the user following the call
		 *                 to the method
		 */
		public double setHumanitiesCredits(double credits) {
			return humanitiesCredits = credits;
		}//setHumanitiesCredits(double)
		
		/**
		 * (setSocialStudiesCredits(double)
		 * @param credits
		 * @preconditions credits should be a valid double value
		 * @postconditions changes the total amount of social studies credits 
		 *                 earned designated by the user following the call to
		 *                 the method
		 */
		public double setSocialStudiesCredits(double credits) {
			return socialStudiesCredits = credits;
		}//setSocialStudiesCredits(double)
		
		/**
		 * setScienceCredits(double)
		 * @param credits
		 * @preconditions credits should be a valid double value
		 * @postconditions changes the total amount of science credits earned 
		 *                 designated by the user following the call to the 
		 *                 method
		 */
		public double setScienceCredits(double credits) {
			return scienceCredits = credits;
		}//setScienceCredits(double)
		
		/**
		 * setGeneralCredits(double)
		 * @param credits
		 * @preconditions credits should be a valid double value
		 * @postconditions changes the total amount of general credits earned
		 *                 designated by the user following the call to the 
		 *                 method
		 */
		public double setGeneralCredits(double credits) {
			return generalCredits = credits;
		}//setGeneralCredits(double)
		
		/**
		 * getStudentCategory()
		 * @param credits
		 * @preconditions credits should be a valid double value
		 * @postconditions gets the type of Enrolled Student
		 */
		public String getStudentCategory() {
			return "Regular";
		}//getStudentCategory()

		/**
		 * getClassStanding()
		 * @param none
		 * @preconditions none
		 * @postconditions determines and logs the class standing of the 
		 * 				   student based on the credits the student has 
		 * 				   completed/working on
		 * @throws Exception
		 */
		public String getClassStanding() throws Exception {
			if (totalCreditsEarned > 0 && totalCreditsEarned <= 11.5)
				return "First Year, Semester 1";
			else if (totalCreditsEarned >= 12 && totalCreditsEarned <= 27.5)
				return "First Year, Semester 2";
			else if (totalCreditsEarned >= 28 && totalCreditsEarned <= 43.5)
				return "Second Year, Semester 1";
			else if (totalCreditsEarned >= 44 && totalCreditsEarned <= 59.5)
				return "Second Year, Semester 2";
			else if (totalCreditsEarned >= 60 && totalCreditsEarned <= 75.5)
				return "Junior, Semester 1";
			else if (totalCreditsEarned >= 76 && totalCreditsEarned <= 91.5)
				return "Junior, Semester 2";
			else if (totalCreditsEarned >= 92 && totalCreditsEarned <= 107.5)
				return "Senior, Semester 1";
			else if (totalCreditsEarned >= 108 && totalCreditsEarned <= 123.5)
				return "Senior Year, Semester 2";
			else return "Was not able to process the amount of credits...";
		}//getClassStanding

		/**
		 * makingGoodProgress()
		 * @param none
		 * @preconditions none
		 * @postconditions determines whether the student is making good 
		 * 				   progress by checking if at least 10% of the 
		 * 				   student's total credits are in each of the three
		 * 				   divisions
		 * @throws Exception
		 */
		public boolean makingGoodProgress() throws Exception {
			if (((getTotalCredits()/humanitiesCredits) > .10) && 
					(getTotalCredits()/socialStudiesCredits > .10) && 
					(getTotalCredits()/scienceCredits > .10)) {
				return true;
			}//if
			else return false;
		}//makeGoodProgress()
		
		/**
		 * validRegistration()
		 * @param none
		 * @preconditions none
		 * @postconditions determines whether the student is registered by
		 * 				   checking if the student is achieving full-time
		 * 				   status
		 */
		public boolean validRegistration() {
			if ((getCurrentEnrolledCredits() >= 12.0) && 
					(getCurrentEnrolledCredits() <= 18)) {
				return true;
			}//if
			else return false;
		}//validRegistration()

		/**
		 * getMajor()
		 * @param none
		 * @preconditions none
		 * @postconditions determines whether the student is registered by
		 * 				   checking if the student is achieving full-time
		 * 				   status
		 * @throws Exception
		 */
		public String getMajor() throws Exception {
			return major;
		}//getMajor()
		
		/**
		 * toString()
		 * @param none
		 * @throws Exception 
		 * @preconditions none
		 * @postconditions returns a nicely formatted output
		 */
		public String toString() {
				try {
					return super.toString() 
							+ "\n   Category: "
							+ getStudentCategory()
							+ "\n   Class Standing: "
							+ getClassStanding()
							+ "\n   Progress: "
							+ makingGoodProgress()
							+ "\n   Registration: "
							+ validRegistration()
							+ "\n   Major: " 
							+ getMajor();
				}//try 
				catch (Exception e) {
					return super.toString()
							+ "\n   Category: "
							+ "\n   Class Standing: "
							+ "\n   Progress: "
							+ "\n   Registration: "
							+ validRegistration()
							+ "\n   Major: "; 
				}//catch
		}//toString()
		
}//class Regular
