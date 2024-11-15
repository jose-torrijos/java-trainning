package com.sngular.session.five;

public enum OptionsEnum {
	FECHA("FECHA"),
	HORA("HORA"),
	SALIR("SALIR");
	
	private final String option;
	
	private OptionsEnum(String option) {
		this.option = option;
	}
	
	public String getOption() {
		return option;
	}
	
	public static OptionsEnum fromOption(String option) {
		for(OptionsEnum op: values()) {
			if(op.getOption().equalsIgnoreCase(option)) {// HELLO == HELLO (true) - HELLO == hello (true)
				// op.getOption().equals(option);// HELLO == HELLO (true) - HELLO == hello (false)
				return op;
			}
		}
		return SALIR;
	}

}