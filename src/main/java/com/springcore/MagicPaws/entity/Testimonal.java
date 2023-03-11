package com.springcore.MagicPaws.entity;

public class Testimonal {
	private String review;
	private String t_name;
	@Override
	public String toString() {
		return "Testimonal [review=" + review + ", t_name=" + t_name + "]";
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public String getT_name() {
		return t_name;
	}
	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
	

}
