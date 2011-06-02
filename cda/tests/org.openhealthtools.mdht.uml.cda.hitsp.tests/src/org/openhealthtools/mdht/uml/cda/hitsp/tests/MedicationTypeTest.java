
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationType;

import org.openhealthtools.mdht.uml.cda.hitsp.operations.MedicationTypeOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest.TestObjectFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Type</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationType#validateMedicationTypeTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Type Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationType#validateMedicationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Type Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class MedicationTypeTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateMedicationTypeTemplateId() {
			OperationsTestCase<MedicationType> validateMedicationTypeTemplateIdTestCase = new OperationsTestCase<MedicationType>(
			"validateMedicationTypeTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_TYPE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(MedicationType target) {

			}

			@Override
			protected void updateToPass(MedicationType target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MedicationTypeOperations.validateMedicationTypeTemplateId(
					(MedicationType) objectToTest, diagnostician, map);
			}

		};

		validateMedicationTypeTemplateIdTestCase.doValidationTest();
}		



/**
*
* @generated
*/
@Test

 
									
public void testValidateMedicationTypeCode() {
			OperationsTestCase<MedicationType> validateMedicationTypeCodeTestCase = new OperationsTestCase<MedicationType>(
			"validateMedicationTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(MedicationType target) {

			}

			@Override
			protected void updateToPass(MedicationType target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MedicationTypeOperations.validateMedicationTypeCode(
					(MedicationType) objectToTest, diagnostician, map);
			}

		};

		validateMedicationTypeCodeTestCase.doValidationTest();
}		



/**
*
* @generated
*/
	private static class OperationsForOCL extends MedicationTypeOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicationType> {
		public MedicationType create() {		
			return HITSPFactory.eINSTANCE.createMedicationType();
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
*
* @generated
*/
	@Override
	protected EObject getObjectToTest() {		
		return null;
	}
	
} // MedicationTypeOperations