/**
 * @generated VGen 1.3.3
 */

package ast;

import visitor.*;

//	variableEstructura:definicion -> nombre:String  tipo:tipo

public class VariableEstructura extends AbstractDefinicion {

	public VariableEstructura(String nombre, Tipo tipo) {
		this.nombre = nombre;
		this.tipo = tipo;

		searchForPositions(tipo);	// Obtener linea/columna a partir de los hijos
	}

	public VariableEstructura(Object nombre, Object tipo) {
		this.nombre = (nombre instanceof Token) ? ((Token)nombre).getLexeme() : (String) nombre;
		this.tipo = (Tipo) tipo;

		searchForPositions(nombre, tipo);	// Obtener linea/columna a partir de los hijos
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private String nombre;
	private Tipo tipo;
	private DefinicionEstructura def;
	
	public DefinicionEstructura getDefinicion()
	{
		return def;
	}
	
	public void setDefinicion(DefinicionEstructura def)
	{
		this.def = def;
	}
	
	private int offset;
	@Override
	public int getOffset() {
		return offset;
	}

	@Override
	public void setOffset(int offset) {
		this.offset = offset;		
	}

	
	private int ambito;
	@Override
	public int getAmbito() {
		return ambito;
	}

	@Override
	public void setAmbito(int ambito) {
		this.ambito=ambito;
	}
}

