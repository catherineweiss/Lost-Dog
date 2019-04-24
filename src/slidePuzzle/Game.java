package slidePuzzle;

public interface Game {
	
	/**
	 * Creates a random tree
	 * @return root of Quadtree
	 */
	public Tile createTree();
	
	/**
	 * Populates an int[][] array
	 * based on tree traversal
	 * @param t
	 */
	//public void populateBoard(Tile t);
	
	/**
	 * Randomly places the dog in a
	 * tile
	 * @return the tile in which the dog
	 * was placed
	 */
	public Tile placeDog();
	
	/**
	 * Randomly places the walker in a 
	 * tile
	 * @return the tile in which the walker
	 * was placed
	 */
	public Tile placeWalker();
	
	/**
	 * Traverses dis
	 * and prints the game board
	 * @param board
	 */
	public void printBoard();
	
}
