package br.edu.ifsp.livro;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Leitura {

	public void lerArquivo() throws IOException {
		InputStream is = new FileInputStream("k:/Arquivos/meioambiente.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String linha = br.readLine();
		while (linha != null) {
			//String linhaAux = new String();
			String caracteres = " #@_\\/,.*()";
			String[] palavras = linha.split("[" + Pattern.quote(caracteres)
					+ "]");
			for (String string : palavras) {
				System.out.println(string + " ");
			}
			linha = br.readLine();
		}
	br.close();
	}

}
