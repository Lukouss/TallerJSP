/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package orm;

public class Contacto {
	public Contacto() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_CONTACTO_EMPRESAIDEMPRESA) {
			this.empresaidEmpresa = (orm.Empresa) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int idContacto;
	
	private String run;
	
	private String nombreContacto;
	
	private String apellidoContacto;
	
	private String mailContacto;
	
	private String telefonoContacto;
	
	private String paisContacto;
	
	private String regionContacto;
	
	private String ciudadContacto;
	
	private String direccion;
	
	private String img;
	
	private String bitacora;
	
	private orm.Empresa empresaidEmpresa;
	
	private void setIdContacto(int value) {
		this.idContacto = value;
	}
	
	public int getIdContacto() {
		return idContacto;
	}
	
	public int getORMID() {
		return getIdContacto();
	}
	
	public void setRun(String value) {
		this.run = value;
	}
	
	public String getRun() {
		return run;
	}
	
	public void setNombreContacto(String value) {
		this.nombreContacto = value;
	}
	
	public String getNombreContacto() {
		return nombreContacto;
	}
	
	public void setApellidoContacto(String value) {
		this.apellidoContacto = value;
	}
	
	public String getApellidoContacto() {
		return apellidoContacto;
	}
	
	public void setMailContacto(String value) {
		this.mailContacto = value;
	}
	
	public String getMailContacto() {
		return mailContacto;
	}
	
	public void setTelefonoContacto(String value) {
		this.telefonoContacto = value;
	}
	
	public String getTelefonoContacto() {
		return telefonoContacto;
	}
	
	public void setPaisContacto(String value) {
		this.paisContacto = value;
	}
	
	public String getPaisContacto() {
		return paisContacto;
	}
	
	public void setRegionContacto(String value) {
		this.regionContacto = value;
	}
	
	public String getRegionContacto() {
		return regionContacto;
	}
	
	public void setCiudadContacto(String value) {
		this.ciudadContacto = value;
	}
	
	public String getCiudadContacto() {
		return ciudadContacto;
	}
	
	public void setDireccion(String value) {
		this.direccion = value;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setImg(String value) {
		this.img = value;
	}
	
	public String getImg() {
		return img;
	}
	
	public void setBitacora(String value) {
		this.bitacora = value;
	}
	
	public String getBitacora() {
		return bitacora;
	}
	
	public void setEmpresaidEmpresa(orm.Empresa value) {
		if (empresaidEmpresa != null) {
			empresaidEmpresa.contacto.remove(this);
		}
		if (value != null) {
			value.contacto.add(this);
		}
	}
	
	public orm.Empresa getEmpresaidEmpresa() {
		return empresaidEmpresa;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_EmpresaidEmpresa(orm.Empresa value) {
		this.empresaidEmpresa = value;
	}
	
	private orm.Empresa getORM_EmpresaidEmpresa() {
		return empresaidEmpresa;
	}
	
	public String toString() {
		return String.valueOf(getIdContacto());
	}
	
}
