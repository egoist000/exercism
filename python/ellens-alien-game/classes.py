"""Solution to Ellen's Alien Game exercise."""


class Alien:
    """Create an Alien object with location x_coordinate and y_coordinate.

    Attributes
    ----------
    (class)total_aliens_created: int
    x_coordinate: int - Position on the x-axis.
    y_coordinate: int - Position on the y-axis.
    health: int - Amount of health points.

    Methods
    -------
    hit(): Decrement Alien health by one point.
    is_alive(): Return a boolean for if Alien is alive (if health is > 0).
    teleport(new_x_coordinate, new_y_coordinate): Move Alien object to new coordinates.
    collision_detection(other): Implementation TBD.
    """

    STARTING_HEALTH = 3

    total_aliens_created = 0

    x_coordinate = 0
    y_coordinate = 0
    health = STARTING_HEALTH

    def __init__(self, x, y) -> None:
        self.x_coordinate = x
        self.y_coordinate = y
        type(self).total_aliens_created += 1

    def hit(self) -> None:
        self.health -= 1

    def is_alive(self) -> bool:
        return self.health > 0

    def teleport(self, new_x, new_y):
        self.x_coordinate = new_x
        self.y_coordinate = new_y

    def collision_detection(self, other):
        False if not isinstance(
            self, type(other)
        ) else self.x_coordinate == other.x_coordinate and self.y_coordinate == other.y_coordinate


def new_aliens_collection(alien_start_positions):
    aliens = []
    for pos in alien_start_positions:
        aliens.append(Alien(pos[0], pos[1]))
    return aliens
