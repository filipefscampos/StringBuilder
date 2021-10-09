package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	private static SimpleDateFormat sdf1 = 
			new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
	
	private Date momentoDoPost;
	private String titulo;
	private String conteudo;
	private Integer likes;
	
	private List<Comentario> comentarios = new ArrayList<>();
	
	public Post() {
		
	}

	public Post(Date momentoDoPost, String titulo, String conteudo, Integer likes) {
		this.momentoDoPost = momentoDoPost;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.likes = likes;
	}

	public Date getMomentoDoPost() {
		return momentoDoPost;
	}

	public void setMomentoDoPost(Date momentoDoPost) {
		this.momentoDoPost = momentoDoPost;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comentario> getComentario() {
		return comentarios;
	}
	
	public void addComentario(Comentario comentario) {
		comentarios.add(comentario);
	}
	
	public void removeComentario(Comentario comentario) {
		comentarios.remove(comentario);
	}

	//StringBuilder é uma classe que te permite adicionar strings para
	//uma melhor apresentação, e melhora o uso da memoria
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(titulo + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf1.format(momentoDoPost) + "\n");
		sb.append(conteudo + "\n");
		sb.append("Comentario: \n");
		for (Comentario c : comentarios) {
			sb.append(c.getComentario() + "\n");
		}
		
		return sb.toString();
	}	
}
