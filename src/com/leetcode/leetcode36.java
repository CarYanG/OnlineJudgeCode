package com.leetcode;

/**
 * Created by carl on 2016/9/3.
 *
 * Valid Sudoku
 * 判断一个数据矩阵是否是有效的，
 * 即判断数独的每一行，每一列，每一个九宫格是不是1-9只出现一次，此处的九宫格不是任意的九宫格，而是数独中按顺序排列的九宫格
 *
 */
public class leetcode36 {

    public boolean isValidSudoku(char[][] board) {

        if (board.length<9)return false;

        for(int i=0;i<9;i++){
            int row[]=new int[9];
            int col[]=new int[9];
            for(int j=0;j<9;j++){

                if(board[i][j]!='.'){
                    if(row[board[i][j]-'1']>0){
                        return false ;  //出现重复项
                    }

                    else{
                        row[board[i][j]-'1']++;
                    }
                }

                if(board[j][i]!='.'){
                    if(col[board[j][i]-'1']>0){
                        return false ;  //出现重复项
                    }

                    else{
                        col[board[j][i]-'1']++;
                    }
                }

            }

        }


        for(int i=0;i<9;i=i+3){

            for(int j=0;j<9;j=j+3){
                int blocks[]=new int[9];
                for(int a = 0; a < 3; a++)
                    for(int b= 0; b < 3; b++)
                        if(board[i+a][j+b] != '.')
                        {
                            if(blocks[board[i+a][j+b]-'1']>0)return false;
                            else blocks[board[i+a][j+b]-'1']++;
                        }

            }

        }

        return true;
    }
}



/**
 * Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.

 The Sudoku board could be partially filled, where empty cells are filled with the character '.'.


 A partially filled sudoku which is valid.

 Note:
 A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated.

 */