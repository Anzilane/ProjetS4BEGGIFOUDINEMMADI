import java.util.Scanner;

public class Player {

	private Piece.PieceColor color;
	private String lastName;
	private String firstName;
	private String email;
	private Board board; //the board the player is playing on
	private Scanner input;

	public Player(Piece.PieceColor color, String lastName, String firstName,
				  String email, Board board){
		this.color = color;
		this.lastName = lastName;
		this.firstName = firstName;
		this.email = email;
		this.board = board;
		this.input = new Scanner(System.in);
	}

	public Piece.PieceColor getColor(){
		return color;
	}

	public String getColorName(){
		if (color == Piece.PieceColor.BLACK)
			return "(*) BLACK ";
		else
			return "(o) WHITE ";
	}

	public String getLastName(){
		return lastName;
	}

	public String getFirstName(){
		return firstName;
	}

	public String getEmail(){
		return email;
	}

	public Board getBoard(){
		return board;
	}

	public Coordinates enterCoordinates(){
		Coordinates coord;
		int x;
		int y;
		System.out.println("\n" + getColorName() + "player, where do you want to put your piece?");
		System.out.print("x = ");
		x = input.nextInt();
		while(x < 0 || x >= board.getBoardSize()){
			System.out.println("Please enter a number between 0 and " + (board.getBoardSize()-1));
			System.out.print("x = ");
			x = input.nextInt();
		}

		System.out.print("y = ");
		y = input.nextInt();
		while(y < 0 || y >= board.getBoardSize()){
			System.out.println("Please enter a number between 0 and " + (board.getBoardSize()-1));
			System.out.print("y = ");
			y = input.nextInt();
		}
		
		coord = new Coordinates(x, y);
		return coord;
	}

	public void placePiece(){
		Coordinates coord = enterCoordinates();
		int pos = coord.calcPosition(coord.getXCoord(), coord.getYCoord(), board.getBoardSize());
		if (! board.getHex(pos).isFull()){
			board.getHex(pos).getPiece().setColor(color);
		}else{
			System.out.println("That spot already has a piece on it");
			while(board.getHex(pos).isFull()){
				coord = enterCoordinates();
				pos = coord.calcPosition(coord.getXCoord(), coord.getYCoord(), board.getBoardSize());
			}
			board.getHex(pos).getPiece().setColor(color);
		}
	}
	
	public static Piece.PieceColor quiJoue(boolean joueur){
		return joueur ? Piece.PieceColor.BLACK : Piece.PieceColor.WHITE;
	}

	public static void main(String[] args) {
		boolean joueur = true;
		// Board board = new Board(5);
		Board board = InterfaceAvecC.nativeInitBoard(5);
		Player b = new Player(Piece.PieceColor.BLACK, "turner", "guy", "guy@truc.com", board);
		Player w = new Player(Piece.PieceColor.WHITE, "miller", "pam", "pam@thing.fr", board);

		board.printBoard();

		Player p;
		int i = 0;
		while(i < board.getNbHexes()){
			Piece.PieceColor color = quiJoue(joueur);

			if (color == Piece.PieceColor.BLACK)
				p = b;
			else
				p = w;

			p.placePiece();
			p.board.printBoard();
			joueur = !joueur;
		}
	}	
}