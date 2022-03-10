def create_inventory(items):
    """

    :param items: list - list of items to create an inventory from.
    :return:  dict - the inventory dictionary.
    """
    res = {}
    for item in items:
        if item in res:
            res[item] += 1
        else:
            res[item] = 1
    return res


def add_items(inventory, items):
    """

    :param inventory: dict - dictionary of existing inventory.
    :param items: list - list of items to update the inventory with.
    :return:  dict - the inventory dictionary update with the new items.
    """
    new_items = create_inventory(items)
    for k in new_items:
        try:
            inventory[k] += new_items[k]
        except KeyError:
            inventory[k] = new_items[k]
    return inventory


def decrement_items(inventory, items):
    """

    :param inventory: dict - inventory dictionary.
    :param items: list - list of items to decrement from the inventory.
    :return:  dict - updated inventory dictionary with items decremented.
    """
    for item in items:
        if inventory[item] != 0:
            inventory[item] -= 1
    return inventory


def remove_item(inventory, item):
    """
    :param inventory: dict - inventory dictionary.
    :param item: str - item to remove from the inventory.
    :return:  dict - updated inventory dictionary with item removed.
    """
    try:
        inventory.pop(item)
    except KeyError:
        pass
    return inventory


def list_inventory(inventory):
    """

    :param inventory: dict - an inventory dictionary.
    :return: list of tuples - list of key, value pairs from the inventory dictionary.
    """
    res = []
    for k in inventory:
        if inventory[k] > 0:
            res.append((k, inventory[k]))
    return res
