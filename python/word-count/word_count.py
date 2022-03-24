import re
import string

def count_words(sentence):
    w2c = dict()
    sentence_cleaned = re.sub(r"[,_]", ' ', sentence).strip().lower()
    words = re.split(r"\s+", sentence_cleaned)
    words_cleaned = [w.strip(string.punctuation) for w in words]
    for w in words_cleaned:
        if w in w2c:
            w2c[w] += 1
        else:
            w2c[w] = 1
    return w2c 

