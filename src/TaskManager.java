import java.util.*;

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task){
        tasks.add(task);
    }

    public void deleteTask(int id){
        //user will delete task based off task they can see
        if(tasks.isEmpty() || id > tasks.size() || id < 0){
            System.out.println("there are no task to delete or invalid id");
        }else{
            tasks.remove(id);
        }
    }

    public void getTask(){
        if(tasks.isEmpty()){
            System.out.println("No task to view");
        } else{
            for(Task t: tasks){
                System.out.println("id: " + t.getId());
                System.out.println("Title: " + t.getTitle());
            }
        }

    }

    public void markComplete(int id){
        tasks.get(id).setStatus(true);
    }

    //add update task later
}
