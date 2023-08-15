package co.com.choucair.certification;

import com.intuit.karate.junit5.Karate;

public class UserDummyRunner {

    @Karate.Test
    Karate userGet(){
        return Karate.run().relativeTo(getClass());
    }
}