import re

def is_isogram(string):
    return not re.search(r"([^- ])?.*\1", string.lower())
