class StudentInfo {
    String name, program, semester;
    String[] courses = {"Math", "CS"};
    int[] marks = {35, 85};
    public StudentInfo(String name,String program, String semister){
        this.name = name;
        this.program = program;
        this.semester = semister;
    }
    public void display() {
        System.out.println("Student: " + name + ", Program: " + program + ", Semester: " + semester);
        for (int i = 0; i < courses.length; i++) {
            System.out.println(courses[i] + ": " + marks[i]);
        }
    }

    public void lowScorers() {
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 40) {
                System.out.println("Low score: " + courses[i] + " - " + marks[i]);
            }
        }
    }

    public static void main(String[] args) {
        StudentInfo std = new StudentInfo("Vaishnavi","BCA","4th Semister");
        std.display();
        std.lowScorers();
    }
}
