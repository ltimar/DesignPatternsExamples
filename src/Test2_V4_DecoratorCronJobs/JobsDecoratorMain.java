package Test2_V4_DecoratorCronJobs;

import Test2_V4_CompositeCronJobs.*;

public class JobsDecoratorMain {
    public static void main(String arg[]){
        ContextDeco context = new ContextDeco();

        CronJobExecutorDeco jobsExecutor = new CronJobExecutorDeco(context);
        JobDeBaza c1 = new JobDeBaza("c1");
        jobsExecutor.run(c1);
        System.out.println("=====================");

        JobDecorator tripluJob = new JobDecorator("c3", new JobDecorator("c2",new JobDeBaza("c1")));
        jobsExecutor.run(tripluJob);
    }
}
