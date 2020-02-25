'''
Task annouciation

Given a time in -hour AM/PM format, convert it to military (24-hour) time.
Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM
on a 12-hour clock, and 12:00:00 on a 24-hour clock.
Input Format
A single string containing a time in -hour clock format (i.e.: or ), where
and .
Output Format
Convert and print the given time in -hour format, where .
Sample Input
07:05:45PM
Sample Output
19:05:45
'''

import re
#
# Complete the timeConversion function below.
#
def timeConversion(s):
    # Starts with 12 (hh = 12) and ends with AM
    x = re.search("^12.*AM$" ,s)
    if x:
        return '00:' + (s[3:-2])
    # Ends with AM
    x = re.search("AM$",s)
    if x:
        return s[:-2]
    # Starts with 12 and ends with PM
    x = re.search("^12.*PM$",s)
    if x:
        return s[:-2]
    x = re.search("PM$",s)
    if x:
        hour = str(int(s[:2]) + 12)
        return hour + (s[2:-2])
