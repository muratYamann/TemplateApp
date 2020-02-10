package com.yaman.core.utils

import java.text.SimpleDateFormat
import java.util.*
import java.util.regex.Matcher
import java.util.regex.Pattern

object DateUtil {

    fun formatterDate(expireTime: String): Long {

        val pattern: Pattern = Pattern.compile("(.*)([\\+|\\-]\\d{2}:\\d{2})")
        val matcher: Matcher = pattern.matcher(expireTime)

        val sdf = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault())
        sdf.timeZone = TimeZone.getTimeZone("UTC" + matcher.group(2))
        val dateConvert = sdf.parse(matcher.group(1))


        return dateConvert.time - System.currentTimeMillis()
    }

    fun controlDate(): Boolean {

        val date = getCurrentDateTime()
        val dateInString = date.toString(
                "yyyy-MM-dd")
        val nowDate = "2020-01-12"

        val formatter = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
        formatter.timeZone = TimeZone.getTimeZone("UTC")

        val curretDate = formatter.parse(dateInString)
        val goalDate = formatter.parse(nowDate)

        return goalDate.before(curretDate)
    }

    private fun Date.toString(format: String, locale: Locale = Locale.getDefault()): String {
        val formatter = SimpleDateFormat(format, locale)
        return formatter.format(this)
    }

    private fun getCurrentDateTime(): Date {
        return Calendar.getInstance().time
    }


}