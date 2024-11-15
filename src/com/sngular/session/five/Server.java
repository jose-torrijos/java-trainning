package com.sngular.session.five;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		System.out.println("Creando servidor");
		ServerSocket serverSocket;
		try{
			serverSocket = new ServerSocket(20000);
			while(true) {
				Socket socket = serverSocket.accept();
				DataInputStream dataIn = new DataInputStream(socket.getInputStream());
				DataOutputStream dataOut = new DataOutputStream(socket.getOutputStream());
				System.out.println("Se ha conectado un cliente: " + socket + " y se asigna u nuevo hilo");
				Thread threadClient = new ClientHandler(dataIn, dataOut, socket);
				threadClient.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
