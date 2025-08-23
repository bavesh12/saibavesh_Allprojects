package Assignment24;


abstract class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract String getRoleInfo();
}

class Student extends Person {
    String course;
    int rollNumber;

    Student(String name, int age, String course, int rollNumber) {
        super(name, age);
        this.course = course;
        this.rollNumber = rollNumber;
    }

    @Override
    String getRoleInfo() {
        return "Student: Name=" + name + ", Age=" + age + ", Course=" + course + ", Roll Number=" + rollNumber;
    }
}

class Professor extends Person {
    String subject;
    double salary;

    Professor(String name, int age, String subject, double salary) {
        super(name, age);
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    String getRoleInfo() {
        return "Professor: Name=" + name + ", Age=" + age + ", Subject=" + subject + ", Salary=" + salary;
    }
}

class TeachingAssistant extends Student {
    TeachingAssistant(String name, int age, String course, int rollNumber) {
        super(name, age, course, rollNumber);
    }

    @Override
    String getRoleInfo() {
        return "Teaching Assistant: Name=" + name + ", Age=" + age + ", Course=" + course + ", Roll Number=" + rollNumber;
    }
}

public class PersonRoles {
    public static void main(String[] args) {
        Person[] people = {
            new Student("Alice", 20, "Computer Science", 101),
            new Professor("Bob", 45, "Mathematics", 75000),
            new TeachingAssistant("Charlie", 25, "Physics", 102)
        };
        for (Person person : people) {
            System.out.println(person.getRoleInfo());
        }
    }
}
