package br.edu.ifsp.livro;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Parametro {

	
		public void lerParametro() throws IOException{
			
			File files = new File("k:\\Arquivos");
			for (File file : files.listFiles()) {
				if (file.isFile()){
					System.out.println("Arquivo: " + file);
					
				}
				
				if (file.isDirectory()){
					System.out.println("Pasta: " + file);
					
				}
				
				String arq = file.getAbsolutePath();
				arq.endsWith(".txt");
				
			/*InputStream is = new FileInputStream("k:/parametros.txt");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String linha = br.readLine();
			
			while (linha != null) {
			       System.out.println(linha);
			 
			       linha = br.readLine(); 
			}*/
			
			
			}
			
		}
		
}

		
	

