public class Task implements Priority, Comparable<Task> 
{

    // Enumerated type representing the status of the task
    public enum Status 
    {
        NOT_STARTED, IN_PROCESS, COMPLETE
    }

    private String name;
    private int priority;
    private Status status;

    public Task(String name) {
        this.name = name;
        this.priority = MED_PRIORITY; // Default priority set to MED_PRIORITY
        this.status = Status.NOT_STARTED; // Default status set to NOT_STARTED
    }

    public String getName() {
        return name;
    }
    
    public String getStatus() {
        return status.toString();
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getPriority() {
        return priority;
    }

    
    public void setPriority(int priority) {
        if (priority >= MIN_PRIORITY && priority <= MAX_PRIORITY) {
            this.priority = priority;
        } else {
            System.out.println("Invalid priority value. Priority must be between " + MIN_PRIORITY + " and " + MAX_PRIORITY);
        }
    }
    
    @Override
    public int compareTo(Task other) 
    {
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() 
    {
        return "Task: " + name + " [Priority: " + priority + ", Status: " + status + "]";
    }
}