package com.java.al2023;

public class al20231124 {

    /*
     * startChar = s, endChar = e
     * aa
     * abba
     * abccba
     * abba
     * aa
     */
    public void question1(int s, int e){
        //System.out.println(s); 97
        //System.out.println(e); 106

        //aa가 나오려면 어떻게 해야할까
        // 97 + 97
        // 97 98 98 97
        // 97 98 99 99 98 97
        //증가했다가 최대에서 감소
        String str = "";
        String revStr = "";
        for(int i=s; i<= e; i++){
            str += (char)i;
            for(int j=str.length()-1; j >= 0; j--){
                revStr += str.charAt(j);
            }
            System.out.println(str + revStr);
            revStr = "";
        }

        for(int i=str.length()-1; i>0;i--){            
            str = str.substring(0,i);

            for(int j=str.length()-1; j >= 0; j--){
                revStr += str.charAt(j);
            }
            System.out.println(str + revStr);
            revStr = "";
        }
    }
    
    /*
     * 문자열이 대칭이면 true, 아니면 false
     * ex) str = "level", "EVVE"
     */
    public boolean question2(String str){
        boolean answer = false;
        int strHalf = str.length()%2 ==0?str.length()/2 : str.length()/2+1;     
        String revStr = "";        

        for(int i=str.length()/2-1; i >= 0; i--){                        
            revStr += str.charAt(i);
        }
        
        if(revStr.equals(str.substring(strHalf))){
            answer = true;
        }else{
            answer = false;
        }
        return answer;
    }
}
