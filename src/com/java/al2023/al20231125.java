package com.java.al2023;

import java.util.HashMap;

public class al20231125 {
    
    public int question1 (String[] friends, String[] gifts){
        int answer = 0;
        int[][] giftArr = new int[friends.length][friends.length];
        HashMap<String,Integer> friendsMap = new HashMap<String,Integer>();
        int[] giftCntArr = new int[friends.length];
        int[] digree = new int[friends.length];

        for(int i=0; i < friends.length; i++){
            friendsMap.put(friends[i], i);            
        }

        for(int i=0; i<gifts.length; i++){
            String[] giftsList = gifts[i].split(" ");            
            giftArr[friendsMap.get(giftsList[0])][friendsMap.get(giftsList[1])]++;
        }

        for(int i=0; i < giftArr.length; i++){
            for(int j=0; j < digree.length; j++){
                //준선물 - 받은선물            
                digree[j] += giftArr[j][i] - giftArr[i][j];            
            }
        }        

        for(int i=0; i<giftArr.length; i++){
            for(int j=0; j<giftArr[0].length; j++){
                //더 많이 준경우  
                if(giftArr[i][j] > giftArr[j][i]){
                    giftCntArr[i]++;
                //같아서 지수 비교
                }else if(giftArr[i][j] == giftArr[j][i]){
                    if(digree[i] > digree[j]){
                        giftCntArr[i]++;
                    }
                }                
            }
        }

        for(int i=0;i<giftCntArr.length; i++){
            answer = Math.max(answer,giftCntArr[i]);
        }
        return answer;
    }
    
}
