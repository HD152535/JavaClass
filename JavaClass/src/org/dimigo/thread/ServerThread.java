package org.dimigo.thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


public class ServerThread extends Thread {

   // 클라이언트와의 통신을 위한 소켓
   private Socket connetionSocket;
   
   public ServerThread(Socket connetionSocket) {
      this.connetionSocket = connetionSocket;
      System.out.println(Thread.currentThread().getName() + "cradted");
   }
   
   @Override
   public void run() {
      // 클라이언트의 통신을 위해 입출력 스트림 생성
      try (BufferedReader in = new BufferedReader(
            new InputStreamReader(connetionSocket.getInputStream()));
            PrintWriter out = new PrintWriter(connetionSocket.getOutputStream(), true)) {
         
         // 클라이언트로부터 데이터를 읽어들인다.
         String request = in.readLine();
         System.out.println("request : " + request);
         
         // 응답 데이터 출력하기
         // 200 : 정상
         out.println("HTTP/1.1 200");
         out.println("Content-type: text/html");
         out.println("Server-name: Server");
         String response = "<html><body><h1>Hello,My WevServer</h1></body></html>";
         out.println("Content-length: " + response.length());
         // header부의 끝을 알리기 위해 한줄 띄기
         out.println("");
         out.println(response);
         
      } catch(Exception e) {
         e.printStackTrace();
      } finally {
         try {
            connetionSocket.close();
         } catch (IOException e) {
            e.printStackTrace();
         }
      }
   }
}