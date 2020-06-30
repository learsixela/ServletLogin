package com.web.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.util.BaseDatos;
import com.web.util.Conector;
import com.web.util.Conexion;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Conexion cn=new Conexion();
	BaseDatos basedato =new BaseDatos();
	//creamos la conexion,statement y resultset y realizamos el import 
	Connection con = null;
	Statement stmt = null;
	ResultSet resul = null;
	
    Statement ps;
    ResultSet rs;
	
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   PrintWriter out;
		    String title = "Datos  de usuarios";
		    
		    //llamamos a la funcion que luego ira en el DAO
		    ResultSet resul = obtenerDatosusuario();
		    
			System.out.println("*********************");
			try {
			    // primero selecciona el tipo de contenidos y otros campos de cabecera de la respuesta
			    response.setContentType("text/html");
			    // Luego escribe los datos de la respuesta
			    out = response.getWriter();
			    out.println("<HTML><HEAD><TITLE>");
			    out.println(title);
			    out.println("</TITLE></HEAD><BODY>");
			    out.println("<H1>" + title + "</H1>");
			    
				while(resul.next()) {
					//recorremos el resul y 
					//accedemos a los registros por posicion
					int iUsuarioId = resul.getInt(1);
					String sUsuarioNombre = resul.getString(2);
					String sUsuarioEmail = resul.getString(3);
					String sUsuarioRut = resul.getString(4);
					String sUsuarioPassword = resul.getString(4);
					
					//cada vez que encuentre un registro lo imprimirá
					System.out.println("usuario Id : "+ iUsuarioId);
					System.out.println("Nombre Usuario : "+ sUsuarioNombre);
					System.out.println("Email usuario : "+ sUsuarioEmail);
					System.out.println("Rut usuario : "+ sUsuarioRut);
					System.out.println("Password usuario : "+ sUsuarioPassword);
					System.out.println("*********************");
					
					//Generamos el html
					out.println("<p>ID : "+iUsuarioId + "</p>");
					out.println("<p>Nombre : "+sUsuarioNombre + "</p>");
					out.println("<p>Email : "+sUsuarioEmail + "</p>");
					out.println("<p>Rut : "+sUsuarioRut + "</p>");
					out.println("<p>Password : "+sUsuarioPassword + "</p>");
					out.println("<br>");
		
				}
				
			    out.println("</BODY></HTML>");
			    out.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// doGet(request, response);
		conectar();
	}
	
	public ResultSet obtenerDatosusuario() {
		//instacia de base datos
				Conector basedato =new Conector();
						
				String sql="SELECT * FROM usuario";
				
				//creamos el statment
				
				try {
		            con=cn.getConnection();
		            
					//con = basedato.datos("servlet");
					stmt= con.createStatement();
					resul = stmt.executeQuery(sql);
					
					//crear tabla usuario
				
					/* 
					 * id
					 * nombre
					 * rut
					 * email
					 * password
					 */
				
					
				} catch (SQLException e) {
					System.out.println("Error al realizar la consulta "+ e);
				}finally {
					//cerramos las conexiones 
					try {
						if(resul != null ) {
							resul.close();
						}
						if(stmt != null ) {
							stmt.close();
						}
						if(con != null ) {
							con.close();
						}
					} catch (Exception e2) {
						System.out.println("Error al cerrar la conexiones ");
					}
				}
				return resul;
	}
	
	public void conectar() {
		//instacia de base datos
		
						
				//creamos la conexion,statement y resultset y realizamos el import 
				Connection con = null;
				Statement stmt = null;
				ResultSet resul = null;
				
				//Instancia del controller
				//ArquitecturaController ac = new ArquitecturaController();
				
				//creamos el statment
				
				try {
					con = basedato.datos("arquitectura");
					stmt= con.createStatement();
					resul = stmt.executeQuery("SELECT * FROM cursos");
					
					//crear tablas cursos y alumnos
				
					/* cursos
					 * id
					 * nombre
					 * codigo
					 */
					
					System.out.println("*********************");
					while(resul.next()) {
						//recorremos el resul y 
						//accedemos a los registros por posicion
						int iCursoId = resul.getInt(1);
						String sNombreCurso = resul.getString(2);
						String sCodigoCurso = resul.getString(3);
						
						//cada vez que encuentre un registro lo imprimirá
						System.out.println("Curso Id : "+ iCursoId);
						System.out.println("Nombre Curso : "+ sNombreCurso);
						System.out.println("Codigo Curso : "+ sCodigoCurso);
						System.out.println("*********************");
					}
					
					/*alumnos
					 * id
					 * nombre
					 * apellido
					 * edad
					 */
					
				} catch (SQLException e) {
					System.out.println("Error al realizar la consulta "+ e);
				}finally {
					//cerramos las conexiones 
					try {
						if(resul != null ) {
							resul.close();
						}
						if(stmt != null ) {
							stmt.close();
						}
						if(con != null ) {
							con.close();
						}
					} catch (Exception e2) {
						System.out.println("Error al cerrar la conexiones ");
					}
				}
	}

}
