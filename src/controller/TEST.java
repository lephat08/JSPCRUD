package controller;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.tomcat.util.http.fileupload.IOUtils;



public class TEST implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static	int id1;
	private static	String hoten1;	
	private static	String phongban1;
	private static	String diachi1;	
	public static void main(String[] args) {
		TEST.Post_JSON();
	}
	public static void Post_JSON() {

		ThemTK abc = new ThemTK();
		
		id1 =  Integer.parseInt(abc.mahoSo1);
		hoten1 = abc.hotenEsb1;
		phongban1 = abc.phongBan1;
		diachi1 = abc.diaChi1;
		System.out.println(id1);
		System.out.println(hoten1);
		System.out.println(phongban1);
		System.out.println(diachi1);
           String query_url = "http://192.168.1.59:8280/nhanvien/them";
           String json = "{" + 
           		"	\"request\" :{" + 
           		"		\"id\" : \""+id1+"\"," + 
           		"		\"hoten\": \""+hoten1+"\","+ 
           		"		\"phongban\" : \""+phongban1+"\"," + 
           		"		\"diachi\": \""+diachi1+"\"" + 
           		"	}" + 
           		"}";
           try {
           URL url = new URL(query_url);
           HttpURLConnection conn = (HttpURLConnection) url.openConnection();
           conn.setConnectTimeout(5000);
           conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
           conn.setDoOutput(true);
           conn.setDoInput(true);
           conn.setRequestMethod("POST");
           OutputStream os = conn.getOutputStream();
           os.write(json.getBytes("UTF-8"));
           os.close(); 
           // read the response
           InputStream in = new BufferedInputStream(conn.getInputStream());
           in.close();
           conn.disconnect();
           } catch (Exception e) {
   			System.out.println(e);
   		}
           
	}
	public static void Xoa_JSON() {

		XoaTK abc = new XoaTK();
		
		id1 =  Integer.parseInt(abc.mahoSo1);
		System.out.println(id1);
           String query_url = "http://192.168.1.59:8280/nhanvien/xoa";
           String json = "{" + 
           		"	\"request\" :{" + 
           		"		\"id\" : \""+id1+"\"" + 
           		"	}" + 
           		"}";
           try {
           URL url = new URL(query_url);
           HttpURLConnection conn = (HttpURLConnection) url.openConnection();
           conn.setConnectTimeout(5000);
           conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
           conn.setDoOutput(true);
           conn.setDoInput(true);
           conn.setRequestMethod("POST");
           OutputStream os = conn.getOutputStream();
           os.write(json.getBytes("UTF-8"));
           os.close(); 
           // read the response
           InputStream in = new BufferedInputStream(conn.getInputStream());
           in.close();
           conn.disconnect();
           } catch (Exception e) {
   			System.out.println(e);
   		}        
	}	
	public int getId1() {
		return id1;
	}
	public void setId1(int id1) {
		this.id1 = id1;
	}
	public String getHoten1() {
		return hoten1;
	}
	public void setHoten1(String hoten1) {
		this.hoten1 = hoten1;
	}
	public String getPhongban1() {
		return phongban1;
	}
	public void setPhongban1(String phongban1) {
		this.phongban1 = phongban1;
	}
	public String getDiachi1() {
		return diachi1;
	}
	public void setDiachi1(String diachi1) {
		this.diachi1 = diachi1;
	}	
	
}
