package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.controller.TopicController;
import com.example.demo.model.Topic;

@Service
public class TopicService {
	private List<Topic> topic=new ArrayList<>(Arrays.asList(
			new Topic(1,"spring","spring tutorials"),
			new Topic(2,"spring2","spring tutorials part 2"),
			new Topic(3,"spring3","spring tutorials part 3")
			
			)) ;
 public List<Topic> getAll(){
	return topic;
	 
 }
 public  Topic gettopic(String  name) {
	return topic.stream().filter(t -> t.getName().equals(name)).findFirst().get();
	 
 }
public void addTopic(Topic topics) {
	topic.add(topics);
	
}
public void updateTopic(String name, Topic topics) {
	for(int i=0;i<topic.size();i++) {
		Topic t=topic.get(i);
		if(t.getName().equals(name)) {
			topic.set(i, topics);
			return;
		}
	}
	
}
public void deleteTopic(String name) {
	topic.removeIf(t -> t.getName().equals(name));
	
}

}
