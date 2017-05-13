
public class UG1Student extends Student {
	private char mainSchedule;
	
	public UG1Student(String name, String uun, char schedule) {
			super(name, uun, 1);
			mainSchedule = schedule;
	}
	
	public UG1Student() {
		this("not set", "not set", 'X');
	}
	
	public boolean addCourse(Course c) {
		int level = c.getLevel();
		if ((level != 7) && (level != 8)) {
			return false;
		}
		
		super.addCourse(c);
		return true;
	}
	
	/* 
	 Write a public instance method addCourses, taking an array of Course
objects representing a list of courses that this student wishes to enroll on, and
returning a boolean indicating overall success or failure. You may assume
that the array, and any Course objects in it, are not null, but do not assume
anything about the length of the array. Use your addCourse method to add
each course in turn. The return value must be the conjunction of all the
return values from addCourse: that is, true if every addCourse succeeded,
false if any failed.
	 */
	
	public boolean addCourses(Course[] courses) {
		boolean success = true;
		for (Course c : courses) {
			if (!addCourse(c)) {
				success = false;
			}
		}
		return success;
	}
	
	public String toString() {
		String output = String.format("%s\nMain schedule %c courses:", super.toString(), mainSchedule);
		for (Course c : getCourses()) {
			output += "\n" + c.getName();
		}
		return output;
	}
}
