package Test2_V4_CompositeCronJobs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeCronJob implements CronJob{
    private List<CronJob> listaDeJobs = new ArrayList<>();

    public CompositeCronJob(CronJob ...jobs){
        listaDeJobs.addAll(Arrays.asList(jobs));
    }

    @Override
    public void perform(Context context) {
        listaDeJobs.forEach(crtJob -> crtJob.perform(context));
    }
}
