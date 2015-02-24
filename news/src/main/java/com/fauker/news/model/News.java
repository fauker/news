package com.fauker.news.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.fauker.news.util.Paginator;
import com.fauker.news.util.Repository;

@Entity
public class News extends Repository {

	private static final long serialVersionUID = 8124220365098903377L;
	
	@Id
	private Long id;
	
	@NotEmpty
	private String title;
	
	@NotEmpty
	private String description;
	
	@NotNull
	@ManyToOne
	private User author;
	
	@SuppressWarnings("unchecked")
	public static List<News> findAll(Paginator paginator) {
		return findAllWithPaginator(News.class, paginator, "datecreated");
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

}
