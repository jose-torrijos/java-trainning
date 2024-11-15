package com.sngular.session.five;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

// Extiendo de Thread
// Implementando Runnable
public class ClientHandler extends Thread {

	DataInputStream dataIn;
	DataOutputStream dataOut;
	DateTimeFormatter datePattern = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
	Socket socket;

	public ClientHandler(DataInputStream dataIn, DataOutputStream dataOut, Socket socket) {
		this.dataIn = dataIn;
		this.dataOut = dataOut;
		this.socket = socket;
	}
	
	@Override
	public void run() {
		OptionsEnum received;
		String sended;
		
		try {
			while(true) {
				dataOut.writeUTF("Que necesitas? [Fecha/Hora]\n [Escribe Salir para cerrar la conexión]");
				received = OptionsEnum.fromOption(dataIn.readUTF());
				
				if(received == OptionsEnum.SALIR) {
					System.out.println("Cerrando la conexión del cliente " + this.socket);
					this.socket.close();
					System.out.println("Conexión cerrada.");
					break;
				}
				
				switch (received) {
				case FECHA:
//					new Date();
					sended = LocalDate.now().format(datePattern);
					dataOut.writeUTF(sended);
					break;
				case HORA:
					sended = LocalTime.now().toString();
					dataOut.writeUTF(sended);
					break;
				default:
					sended = "Opción invalida";
					dataOut.writeUTF(sended);
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			try {
				this.socket.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				this.dataOut.close();
				this.dataIn.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
