package chan.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FileDownload")
public class FileDownload extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String fileName = request.getParameter("file_name");
	String savePath = "./upload";
	ServletContext servletContext = request.getServletContext();
	String downloadPath = servletContext.getRealPath(savePath);
	String filePath = downloadPath + "\\" + fileName;
	byte b[ ] = new byte[4096];
	File file = new File(filePath);
	if (file.exists()) {
		FileInputStream fileInputStream = new FileInputStream(filePath);
		String downType = getServletContext().getMimeType(filePath);
		if (downType == null) {
			downType = "application/octet-stream";
			response.setContentType(downType);
		}
		boolean MSIE = false;
		MSIE = (request.getHeader("user-agent").indexOf("MSIE")!=-1) || (request.getHeader("user-agent").indexOf("Trident")!=-1);
		String encoding = null;
		if (MSIE) {
			encoding = new String(fileName.getBytes("EUC-KR"),"ISO-8859-1").replaceAll("\\+", "%20");
		}else {
			encoding = new String(fileName.getBytes("UTF-8"),"ISO-8859-1");
		}
		response.setHeader("Content-Disposition", "attachment;filename=\""+encoding+"\"");
		ServletOutputStream servletOutputStream = response.getOutputStream();
		int numRead;
		while ((numRead = fileInputStream.read(b, 0, b.length)) != -1) {
		servletOutputStream.write(b, 0, numRead);
			
		}
		servletOutputStream.flush();
		servletOutputStream.close();
		fileInputStream.close();
	}
	}
}
