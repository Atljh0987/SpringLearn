package spring.practice.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

import javax.management.loading.PrivateClassLoader;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String getLineFromFile() throws IOException {
		
		List<String> result = Files.readAllLines(Paths.get("src/fortune-data.txt")); 

		Random rnd = new Random(); 
		
		
		
		return result.get(rnd.nextInt(result.size()));
	}
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		String result = ""; 
		
		try {
			result = getLineFromFile();
		} 
		catch (Exception e) {
			System.err.println(e);
		}
		
		return result;
	}

}
