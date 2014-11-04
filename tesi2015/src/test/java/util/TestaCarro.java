package util;

import org.hibernate.Session;

public class TestaCarro {

	public static void main(String[] args) {
//		cria��o da sess�o
		Session s = HibernateUtil.getSessionFactory().openSession();
		s.beginTransaction();
		Carro c = new Carro();
		c.setAno(2014);
		c.setCombustivel("Flex");
		c.setPlaca("MZZ-5999");
		s.save(c);
		s.getTransaction().commit();
		s.close();
	}

}
