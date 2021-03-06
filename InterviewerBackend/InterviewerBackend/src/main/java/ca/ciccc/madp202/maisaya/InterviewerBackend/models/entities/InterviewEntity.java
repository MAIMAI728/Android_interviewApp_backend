package ca.ciccc.madp202.maisaya.InterviewerBackend.models.entities;
import java.util.Iterator;

import ca.ciccc.madp202.maisaya.InterviewerBackend.models.entities.Question;
import ca.ciccc.madp202.maisaya.InterviewerBackend.models.entities.Topic;

public class InterviewEntity implements Iterable<Question> {
	private int interviewid;
	private int questions;
	private int duration;
	private Topic topic;
	private Question[] interviewQuestions;
	
	public InterviewEntity() {
	}

	public InterviewEntity(int interviewid, int questions, int duration, Topic topic, Question[] interviewQuestions) {
		this.interviewid = interviewid;
		this.questions = questions;
		this.duration = duration;
		this.topic = topic;
		this.interviewQuestions = interviewQuestions;
	}
	

	public int getInterviewid() {
		return interviewid;
	}
	public void setInterviewid(int interviewid) {
		this.interviewid = interviewid;
	}
	public int getQuestions() {
		return questions;
	}
	public void setQuestions(int questions) {
		this.questions = questions;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	public Question[] getInterviewQuestions() {
		return interviewQuestions;
	}
	public void setInterviewQuestions(Question[] interviewQuestions) {
		this.interviewQuestions = interviewQuestions;
	}
	
	@Override
    public Iterator<Question> iterator() {
        return new QuestionIterator(interviewQuestions);
    }
	
}
