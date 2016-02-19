/**
 */
package petrinet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petrinet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.Petrinet#getArcs <em>Arcs</em>}</li>
 *   <li>{@link petrinet.Petrinet#getNodes <em>Nodes</em>}</li>
 *   <li>{@link petrinet.Petrinet#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getPetrinet()
 * @model
 * @generated
 */
public interface Petrinet extends EObject {
	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link petrinet.Arc}.
	 * It is bidirectional and its opposite is '{@link petrinet.Arc#getPetrinet <em>Petrinet</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arcs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' containment reference list.
	 * @see petrinet.PetrinetPackage#getPetrinet_Arcs()
	 * @see petrinet.Arc#getPetrinet
	 * @model opposite="petrinet" containment="true"
	 * @generated
	 */
	EList<Arc> getArcs();

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link petrinet.Node}.
	 * It is bidirectional and its opposite is '{@link petrinet.Node#getPetrinet <em>Petrinet</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see petrinet.PetrinetPackage#getPetrinet_Nodes()
	 * @see petrinet.Node#getPetrinet
	 * @model opposite="petrinet" containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see petrinet.PetrinetPackage#getPetrinet_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link petrinet.Petrinet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Petrinet
