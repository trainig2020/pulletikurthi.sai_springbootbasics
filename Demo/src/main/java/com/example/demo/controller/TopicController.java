package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Topic;
import com.example.demo.service.TopicService;
@RestController
public class TopicController {
	@Autowired
	private TopicService topicservice;
	
	 @RequestMapping("/topic")
	   	public List<Topic> getlist() {
	   		return  topicservice.getAll();
	   	}
	 @RequestMapping("/topic/{name}")
	 public Topic gettopic(@PathVariable String name) {
		 return topicservice.gettopic(name);
	 }
		
		 @RequestMapping(method =RequestMethod.POST,value="/topic") 
		 public void addtopics(@RequestBody Topic topics) { 
			 topicservice.addTopic(topics);
			 }
		 
		 @RequestMapping(method =RequestMethod.PUT,value="/topic/{name}") 
		 public void updatetopics(@RequestBody Topic topics,@PathVariable String name) { 
			 topicservice.updateTopic(name,topics);
			 }
		 
		 @RequestMapping(method =RequestMethod.DELETE,value="/topic/{name}") 
		 public void deletetopics(@PathVariable String name) { 
			 topicservice.deleteTopic(name);
			 }
		 
}
