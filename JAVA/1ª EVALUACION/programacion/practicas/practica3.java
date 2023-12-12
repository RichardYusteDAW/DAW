import java.util.Random;
import java.util.Scanner;

public class practica3 {
    static Scanner in = new Scanner(System.in);
    static final int BOUTNUMBER = 6;
    static final int BOARDSIZE = 8;
    static final int TOTALTRIES = BOARDSIZE*BOARDSIZE;
    static int tries = 0; 
    static int[][] intialBoard;
    static int op, row, column;

    static int randomNumber(){
        Random random = new Random();
        return random.nextInt(1, BOARDSIZE);
    }

    static void randomBoard(){
        intialBoard = new int[BOARDSIZE][BOARDSIZE];
        int cont = 0;
        int randomRow, randomColumn;

        while (cont < BOUTNUMBER) {
            randomRow=randomNumber();
            randomColumn=randomNumber();
            if (intialBoard[randomRow][randomColumn] == 1) {
                continue;
            } else{
                intialBoard[randomRow][randomColumn] = 1;
                cont++;
            }
        }
        //return intialBoard;
    }

    static void showBoard(int[][] board){
        for (int[] x : board) {
           for (int y : x) {
                if (y == 0 || y == 1){
                    System.out.print("( )");
                }else if (y == 2){
                    System.out.print("(O)");
                }else{
                    System.out.print("(X)");
                }
           }
           System.out.println();
        }
    }

    static int[][] modifiedBoard(){
        if (intialBoard[row][column] == 0){
            intialBoard[row][column] = 2;
        } else{
            intialBoard[row][column] = 3;
        }
        return intialBoard;
    }

    static void showMenu(){
        System.out.print("1. Disparar\n" + "0. Salir\n" + "Opcion: ");
        op=in.nextInt();
    }
    
    static boolean checkBoard(){
        int cont = 0;
        for (int i = 0; i < intialBoard.length; i++) {
            for (int j = 0; j < intialBoard[i].length; j++) {
                if (intialBoard[i][j]==3){
                    cont ++;
                }
            }
        }
        if (cont == BOUTNUMBER){
            return true;
        }
        return false;
    }

    static boolean checkCell(){
        if (row>BOARDSIZE-1 || row<0 || column>BOARDSIZE-1 || column<0 || intialBoard[row][column]==2 || intialBoard[row][column]==3){
            return false;
        }
        return true;
    }

    static void errors(){
        if (row>BOARDSIZE-1 || row<0 || column>BOARDSIZE-1 || column<0){
            if (row>BOARDSIZE-1 || row<0){
                System.out.println("\u001B[31mEsa fila no existe!!!\u001B[0m");
            }
            if (column>BOARDSIZE-1 || column<0){
                System.out.println("\u001B[31mEsa columna no existe!!!\u001B[0m");
            }
        }else{
            if(intialBoard[row][column]==2 || intialBoard[row][column]==3){
                System.out.println("\u001B[31mCelda abierta!!!\u001B[0m");
            }
        }
    }

    static boolean checkTries(){
        return tries >= TOTALTRIES ? true : false;
    }

    public static void main(String[] args) {
        showBoard(randomBoard());
        
        do {
            System.out.println();
            showMenu();
            
            if(op == 1){
                System.out.print("Dime un fila: ");
                row = in.nextInt()-1;
                System.out.print("Dime un columna: ");
                column = in.nextInt()-1;
                if (checkCell()){
                    showBoard(modifiedBoard());
                    tries ++;
                    if (checkBoard()){
                        System.out.println("\u001B[34mHas encontrado todos los barcos!!!\u001B[0m");
                        break;
                    }
                    if (checkTries()) {
                        System.out.println("\u001B[31mHas superado el numero de intentos!!!\u001B[0m");
                        System.exit(0);
                    }
                } else{
                    errors();
                }
            }

        } while (op != 0);
    }
}