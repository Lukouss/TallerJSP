/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class DeleteProyectoData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = orm.ProyectoPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Contacto lormContacto = orm.ContactoDAO.loadContactoByQuery(null, null);
			// Delete the persistent object
			orm.ContactoDAO.delete(lormContacto);
			orm.Empresa lormEmpresa = orm.EmpresaDAO.loadEmpresaByQuery(null, null);
			// Delete the persistent object
			orm.EmpresaDAO.delete(lormEmpresa);
			orm.Usuario lormUsuario = orm.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Delete the persistent object
			orm.UsuarioDAO.delete(lormUsuario);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteProyectoData deleteProyectoData = new DeleteProyectoData();
			try {
				deleteProyectoData.deleteTestData();
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
