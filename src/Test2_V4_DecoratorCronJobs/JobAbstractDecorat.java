package Test2_V4_DecoratorCronJobs;

public abstract class JobAbstractDecorat implements ICronJob{
    private final ICronJob altJob;
    public ICronJob getAltJob() {
        return altJob;
    }

    protected JobAbstractDecorat(ICronJob job) {
        this.altJob = job;
    }

    public void perform(ContextDeco context){
        altJob.perform(context);
        performNewJob(context);
    }

    protected abstract void performNewJob(ContextDeco context);
}
