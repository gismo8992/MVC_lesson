package Model;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс модели, реализующей функционал работы пользователя с данными и файлами.
 */
public class FileModelClass implements iGetModel {
    private String fileName;

    /**
     * Конструктор класса FileModelClass.
     * @param fileName имя файла для работы.
     */
    public FileModelClass(String fileName) {
        this.fileName = fileName;
        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * @apiNote Метод для записи студентов в виде списка в файл.
     * @param students список студентов для записи в файл.
     */
    public void saveAllStudents(List<Student> students) {
        try (FileWriter fw = new FileWriter(fileName, true)) {
            for (Student pers : students
            ) {
                fw.write(pers.getName() + " " + pers.getAge() + " " + pers.getId());
                fw.append('\n');
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * @apiNote Метод получения студентов в виде списка из файла.
     * @return список студентов.
     */
    @Override
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        try {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line!=null) {
                String[] param = line.split(" ");
                Student pers = new Student(param[0], Integer.parseInt(param[1]));
                students.add(pers);
                line = reader.readLine();
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return students;
    }

    /**
     * @apiNote Метод удаления студентов из списка по индексу.
     * @param studentIndex индекс студента в списке для удаления.
     */
    @Override
    public void deleteStudent(int studentIndex) {

    }
}
