/* Assignment #: 4
Description: Assignment 4 class displays a menu of choices to a user
  and performs the chosen task. It will keep asking a user to
 enter the next choice until the choice of 'Q' (Quit) is entered.
 */
public class Coach {
	private String firstName;
	private String lastName;
	private int years;

	public Coach() {//Default constructor for coach, sets up the coach with default variables. 
		firstName="?";
		lastName="?";
		years=0;
	}
	public Coach(String fName,String lName, int yrs) {//Takes in first name, last name, and years of experience to make a coach object.
		firstName=fName;
		lastName=lName;
		years=yrs;
	}
	public Coach(Coach inputCoach) {//If coach object already made takes that Coaches info to make new coach object.
		firstName=inputCoach.getFirstName();
		lastName=inputCoach.getLastName();
		years=inputCoach.getYears();
	}
	public String getFirstName() {//Returns first name of coach.
		return firstName;
	}
	public String getLastName() {//Returns last name of coach.
		return lastName;
	}
	public int getYears() {//Returns the years of experience of coach.
		return years;
	}
	public void setFirstName(String fNameInput) {//Sets the first name of coach.
		firstName=fNameInput;
	}
	public void setLastName(String lNameInput) {//Sets the last name of coach.
		lastName=lNameInput;
	}
	public void setYears(int yearsInput) {//Sets years of experience of coach. 
		years=yearsInput;
	}
	public String toString() {
		String info = ("Last Name:	"+lastName+"\nFirst Name:	"+firstName+"\nYears of Experience:	"+years);
		return info;
	}
}
