
package org.dimigo.thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


public class ServerThread2 extends Thread{

   // 클라이언트와의 통신을 위한 소켓
   private Socket connectionSocket;
   
   public ServerThread2(Socket connectionSocket){
      this.connectionSocket = connectionSocket;
      System.out.println(Thread.currentThread().getName() + " created");
   }
   
   @Override
   public void run(){
      // 클라이언트의 통신을 위해 입출력 스트림 생성
      try (BufferedReader in = new BufferedReader(
            new InputStreamReader(connectionSocket.getInputStream()));
            PrintWriter out = new PrintWriter(connectionSocket.getOutputStream())) {
         
         // 클라이언트로로부터 데이터를 읽어들인다.
         String request = in.readLine();
         System.out.println("request : " + request);

         // GET /main.html HTTP/1.1
         // 파일명 얻기
         String[] requestArr = request.split(" ");
         String fileName = requestArr[1].substring(1);
         System.out.println("fileName : " + fileName);
         
         // 파일 입력 스트림
         InputStream is = this.getClass().getResourceAsStream(fileName);
         if(is == null){
        	 out.println("HTTP/1.1 404");
        	 out.println("Content-type : text/html");
        	 String response = "<html><body>Hello,<h1>File Not Found</h1></body></html>";
             out.println("Content-length: " + response.length());
             // header부의 끝을 알리기 위해 한줄 띄기
             out.println("");
             out.println(response);
         }else{
        	 String data;
        	 StringBuilder sb = new StringBuilder();
        	 
        	 try(BufferedReader br = new BufferedReader(new InputStreamReader(is))){
        		while((data= br.readLine())!= null){
        			sb.append(data);
        		}
        	 }
        	 
        	// 응답 데이터 출력하기
 			// 200 : 정상

 			out.println("HTTP/1.1 200");
 			out.println("Content-type: text/html");
 			out.println("Server-name : myserver");
 			out.println("Content-length: " + sb.toString().length());
 			// header부의 끝을 알리기 위해 한줄 띄기
 			out.println("");
 			out.println(sb.toString());

         }
         
         
         
         // 응답 데이터 출력하기
         // 200 : 정상
         
         out.println("HTTP/1.1 200");
         out.println("Content-type: text/html");
         out.println("Server-name : myserver");
         String response = "<html><body>Hello,<h1>My WebServer</h1></body></html>";
         out.println("Content-length: " + response.length());
         // header부의 끝을 알리기 위해 한줄 띄기
         out.println("");
         out.println(response);
         
         
      } catch(Exception e){
         e.printStackTrace();
      } finally{
         try{
            connectionSocket.close();
         } catch(IOException e){
            e.printStackTrace();
         }
      }
   }
}