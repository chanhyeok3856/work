package chan.test;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Enumeration;
import java.awt.Graphics2D;
import javax.imageio.ImageIO;
import javax.media.jai.GraphicsJAI;
import javax.media.jai.JAI;
import javax.media.jai.RenderedOp;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.renderable.ParameterBlock;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/ImageThum")
public class ImageThum extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String path = request.getSession().getServletContext().getRealPath("./img");
	int size = 10 * 1024 * 1024;
	String filename = "";
	try {
		MultipartRequest multipartRequest = new MultipartRequest(request, path, size, "UTF-8", new DefaultFileRenamePolicy());
		Enumeration<?> enumeration = multipartRequest.getFileNames();
		String file = (String) enumeration.nextElement();
		filename = multipartRequest.getFilesystemName(file);
		if (filename == null) {
			response.sendRedirect("./test/image_thumbnail.jsp");
			return;
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	ParameterBlock parameterBlock = new ParameterBlock( );
	parameterBlock.add(path + "\\" + filename);
	RenderedOp renderedOp = JAI.create("fileload", parameterBlock);
	BufferedImage bufferedImage = renderedOp.getAsBufferedImage();
	BufferedImage bufferedImage2 = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
	Graphics2D graphics2d = bufferedImage2.createGraphics();
	graphics2d.drawImage(bufferedImage, 0, 0, 100, 100, null);
	File file = new File(path + "/sm_" + filename);
ImageIO.write(bufferedImage2, "jpg", file);
String file_name = filename;
file_name = URLEncoder.encode(file_name, "UTF-8");
request.setAttribute("file_name", file_name);
RequestDispatcher dispatcher = request.getRequestDispatcher("./test/image_thumbnail_download.jsp");
dispatcher.forward(request, response);
	}

}
