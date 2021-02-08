package Test2_V4_DecoratorCronJobs;

public class JobDeBaza implements ICronJob{

    private String jobName;

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public JobDeBaza(String name){
        this.jobName = name;
    }

    @Override
    public void perform(ContextDeco context) {
        System.out.println("Job simplu " + getJobName() + " este rulat." );
    }

    @Override
    public String toString() {
        return "JobDeBaza :: " + jobName ;
    }
}
