package com.java.al2023;

import java.util.HashSet;

public class al20231205 {
    
    /*
     * 폰켓몬
     * N마리 중에서 N/2 마리를 뽑았을 때 가장 많은 종류의 갯수를 반환해라
     * 
     * 조건
     * nums는 폰켓몬의 종류 번호가 담긴 1차원 배열입니다.
     * nums의 길이(N)는 1 이상 10,000 이하의 자연수이며, 항상 짝수로 주어집니다.
     * 폰켓몬의 종류 번호는 1 이상 200,000 이하의 자연수로 나타냅니다.
     * 가장 많은 종류의 폰켓몬을 선택하는 방법이 여러 가지인 경우에도, 선택할 수 있는 폰켓몬 종류 개수의 최댓값 하나만 return 하면 됩니다.
     */
    public int question1(int[] nums) {
        int answer = 0;
        int choiceCnt = nums.length/2;
        HashSet<Integer> kindSet = new HashSet<Integer>();
        // 최대한 많은 종류가 들어간 경우 종류의 수를 구해라
        // nums에 중복없는 종류 수를 구하면 끝
        // N/2 
        for(int i=0; i< nums.length;i++){            
            kindSet.add(nums[i]);
        }
        
        System.out.println(choiceCnt);
        System.out.println(kindSet.size());
        if(choiceCnt <= kindSet.size()){//종류가 choiceCnt 와 크거나 같다. return choiceCnt
            return choiceCnt;
        }else{// 종류가 choiceCnt 보다 작다. 1,2,1,2,2,1 return return 종류 수;
            return kindSet.size();
        }               
    }
}
