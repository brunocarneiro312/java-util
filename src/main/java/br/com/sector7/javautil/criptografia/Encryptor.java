package br.com.sector7.javautil.criptografia;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;


/**
 * -------------------------------------------------------
 * Classe utilitária que concentra métodos de criptografia
 * -------------------------------------------------------
 * @author bruno.carneiro
 */
public class Encryptor
{
    private static final String MD5  = "MD5";
    private static final String SHA1 = "SHA1";

    /**
     * -----------------------
     * Converte texto para MD5
     * -----------------------
     */
    public static String toMD5(String text)
    {
        try
        {
            return digest(text, MD5);
        }
        catch (NoSuchAlgorithmException e)
        {
            e.printStackTrace();
            System.out.println("Não foi possível gerar uma instância do algorítimo MD5.");
        }
        return text;
    }

    /**
     * ------------------------------------------
     * Compara se texto possui a mesma MD5 gerada
     * ------------------------------------------
     */
    public static boolean fromMD5(String text, String md5)
    {
        /**
         * O algoritmo MD5 é unidirecional,
         * sendo assim, a única forma de verificar se o texto
         * corresponde à hash informada é através de comparação
         */
        return md5.equals(toMD5(text));
    }

    /**
     * ------------------------
     * Converte texto para SHA1
     * ------------------------
     */
    public static String toSHA1(String text)
    {
        try
        {
            return digest(text, SHA1);
        }
        catch (NoSuchAlgorithmException e)
        {
            e.printStackTrace();
            System.out.println("Não foi possível gerar uma instância do algorítimo SHA1.");
        }
        return text;
    }

    /**
     * -------------------------------------------
     * Compara se texto possui a mesma SHA1 gerada
     * -------------------------------------------
     */
    public static boolean fromSHA1(String text, String sha1)
    {
        /**
         * O algorítmo SHA1 é igualmente unidirecional,
         * sendo necessário comparar o texto com a hash
         * para verificar se são correspondentes
         */
        return sha1.equals(toSHA1(text));
    }

    /**
     * --------------------------
     * Converte texto para base64
     * --------------------------
     */
    public static String toBase64(String text)
    {
        try
        {
            return Base64.getEncoder().encodeToString(text.getBytes());
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Erro> Não foi possível realizar a conversão para base64");
        }
        return text;
    }

    /**
     * --------------------------
     * Converte base64 para texto
     * --------------------------
     */
    public static String fromBase64(String base64)
    {
        try
        {
            byte [] base64decoded = Base64.getDecoder().decode(base64.getBytes());
            return new String(base64decoded);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Erro> Não foi possível realizar a conversão para base64");
        }
        return base64;
    }

    /**
     * ---------------------------------------------------
     * Aplica algoritmo de criptografia à String informada
     * ---------------------------------------------------
     */
    private static String digest(String text, String algoritmo) throws NoSuchAlgorithmException
    {
        MessageDigest md;
        byte [] digest;

        md = MessageDigest.getInstance(algoritmo);
        md.update(text.getBytes());

        digest = md.digest();
        String sha1hash = DatatypeConverter.printHexBinary(digest);

        return sha1hash.toLowerCase();
    }
}