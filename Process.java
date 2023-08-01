public class Process implements Priority, Comparable<Process> 
{

    private String processID;
    private int priority;

    public Process(String processID) 
    {
        this.processID = processID;
        this.priority = MED_PRIORITY; // Default set to MED_PRIORITY
    }
    
    public int compareTo(Process other)
    {
        return Integer.compare(this.priority, other.priority);
    }
    
 
    public void setPriority(int priority) 
    {
        if (priority >= MIN_PRIORITY && priority <= MAX_PRIORITY) 
        {
            this.priority = priority;
        } 
        else
        {
            System.out.println("Priority value must be between " + MIN_PRIORITY + " and " + MAX_PRIORITY);
        }
    }
    
    
    public int getPriority()
    {
        return priority;
    }
    
    public String getProcessID() 
    {
        return processID;
    }

       

    @Override
    public String toString()
    {
        return "Process: " + processID + " [Priority: " + priority + "]";
    }
}
