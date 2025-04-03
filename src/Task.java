import java.util.*;
public class Task {
    private UUID id;
    private String title;
    private String description;
    private boolean status;
    private final Date createdAt;
    private String dueDate;

    public Task(){
        this.id = UUID.randomUUID();
        this.status = false;
        this.createdAt = new Date();
    }

    //add setter functions here
    public void setTitle(String titleVal){
        this.title = titleVal;
    }

    public void setDescription(String descriptionVal){
        this.description = descriptionVal;
    }

    public void setDueDate(String dueDate){
        //add regex check to make sure its in yyyy-MM-dd format
        this.dueDate = dueDate;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    //add getter functions
    public UUID getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getDescription(){
        return description;
    }

    public boolean getStatus(){
        return status;
    }

    public Date getDate(){
        return createdAt;
    }

    public String getDueDate(){
        return dueDate;
    }
}
