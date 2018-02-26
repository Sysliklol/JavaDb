package dao;

public class Student {
	
		private String pib;
		private int course;
		private int studentId;
		
		public Student(int studentId, String pib, int course) {
			super();
			this.studentId = studentId;
			this.pib = pib;
			this.course = course;
		}
		
		public Student(String pib, int course) {
			super();
			this.pib = pib;
			this.course = course;
		}
		
		public Student() {
			
		}

		public int getStudentId() {
			return studentId;
		}
		
		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}
		
		public String getPib() {
			return pib;
		}
		
		public void setPib(String pib) {
			this.pib = pib;
		}
		
		public int getCourse() {
			return course;
		}
		
		public void setCourse(int course) {
			this.course = course;
		}
		
	

}
