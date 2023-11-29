package com.java.al2023;

import java.util.HashMap;

public class al20231129 {
    
    /*
     * food의 갯수와 순서가 대칭되도록 하는 문자열 반환하기
     * food의 index
     * 0 = 0 가운데 물
     * i = i 번째 음식의 갯수
     * ex) [1,2,4,7] >> 1223330333221
     */
    public String qudtison1(int[] food){
        String answer = "";
        int halfCnt = 0;
        for(int i=1; i<food.length; i++){
            halfCnt = food[i]/2;
            for(int j=0; j < halfCnt; j++){
                answer += i+"";
            }
        }
        answer += "0";
        for(int j=answer.length()-2; j >=0; j--){                ;
            answer += answer.charAt(j);
        }
        
        return answer;
    }
    /*
     * 콜라 a 병을 반납하면
     * b병 만큼 콜라를 주고
     * 내가 처음 n개의 빈병을 반납 했을 때 받을 수 있는 콜라 수
     */
    public int question2(int a, int b, int n) {
        int answer = 0;
        while(n >= a){            
            answer += (n / a) * b; // 갖다줬을때 받는 병 수
            
            n = (n / a) * b + (n % a); //남은 병 수 
        }
        return answer;
    }
    /*
     * 추억 점수
     * name 의 길이와 yearning의 길이는 같다.
     * photo에 있는 이름의 yearning 값의 합을 구해라
     * photo에 있지만 name에 이름이 없을 경우 0으로 처리
     */
    public int[] question3(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        
        for(int i=0; i<name.length; i++){
            map.put(name[i], yearning[i]);      
        }
        
        for(int i=0; i<photo.length; i++){
            for(int j=0; j<photo[i].length; j++){
                answer[i] += map.getOrDefault(photo[i][j], 0);     
            }
        }
        
        return answer;
    }
}
