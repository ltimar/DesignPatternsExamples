package Test2_V4_CompositeCronJobs;

public class CronCompositeMain {
    public static void main(String arg[]){
        Context context = new Context();

        CronJob c1 = new SimpleCronJob("c1");
        CronJob c2 = new SimpleCronJob("c2");
        CronJob c3 = new SimpleCronJob("c3");

        CronJob jobul = new CompositeCronJob(c1,c2,c3);

        CronJobExecutor executaJoburi = new CronJobExecutor() {
            @Override
            void run(CronJob job) {
                job.perform(context);
            }
        };
        executaJoburi.run(jobul);

    }
}
