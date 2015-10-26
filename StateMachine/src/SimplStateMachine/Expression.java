/**
 */
package SimplStateMachine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SimplStateMachine.Expression#getLeft <em>Left</em>}</li>
 *   <li>{@link SimplStateMachine.Expression#getRight <em>Right</em>}</li>
 *   <li>{@link SimplStateMachine.Expression#getOperator <em>Operator</em>}</li>
 *   <li>{@link SimplStateMachine.Expression#get_name <em>name</em>}</li>
 * </ul>
 * </p>
 *
 * @see SimplStateMachine.SimplStateMachinePackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends ExpressionElement {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(ExpressionElement)
	 * @see SimplStateMachine.SimplStateMachinePackage#getExpression_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExpressionElement getLeft();

	/**
	 * Sets the value of the '{@link SimplStateMachine.Expression#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(ExpressionElement value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(ExpressionElement)
	 * @see SimplStateMachine.SimplStateMachinePackage#getExpression_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExpressionElement getRight();

	/**
	 * Sets the value of the '{@link SimplStateMachine.Expression#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(ExpressionElement value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link SimplStateMachine.Operator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see SimplStateMachine.Operator
	 * @see #setOperator(Operator)
	 * @see SimplStateMachine.SimplStateMachinePackage#getExpression_Operator()
	 * @model required="true"
	 * @generated
	 */
	Operator getOperator();

	/**
	 * Sets the value of the '{@link SimplStateMachine.Expression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see SimplStateMachine.Operator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Operator value);

	/**
	 * Returns the value of the '<em><b>name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>name</em>' attribute.
	 * @see #set_name(String)
	 * @see SimplStateMachine.SimplStateMachinePackage#getExpression__name()
	 * @model
	 * @generated
	 */
	String get_name();

	/**
	 * Sets the value of the '{@link SimplStateMachine.Expression#get_name <em>name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>name</em>' attribute.
	 * @see #get_name()
	 * @generated
	 */
	void set_name(String value);

} // Expression
