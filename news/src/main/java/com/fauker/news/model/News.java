package com.fauker.news.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import org.hibernate.validator.constraints.NotEmpty;

import com.fauker.news.util.Paginator;
import com.fauker.news.util.Repository;

@Entity
@Table(name = "news")
public class News extends Repository {

	private static final long serialVersionUID = 8124220365098903377L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	@NotEmpty
	private String title;
	
	@NotEmpty
	private String description;
	
	private String author;
	
	@SuppressWarnings("unchecked")
	public static List<News> findAll(Paginator paginator) {
		return findAllWithPaginator(News.class, paginator, "datecreated");
	}
	
	public static News findById(Long id) {
		return findById(News.class, id);
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

	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	

}
