package tracker

class Project {
	String name
	String description
	Date dueDate
	String toString () {
		${name}
	}
	//sets relationship, a project belongs to and owner
	static belongsTo = [owner:EndUser]
	//A project has many tasks
	static hasMany = [tasks:Task]
	
    static constraints = {
		///puts fields in the correct order
		name()
		description()
		dueDate()
    }
}
