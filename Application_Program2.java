import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Application_Program2 {
    public static void main(String[] args) {
        Task task1 = new Task("Finish report");
        Task task2 = new Task("Buy groceries");

        task1.setPriority(8);
        task1.setStatus(Task.Status.IN_PROCESS);

        task2.setPriority(3);
        task2.setStatus(Task.Status.NOT_STARTED);

        System.out.println(task1);
        System.out.println(task2);

        // Testing Comparable interface for natural ordering
        List<Task> taskList = new ArrayList<>();
        taskList.add(task1);
        taskList.add(task2);

        Collections.sort(taskList);
        System.out.println("\nSorted by priority:");
        for (Task task : taskList) {
            System.out.println(task);
        }

        Process process1 = new Process("Process-1");
        Process process2 = new Process("Process-2");

        process1.setPriority(5);
        process2.setPriority(9);

        System.out.println(process1);
        System.out.println(process2);
    }
}