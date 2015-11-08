package tracker

class ListProjectController {

	def index = {
		redirect (action: current)
	}
		
    def current = { 
		def allProjects = ListProject.list()
		def dueDate = "3/3/15"
		[allProjects:allProjects]
	}
	
	def overdue = {
		render "Order Valentines day package"
	}
}
