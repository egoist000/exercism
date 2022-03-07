def get_coordinate(record):
    """

    :param record: tuple - a (treasure, coordinate) pair.
    :return: str - the extracted map coordinate.
    """
    return record[1]


def convert_coordinate(coordinate):
    """

    :param coordinate: str - a string map coordinate
    :return:  tuple - the string coordinate seperated into its individual components.
    """
    return (coordinate[0], coordinate[1])


def compare_records(azara_record, rui_record):
    """

    :param azara_record: tuple - a (treasure, coordinate) pair.
    :param rui_record: tuple - a (location, coordinate, quadrant) trio.
    :return: bool - True if coordinates match, False otherwise.
    """
    return get_coordinate(azara_record) == "".join(get_coordinate(rui_record))


def create_record(azara_record, rui_record):
    """

    :param azara_record: tuple - a (treasure, coordinate) pair.
    :param rui_record: tuple - a (location, coordinate, quadrant) trio.
    :return:  tuple - combined record, or "not a match" if the records are incompatible.
    """
    if compare_records(azara_record, rui_record):
        return (azara_record[0], get_coordinate(azara_record), rui_record[0], get_coordinate(rui_record), rui_record[2])
    else:
        return "not a match"

def clean_up(combined_record_group):
    """

    :param combined_record_group: tuple of tuples - everything from both participants.
    :return: string of tuples separated by newlines - everything "cleaned". Excess coordinates and information removed.
    """
    res = ""
    for rec in combined_record_group:
        res += "".join(f"{(rec[0], rec[2], rec[3], rec[4])}\n")
    return res
