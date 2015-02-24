package com.fauker.news.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotEmpty;

import com.fauker.news.util.Repository;

@Entity
public class Comment extends Repository {

	private static final long serialVersionUID = -4314020193000514105L;
	
	@Id
	private Long id;
	
	@NotEmpty
	private String content;
	
	@ManyToOne
	private News news;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public News getNews() {
		return news;
	}

	public void setNews(News news) {
		this.news = news;
	}
}
