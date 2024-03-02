package Controller;

import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.Domain.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Класс контроллера, который принимает и обрабатывает запросы от пользователя,
 * выполняет взаимодействие с моделью и представлением.
 */
public class ControllerClass {
    private iGetModel model;
    private iGetView view;
    private List<Student> bufferStudentList = new ArrayList<>();

    public ControllerClass(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    /**
     * @apiNote Проверка наличия данных о студентах в списке.
     * @param students список студентов для проверки.
     * @return Возвращает true/false в зависимости от наличия студентов в списке.
     */
    private boolean testData(List<Student> students) {
        if (students.size() > 0) return true;
        else return false;
    }

    /**
     * @apiNote Получение списка студентов из модели, проверка на наличие данных в списке и передача на вывод в представление
     * при наличии данных.
     */
    public void update() {
        //MVC
        //view.printAllStudent(model.getStudents());

        //MVP
        bufferStudentList = model.getAllStudents();
        if (testData(bufferStudentList)) view.printAllStudents(bufferStudentList);
        else System.out.println("Список студентов пуст.");
    }

    /**
     * @apiNote Метод запуска цикла взаимодействия с пользователем посредством обработки данных из модели и передачи в представление
     * в ответ на команду пользователя.
     */
    public void run() {
        Command com = Command.NONE;
        boolean getNewIteration = true;
        while (getNewIteration) {
            String command = view.prompt("Введите команду: ");
            com = Command.valueOf(command.toUpperCase());
            switch (com) {
                case EXIT:
                    getNewIteration = false;
                    System.out.println("Выход из программы!");
                    break;
                case LIST:
                    view.printAllStudents(model.getAllStudents());
                    break;
                case DELETE:
                    System.out.println("Введите id студента для удаления: ");
                    Scanner scanner = new Scanner(System.in);
                    int studentId = scanner.nextInt();
                    if (model.deleteStudent(studentId)) System.out.println("Студент с id " + studentId + " удален.");
                    else System.out.println("Студент с id " + studentId + " отсутствует.");
                    break;
            }
        }
    }
    
}
