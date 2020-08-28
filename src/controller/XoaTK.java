package controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MyConnectDB;

@WebServlet("/XoaTK")
public class XoaTK extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static String mahoSo1;
    public XoaTK() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String stt = request.getParameter("stt");
		try {
			new MyConnectDB().thucThiCauLenhSQL("delete from nhanvien where id='"+stt+"'");
			mahoSo1 = stt;
			System.out.println(stt);
			TEST.Xoa_JSON();
			response.sendRedirect("index.jsp");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());	
		}
	}

	public static String getMahoSo1() {
		return mahoSo1;
	}

	public static void setMahoSo1(String mahoSo1) {
		XoaTK.mahoSo1 = mahoSo1;
	}

}
