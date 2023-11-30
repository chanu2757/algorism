package com.java.al2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class al20231130 {
    
    /*
     * 명예의 전당(1)
     * 매개변수 k = 일수, 명예의 전당 마지막 순위
     * 3 <= k <= 100
     * 매개변수 score는 매일 점수 
     * 7 <= score.length <= 1000
     * 0 <= score[i] <= 2000
     * 
     * 매일 마지막 순위의 점수를 담은 int배열을 반환해라
     * ex ) score = {10, 100, 20, 150, 1, 100, 200};
     * >> [10,10,10,20,20,100,100]
     * 
     * Priority Queue 사용하는 방법 공부하기
     */
    public int[] question1 (int k, int[] score){
        int[] answer = new int [score.length];
        //넣을때마다 정렬한다        
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        
        for(int i=0; i< score.length; i++){                   
            arrList.add(score[i]);
            Collections.sort(arrList, Collections.reverseOrder());

            if(k >= arrList.size()){
                answer[i] = arrList.get(arrList.size()-1);
            }else{
                answer[i] = arrList.get(k-1);
            }
        }
        
        return answer;
    }

    /*
     * 명예의 전당(1)
     * priorityQueue(우선순위 큐를 이용한 풀이)
     */
    public int[] question1_2 (int k, int[] score){
        //PriorityQueue           
        //peek 첫번째 값 반환 비어있으면 null 반환, 제거 X
        // System.out.println(priQue.peek());
        //elemnet 첫번째 값 반환 비어있으면 에러발생, 제거 X
        // System.out.println(priQue.element());
        //poll 첫번째 값 반환 비어있으면 null 반환, 제거 O
        // System.out.println(priQue.poll());
        //remove 첫번째 값 제거 없으면 에러발생
        //priQue.remove();
        //clear 큐 초기화
        //priQue.clear();
        int[] answer = new int[score.length];
        
        PriorityQueue<Integer> priQue = new PriorityQueue<Integer>();
        
        for(int i=0; i < score.length; i++){            
            priQue.add(score[i]);    
            
            if(k < priQue.size()){
                priQue.poll();
            }
            
            answer[i] = priQue.peek();
        }
        return answer;
    }
    
    /*
     * 카드 뭉치
     * cards1 배열과 cards2 배열로 goal을 만들 수 있으면 "Yes" 아니면 "No" 리턴
     * 원하는 카드 뭉치에서 카드를 순서대로 한 장씩 사용합니다. 
     * 한 번 사용한 카드는 다시 사용할 수 없습니다.
     * 카드를 사용하지 않고 다음 카드로 넘어갈 수 없습니다.
     * 기존에 주어진 카드 뭉치의 단어 순서는 바꿀 수 없습니다.
     * ex) 
     * cards1 ["i","drink","water"]
     * cards2 ["want", "to"] 일때
     * goal이 ["i","want","to","drink","water"] 면 "Yes"
     * gaol이 ["i","want","to","water","drink"] 면 "NO"
     */
    public String question2 (String[] cards1, String[] cards2, String[] goal){
        String answer = "Yes";
        String[] compareArr = new String[goal.length];
        
        Queue<String> cardsQue1 = new LinkedList<String>();
        Queue<String> cardsQue2 = new LinkedList<String>();
        
        for(String card : cards1){
            cardsQue1.add(card);
        }
        
        for(String card : cards2){
            cardsQue2.add(card);
        }        

        // 위 과정을 간단하게 LinkedList도 list라 리스트형식으로 넣을 수 있음>>>> 
        // Queue<String> cardsQue1 = new LinkedList<String>(Arrays.asList(cards1));
        // Queue<String> cardsQue2 = new LinkedList<String>(Arrays.asList(cards2));
        
        for(int i=0; i<goal.length; i++){
            if(goal[i].equals(cardsQue1.peek())){
                compareArr[i] = cardsQue1.poll();                
            }else if(goal[i].equals(cardsQue2.peek())){
                compareArr[i] = cardsQue2.poll();
            }else{
                answer = "No";
            }
        }
        
        return answer;
    }
}
