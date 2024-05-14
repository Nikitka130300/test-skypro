
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoList {
    private static List<String> toDoList = new ArrayList<>();

    public static void main(String[] args) {
        input();
    }

    private static void input() {
        Scanner console = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите действие: ");
            System.out.println("1. Добавить задачу");
            System.out.println("2. Удалить задачу");
            System.out.println("3. Вывести список задач");
            System.out.println("4. Выход");

            int choice = console.nextInt();

            switch (choice) {
                case 1 -> addTask(console);
                case 2 -> removeTask(console);
                case 3 -> displayTasks(console);
                case 4 -> {
                    System.out.println("Программа завершена. ");
                    console.close();
                    return;
                }
                default -> System.out.println("Неверный выбор номера задачи");
            }
        }
    }

    private static void addTask(Scanner console) {
        System.out.println("Введите новую задачу: ");
        String task = console.next();
        toDoList.add(task);
        System.out.println("Задача добавлена.");
    }

    private static void removeTask(Scanner console) {
        if (toDoList.isEmpty()){
            System.out.println("Текущий список задач пустой.");
        }

        System.out.println("Выбериту задачу, которую хотите удалить: ");
        for (int i = 0; i < toDoList.size(); i++){
            System.out.println((i + 1) + ". " + toDoList.get(i));
        }

        int choice = console.nextInt();
        if (choice >= 1 && choice <= toDoList.size()){
            toDoList.remove(choice - 1);
            System.out.println("Задача удалена.");
        } else {
            System.out.println("Неправильно выбран номер задачи.");
        }
    }

    private static void displayTasks(Scanner console) {
        if (toDoList.isEmpty()){
            System.out.println("Список пустой");
        } else {
            System.out.println("Текущий список задач");
            for (int i = 0; i < toDoList.size(); i++){
                System.out.println((i + 1) + ". " + toDoList.get(i));
            }
        }
    }
}
