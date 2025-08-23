package Assignment24;

class After12th {
 void display() {
     System.out.println("Options available after 12th:");
 }
}

class Engineering extends After12th {
 void showEngineering() {
     System.out.println("Engineering Courses: IT, Mechanical, CS");
 }
}

class Medical extends After12th {
 void showMedical() {
     System.out.println("Medical Courses: MBBS, BDS");
 }
}

class OtherCourses extends After12th {
 void showOtherCourses() {
     System.out.println("Other Courses: BCA, BBA");
 }
}

public class HierarchicalInheritance {
 public static void main(String[] args) {
     Engineering eng = new Engineering();
     Medical med = new Medical();
     OtherCourses other = new OtherCourses();

     eng.display();
     eng.showEngineering();

     med.display();
     med.showMedical();

     other.display();
     other.showOtherCourses();
 }
}

