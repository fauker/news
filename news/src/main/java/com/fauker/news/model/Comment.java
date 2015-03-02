package com.fauker.news.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Query;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import org.hibernate.validator.constraints.NotEmpty;

import com.fauker.news.util.Repository;

@Entity
@Table(name = "comment")
public class Comment extends Repository {

	private static final long serialVersionUID = -4314020193000514105L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	@NotEmpty
	private String content;
	
	@ManyToOne
	private News news;
	
	@SuppressWarnings("unchecked")
	public static List<Comment> findByIdNews(Long id) {
		Query q = getConnection().createQuery("FROM Comment c WHERE c.news.id = :id ORDER BY c.dateCreated");
		q.setParameter("id", id);
		
		return q.getResultList();
	}

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
