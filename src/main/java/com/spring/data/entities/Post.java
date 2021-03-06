package com.spring.data.entities;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
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

	@Enumerated(EnumType.STRING)
	private PostType postType;

	@Formula("datediff('DAY',post_date,curdate())")
	int ageDay;	

	@Formula("CASEWHEN(HOUR(post_date)>12,HOUR(post_date)-12,HOUR(post_date))")
	int ageHour;	

	@Formula("MINUTE(post_date)")
	int ageMinute;	

	@Formula("CASEWHEN(HOUR(post_date)>=12,'PM','AM')")
	String  amPm;


	@ElementCollection(fetch=FetchType.EAGER)
	@CollectionTable(name="POST_COMMENT", joinColumns=@JoinColumn(name="POST_ID"))
	@Column(name="NAME")
	private Set<String> commentsBy =  new HashSet<String>();


	@ElementCollection(fetch=FetchType.EAGER)
	@CollectionTable(name="POST_LIKE", joinColumns=@JoinColumn(name="POST_ID"))
	@MapKeyColumn(name="POSITION_TYPE")
	@Column(name="NAME")
	private Map<String,String> likeBy =  new HashMap<String,String>();

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



	public Set<String> getCommentsBy() {
		return commentsBy;
	}

	public void setCommentsBy(Set<String> commentsBy) {
		this.commentsBy = commentsBy;
	}




	public Map<String, String> getLikeBy() {
		return likeBy;
	}

	public void setLikeBy(Map<String, String> likeBy) {
		this.likeBy = likeBy;
	}



	public PostType getPostType() {
		return postType;
	}

	public void setPostType(PostType postType) {
		this.postType = postType;
	}

	@Override
	public String toString() {
		return "Post [postId=" + postId + ", title=" + title + ", postDate=" + postDate + ", postType=" + postType
				+ ", ageDay=" + ageDay + ", ageHour=" + ageHour + ", ageMinute=" + ageMinute + ", amPm=" + amPm
				+ ", commentsBy=" + commentsBy + ", likeBy=" + likeBy + "]";
	}


}
