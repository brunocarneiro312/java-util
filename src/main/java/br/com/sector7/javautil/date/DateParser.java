package br.com.sector7.javautil.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateParser
{
    public static Date stringToDate(String strDate, String fmt)
    {
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        try
        {
            return sdf.parse(strDate);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
