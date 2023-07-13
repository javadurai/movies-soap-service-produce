package com.soap.produce;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.test.producesoap.Hit;
import com.test.producesoap.Movie;

@Component
public class MovieRepository {
	
	private static final Map<String, Movie> movies = new HashMap<>();

	@PostConstruct
	public void initData() {
		Movie inception = new Movie();
		inception.setName("Inception");
		inception.setActor("Leonardo DiCaprio");
		inception.setDirector("Christopher Nolan");
		inception.setHit(Hit.BLOCKBUSTER);
		inception.setMakingCost(160000000);
		
		movies.put(inception.getName(), inception);
		
		Movie spiderman = new Movie();
		spiderman.setName("Spider Man");
		spiderman.setActor("Tobey Maguire");
		spiderman.setDirector("Sam Raimi");
		spiderman.setHit(Hit.SUPERHIT);
		spiderman.setMakingCost(139000000);
		
		movies.put(spiderman.getName(), spiderman);
		
		Movie avengers = new Movie();
		avengers.setName("Avengers");
		avengers.setActor("Robert Downey Jr.");
		avengers.setDirector("Anthony Russo");
		avengers.setHit(Hit.BLOCKBUSTER);
		avengers.setMakingCost(365000000);
		
		movies.put(avengers.getName(), avengers);

	}

	public Movie findCountry(String name) {
		Assert.notNull(name, "The movie name must not be null");
		return movies.get(name);
	}
}
