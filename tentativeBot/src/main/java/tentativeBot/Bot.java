package tentativeBot;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;


public class Bot {

	public static void main(String[] args) throws LoginException {
		
		@SuppressWarnings("deprecation")
		JDA jda = new JDABuilder(""/*Key goes here*/).build();
		jda.addEventListener(new MyListener());

	}

}