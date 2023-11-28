package com.java.al2023;
import java.util.Comparator;
import java.util.Arrays;

public class al20231128 {
    
    public String[] question1(String[] strings, int n){
        //출처 질문하기 xmas6904201@gmail.com

        //이부분 공부 필요
        // document에 따르면 sort는 오버라이딩되어있음.
        Arrays.sort(strings, new Comparator<String>() {       

            // Int값을 비교할 경우에는 보통 왼쪽이 크면 retrun 값이1 오른쪽이 크면 -1 값이 같으면 0으로 외웠다.
            // 하지만 위의 return 값은 String을 비교 할 시 return값이 엉뚱항 정수가 나온다. 
            // 때문에 왼쪽이 클 때는 양수 값이 같을때는 0 오른쪽이 클 때는 음수로 생각하는 것이 더 편한듯...
            // >document에 따르면 음수, 0, 양수값으로 리턴해준다고 나와있고, 작으면 음수, 같으면 0, 크면 양수
                @Override
                public int compare(String o1, String o2) {                        
                    if (o1.charAt(n) > o2.charAt(n)) {
                        return 50; // 양수 아무거나
                    } else if (o1.charAt(n) < o2.charAt(n)) {
                        return -50; // 음수 아무거나
                    } else if (o1.charAt(n) == o2.charAt(n)) {
                        return o1.compareTo(o2); // compareTo 문자열 비교 compare과 같이 음수,0,양수지만 값의 의미는 문자열 차이만큼의 값이라한다.
                    }
                    return 0;
                } 
            } 
        );
        return strings;
    } 
}
