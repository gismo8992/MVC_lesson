package View;

import Controller.Interfaces.iGetView;
import Model.Domain.Student;

import java.util.List;
import java.util.Scanner;

/**
 * Класс для реализации функций представления (отображение инфо на русском языке).
 */
public class ViewClass implements iGetView {
    /**
     * @param studentList список студентов для вывода.
     * @apiNote Метод вывода студентов из списка.
     */
    public void printAllStudents(List<Student> studentList) {
        System.out.println("------Список студентов------");
        for (Student student : studentList
        ) {
            System.out.println(student);
        }
        System.out.println("-------------------------");
    }

    /**
     * @param message сообщение для отображения пользователю перед вводом данных.
     * @return введенные пользователем данные типа String.
     * @apiNote Метод запроса информации от пользователя.
     */
    public String prompt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }
}
