package tracker

import java.util.Date;

class Task {

	String name
	String description
	Date dueDate
	String toString () {
		${name}
	}
	//Task belongs to two objects, needs to be assigned to EndUser
	//and it needs to belong to a project
	static belongsTo = [assignee: EndUser, project: Project]
	
    static constraints = {
		//ORder of fields
		name()
		description()
		dueDate()
    }
}
