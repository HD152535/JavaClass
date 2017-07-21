package org.dimigo.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteStreamTest {

	public static void main(String[] args) {
		copyFile();
		copyFile2();
		System.out.println("복사 완료");
	}

	// 바이트 기반의 1차 스트림으로 파일 복사
	private static void copyFile() {
		try (InputStream is = new FileInputStream("files/라푼젤.jpg");
			OutputStream os = new FileOutputStream("files/라푼젤_copy.jpg")) {

			long start = System.currentTimeMillis();
			
			int result;

			// 1byte씩 읽고 쓰기
			while ((result = is.read()) != -1) {
				os.write(result);
			}

			// 버퍼 배열을 이용해서 읽고 쓰기
			byte[] buf = new byte[1024];
			while ((result = is.read(buf)) != -1) {
				os.write(buf, 0, result);
			}
			
			long end = System.currentTimeMillis();

			System.out.println("copyFile : " + (end - start));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	// 바이트 기반의 2차 스트림으로 파일 복사
		private static void copyFile2() {
			try (InputStream is = new BufferedInputStream (new FileInputStream("files/라푼젤.jpg"));
				OutputStream os = new BufferedOutputStream(new FileOutputStream("files/라푼젤_copy.jpg"))) {

				long start = System.currentTimeMillis();
				
				int result;

				// 1byte씩 읽고 쓰기
				while ((result = is.read()) != -1) {
					os.write(result);
				}

				// 버퍼 배열을 이용해서 읽고 쓰기
				byte[] buf = new byte[1024];
				while ((result = is.read(buf)) != -1) {
					os.write(buf, 0, result);
				}
				
				long end = System.currentTimeMillis();

				System.out.println("copyFile : " + (end - start));
				
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

}
