package com.java.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

//@Scheduelde(cron)을 이용하면 정해진 시간에 실행시킬 수 있다.
//@Scheduled(cron="0 00 1 * * ?")//초  분 시 일 월 요일
public class processBuilderTest{
    public void template (){
    /* 기본 베이스 */
		System.out.println("========== Start ==========");
		
			String filePath = "파일경로" ;
			String SaveFileNm  = "확장자 없는 파일명"; 

				try{
						
					//ProcessBuilder 선언
					 ProcessBuilder builder = new ProcessBuilder();
                    //Process를 실행시킬 파일 경로 지정
					 	builder.directory(new File(filePath));
					    //실행시킬 명령어 지정 String[] 형태
					 	builder.command("OS 명령어", "ls");
						//프로세스 실행
					 	Process proc = builder.start();
				       /*
                        //1) 커맨드 실행 결과를 InputStreamReader 로 읽어온다.
                        InputStreamReader wisr = new InputStreamReader(proc.getInputStream());

                        // 2) 커맨드를 실행하면서 나오는 출력을 BufferedReader 로 변경한다.
                        BufferedReader wibr = new BufferedReader(wisr);     
								
						*/
						// 1,2 번을 한 줄로 
				        BufferedReader br = new BufferedReader(new InputStreamReader( proc.getInputStream() ));
				        
				        //프로세스 실행이 완료될 때까지 대기 매개변수로 시간을 정해줄 수 있음. >> 이경우는 true,false return
 			            int exitCode = proc.waitFor();
			            
						//정상처리 값은 0 이외는 실패라고 보면 된다.
			            if (exitCode == 0) {
			                System.out.println(SaveFileNm + " deleted successfully.");
			            } else {
			                System.out.println("Failed to delete "+ SaveFileNm);
			            }
								//프로세스가 아직 실행중이면 프로세스 종료시킨다.
				        if(proc != null) {
				        	proc.destroy();
				        }
				}catch(Exception e){
					System.out.println(e.getMessage());
				}	
		
		System.out.println("========== End ==========");
    }
}
