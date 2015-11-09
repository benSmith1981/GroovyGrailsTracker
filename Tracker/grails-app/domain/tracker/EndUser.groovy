package tracker

class EndUser {
	String userName
	String password
	String fullName
	def scaffold = true
	String toString () {
		${fullName}
	}
	static hasMany = [projects:Project , tasks:Task]
	
    static constraints = {
		///puts fields in the correct order
		fullname()
		userName()
		password()
    }
}
