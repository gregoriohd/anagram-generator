package br.com.gregoriosantos.anagram.util;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Arrays;

// Classe de teste para AnagramGenerator
public class AnagramGeneratorTest {

    // Testa se o método gera corretamente todos os anagramas de "abc"
    @Test
    void testGenerateAnagrams() {
        List<String> anagrams = AnagramGenerator.generateAnagrams("abc");

        List<String> expected = Arrays.asList(
                "abc", "acb", "bac", "bca", "cab", "cba"
        );

        // Verifica se a quantidade de anagramas está correta
        assertEquals(expected.size(), anagrams.size());

        // Verifica se todos os anagramas esperados estão na lista retornada
        assertTrue(anagrams.containsAll(expected));
    }

    // Testa o caso de uma única letra, onde só pode haver um anagrama possível
    @Test
    void testGenerateAnagramsWithSingleCharacter() {
        List<String> anagrams = AnagramGenerator.generateAnagrams("a");
        assertEquals(1, anagrams.size());
        assertEquals("a", anagrams.get(0)); // O único anagrama possível é "a"
    }

    // Testa quando a palavra tem letras repetidas ("aa")
    @Test
    void testGenerateAnagramsWithDuplicateCharacters() {
        List<String> anagrams = AnagramGenerator.generateAnagrams("aa");
        assertEquals(1, anagrams.size()); // Só existe "aa"
        assertEquals("aa", anagrams.get(0));
    }

    // Testa se o método lança exceção quando a entrada é nula
    @Test
    void testGenerateAnagrams_NullInput() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            AnagramGenerator.generateAnagrams(null); // Passa null como entrada
        });
        // Verifica se a mensagem de erro está correta
        assertEquals("A entrada não pode ser nula ou vazia.", exception.getMessage());
    }

    // Testa se o método lança exceção quando a entrada é uma string vazia
    @Test
    void testGenerateAnagrams_EmptyInput() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            AnagramGenerator.generateAnagrams(""); // Passa string vazia
        });
        // Verifica se a mensagem de erro está correta
        assertEquals("A entrada não pode ser nula ou vazia.", exception.getMessage());
    }

    // Testa se o método lança exceção quando a entrada contém caracteres inválidos (números, símbolos, etc.)
    @Test
    void testGenerateAnagrams_InvalidCharacters() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            AnagramGenerator.generateAnagrams("ab1"); // Inclui um número na entrada
        });
        // Verifica se a mensagem de erro está correta
        assertEquals("A entrada deve conter apenas letras (sem espaços ou caracteres especiais).", exception.getMessage());
    }
}

