package Controller.Interfaces;

import Model.Domain.Student;

import java.util.List;

/**
 * Интерфейс модели, предоставляющий функции и логику работу с данными.
 */
public interface iGetModel {
    /**
     * @apiNote Метод для получения списка студентов.
     * @return объекты типа Student в виде списка.
     */
    public List<Student> getAllStudents();

    /**
     * @apiNote Метод удаления студента из списка по индексу.
     * @param studentIndex индекс студента в списке для удаления.
     */
    public void deleteStudent(int studentIndex);
}
