package com.spring.data.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Formula;

@Entity
@Table(name="POST")
public class Post {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="POST_ID")
	Integer postId;

	@Column(name="TITLE")
	String title;

	@Column(name="POST_DATE")
	Date postDate;



	@Formula("datediff('DAY',post_date,curdate())")
	int ageDay;	

	@Formula("CASEWHEN(HOUR(post_date)>12,HOUR(post_date)-12,HOUR(post_date))")
	int ageHour;	

	@Formula("MINUTE(post_date)")
	int ageMinute;	

	@Formula("CASEWHEN(HOUR(post_date)>=12,'PM','AM')")
	String  amPm;


	public int getAgeDay() {
		return ageDay;
	}

	public void setAgeDay(int ageDay) {
		this.ageDay = ageDay;
	}

	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getPostDate() {
		return postDate;
	}

	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}



	public int getAgeHour() {
		return ageHour;
	}

	public void setAgeHour(int ageHour) {
		this.ageHour = ageHour;
	}

	public int getAgeMinute() {
		return ageMinute;
	}

	public void setAgeMinute(int ageMinute) {
		this.ageMinute = ageMinute;
	}

	public String getAmPm() {
		return amPm;
	}

	public void setAmPm(String amPm) {
		this.amPm = amPm;
	}

	@Override
	public String toString() {
		return "Post [postId=" + postId + ", title=" + title + ", postDate=" + postDate + ", ageDay=" + ageDay
				+ ", ageHour=" + ageHour + ", ageMinute=" + ageMinute + ", amPm=" + amPm + "]";
	}


}
