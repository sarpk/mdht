/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ihe.EarsNoseMouthThroatSection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.operations.EarsNoseMouthThroatSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Ears Nose Mouth Throat Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.EarsNoseMouthThroatSection#validateEarsNoseMouthThroatSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ears Nose Mouth Throat Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.EarsNoseMouthThroatSection#validateEarsNoseMouthThroatSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ears Nose Mouth Throat Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.EarsNoseMouthThroatSection#validateEarsNoseMouthThroatSectionProblemEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ears Nose Mouth Throat Section Problem Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.EarsNoseMouthThroatSection#getProblemEntry() <em>Get Problem Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EarsNoseMouthThroatSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEarsNoseMouthThroatSectionTemplateId() {
		OperationsTestCase<EarsNoseMouthThroatSection> validateEarsNoseMouthThroatSectionTemplateIdTestCase = new OperationsTestCase<EarsNoseMouthThroatSection>(
			"validateEarsNoseMouthThroatSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_EARS_NOSE_MOUTH_THROAT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EarsNoseMouthThroatSection target) {

			}

			@Override
			protected void updateToPass(EarsNoseMouthThroatSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EarsNoseMouthThroatSectionOperations.validateEarsNoseMouthThroatSectionTemplateId(
					(EarsNoseMouthThroatSection) objectToTest, diagnostician, map);
			}

		};

		validateEarsNoseMouthThroatSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEarsNoseMouthThroatSectionCode() {
		OperationsTestCase<EarsNoseMouthThroatSection> validateEarsNoseMouthThroatSectionCodeTestCase = new OperationsTestCase<EarsNoseMouthThroatSection>(
			"validateEarsNoseMouthThroatSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_EARS_NOSE_MOUTH_THROAT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EarsNoseMouthThroatSection target) {

			}

			@Override
			protected void updateToPass(EarsNoseMouthThroatSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EarsNoseMouthThroatSectionOperations.validateEarsNoseMouthThroatSectionCode(
					(EarsNoseMouthThroatSection) objectToTest, diagnostician, map);
			}

		};

		validateEarsNoseMouthThroatSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateEarsNoseMouthThroatSectionProblemEntry() {
		OperationsTestCase<EarsNoseMouthThroatSection> validateEarsNoseMouthThroatSectionProblemEntryTestCase = new OperationsTestCase<EarsNoseMouthThroatSection>(
			"validateEarsNoseMouthThroatSectionProblemEntry",
			operationsForOCL.getOCLValue("VALIDATE_EARS_NOSE_MOUTH_THROAT_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EarsNoseMouthThroatSection target) {
				target.init();
			}

			@Override
			protected void updateToPass(EarsNoseMouthThroatSection target) {

				target.addObservation(IHEFactory.eINSTANCE.createProblemEntry().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EarsNoseMouthThroatSectionOperations.validateEarsNoseMouthThroatSectionProblemEntry(
					(EarsNoseMouthThroatSection) objectToTest, diagnostician, map);
			}

		};

		validateEarsNoseMouthThroatSectionProblemEntryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemEntry() {

		EarsNoseMouthThroatSection target = objectFactory.create();
		target.getProblemEntry();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EarsNoseMouthThroatSectionOperations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass().getDeclaredField(fieldName).get(this);
			} catch (Exception e) {
				oclValue = "NO OCL FOUND FOR PROPERTY " + fieldName;
			}
			return oclValue;
		}
	}

	/**
	*
	* @generated
	*/
	private static class ObjectFactory implements TestObjectFactory<EarsNoseMouthThroatSection> {
		public EarsNoseMouthThroatSection create() {
			return IHEFactory.eINSTANCE.createEarsNoseMouthThroatSection();
		}
	}

	/**
	*
	* @generated
	*/
	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	/**
	*
	* @generated
	*/
	private static ObjectFactory objectFactory = new ObjectFactory();

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	private static class ConstructorTestClass extends EarsNoseMouthThroatSectionOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		@SuppressWarnings("unused")
		ConstructorTestClass constructorTestClass = new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // EarsNoseMouthThroatSectionOperations
