/*******************************************************************************
 * Copyright (c) 2018 Fraunhofer IEM, Paderborn, Germany.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Johannes Spaeth - initial API and implementation
 *******************************************************************************/
package boomerang.jimple;

import soot.SootMethod;
import soot.Value;
import soot.jimple.NewExpr;

public class AllocVal extends Val {

	private Value alloc;

	public AllocVal(Value v, SootMethod m, Value alloc) {
		super(v, m);
		this.alloc = alloc;
	}

	@Override
	public String toString() {
		return super.toString() + " Value: "+ alloc;
	}
	
	public Value allocationValue(){
		return alloc;
	}

	@Override
	public boolean isNewExpr() {
		return alloc instanceof NewExpr;
	}
}
