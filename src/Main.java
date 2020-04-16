public class Main {
    enum xPos{
        a,b,c,d,e,f,g,h
    }

    public static void main(String[] args) {
        //Init of some chess pieces
        ChessPiece pawn_1 = new Pawn("pawn", "black", xPos.a, 2);
        ChessPiece knight_1 = new Knight("knight", "white", xPos.b,2);
        ChessPiece bishop_1 = new Bishop("bishop", "black", xPos.c,5);
        ChessPiece queen_1 = new Queen();
        pawn_1.move(xPos.a,3);
        bishop_1.move(xPos.a,3);
        knight_1.move(xPos.a,3);

    }


    //Interface used to implement strategy pattern
    public interface ChessPiece{
        public void move(xPos x_input, int y_input);
    }



    public static class Pawn implements ChessPiece{
        private String pieceName;
        private String color;
        private xPos x_position;
        private int y_position;
        private boolean play;
        //empty constructor used to initialize the ChessPiece with default values
        Pawn(){
            this.pieceName = null;
            this.color = null;
            this.x_position = null;
            this.y_position = 1;
            this.play = false;
        }
        // constructor with 4 parameters used to create the new object
        Pawn(String name, String color_input, xPos x_input, int y_input){
            this.pieceName = name;
            this.color = color_input;
            this.x_position = x_input;
            this.y_position = y_input;
            this.play = true;
        }

        @Override public void move(xPos user_x, int user_y){
            if((user_x.ordinal() == x_position.ordinal()) && (user_y - y_position)==1)
                System.out.println(pieceName+" at "+x_position.toString().toUpperCase()+" , "+y_position+" can move to "
                        +user_x.toString().toUpperCase()+" , "+ user_y);
            else
                System.out.println("Move not possible");
        }
    }

    public static class Knight implements ChessPiece{
        private String pieceName;
        private String color;
        private xPos x_position;
        private int y_position;
        private boolean play;
        //empty constructor used to initialize the ChessPiece with default values
        Knight(){
            this.pieceName = null;
            this.color = null;
            this.x_position = null;
            this.y_position = 1;
            this.play = false;
        }
        // constructor with 4 parameters used to create the new object
        Knight(String name, String color_input, xPos x_input, int y_input){
            this.pieceName = name;
            this.color = color_input;
            this.x_position = x_input;
            this.y_position = y_input;
            this.play = true;
        }

        @Override public void move(xPos user_x, int user_y){
            if((user_x.ordinal() == x_position.ordinal()) && (user_y - y_position)==1)
                System.out.println(pieceName+" at "+x_position.toString().toUpperCase()+" , "+y_position+" can move to "+user_x.toString().toUpperCase()+" , "+ user_y);
            else
                System.out.println("Move not possible");
        }
    }

    public static class Bishop implements ChessPiece{
        private String pieceName;
        private String color;
        private xPos x_position;
        private int y_position;
        private boolean play;
        //empty constructor used to initialize the ChessPiece with default values
        Bishop(){
            this.pieceName = null;
            this.color = null;
            this.x_position = null;
            this.y_position = 1;
            this.play = false;
        }
        // constructor with 4 parameters used to create the new object
        Bishop(String name, String color_input, xPos x_input, int y_input){
            this.pieceName = name;
            this.color = color_input;
            this.x_position = x_input;
            this.y_position = y_input;
            this.play = true;
        }

        @Override public void move(xPos user_x, int user_y){
            if(Math.abs(user_x.ordinal() - x_position.ordinal()) == Math.abs(user_y - y_position))
                System.out.println(pieceName+" at "+x_position.toString().toUpperCase()+" , "+y_position+" can move to "+user_x.toString().toUpperCase()+" , "+ user_y);
            else
                System.out.println("Move not possible");
        }
    }

    public static class Queen implements ChessPiece{
        private String pieceName;
        private String color;
        private xPos x_position;
        private int y_position;
        private boolean play;
        //empty constructor used to initialize the ChessPiece with default values
        Queen(){
            this.pieceName = null;
            this.color = null;
            this.x_position = null;
            this.y_position = 1;
            this.play = false;
        }
        // constructor with 4 parameters used to create the new object
        Queen(String name, String color_input, xPos x_input, int y_input){
            this.pieceName = name;
            this.color = color_input;
            this.x_position = x_input;
            this.y_position = y_input;
            this.play = true;
        }
        @Override public void move(xPos user_x, int user_y){
            if((user_x.ordinal() == x_position.ordinal()) || (user_y == y_position) || Math.abs(user_x.ordinal() - x_position.ordinal()) == Math.abs(user_y - y_position))
                System.out.println(pieceName+" at "+x_position.toString().toUpperCase()+" , "+y_position+" can move to "+user_x.toString().toUpperCase()+" , "+ user_y);
            else
                System.out.println("Move not possible");
        }
    }


}
