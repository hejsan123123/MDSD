/**
 */
package Classes.Buissnesslayer.impl;

import Classes.Buissnesslayer.Address;
import Classes.Buissnesslayer.BookingHandler;
import Classes.Buissnesslayer.BuissnesslayerPackage;
import Classes.Buissnesslayer.User;
import Classes.Buissnesslayer.UserHandler;

import Classes.Interactionlayer.LoginController;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Classes.Buissnesslayer.impl.UserImpl#getName <em>Name</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.impl.UserImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.impl.UserImpl#getBookingHandler <em>Booking Handler</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.impl.UserImpl#getLogincontroller <em>Logincontroller</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.impl.UserImpl#getUserhandler <em>Userhandler</em>}</li>
 *   <li>{@link Classes.Buissnesslayer.impl.UserImpl#getAddress <em>Address</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UserImpl extends MinimalEObjectImpl.Container implements User {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final char NAME_EDEFAULT = '\u0000';

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected char name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final char EMAIL_EDEFAULT = '\u0000';

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected char email = EMAIL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBookingHandler() <em>Booking Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingHandler()
	 * @generated
	 * @ordered
	 */
	protected BookingHandler bookingHandler;

	/**
	 * The cached value of the '{@link #getLogincontroller() <em>Logincontroller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogincontroller()
	 * @generated
	 * @ordered
	 */
	protected LoginController logincontroller;

	/**
	 * The cached value of the '{@link #getUserhandler() <em>Userhandler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserhandler()
	 * @generated
	 * @ordered
	 */
	protected UserHandler userhandler;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected Address address;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuissnesslayerPackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public char getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(char newName) {
		char oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuissnesslayerPackage.USER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public char getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(char newEmail) {
		char oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuissnesslayerPackage.USER__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingHandler getBookingHandler() {
		if (bookingHandler != null && bookingHandler.eIsProxy()) {
			InternalEObject oldBookingHandler = (InternalEObject)bookingHandler;
			bookingHandler = (BookingHandler)eResolveProxy(oldBookingHandler);
			if (bookingHandler != oldBookingHandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BuissnesslayerPackage.USER__BOOKING_HANDLER, oldBookingHandler, bookingHandler));
			}
		}
		return bookingHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingHandler basicGetBookingHandler() {
		return bookingHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookingHandler(BookingHandler newBookingHandler) {
		BookingHandler oldBookingHandler = bookingHandler;
		bookingHandler = newBookingHandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuissnesslayerPackage.USER__BOOKING_HANDLER, oldBookingHandler, bookingHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoginController getLogincontroller() {
		if (logincontroller != null && logincontroller.eIsProxy()) {
			InternalEObject oldLogincontroller = (InternalEObject)logincontroller;
			logincontroller = (LoginController)eResolveProxy(oldLogincontroller);
			if (logincontroller != oldLogincontroller) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BuissnesslayerPackage.USER__LOGINCONTROLLER, oldLogincontroller, logincontroller));
			}
		}
		return logincontroller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoginController basicGetLogincontroller() {
		return logincontroller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogincontroller(LoginController newLogincontroller) {
		LoginController oldLogincontroller = logincontroller;
		logincontroller = newLogincontroller;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuissnesslayerPackage.USER__LOGINCONTROLLER, oldLogincontroller, logincontroller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserHandler getUserhandler() {
		if (userhandler != null && userhandler.eIsProxy()) {
			InternalEObject oldUserhandler = (InternalEObject)userhandler;
			userhandler = (UserHandler)eResolveProxy(oldUserhandler);
			if (userhandler != oldUserhandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BuissnesslayerPackage.USER__USERHANDLER, oldUserhandler, userhandler));
			}
		}
		return userhandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserHandler basicGetUserhandler() {
		return userhandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserhandler(UserHandler newUserhandler) {
		UserHandler oldUserhandler = userhandler;
		userhandler = newUserhandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuissnesslayerPackage.USER__USERHANDLER, oldUserhandler, userhandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address getAddress() {
		if (address != null && address.eIsProxy()) {
			InternalEObject oldAddress = (InternalEObject)address;
			address = (Address)eResolveProxy(oldAddress);
			if (address != oldAddress) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BuissnesslayerPackage.USER__ADDRESS, oldAddress, address));
			}
		}
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address basicGetAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(Address newAddress) {
		Address oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuissnesslayerPackage.USER__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void enterContactDataStringnameEmailemailAddressadress() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void intbookRoomBookingbooking() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeBookingBookingoldBookingBookingnewBooking() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void cancelBookingBookingbooking() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void attemptCheckInBookingbooking() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void attemptCheckOutBookingbooking() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BuissnesslayerPackage.USER__NAME:
				return getName();
			case BuissnesslayerPackage.USER__EMAIL:
				return getEmail();
			case BuissnesslayerPackage.USER__BOOKING_HANDLER:
				if (resolve) return getBookingHandler();
				return basicGetBookingHandler();
			case BuissnesslayerPackage.USER__LOGINCONTROLLER:
				if (resolve) return getLogincontroller();
				return basicGetLogincontroller();
			case BuissnesslayerPackage.USER__USERHANDLER:
				if (resolve) return getUserhandler();
				return basicGetUserhandler();
			case BuissnesslayerPackage.USER__ADDRESS:
				if (resolve) return getAddress();
				return basicGetAddress();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BuissnesslayerPackage.USER__NAME:
				setName((Character)newValue);
				return;
			case BuissnesslayerPackage.USER__EMAIL:
				setEmail((Character)newValue);
				return;
			case BuissnesslayerPackage.USER__BOOKING_HANDLER:
				setBookingHandler((BookingHandler)newValue);
				return;
			case BuissnesslayerPackage.USER__LOGINCONTROLLER:
				setLogincontroller((LoginController)newValue);
				return;
			case BuissnesslayerPackage.USER__USERHANDLER:
				setUserhandler((UserHandler)newValue);
				return;
			case BuissnesslayerPackage.USER__ADDRESS:
				setAddress((Address)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BuissnesslayerPackage.USER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BuissnesslayerPackage.USER__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case BuissnesslayerPackage.USER__BOOKING_HANDLER:
				setBookingHandler((BookingHandler)null);
				return;
			case BuissnesslayerPackage.USER__LOGINCONTROLLER:
				setLogincontroller((LoginController)null);
				return;
			case BuissnesslayerPackage.USER__USERHANDLER:
				setUserhandler((UserHandler)null);
				return;
			case BuissnesslayerPackage.USER__ADDRESS:
				setAddress((Address)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BuissnesslayerPackage.USER__NAME:
				return name != NAME_EDEFAULT;
			case BuissnesslayerPackage.USER__EMAIL:
				return email != EMAIL_EDEFAULT;
			case BuissnesslayerPackage.USER__BOOKING_HANDLER:
				return bookingHandler != null;
			case BuissnesslayerPackage.USER__LOGINCONTROLLER:
				return logincontroller != null;
			case BuissnesslayerPackage.USER__USERHANDLER:
				return userhandler != null;
			case BuissnesslayerPackage.USER__ADDRESS:
				return address != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BuissnesslayerPackage.USER___ENTER_CONTACT_DATA_STRINGNAME_EMAILEMAIL_ADDRESSADRESS:
				enterContactDataStringnameEmailemailAddressadress();
				return null;
			case BuissnesslayerPackage.USER___INTBOOK_ROOM_BOOKINGBOOKING:
				intbookRoomBookingbooking();
				return null;
			case BuissnesslayerPackage.USER___CHANGE_BOOKING_BOOKINGOLD_BOOKING_BOOKINGNEW_BOOKING:
				changeBookingBookingoldBookingBookingnewBooking();
				return null;
			case BuissnesslayerPackage.USER___CANCEL_BOOKING_BOOKINGBOOKING:
				cancelBookingBookingbooking();
				return null;
			case BuissnesslayerPackage.USER___ATTEMPT_CHECK_IN_BOOKINGBOOKING:
				attemptCheckInBookingbooking();
				return null;
			case BuissnesslayerPackage.USER___ATTEMPT_CHECK_OUT_BOOKINGBOOKING:
				attemptCheckOutBookingbooking();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(", Email: ");
		result.append(email);
		result.append(')');
		return result.toString();
	}

} //UserImpl