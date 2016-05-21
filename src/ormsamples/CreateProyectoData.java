/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class CreateProyectoData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = orm.ProyectoPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Contacto lormContacto = orm.ContactoDAO.createContacto();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : empresaidEmpresa, direccion, ciudadContacto, regionContacto, paisContacto, telefonoContacto, mailContacto, apellidoContacto, nombreContacto, run
			orm.ContactoDAO.save(lormContacto);
			orm.Empresa lormEmpresa = orm.EmpresaDAO.createEmpresa();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : contacto, domicilio, ciudadEmpresa, regionEmpresa, paisEmpresa, telefonoEmpresa, mailEmpresa, representante, nombreEmpresa, razonSocial, rut
			orm.EmpresaDAO.save(lormEmpresa);
			orm.Usuario lormUsuario = orm.UsuarioDAO.createUsuario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : password, usuario
			orm.UsuarioDAO.save(lormUsuario);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateProyectoData createProyectoData = new CreateProyectoData();
			try {
				createProyectoData.createTestData();
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
