/**
 * @generated VGen 1.3.3
 */

package ast;

import visitor.*;

//	printsp:sentencia -> expresion:expresion

public class Printsp extends AbstractSentencia {

	public Printsp(Expresion expresion) {
		this.expresion = expresion;

		searchForPositions(expresion);	// Obtener linea/columna a partir de los hijos
	}

	public Printsp(Object expresion) {
		this.expresion = (Expresion) expresion;

		searchForPositions(expresion);	// Obtener linea/columna a partir de los hijos
	}

	public Expresion getExpresion() {
		return expresion;
	}
	public void setExpresion(Expresion expresion) {
		this.expresion = expresion;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expresion expresion;
	
	private DefinicionFuncion miFunc;
	@Override
	public void setFuncion(DefinicionFuncion node) {
		miFunc = node;
	}
	public DefinicionFuncion getFuncion()
	{
		return miFunc;
	}
}

