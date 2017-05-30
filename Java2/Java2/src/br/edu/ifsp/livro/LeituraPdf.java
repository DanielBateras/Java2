package br.edu.ifsp.livro;

import java.io.*;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;


public class LeituraPdf {
	
	
	public static String extraiTextoDoPDF(File caminho) {
	    PDDocument pdfDocument = null;
	    try {
	      pdfDocument = PDDocument.load(caminho);
	      PDFTextStripper stripper = new PDFTextStripper();
	      String texto = stripper.getText(pdfDocument);
	      return texto;
	    } catch (IOException e) {
	      throw new RuntimeException(e);
	    } finally {
	      if (pdfDocument != null) try {
	        pdfDocument.close();
	      } catch (IOException e) {
	        throw new RuntimeException(e);
	      }
	    }
	  }

	  /**
	  *
	  * Extrai o conteudo do arquivo indicado
	  */
	

	  
	 /* public static void main(String[] args) {
	    String caminho = "K:/Arquivos/organograma.pdf";
	    String texto = extraiTextoDoPDF(caminho);
	    System.out.println(texto);*/
	    
	  }

	
	

	  
	
	


