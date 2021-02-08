package Test2_V4_DecoratorCronJobs;

public class CronJobExecutorDeco {
    ContextDeco contextDeco;

    public CronJobExecutorDeco(ContextDeco contextDeco) {
        this.contextDeco = contextDeco;
    }

    void run(ICronJob job){
        System.out.println("CronJobExecutor executa job-ul ");
        job.perform(contextDeco);
    }
}

