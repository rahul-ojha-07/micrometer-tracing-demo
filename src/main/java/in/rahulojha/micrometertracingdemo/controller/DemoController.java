package in.rahulojha.micrometertracingdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/")
public class DemoController {

    @GetMapping("test")
    public ResponseEntity<String> test() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread.sleep(100);
            log.info("Running on {} iteration from class {}", i, this.getClass());
        }
        return ResponseEntity.ok("Running Fine");
    }
}
