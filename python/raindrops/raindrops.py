FACTORS = {3: 'Pling', 5: 'Plang', 7: 'Plong'}


def convert(number):
    res = ''
    for fact in FACTORS:
        if number % fact == 0:
            res = res + FACTORS[fact]
    return res if res else f'{number}'
