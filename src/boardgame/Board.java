package boardgame;

public class Board {
	
	private Integer rows;
	private Integer columns;
	private Piece[][] pieces;
	
	public Board(Integer rows, Integer columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece [rows][columns];
	}
	
	public Integer getColumns() {
		return columns;
	}
	public void setColumns(Integer columns) {
		this.columns = columns;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}
	
	public Piece piece (int row, int column) {//set piece in X and Y vector
		return this.pieces[row][column];
	}
	
	public Piece piece (Position position) { //return piece by position at X and Y vector
		return this.pieces[position.getRow()][position.getColum()];
	}
	
	public void placePiece(Piece piece, Position position) {
		this.pieces[position.getRow()][position.getColum()] = piece;
		piece.position = position;
	}
}
