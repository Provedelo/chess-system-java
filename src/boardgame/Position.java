package boardgame;

public class Position {
	private Integer row;
	private Integer colum;
	
	public Position(Integer row, Integer colum) {
		this.row = row;
		this.colum = colum;
	}
	public Integer getRow() {
		return row;
	}
	public void setRow(Integer row) {
		this.row = row;
	}
	public Integer getColum() {
		return colum;
	}
	public void setColum(Integer colum) {
		this.colum = colum;
	}
	@Override
	public String toString() {
		return  row + ", " + colum;
	}
		
}
