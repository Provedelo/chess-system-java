package boardgame;

public class Board {
	
	private Integer rows;
	private Integer columns;
	private Piece[][] piece;
	
	public Board(Integer rows, Integer columns) {
		this.rows = rows;
		this.columns = columns;
		piece = new Piece [rows][columns];
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
	
}
