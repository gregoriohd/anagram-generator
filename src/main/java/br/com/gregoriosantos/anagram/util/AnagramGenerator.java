package br.com.gregoriosantos.anagram.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * Classe utilitária para gerar todos os anagramas possíveis de uma string. Um
 * anagrama é uma permutação das letras de uma palavra ou frase.
 * 
 * <p>
 * Esta implementação utiliza backtracking para gerar todas as permutações
 * possíveis dos caracteres da string de entrada, garantindo que cada anagrama
 * seja único mesmo que haja caracteres repetidos (embora o método atual valide
 * apenas entradas com caracteres distintos).
 * </p>
 * 
 * @author Gregorio Santos
 * @version 1.0
 */
public class AnagramGenerator {

    /**
     * Gera todos os anagramas únicos possíveis a partir de uma string.
     * 
     * @param input String contendo os caracteres a serem permutados (ex.: "abc")
     * @return Lista de strings, cada uma representando um anagrama único
     * @throws IllegalArgumentException Se a entrada for nula, vazia ou contiver
     *                                  caracteres não alfabéticos
     * @see #validateInput(String) Para detalhes sobre a validação da entrada
     * 
     * <pre>
     * {@code
     * List<String> anagrams = AnagramGenerator.generateAnagrams("abc");
     * // Resultado: ["abc", "acb", "bac", "bca", "cab", "cba"]
     * }
     * </pre>
     */
	public static List<String> generateAnagrams(String input) {

		validateInput(input);
		Set<String> resultSet = new HashSet<String>();
		char[] chars = input.toCharArray();
		boolean[] used = new boolean[chars.length];
		backtrack(chars, used, new StringBuilder(), resultSet);
		return new ArrayList<String>(resultSet);
	}

	/**
     * Método recursivo auxiliar que implementa o algoritmo de backtracking
     * para gerar as permutações dos caracteres.
     * 
     * @param chars Array de caracteres originais
     * @param used Array que controla quais caracteres já foram utilizados
     * @param current StringBuilder que armazena o anagrama em construção
     * @param result Conjunto que armazena os resultados únicos
     */
	private static void backtrack(char[] chars, boolean[] used, StringBuilder current, Set<String> result) {

		if (current.length() == chars.length) {
			result.add(current.toString());
			return;
		}

		for (int i = 0; i < chars.length; i++) {
			if (used[i])
				continue;

			used[i] = true;
			current.append(chars[i]);

			backtrack(chars, used, current, result);

			// Backtrack
			current.deleteCharAt(current.length() - 1);
			used[i] = false;
		}
	}

	/**
	 * Valida a string de entrada de acordo com as seguintes regras:
	 * <ul>
	 * <li>Não pode ser nula ou vazia</li>
	 * <li>Deve conter apenas caracteres alfabéticos (A-Z, a-z)</li>
	 * </ul>
	 * 
	 * @param input String a ser validada
	 * @throws IllegalArgumentException Se alguma das regras de validação for
	 *                                  violada
	 */
	private static void validateInput(String input) {
		if (Objects.isNull(input) || input.isEmpty()) {
			throw new IllegalArgumentException("A entrada não pode ser nula ou vazia.");
		}

		if (!input.matches("[a-zA-Z]+")) {
			throw new IllegalArgumentException(
					"A entrada deve conter apenas letras (sem espaços ou caracteres especiais).");
		}

	}
}