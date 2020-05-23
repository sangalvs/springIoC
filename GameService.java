package com.springuse;

import org.springframework.context.*;
import org.springframework.context.support.*;

public class GameService {

	ApplicationContext context = new ClassPathXmlApplicationContext("springBean.xml");  
	Score score = context.getBean("thescore", Score.class);

	public void playTheGame(String clientGesture) {
		if (clientGesture.equals("scissors")) { 
			score.win = true; 
			}
		if (clientGesture.equals("rock")){ 
			score.tie = true; 
			}
		if (clientGesture.equals("rock")){ 
			score.loss = true; 
			}
	}
}
