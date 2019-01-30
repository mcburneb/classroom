
package classroom;

/**
 * @author Brianna McBurney 
 * Student Number: 991517337
 * Date: 
 */
public class Classroom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student [] students = new Student[5];
        
        students[0] = new Student("student1"); 
        students[1] = new Student("student2"); 
        students[2] = new Student("student3"); 
        students[3] = new Student("student4"); 
        students[4] = new Student("student5"); 
        
        for (int i=0; i<students.length;i++) {
            System.out.println(students[i]);
        }
    }

}
