/******************************************************************************* 
 * Copyright (c) 2011 Red Hat, Inc. 
 * Distributed under license by Red Hat, Inc. All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 ******************************************************************************/
package org.jboss.tools.cdi.seam.solder.core.validation;

import org.eclipse.osgi.util.NLS;

/**
 * 
 * @author Viacheslav Kabanovich
 *
 */
public class SeamSolderValidationMessages {

	private static final String BUNDLE_NAME = SeamSolderValidationMessages.class.getPackage().getName() + ".messages"; //$NON-NLS-1$
	
	public static String AMBIGUOUS_GENERIC_CONFIGURATION_POINT;
	public static String WRONG_TYPE_OF_GENERIC_CONFIGURATION_POINT;
	public static String WRONG_GENERIC_CONFIGURATION_ANNOTATION_REFERENCE;
	public static String GENERIC_CONFIGURATION_TYPE_IS_A_GENERIC_BEAN;

	public static String DEFAULT_PRODUCER_FIELD_ON_NORMAL_SCOPED_BEAN;
	public static String IDENTICAL_DEFAULT_BEANS;

	static {
		NLS.initializeMessages(BUNDLE_NAME, SeamSolderValidationMessages.class);
	}

}
