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
            System.out.println("Please enter 5 to stop using task manager");


            int taskVal = scanner.nextInt();

            scanner.nextLine();


            if(taskVal == 1){
                addTask(scanner,taskManager); //need to make function static to access it
            }
            else if(taskVal == 2){
                deleteTask(scanner,taskManager);
            }
            else if (taskVal == 3){
                updateTask(scanner,taskManager);
            }
            else if(taskVal == 4) {
                taskManager.getTask();
            }
            else if(taskVal == 5){
                endCondition = true;
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

    public static void deleteTask(Scanner scanner, TaskManager taskManager){
        System.out.println("Please select a task id to delete");
        taskManager.getTask();
        int taskSelector = scanner.nextInt();
        taskManager.deleteTask(taskSelector);

        System.out.println("Task successfully deleted");
    }

    public static void updateTask(Scanner scanner, TaskManager taskManager){
        System.out.println("Please select a task id to update");
        taskManager.getTask();
        int taskSelector = scanner.nextInt();

        System.out.println("Enter 1 to update title");
        System.out.println("Enter 2 to update description");
        System.out.println("Enter 3 to update due date");

        int updateSelection = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Now enter a value for your updated task");
        String updateVal = scanner.nextLine();

        System.out.println("this is the updateval" +updateVal);

        taskManager.updateTask(taskSelector,updateSelection,updateVal);
        System.out.println("value was updated successfully");
    }
}