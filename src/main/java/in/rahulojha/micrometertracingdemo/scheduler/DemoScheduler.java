package in.rahulojha.micrometertracingdemo.scheduler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DemoScheduler {
    @Scheduled(cron="0/30 * * * * ?")
    public void scheduledTask() throws InterruptedException{
        log.info("==========================================");
        for (int i = 0; i < 10; i++) {
            Thread.sleep(100);
            log.info("Running on {} iteration from {}", i, this.getClass());
        }
        log.info("==========================================");
    }
}
