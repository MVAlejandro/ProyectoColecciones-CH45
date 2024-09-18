
public class Main {
    public static void main(String[] args ) {
        CourseService courseService = new CourseService();

        String courseId = "math_01";
        String studentId = "120120";
       
        System.out.println("------------------------- displayStudentInformation ------------------------");
        
        courseService.displayStudentInformation(studentId);
        
        System.out.println("----------------- ------- enrollStudent ------------------ -----------------");
        
        courseService.displayCourseInformation(courseId);
        
        courseService.enrollStudent(studentId, courseId);
        courseService.displayStudentInformation(studentId);
        
        System.out.println("----------------------------------------------------------------------------");
        
        courseService.displayCourseInformation("biol_01");
        courseService.enrollStudent(studentId, "biol_01");
        courseService.displayStudentInformation(studentId);
        
        System.out.println("------------------------- creditsTotal -------------------------------------");
        
        courseService.creditsTotal(studentId);
        
        System.out.println("------------------------- unEnrollStudent ----------------------------------");
        
        courseService.unEnrollStudent(studentId, courseId );
        courseService.displayStudentInformation(studentId);
        
    } // main


} // class Main