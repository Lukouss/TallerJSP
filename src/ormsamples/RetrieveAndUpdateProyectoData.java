/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateProyectoData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = orm.ProyectoPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Contacto lormContacto = orm.ContactoDAO.loadContactoByQuery(null, null);
			// Update the properties of the persistent object
			orm.ContactoDAO.save(lormContacto);
			orm.Empresa lormEmpresa = orm.EmpresaDAO.loadEmpresaByQuery(null, null);
			// Update the properties of the persistent object
			orm.EmpresaDAO.save(lormEmpresa);
			orm.Usuario lormUsuario = orm.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Update the properties of the persistent object
			orm.UsuarioDAO.save(lormUsuario);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Contacto by ContactoCriteria");
		orm.ContactoCriteria lormContactoCriteria = new orm.ContactoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormContactoCriteria.idContacto.eq();
		System.out.println(lormContactoCriteria.uniqueContacto());
		
		System.out.println("Retrieving Empresa by EmpresaCriteria");
		orm.EmpresaCriteria lormEmpresaCriteria = new orm.EmpresaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormEmpresaCriteria.idEmpresa.eq();
		System.out.println(lormEmpresaCriteria.uniqueEmpresa());
		
		System.out.println("Retrieving Usuario by UsuarioCriteria");
		orm.UsuarioCriteria lormUsuarioCriteria = new orm.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormUsuarioCriteria.idusuario.eq();
		System.out.println(lormUsuarioCriteria.uniqueUsuario());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateProyectoData retrieveAndUpdateProyectoData = new RetrieveAndUpdateProyectoData();
			try {
				retrieveAndUpdateProyectoData.retrieveAndUpdateTestData();
				//retrieveAndUpdateProyectoData.retrieveByCriteria();
			}
			finally {
				orm.ProyectoPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
