package com.question;

import java.util.List;
import java.util.Set;

public class ListDemo {

	private Set<Question> answers;

	public Set<Question> getAnswers() {
		return answers;
	}

	public void setAnswers(Set<Question> answers) {
		this.answers = answers;
	}
	public void show()
	{
		for(Question s:answers)
		{
			System.out.println(s.getQuestion()+" "+s.getAnswers());
		}
	}
}
