package com.hi.mvcProject;

public class ServicecenterfaqVO {
	
	
	@Override
	public String toString() {
		return "faqVO [faqIdx=" + faqIdx + ", faqTitle=" + faqTitle + ", faqQuestion=" + faqQuestion + "]";
	}
	public int getFaqIdx() {
		return faqIdx;
	}
	public void setFaqIdx(int faqIdx) {
		this.faqIdx = faqIdx;
	}
	public String getFaqTitle() {
		return faqTitle;
	}
	public void setFaqTitle(String faqTitle) {
		this.faqTitle = faqTitle;
	}
	public String getFaqQuestion() {
		return faqQuestion;
	}
	public void setFaqQuestion(String faqQuestion) {
		this.faqQuestion = faqQuestion;
	}
	private int faqIdx;
	private String faqTitle;
	private String faqQuestion;

}
