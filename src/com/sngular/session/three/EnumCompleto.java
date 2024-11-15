package com.sngular.session.three;

public enum EnumCompleto {
	SUCCESS("Operacion exitosa"),
	VERIFY("Favor de verificar tu correo electronico"),
	ERROR("Error al crear el usuario");
	
	String mensaje;
	
	private EnumCompleto(String mens){
		mensaje = mens;
	}
	
	public static String getMensaje(EnumCompleto enu) {
		for(EnumCompleto en : values()) {
			if(enu.equals(en)) {
				return enu.mensaje;
			}
		}
		return "";
	}

}
