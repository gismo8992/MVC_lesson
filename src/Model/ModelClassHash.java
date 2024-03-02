package Model;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

import java.util.HashMap;
import java.util.List;
/**
 * Класс модели, реализующей функционал работы пользователя с данными.
 * Студенты хранятся в HashMap.
 */
public class ModelClassHash implements iGetModel {
    private HashMap<Integer, Student> studentHashMapStorage;

    /**
     * Конструктор класса ModelClassHash. Создает HashMap со студентами из списка типа List.
     * @param studentList список студентов.
     */
    public ModelClassHash(List<Student> studentList) {
        this.studentHashMapStorage = new HashMap<>();
        for (Student student: studentList) {
            this.studentHashMapStorage.put(student.getId(), student);
        }
    }

    /**
     * Метод получения студентов в виде списка.
     * @return список студентов.
     */
    @Override
    public List<Student> getAllStudents() {
        return null;
    }

    @Override
    public void deleteStudent(int studentIndex) {

    }


}
