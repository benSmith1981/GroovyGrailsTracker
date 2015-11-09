package tracker

class ProjectController {
	def scaffold = true
	
	def index = {//we can define a redirect to an html page of our choice
//		redirect (action: current)
	}
		
    def current = { 
//		def allProjects = Project.list() //gets all our data in our database
//		def dueDate = "3/3/15" 
//		[allProjects:allProjects] //passes all the data to our view (current.gsp)
	}
	
	def overdue = {
		render "Order Valentines day package"
	}
}
