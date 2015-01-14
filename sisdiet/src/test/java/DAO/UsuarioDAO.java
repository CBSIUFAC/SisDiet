package DAO;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.mapping.List;

import entity.Usuario;
import DAO.MasterDAO;

public class UsuarioDAO {

	
	//inserir
		public void inserir(Usuario usuario){
			inserirObjeto(usuario);
		}
		//atualizar
		public void atualizar( usuario){
			Session s = getSession();
			s.beginTransaction();
			s.update(usuario);
			s.getTransaction().commit();
			s.close();
		}
		//deletar
		public void deletar( usuario){
			deletarObjeto(usuario);
		}
		//listar todos os usuarios
		public List<> listar(){
			Session s = getSession();
			s.beginTransaction();
			Query qr = s.createQuery("from  c");
			List<> lista = qr.list();
			s.close();
			return lista;
		}
		
		public  get(int id){
			Session s = getSession();
			s.beginTransaction();
			 c = () s.get(.class, id);
			s.getTransaction().commit();
			s.close();
			return c;
		}
		
		public List<> buscarPorPlaca(String placa){
			Session s = getSession();
			s.beginTransaction();
			Query qr = s.createQuery("from  c where c.placa like :pa");
			qr.setParameter("pa","%"+placa+"%");
			List<> listas = qr.list();
			s.close();
			return listas;
		}
		

		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
