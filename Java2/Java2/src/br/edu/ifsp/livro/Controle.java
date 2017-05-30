package br.edu.ifsp.livro;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;





public class Controle {

	public static void main(String[] args) throws IOException {
		
		 Parametro p = new Parametro();
		 p.lerParametro();
		 
		 
		Leitura l = new Leitura();
		 l.lerArquivo();
		 
		 
		 File caminho = new File ("K:/Arquivos/organograma.pdf");
		 LeituraPdf pdf = new LeituraPdf();
		    String texto = pdf.extraiTextoDoPDF(caminho);
		    System.out.println(texto);
		
		 
		
		
		

}
}

