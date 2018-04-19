package io.javabrains.springbootstarter.hello;

import java.util.*;
import org.springframework.stereotype.Service;

@Service
public class HelloService
{
	private List<Topic> topics =new ArrayList<>(Arrays.asList(new Topic("first","second","third"),
			 new Topic("x","y","z"),
			 new Topic("one","seccond","third")
			 ));
			
public List<Topic> helloService()
 {
	return topics;
	
 }


public Topic getonetopic(String id) {
	return topics.stream().filter(t ->t.getId().equals(id)).findFirst().get();
}


public void addTopic(Topic topic) {
	topics.add(topic);
	
}

	
}
