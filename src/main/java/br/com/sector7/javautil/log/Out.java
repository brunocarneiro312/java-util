package br.com.sector7.javautil.log;

/**
 * ----------------------------------------
 * Classe utilitária para saídas no console
 * ----------------------------------------
 */
public class Out
{
    /**
     * -----------
     * Cria header
     * -----------
     */
    public static void printHeader(String text)
    {
        repeat("-", text.length());
        System.out.println(text);
        repeat("-", text.length());
    }

    /**
     * ----------------------------------
     * Cria header com caracter informado
     * ----------------------------------
     * @param text
     * @param repeatChar
     */
    public static void printHeader(String text, String repeatChar)
    {
        repeat(repeatChar, text.length());
        System.out.println(text);
        repeat(repeatChar, text.length());
    }

    /**
     * --------------------
     * Cria header espaçado
     * --------------------
     * @param text
     */
    public static void printSpacedHeader(String text)
    {
        System.out.println();
        printHeader(text);
        System.out.println();
    }

    /**
     * ---------------------------------------------
     * Cria header espaçado com o caracter informado
     * ---------------------------------------------
     * @param text
     */
    public static void printSpacedHeader(String text, String repeatChar)
    {
        System.out.println();
        printHeader(text, repeatChar);
        System.out.println();
    }

    /**
     * ---------------------
     * Printa texto tabulado
     * ---------------------
     * @param text
     */
    public static void tab(String text)
    {
        System.out.print("\t" + text);
    }

    /**
     * --------------------------------------------------
     * Repete um caracter pelo número de vezes informado,
     * printando-o em uma linha
     * --------------------------------------------------
     * @param repeatChar: caracter que será repetido
     * @param times: quantas vezes será repetido o caractér
     */
    private static void repeat(String repeatChar, int times)
    {
        for(int i = 0; i < times; i++)
        {
            System.out.print(repeatChar);
        }
        System.out.println();
    }
}
