package Model;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

import java.util.List;

/**
 * Класс модели, реализующей функционал работы пользователя с данными.
 */
public class ModelClass implements iGetModel {
    private List<Student> students;

    /**
     * Конструктор класса ModelClass.
     * @param students список студентов.
     */
    public ModelClass(List<Student> students) {
        this.students = students;
    }

    /**
     * @apiNote Метод для получения списка студентов.
     * @return список студентов.
     */
    public List<Student> getAllStudents() {
        return students;
    }

    /**
     * @apiNote Метод для удаления студента по индексу.
     * @param studentIndex индекс студента в списке для удаления.
     */
    @Override
    public void deleteStudent(int studentIndex) {
        if (studentIndex < students.size()) {
            students.remove(studentIndex);
        }
        else {
            System.out.println("Такого пользователя не существует.");
        }
    }
}
