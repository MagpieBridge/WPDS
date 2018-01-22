/*******************************************************************************
 * Copyright (c) 2018 Fraunhofer IEM, Paderborn, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Johannes Spaeth - initial API and implementation
 *******************************************************************************/
package pathexpression;

public class Epsilon<V> implements IRegEx<V> {
  private V v;

  public Epsilon(V v) {
    this.v = v;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((v == null) ? 0 : v.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Epsilon other = (Epsilon) obj;
    if (v == null) {
      if (other.v != null)
        return false;
    } else if (!v.equals(other.v))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "EPS:" + v.toString();
  }
}
