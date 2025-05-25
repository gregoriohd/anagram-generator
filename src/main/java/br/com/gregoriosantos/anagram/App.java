package br.com.gregoriosantos.anagram;

import java.util.List;

import static br.com.gregoriosantos.anagram.util.AnagramGenerator.*;

/**
 * Classe principal de demonstração para geração de anagramas.
 * <p>
 * Esta classe contém um método {@code main} que exemplifica o uso da classe
 * {@link br.com.gregoriosantos.anagram.util.AnagramGenerator} para gerar e
 * exibir anagramas de uma palavra específica.
 * </p>
 * 
 * @author Gregorio Santos
 * @version 1.0
 * @see br.com.gregoriosantos.anagram.util.AnagramGenerator
 * @since 1.0
 */
public class App {
	/**
	 * Ponto de entrada da aplicação para demonstração da geração de anagramas.
	 * <p>
	 * Gera todos os anagramas possíveis da palavra "abc"
	 * </p>
	 * 
	 * @param args Argumentos de linha de comando (não utilizados)
	 * 
	 * <p><b>Exemplo de saída:</b></p>
	 * 
	 * <pre>{@code
	 * Anagramas de 'abc': [acb, bca, abc, cba, bac, cab]
	 * }</pre>
	 * 
	 * @see br.com.gregoriosantos.anagram.util.AnagramGenerator#generateAnagrams(String)
	 */
	public static void main(String[] args) {
		List<String> anagrams = generateAnagrams("abc");
		System.out.println("Anagramas de 'abc': " + anagrams);
	}
}
