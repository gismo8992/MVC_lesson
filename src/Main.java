import Controller.ControllerClass;
import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.Domain.Student;
import Model.FileModelClass;
import Model.ModelClass;
import View.ViewClass;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", 20);
        Student student6 = new Student("Olga", 19);
        Student student7 = new Student("Andrei", 20);
        Student student2 = new Student("Anna", 22);
        Student student3 = new Student("Vova", 24);
        Student student4 = new Student("Sergei", 19);
        Student student5 = new Student("Dima", 22);
        Student student8 = new Student("Alex", 18);
        Student student9 = new Student("Igor", 23);
        Student student10 = new Student("Boris", 24);
        Student student11 = new Student("Kolya", 22);
        Student student12 = new Student("Katya", 20);
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        studentList.add(student7);
        studentList.add(student8);

        FileModelClass fileModelClass = new FileModelClass("studentDB.csv");
        //fileModelClass.saveAllStudents(studentList);
        iGetView view = new ViewClass();
        iGetModel model = new ModelClass(studentList);
        ControllerClass controller = new ControllerClass(fileModelClass, view);
        // controller.update();
        controller.run();
    }
}