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

    //overload method to allow optional parameters based on what users pick
    public void updateTask(int id, int updateSelection, String updateVal ){
        if(updateSelection == 1){
            tasks.get(id).setTitle(updateVal);
        }
        else if(updateSelection == 2){
            tasks.get(id).setDescription(updateVal);
        }
        else if(updateSelection == 3){
            tasks.get(id).setDueDate(updateVal);
        }
        else{
            System.out.println("invalid selection");
        }
    }

    public void getTask(){
        if(tasks.isEmpty()){
            System.out.println("No task to view");
        } else{
            for(int i = 0 ; i < tasks.size(); i++){
                System.out.println("id: " + i);
                System.out.println("UUID: " + tasks.get(i).getId());
                System.out.println("Title: " + tasks.get(i).getTitle());
            }
        }

    }

    public void markComplete(int id){
        tasks.get(id).setStatus(true);
    }

    //add update task later
}
