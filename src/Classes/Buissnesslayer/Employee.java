/**
 */
package Classes.Buissnesslayer;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Classes.Buissnesslayer.Employee#getID <em>ID</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.Employee#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getEmployee()
 * @model
 * @generated
 */
public interface Employee extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(int)
	 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getEmployee_ID()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getID();

	/**
	 * Sets the value of the '{@link Classes.Buissnesslayer.Employee#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(int value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(char)
	 * @see Classes.Buissnesslayer.BuissnesslayerPackage#getEmployee_Password()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	char getPassword();

	/**
	 * Sets the value of the '{@link Classes.Buissnesslayer.Employee#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(char value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingRequired="true" bookingOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='int bookRoom'"
	 * @generated
	 */
	void intbookRoom(Booking booking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model oldBookingRequired="true" oldBookingOrdered="false" newBookingRequired="true" newBookingOrdered="false"
	 * @generated
	 */
	void changeBooking(Booking oldBooking, Booking newBooking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	void cancelBooking(Booking booking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	void attemptCheckIn(Booking booking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	void attemptCheckOut(Booking booking);

} // Employee
