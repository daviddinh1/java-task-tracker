import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean endCondition = false;
        TaskManager taskManager = new TaskManager();

        while(!endCondition){
            System.out.println("Please enter 1 to add a task");
            System.out.println("Please enter 2 to delete a task");
            System.out.println("Please enter 3 to update a task");
            System.out.println("Please enter 4 to view a task");

            int taskVal = scanner.nextInt();

            scanner.nextLine();


            if(taskVal == 1){
                addTask(scanner,taskManager); //need to make function static to access it
            }
            else if(taskVal == 2){

            }
            else if (taskVal == 3){

            }
            else if(taskVal == 4) {
            }
            else{
                System.out.println("Please enter 1,2,3, or 4");
            }
        }
    }

    public static void addTask(Scanner scanner, TaskManager taskManager){
        Task task = new Task();
        System.out.println("Title: ");
        String title = scanner.nextLine();
        task.setTitle(title);
        System.out.println("Description: ");
        String description = scanner.nextLine();
        task.setDescription(description);
        System.out.println("Due Date: ");
        String dueDate = scanner.nextLine();
        task.setDueDate(dueDate);

        taskManager.addTask(task);
        System.out.println("Task added successfully.");

    }
}