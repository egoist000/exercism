from functools import reduce


def distance(strand_a, strand_b):
    try:
        return reduce(
            lambda acc, iv: acc + 1 #iv -> index, value of longest strand
            if strand_a[iv[0]] != strand_b[iv[0]] else acc + 0,
            enumerate(max(strand_a, strand_b, key=len)), 0)
    except IndexError:
        raise ValueError("Strands must be of equal length.")
