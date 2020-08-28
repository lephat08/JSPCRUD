package controller;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.MyConnectDB;

/**
 * Servlet implementation class ThemTK
 */
@WebServlet("/ThemTK")
public class ThemTK extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ThemTK() {
        super();
    }
	public static String mahoSo1;
	public static String hotenEsb1;
	public static String phongBan1;
	public static String diaChi1;	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String author =request.getParameter("author");
		String title =request.getParameter("title");
		String price =request.getParameter("price");
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		try {
			ResultSet rs = new MyConnectDB().chonDuLieuTuDTB("select * from book");
			while(rs.next()){
				String s = rs.getString(1);				
			}
			new MyConnectDB().thucThiCauLenhSQL("insert into book values('"+author+"','"+title+"','"+price+"')");
			response.sendRedirect("index.jsp");
			System.out.println("Gui Thanh Cong Nha !");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}


}
