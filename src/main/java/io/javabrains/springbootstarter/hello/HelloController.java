package io.javabrains.springbootstarter.hello;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{
	@Autowired
	private HelloService helloservice;
@RequestMapping("/show")	
 public List<Topic> display()
 {
	 return helloservice.helloService();
	 
 }

@RequestMapping("/show/{west}")
public Topic getone(@PathVariable("west") String id)
 {
	return helloservice.getonetopic(id);
	
 }

@RequestMapping(value="/show",method=RequestMethod.POST)

public void addTopic(@RequestBody Topic topic)// its a requestbody that request input from url
{
  	helloservice.addTopic(topic);
}

}
