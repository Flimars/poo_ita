package semana_02;

import org.junit.Test;

public class RegistroPontosTest {

	@Test
	public void testPontosCriarTopico() {
		Usuario u = new Usuario();
		u.nome = "Flima";
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarUmTopico(u);
		assertEquals(u.pontos, 5);
	}

	@Test
	public void PontosCriarTopico() {
		
		Usuario u = new Usuario();
		u.nome = "Flima";
		CalculadoraBonus cb = new CalculadoraBonus();
		cb.bonusDoDia = 3;
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarUmTopico(u);
		assertEquals(u.pontos, 15);
	}

	@Test
	public void testPontosCriarTopicoVip() {
		Usuario u = new Usuario();
		u.nome = "Flima";
		u.vip  = true;
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarUmTopico(u);
		assertEquals(u.pontos, 25); 
	}

	/*@Test
	public void testFazerUmComentario() throws Exception {

	}

	@Test
	public void testCriarUmTopico() throws Exception {
		
	}

	@Test
	public void testDarUmLike() throws Exception {

	}*/

}
