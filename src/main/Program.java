package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import entidades.Comentario;
import entidades.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		
		Comentario c1 = new Comentario("Viagem muito boa");
		Comentario c2 = new Comentario("Uao que massa");
		
		Post p1 = new Post(sdf1.parse("08/10/2021 07:44:02"), 
				"Viagem a Bahia",
				"Vamos para a BBMP", 
				12);
		
		p1.addComentario(c1);
		p1.addComentario(c2);
		
		System.out.println(p1);
		
		
		sc.close();

	}

}
