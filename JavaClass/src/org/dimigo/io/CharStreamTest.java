package org.dimigo.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class CharStreamTest {

	public static void main(String[] args) {
		copyFile();
		copyFile2();
		System.out.println("복사 완료");
		
		readFile();
	}

	// 바이트 기반의 1차 스트림으로 파일 복사
	private static void copyFile() {
		try (Reader reader = new FileReader("files/input.txt");
			Writer writer = new FileWriter("files/output.txt"))
			 {

			long start = System.currentTimeMillis();
			
			int result;
			
			// 1뮨자씩 읽고 쓰기
			while((result = reader.read()) != -1){
				writer.write(result);
			}


			// 버퍼 배열을 이용해서 읽고 쓰기
			char[] buf = new char[1024];
			while ((result = reader.read(buf)) != -1) {
				writer.write(buf, 0, result);
			}
			
			writer.write("\n요것도 출력되겠지롱");
			
			long end = System.currentTimeMillis();

			System.out.println("copyFile : " + (end - start));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	// 바이트 기반의 2차 스트림으로 파일 복사
		private static void copyFile2() {
			try (Reader reader = new BufferedReader (new FileReader("files/input.txt"));
				Writer writer = new BufferedWriter(new FileWriter("files/output.txt"))) {

				long start = System.currentTimeMillis();
				
				int result;

				// 1byte씩 읽고 쓰기
				while ((result = reader.read()) != -1) {
					writer.write(result);
				}

				// 버퍼 배열을 이용해서 읽고 쓰기
				char[] buf = new char[1024];
				while ((result = reader.read(buf)) != -1) {
					writer.write(buf, 0, result);
				}
				
				long end = System.currentTimeMillis();

				System.out.println("copyFile : " + (end - start));
				
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		
		private static void readFile(){
			try(BufferedReader reader = new BufferedReader(new FileReader("files/Input.txt"))){
				
				String str;
				while((str =reader.readLine()) != null){
					System.out.println(str);
				}
					
			}catch(Exception e){
				e.printStackTrace();
			}
		}

}
