package controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MyConnectDB;

/**
 * Servlet implementation class SuaTK
 */
@WebServlet("/SuaTK")
public class SuaTK extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String ho="";
	String ten="";
	String tk="";
       
    public SuaTK() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String stt=request.getParameter("stt");
		ResultSet rs;
		try {
			rs = new MyConnectDB().chonDuLieuTuDTB("select * from ThanhVien where stt='"+stt+"'");
			while(rs.next()){
				ho=rs.getString(2);
				ten=rs.getString(3);
				tk=rs.getString(4);
			}
			response.setContentType("text/html");
			ServletContext context = getServletContext();
			context.setAttribute("stt", stt);
			context.setAttribute("ho", ho);
			context.setAttribute("ten", ten);
			context.setAttribute("tk", tk);
			
			
			response.sendRedirect("SuaTaiKhoan.jsp");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		String ho = request.getParameter("ho");
		String ten = request.getParameter("ten");
		String tk = request.getParameter("tk");
		response.setContentType("text/html");
		ServletContext context = getServletContext();
		String stt=(String) context.getAttribute("stt");
		
		
		try {
			new MyConnectDB().thucThiCauLenhSQL("update ThanhVien set stt='"+stt+"',Ho='"+ho+"',Ten='"+ten+"',TaiKhoan='"+tk+"' where stt='"+stt+"'");
			response.sendRedirect("index.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
