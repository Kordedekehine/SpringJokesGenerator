package brain.springframework.joke.jokeapp.Config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChukConfiguration {

    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes(){

        return new ChuckNorrisQuotes();
    }

} //THIS IS JAVA BASED CONFIGURATION,We shall comment it out and create an XML configuration in the resources
