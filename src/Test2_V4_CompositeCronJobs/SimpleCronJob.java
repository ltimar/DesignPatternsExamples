package Test2_V4_CompositeCronJobs;

public class SimpleCronJob implements CronJob{
    private String jobName;

    public SimpleCronJob(String jobName){
        this.jobName = jobName;
    }
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    @Override
    public void perform(Context context) {
        System.out.println("Job simplu " + this.getJobName());
    }
}
