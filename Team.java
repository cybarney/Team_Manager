/* Assignment #: 4
Description: Assignment 4 class displays a menu of choices to a user
  and performs the chosen task. It will keep asking a user to
 enter the next choice until the choice of 'Q' (Quit) is entered.
 */
public class Team {
	private String name;
	private Coach coach;
	private String city;

public Team(){//Default constructor for team object.
	name="?";
	coach=null;
	city="?";
	}

public Team(String nameInput, Coach coachInput, String cityInput) {//Overloaded constructor that can take inputs for name, coach, and city.
	name=nameInput;
	coach=coachInput;
	city=cityInput;
	}
public String getName() {//Returns name of team
	return name;
	}
public Coach getCoach() {//Returns coach of team
	return coach;
	}	
public String getCity() {//Return city of team
	return city;
	}
public void setName(String nameSet) {//Sets name of team
	name=nameSet;
	}
public void setCity(String citySet) {//Sets city of team
	city=citySet;
	}
public void setCoach(String fName, String lName, int yrs) {//Sets coach of team, using information from coach class.
	coach.setFirstName(fName);
	coach.setLastName(lName);
	coach.setYears(yrs);
	}
public String toString(){//To String for the team, also has coach's info.
	String info = ("Team's name:	"+name+" from "+city+"\nCoach Information:"+"\n"+coach.toString()+"\n");
	return(info);
	}
}

