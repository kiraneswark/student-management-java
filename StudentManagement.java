import java.util.*;

class Student {
    int id;
    String name;
    int marks;
    Student(int id , String name , int marks){
       this.id = id;
       this.name = name;
       this.marks = marks;
    }
}
     public class StudentManagement {
        public static void main(String[] args){
             Scanner sc = new Scanner(System.in);
             ArrayList<Student> students = new ArrayList<>();
             
             while (true){
                System.out.println( "Student Management" );
                System.out.println( " 1 . Add student");
                System.out.println( " 2 . view student ");
                System.out.println("3. search student");
               System.out.println("4. delete student");
               System.out.println("5.update student");
                System.out.println(  "6. exit");

                int choice = sc.nextInt();
                
             switch (choice){
                case 1:
                    System.out.println("Enter student id :  ");
                    int id = sc. nextInt();
                    sc.nextLine();

                    System.out.println("Enter student name :  ");
                    String name = sc.nextLine();

                    System.out.println("Enter student marks ");
                    int marks = sc. nextInt();
                    sc.nextLine();
 
                         students.add (new Student(id, name, marks));
                           System.out.println("student added");
                                         break;

                   case 2:
                        for( Student s : students){
                            System.out.println("id : " + s.id + " name : " + s.name + " marks : " + s.marks);
                        }
                         break;
                    
                    case 3:
                        System.out.println("Enter student id to search : ");
                        int searchId = sc.nextInt();
                        sc.nextLine();
                    
                    Boolean found = false;
                    for (Student s : students){
                        if (s.id == searchId){
                            System.out.println("id : " + s.id + " name : " + s.name + " marks : " + s.marks);
                       found = true;
                            break;

                        }
                    }
                     if (!found){
                        System.out.println("student not found");
                     }
                    
                    case 4:
                        System.out.println(" Enter student to delete");
                        int deleteId= sc.nextInt();
                        sc.nextLine();
                        Boolean deleted = false;
                         
                        for(int i = 0; i< students.size(); i++){
                            if (students.get(i).id == deleteId){
                                students.remove(i);
                                System.out.println("student deleted");
                                deleted = true;
                                break;
                            }
                        }
                        if (!deleted) {
                            System.out.println("student not found");
                        }
                         case 5:
                            System.out.print("Enter ID to Update: ");
                              int updateId = sc.nextInt();
                                 sc.nextLine();
                     boolean updated = false;

                           for (Student s : students) {
                            if (s.id == updateId) {
                      System.out.print("Enter New Marks: ");
                      s.marks = sc.nextInt();
                                 updated = true;
                         System.out.println("Marks Updated");
                           }
                          }

                           if (!updated) {
                           System.out.println("Student Not Found");
                            }
                          break;

      
                      case 6:
                        System.out.println(" Exit");
                       return;
                       
                    default:
                          System.out.println("Invalid choice");

             }
             }
             
        }
    }

