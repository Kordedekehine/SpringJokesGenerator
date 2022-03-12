package brain.springframework.joke.jokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service //here we create a service annotation
public class JokeServiceImpl implements JokeService{
   private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes(); //we initialize the chuckNorris Quotes using the class constructor
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote(); //here we return it ...get the quotes directly
    }
}
