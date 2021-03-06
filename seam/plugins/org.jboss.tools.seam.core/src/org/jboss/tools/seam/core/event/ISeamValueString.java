 /*******************************************************************************
  * Copyright (c) 2007 Red Hat, Inc.
  * Distributed under license by Red Hat, Inc. All rights reserved.
  * This program is made available under the terms of the
  * Eclipse Public License v1.0 which accompanies this distribution,
  * and is available at http://www.eclipse.org/legal/epl-v10.html
  *
  * Contributor:
  *     Red Hat, Inc. - initial API and implementation
  ******************************************************************************/
package org.jboss.tools.seam.core.event;

import org.jboss.tools.common.model.project.ext.IValueInfo;

/**
 * @author Viacheslav Kabanovich
 */
public interface ISeamValueString extends ISeamValue {
	
	/**
	 * Returns value info object that includes string value 
	 * of seam property and its position in source.
	 * @return value info object
	 */
	public IValueInfo getValue();

	public ISeamValueString clone() throws CloneNotSupportedException;

}
