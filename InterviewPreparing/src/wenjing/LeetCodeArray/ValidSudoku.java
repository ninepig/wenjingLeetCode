package wenjing.LeetCodeArray;

import java.util.HashMap;

/**
 * Created by yamengwenjing on 2016-11-21.
 */
public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {

        if(board == null){
            return false;
        }
        HashMap<Integer,Character> testHashMap = new HashMap<>();

        // for row test
        for(int i = 0 ; i<9;i++){
            testHashMap.clear();
            for(int j = 0 ; j<9 ;j++){
                if(board[i][j]!='.'){
                    if(testHashMap.containsValue(board[i][j])){
                        return false;
                    }
                    testHashMap.put(j,board[i][j]);
                }
            }
        }
        // for column TEST
        testHashMap.clear();
        for(int j = 0 ; j<9;j++){
            for(int i = 0 ; i<9 ;i++){
                if(board[i][j]!='.'){
                    if(testHashMap.containsValue(board[i][j])){
                        return false;
                    }
                    testHashMap.put(i,board[i][j]);
                }
            }
        }
        //for subset TEST
        testHashMap.clear();

    //we have 9 block
        for(int block = 0; block<9;block++){
            testHashMap.clear();
            //use a trick to get each block's row number
            for(int i=block/3*3;i<block/3*3+3;i++){
                //use a trick to get each block's colomn number
                for(int j=block/3*3;j<block/3*3+3;j++){
                    if(board[i][j]!='.'){
                        if(testHashMap.containsValue(board[i][j])){
                            return false;
                        }
                        // from 0--8 as key
                        testHashMap.put(board[i][j]-'0',board[i][j]);
                    }
                }
            }

        }
//        for(int block = 0;block<9;block++){
//            //每一个空格没有清理缓存。造成了问题
//            testHashMap.clear();
//            for(int i = block/3*3;i<block/3*3+3;i++){
//                for(int j = block%3*3;j<block%3*3+3;j++){
//                    if(board[i][j]!='.'){
//                        if(testHashMap.containsValue(board[i][j])){
//                            return false;
//                        }
//
//                        testHashMap.put(board[i][j]-'0', board[i][j]);
//
//                    }
//
//                }
//            }
//        }


        //if pass all test
        return  true;
    }

}
