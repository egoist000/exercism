EXPECTED_BAKE_TIME = 40
PREPARATION_TIME = 2

def bake_time_remaining(elapsed_bake_time):
    """ I AM LAZY """
    return EXPECTED_BAKE_TIME - elapsed_bake_time

def preparation_time_in_minutes(layers):
    """ I AM LAZY """
    return layers * PREPARATION_TIME

def elapsed_time_in_minutes(layers, elapsed):
    """ I AM LAZY """
    return preparation_time_in_minutes(layers) + EXPECTED_BAKE_TIME - bake_time_remaining(elapsed)