package org.dimigo.thread;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {

	public static void main(String[] args) {
		// 서버 소켓을 생성한다. 웹서버는 기본적으로 80번 포트를 사용한다.
		try {
			ServerSocket listenSocket = new ServerSocket(80);
			System.out.println("WebServer is starting up on port 80");
			System.out.println("(press ctrl-c to exit)");

			Socket connectionSocket;
			// 반복문 내에서 클라이언트 접속을 받는다.
			while ((connectionSocket = listenSocket.accept()) != null) {
				// 스레드를 생성해서 실행
			 Thread t = new ServerThread2(connectionSocket);
				t.start();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
