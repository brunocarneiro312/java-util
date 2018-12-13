package br.com.sector7.javautil.date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class DateParserTest
{
    @Before
    public void setUp() throws Exception
    {

    }

    @Test
    public void given_strDate_when_stringToDate_then_return_dateFormatted()
    {
        // Given
        String strDate = "29/29/1987";

        // When
        Date responseDate = DateParser.stringToDate(strDate, "dd/MM/yyyy");

        // Then
        Assert.assertEquals(612414000000L, responseDate.getTime());
    }
}