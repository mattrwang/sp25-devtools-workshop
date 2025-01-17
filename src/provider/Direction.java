package provider;

/**
 * This includes the directions.
 */
public enum Direction {
  NORTH,
  SOUTH,
  EAST,
  WEST;

  /**
   * Accounts for the opposite directions.
   */
  public Direction opposite() {
    switch (this) {
      case NORTH: return SOUTH;
      case SOUTH: return NORTH;
      case EAST: return WEST;
      case WEST: return EAST;
      default: throw new IllegalArgumentException("invalid direction: " + this);
    }
  }
}
