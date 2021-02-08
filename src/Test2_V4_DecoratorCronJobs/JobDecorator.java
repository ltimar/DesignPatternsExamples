package Test2_V4_DecoratorCronJobs;

public class JobDecorator extends JobAbstractDecorat{
    String crtJobName;
    public JobDecorator(String numeJob, ICronJob job){
        super(job);
        this.crtJobName = numeJob;
    }

    public String getCrtJobName() {
        return crtJobName;
    }

    @Override
    protected void performNewJob(ContextDeco context) {
        System.out.println("Decoratorul executa :"+ this.getCrtJobName());
    }
}
