package br.com.sector7.javautil.criptografia;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptorTest
{
    private static final String HASH_TEXT   = "testehash";
    private static final String HASH_MD5    = "4f55795e4051eafaecbfa649f7962300";
    private static final String HASH_SHA1   = "68958593b2d0d81052c93af3e73c4273fb60c19a";
    private static final String HASH_BASE64 = "dGVzdGVoYXNo";

    @Test
    public void given_text_when_toMD5_then_returnMD5()
    {
        // given
        String text = HASH_TEXT;
        String md5;

        // when
        md5 = Encryptor.toMD5(text);

        // then
        Assert.assertEquals(HASH_MD5, md5);
    }

    @Test
    public void given_md5_when_fromMD5_then_returnBoolean()
    {
        // given
        String text = HASH_TEXT;

        // when
        boolean result = Encryptor.fromMD5(text, HASH_MD5);

        // then
        Assert.assertTrue(result);
    }

    @Test
    public void given_text_when_toSHA1_then_returnSHA1()
    {
        // given
        String text = HASH_TEXT;

        // when
        String sha1 = Encryptor.toSHA1(text);

        // then
        Assert.assertEquals(sha1, HASH_SHA1);
    }

    @Test
    public void given_sha1_when_fromSHA1_then_returnBoolean()
    {
        // given
        String text = HASH_TEXT;

        // when
        boolean result = Encryptor.fromSHA1(text, HASH_SHA1);

        // then
        Assert.assertTrue(result);
    }

    @Test
    public void given_text_when_toBase64_then_returnBase64()
    {
        // given
        String text = HASH_TEXT;

        // when
        String base64 = Encryptor.toBase64(text);

        // then
        Assert.assertEquals(base64, HASH_BASE64);
    }

    @Test
    public void given_base64_when_fromBase64_then_returnText()
    {
        // given
        String base64 = HASH_BASE64;

        // when
        String text = Encryptor.fromBase64(base64);

        // then
        Assert.assertEquals(text, HASH_TEXT);
    }
}
