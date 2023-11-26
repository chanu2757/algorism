package com.java.al2023;

import java.util.*;

public class al20231126 {

    /*
     * ex) one4seveneight 
     * >> 1478
     */
    public int question1(String s){
        int answer = 0;
        String[] numArr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i=0; i<numArr.length; i++){
            s= s.replaceAll(numArr[i],i+"");
        }
        answer = Integer.parseInt(s);
        return answer;
    }

    /*
     * ex) param s = "banana"     
     * b 앞에 동일한 글자가 없으므로 -1 
     * a 앞에 동일한 글자가 없으므로 -1 
     * n 앞에 동일한 글자가 없으므로 -1 
     * a 앞에 동일한 글자가 2칸 앞에 있으므로 2
     * n 앞에 동일한 글자가 2칸 앞에 있으므로 2
     * a 앞에 동일한 글자가 2칸 앞에 있으므로 2
     * 결과 > [-1,-1,-1,2,2,2]
     */
    public int[] question2(String s){
        int[] answer = new int[s.length()];
        char[] chrArr = s.toCharArray();
        
        for(int i=0; i < chrArr.length; i++){
            for(int j=0 ; j<i; j++){
                if(chrArr[i] == chrArr[j]){                    
                    answer[i] = i-j;
                }
            }
            answer[i] = answer[i] == 0?-1:answer[i];
        }
        
        return answer;
    }

    /*
     * array 배열의 commands[x][0] 부터
     * array 배열의 commands[x][1] 까지 구한뒤 정렬하고
     * 정렬하고 나온것의 commands[x][2] 번째 수를 구해라.
     */
    public int[] question3 (int[] array, int[][] commands){
        // JAVA Arrays.copyOfrange(시작,끝); 사용할 수 있음.
        int[] answer = new int[commands.length];
                
        for(int j=0; j<commands.length; j++){
            ArrayList<Integer> numList = new ArrayList<Integer>();
            for(int i=commands[j][0]-1; i<commands[j][1]; i++){
                  numList.add(array[i]);
            }
            Collections.sort(numList);
            
            answer[j] = numList.get(commands[j][2]-1);
        }
        
        return answer;
    }

}
