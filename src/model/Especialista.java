package model;

import java.util.ArrayList;
import java.util.TreeSet;

public class Especialista {
	private ArrayList<Sapato> sapatos;

	public Especialista() {
		this.sapatos = this.cadastroDeSapatos();
	}

	public TreeSet<Sapato> listarMarcas(String estilo, String cor,
			String tamanho) {
		TreeSet<Sapato> marcas = new TreeSet<Sapato>();

		if (estilo.length() > 0 && cor.length() > 0 && tamanho.length() > 0) {
			marcas = buscarEstiloCorTamanho(estilo, cor, tamanho);
		} else if (estilo.length() > 0 && cor.length() > 0) {
			marcas = buscarEstiloCor(estilo, cor);
		} else if (estilo.length() > 0 && tamanho.length() > 0) {
			marcas = buscarEstiloTamanho(estilo, tamanho);
		} else if (cor.length() > 0 && tamanho.length() > 0) {
			marcas = buscarCorTamanho(cor, tamanho);
		} else if (estilo.length() > 0) {
			marcas = buscarEstilo(estilo);
		} else if (cor.length() > 0) {
			marcas = buscarCor(cor);
		} else if (tamanho.length() > 0) {
			marcas = buscarTamanho(tamanho);
		} else {
			marcas = todas();
		}
		return marcas;
	}

	private TreeSet<Sapato> buscarEstilo(String estilo) {
		TreeSet<Sapato> lista = new TreeSet<Sapato>();
		for (Sapato sapato : sapatos) {
			if (estilo.equals(sapato.getEstilo())) {
				lista.add(sapato);
			}
		}
		return lista;
	}

	private TreeSet<Sapato> buscarCor(String cor) {
		TreeSet<Sapato> lista = new TreeSet<Sapato>();
		for (Sapato sapato : sapatos) {
			if (cor.equals(sapato.getCor())) {
				lista.add(sapato);
			}
		}
		return lista;
	}

	private TreeSet<Sapato> buscarTamanho(String tamanho) {
		TreeSet<Sapato> lista = new TreeSet<Sapato>();
		for (Sapato sapato : sapatos) {
			if (tamanho.equals(sapato.getTamanho())) {
				lista.add(sapato);
			}
		}
		return lista;
	}

	private TreeSet<Sapato> buscarEstiloCor(String estilo, String cor) {
		TreeSet<Sapato> lista = new TreeSet<Sapato>();
		for (Sapato sapato : sapatos) {
			if (estilo.equals(sapato.getEstilo())
					&& cor.equals(sapato.getCor())) {
				lista.add(sapato);
			}
		}
		return lista;
	}

	private TreeSet<Sapato> buscarEstiloTamanho(String estilo, String tamanho) {
		TreeSet<Sapato> lista = new TreeSet<Sapato>();
		for (Sapato sapato : sapatos) {
			if (estilo.equals(sapato.getEstilo())
					&& tamanho.equals(sapato.getTamanho())) {
				lista.add(sapato);
			}
		}
		return lista;
	}

	private TreeSet<Sapato> buscarCorTamanho(String cor, String tamanho) {
		TreeSet<Sapato> lista = new TreeSet<Sapato>();
		for (Sapato sapato : sapatos) {
			if (cor.equals(sapato.getCor())
					&& tamanho.equals(sapato.getTamanho())) {
				lista.add(sapato);
			}
		}
		return lista;
	}

	private TreeSet<Sapato> buscarEstiloCorTamanho(String estilo, String cor,
			String tamanho) {
		TreeSet<Sapato> lista = new TreeSet<Sapato>();
		for (Sapato sapato : sapatos) {
			if (estilo.equals(sapato.getEstilo())
					&& cor.equals(sapato.getCor())
					&& tamanho.equals(sapato.getTamanho())) {
				lista.add(sapato);
			}
		}
		return lista;
	}

	private TreeSet<Sapato> todas() {
		TreeSet<Sapato> lista = new TreeSet<Sapato>();
		for (Sapato sapato : sapatos) {
			lista.add(sapato);
		}
		return lista;
	}

	private ArrayList<Sapato> cadastroDeSapatos() {
		ArrayList<Sapato> sapatos = new ArrayList<Sapato>();

		sapatos.add(new Sapato("Oxford", "Social", "preto", "40",
				"sapato01-preto"));

		sapatos.add(new Sapato("Derby", "Social", "preto", "41",
				"sapato04-preto"));

		sapatos.add(new Sapato("Monk", "Social", "preto", "42",
				"sapato05-preto"));

		sapatos.add(new Sapato("Oxford", "Social", "marron", "40",
				"sapato02-marron"));

		sapatos.add(new Sapato("Derby", "Social", "marron", "41",
				"sapato06-marron"));

		sapatos.add(new Sapato("Monk", "Social", "marron", "42",
				"sapato07-marron"));

		sapatos.add(new Sapato("Oxford", "Social", "branco", "40",
				"sapato03-branco"));

		sapatos.add(new Sapato("Derby", "Social", "branco", "41",
				"sapato08-branco"));

		sapatos.add(new Sapato("Monk", "Social", "branco", "42",
				"sapato09-branco"));

		sapatos.add(new Sapato("Oxford", "Casual", "preto", "40",
				"sapato10-casual-preto"));

		sapatos.add(new Sapato("Derby", "Casual", "preto", "41",
				"sapato11-casual-preto"));

		sapatos.add(new Sapato("Monk", "Casual", "preto", "42",
				"sapato12-casual-preto"));

		sapatos.add(new Sapato("Oxford", "Casual", "marron", "40",
				"sapato13-casual-marron"));

		sapatos.add(new Sapato("Derby", "Casual", "marron", "41",
				"sapato14-casual-marron"));

		sapatos.add(new Sapato("Monk", "Casual", " marron", "42",
				"sapato15-casual-marron"));

		sapatos.add(new Sapato("Oxford", "Casual", "branco", "40",
				"sapato16-casual-branco"));

		sapatos.add(new Sapato("Derby", "Casual", "branco", "41",
				"sapato17-casual-branco"));

		sapatos.add(new Sapato("Monk", "Casual", "branco", "42",
				"sapato18-casual-branco"));

		sapatos.add(new Sapato("Oxford", "Sapatenis", "preto", "40",
				"sapato18-sapatenis-preto"));

		sapatos.add(new Sapato("Derby", "Sapatenis", "preto", "41",
				"sapato19-sapatenis-preto"));

		sapatos.add(new Sapato("Monk", "Sapatenis", "preto", "42",
				"sapato20-sapatenis-preto"));

		sapatos.add(new Sapato("Oxford", "Sapatenis", "marron", "40",
				"sapato21-sapatenis-marron"));

		sapatos.add(new Sapato("Derby", "Sapatenis", "marron", "41",
				"sapato22-sapatenis-marron"));

		sapatos.add(new Sapato("Monk", "Sapatenis", "marron", "42",
				"sapato23-sapatenis-marron"));

		sapatos.add(new Sapato("Oxford", "Sapatenis", "branco", "40",
				"sapato24-sapatenis-branco"));

		sapatos.add(new Sapato("Derby", "Sapatenis", "branco", "41",
				"sapato25-sapatenis-branco"));

		sapatos.add(new Sapato("Monk", "Sapatenis", "branco", "42",
				"sapato26-sapatenis-branco"));

		return sapatos;
	}
}