/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.puffinz.utils.util;

import static org.junit.Assert.assertTrue;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {
	@Test 
    public void testDateUtil() {
        DateUtil dateUtil = new DateUtil();
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String today = sdf.format(new Date());
        assertTrue("getDateToday : ", today.equals(dateUtil.getDate(pattern)));
    }
}