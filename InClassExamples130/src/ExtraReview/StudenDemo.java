
package Chapter10;

public class StudenDemo {

    public static void main(String[] args) {
        
        Student tom = new Student("Tom", "English", 45);
        System.out.println(tom);
        
        Student frank = new Student("Frank", "Chemistry", -30);
        System.out.println(frank);
        
        Student claire = new Student("Claire", "Computer Science", 12);
        System.out.println(claire);
        
        Student empty = new Student();
        System.out.println(empty);
        
    }
    
}
