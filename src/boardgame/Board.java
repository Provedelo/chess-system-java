package boardgame;

public class Board {

	private Integer rows;
	private Integer columns;
	private Piece[][] pieces;

	public Board(Integer rows, Integer columns) {
		if (rows < 1 || columns < 1) {
			throw new BoardException("Error creating board, there must be at least 1 row and 1 column");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public Integer getColumns() {
		return columns;
	}

	public Integer getRows() {
		return rows;
	}

	public Piece piece(int row, int column) {// set piece in X and Y vector
		if (!positionExists(row, column)) {
			throw new BoardException("Position not on the board");
		}
		return this.pieces[row][column];
	}

	public Piece piece(Position position) { // return piece by position at X and Y vector
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		return this.pieces[position.getRow()][position.getColum()];
	}

	public void placePiece(Piece piece, Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardException("There is already a piece on position " + position);
		}
		this.pieces[position.getRow()][position.getColum()] = piece;
		piece.position = position;
	}
	
	public Piece removePiece (Position position) {
		if (!positionExists(position)){
			System.out.println("Position not on the board");
		}
		if (piece(position) == null) {
			return null;
		}
		Piece aux = piece(position);
		aux.position = null;
		pieces[position.getRow()][position.getColum()] = null;
		return aux;		
	}

	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && columns >= 0 && column < columns;
	}

	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColum());
	}

	public boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		return piece(position) != null;
	}
}
