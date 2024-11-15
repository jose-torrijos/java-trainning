package com.sngular.session.five;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public static void main(String ...args) {
		try(
			Scanner reader = new Scanner(System.in);
		) {
			InetAddress ip = InetAddress.getByName("localhost");
			Socket socket = new Socket(ip, 20000);
			
			DataInputStream dataIn = new DataInputStream(socket.getInputStream());
			DataOutputStream dataOut = new DataOutputStream(socket.getOutputStream());
			
			while(true) {
				System.out.println(dataIn.readUTF());
				String send = reader.nextLine();
				dataOut.writeUTF(send);
				
				if(OptionsEnum.fromOption(send) == OptionsEnum.SALIR) {
					System.out.println("Cerrando esta conexión: " + socket);
					socket.close();
					System.out.println("Conexión cerrada.");
					break;
				}
//				int a = 1/0;
				String received = dataIn.readUTF();
				System.out.println(OptionsEnum.fromOption(send) + ": " + received);
			}
			reader.close();
			dataIn.close();
			dataOut.close();
		} catch (UnknownHostException | ArithmeticException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
