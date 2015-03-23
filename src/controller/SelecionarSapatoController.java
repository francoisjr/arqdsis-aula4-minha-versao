package controller;

import java.io.IOException;
import java.util.TreeSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Sapato;
import model.Especialista;

/**
 * Servlet implementation class SelecionarCervejasController
 */
@WebServlet("/selecao")
public class SelecionarSapatoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String estilo = request.getParameter("estilo");
		String cor = request.getParameter("cor");
		String tamanho = request.getParameter("tamanho");
		Especialista esp = new Especialista();
		TreeSet<Sapato> lista = esp.listarMarcas(estilo, cor, tamanho);
		request.setAttribute("listaDeMarcas", lista);

		RequestDispatcher view = request.getRequestDispatcher("resultado.jsp");
		view.forward(request, response);

	}
}