package co.com.choucair.certification;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UserDummyRunner {

    @Test
    void userGet(){
        Runner.path("classpath:co/com/choucair/certification").parallel(5);
    }
}