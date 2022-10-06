package google.drive.common;


import google.drive.VideoProcessiogApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { VideoProcessiogApplication.class })
public class CucumberSpingConfiguration {
    
}
