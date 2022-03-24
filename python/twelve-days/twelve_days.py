DAYS = {
    1: "first",
    2: "second",
    3: "third",
    4: "fourth",
    5: "fifth",
    6: "sixth",
    7: "seventh",
    8: "eighth",
    9: "ninth",
    10: "tenth",
    11: "eleventh",
    12: "twelfth"
}

NUMBERS = {
    1: "a",
    2: "two",
    3: "three",
    4: "four",
    5: "five",
    6: "six",
    7: "seven",
    8: "eight",
    9: "nine",
    10: "ten",
    11: "eleven",
    12: "twelve"
}

GIFTS = [
    "Partridge in a Pear Tree", "Turtle Doves", "French Hens", "Calling Birds",
    "Gold Rings", "Geese-a-Laying", "Swans-a-Swimming", "Maids-a-Milking",
    "Ladies Dancing", "Lords-a-Leaping", "Pipers Piping", "Drummers Drumming"
]


def recite_single_verse(verse):
    t1 = f"On the {DAYS[verse]} day of Christmas my true love gave to me:"
    res = []
    i = verse
    while i != 0:
        if i == 1 and verse == 1:
            res.append(f"{NUMBERS[1]} {GIFTS[0]}.")
        elif i == 1 and verse != 1:
            res.append(f"and {NUMBERS[1]} {GIFTS[0]}.")
        else:
            res.append(f"{NUMBERS[i]} {GIFTS[i - 1]},")
        i -= 1
    res.insert(0, t1)
    return " ".join(res)


def recite(start_verse, end_verse):
    i = start_verse
    res = []
    while i <= end_verse:
        res.append(recite_single_verse(i))
        i += 1
    return res
