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
     *
     * @param students список студентов.
     */
    public ModelClass(List<Student> students) {
        this.students = students;
    }

    /**
     * @return список студентов.
     * @apiNote Метод для получения списка студентов.
     */
    public List<Student> getAllStudents() {
        return students;
    }

    /**
     * @param studentId индекс студента в списке для удаления.
     * @return true/false определяющее наличие студента по индексу в списке.
     * @apiNote Метод для удаления студента по индексу.
     */
    @Override
    public boolean deleteStudent(int studentId) {
        boolean studentExist = false;
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getId() == studentId) {
                studentExist = true;
                students.remove(i);
                break;
            }
        }
        return studentExist;

    }
}
