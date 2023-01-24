package in.rahulojha.micrometertracingdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MicrometerTracingDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicrometerTracingDemoApplication.class, args);
    }
}
