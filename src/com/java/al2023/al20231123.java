package com.java.al2023;

public class al20231123{

     /*
    문제
     * 숫자로 이루어진 문자열 t와 p가 주어질 때, t에서 p와 길이가 같은 부분문자열 중에서, 
     * 이 부분문자열이 나타내는 수가 p가 나타내는 수보다 작거나 같은 것이 나오는 횟수를 return하는 함수 solution을 완성하세요.
     * 예를 들어, t="3141592"이고 p="271" 인 경우, t의 길이가 3인 부분 문자열은 314, 141, 415, 159, 592입니다. 
     * 이 문자열이 나타내는 수 중 271보다 작거나 같은 수는 141, 159 2개 입니다.
     */
    public int question1(String t, String p){
        
        int answer = 0;
        //t를 p의 길이 만큼 자른다.
        //자른 배열과 p를 비교한다.
        
        for(int i=0; i<t.length() - p.length() + 1 ; i++){   
            // 런타임 오류가 발생하는 상황
            // i 가 t 문자열보다 큰경우
            // i+p.length가 t의 문자열보다 큰경우
            // p와 t의 길이가 int보다 큰 경우
            
            if(Double.parseDouble(t.substring(i,i+p.length())) <= Double.parseDouble(p)){
                answer ++;
            }
        }
        return answer;
    }

    public int question2(int[] number) {
        int answer = 0;
        // 세 수를 더했을 때 0이 나오도록 하는 경우의 수를 구해라
        for(int i=0; i < number.length; i++){
            for(int j=i+1; j <number.length; j++){
                for(int k=j+1; k<number.length; k++){
                    if(number[i] + number[j] + number[k] == 0){
                        answer ++;
                    }
                }
            }
        }
        return answer;
    }
    
    //지갑 최적화
    public int question3(int[][] sizes) {
        // 명함의 가장 긴 길이 a와 명함의 가장 짧은 길이 b
        // 지갑의 가장 긴 길이 A와 지갑의 가장 짧은 길이 B
        // 둘을 비교했을때 A는 a보다 길거나 같고 B는 b보다 길거나 같다.
        // a= 80 b = 30
        // A= 80 B = 50
        int answer = 0;
        int prevMax = 0;
        int prevMin = 0;
        
        for (int[] size: sizes) {
            // 명함의 최대 최소
            int curMax = Math.max(size[0], size[1]);
            int curMin = Math.min(size[0], size[1]);
            
            // 지갑의 최대 최소
            prevMax = Math.max(curMax, prevMax);            
            prevMin = Math.max(curMin, prevMin);
        }       
         answer = prevMax * prevMin;
         return answer;
    }
}