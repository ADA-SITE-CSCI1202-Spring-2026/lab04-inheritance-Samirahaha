package lab04;

public class Teacher extends Person{
    private String department;
    private String[] courses;

    public Teacher(String firstName, String lastName, String gender, String department, String[] courses){
        super(firstName, lastName, gender);
        this.department=department;
        this.courses=courses;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department=department;
    }
    public String[] getCourses(){
        return courses;
    }
    public void setCourses(String[] courses){
        this.courses=courses;
    }
    @Override
    public String toString(){
        String courseList="";
        for (int i = 0; i < courses.length; i++) {
            courseList += courses[i];
            if (i < courses.length - 1) {
                courseList += ", ";
            }
        }

        return super.toString() +
               ", Department=" + department + ", Courses=[" + courseList + "]";
    }
}
