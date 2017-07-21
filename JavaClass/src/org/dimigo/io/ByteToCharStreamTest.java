package org.dimigo.io;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;

public class ByteToCharStreamTest {

	public static void main(String[] args) {
		try (PrintStream os = System.out; 
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				) 
			{
			
			// 키보드로 한줄 입력 받고 모니터로 출력하기
			String str;
			while((str = br.readLine()) != null){
				os.println("출력 => " + str);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
