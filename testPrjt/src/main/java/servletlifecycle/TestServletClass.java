package servletlifecycle;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/tsc")
public class TestServletClass extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/*
	 * 실행 순서
	 * postConstruct() -> init() -> service(doGet()) -> destroy() -> preDestroy()
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("--doGet()--");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	@PostConstruct
	private void postConstruct() {
		System.out.println("--postConstruct--");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("--init()--");
	}
	
	@Override
	public void destroy() {
		System.out.println("--destory()--");
	}
	
	@PreDestroy
	private void PreDestroy() {
		System.out.println("--preDestroy()--");

	}
}
