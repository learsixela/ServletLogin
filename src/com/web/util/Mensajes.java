package com.web.util;

import java.io.PrintWriter;

public class Mensajes {

	
	
	public PrintWriter mensajeSalida(PrintWriter salida, String mensaje) {
        salida.println("<HTML><HEAD><TITLE>");
	    salida.println("title");
	    salida.println("</TITLE></HEAD><BODY>");
        salida.println(mensaje);
        salida.println("</BODY></HTML>");
        salida.close();
		
		return salida;
	}
	
}
