package entidades;

public class Comentario {
	
	private String comentario;
	
	public Comentario() {
		
	}
	
	public Comentario(String texto) {
		this.comentario = texto;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	@Override
	public String toString() {
		return "Comentario [comentario=" + comentario + "]";
	}	
}
