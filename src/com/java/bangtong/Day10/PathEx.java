package com.java.bangtong.Day10;

import java.util.*;
import java.nio.file.*;

public class PathEx {
    public static void main(String args[]){
        try{
            Path path = Paths.get("C:\\windows\\system32\\drivers\\etc\\hosts");
            System.out.println("파일 이름 :" + path.getFileName());
            System.out.println("상위 폴더 :" + path.getParent().getFileName());
            System.out.println("경로 길이 :" + path.getNameCount());

            System.out.println("현재 경로 : ");
            for (int i =0; i < path.getNameCount(); i++){
                System.out.println(path.getName(i) + "\\");                
            }
            Iterator<Path> it = path.iterator();
            System.out.println("\n현재 경로 :");
            while (it.hasNext())
                System.out.println(it.next().getFileName() + "\\");                
        }catch(Exception e){
            System.out.println(e);
        }
    }    
}
