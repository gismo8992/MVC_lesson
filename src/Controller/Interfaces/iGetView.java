package Controller.Interfaces;

import Model.Domain.Student;

import java.util.List;

/**
 * Интерфейс представления, предоставляющий функции отображения данных для пользователя.
 */
public interface iGetView {
    /**
     * @apiNote Метод вывода списка студентов.
     * @param students список студентов для вывода.
     */
    public void printAllStudents(List<Student> students);

    /**
     * @apiNote Метод запроса информации от пользователя.
     * @param message сообщение для отображения пользователю перед вводом данных.
     * @return введенные пользователем данные типа String.
     */
    public String prompt(String message);
}
