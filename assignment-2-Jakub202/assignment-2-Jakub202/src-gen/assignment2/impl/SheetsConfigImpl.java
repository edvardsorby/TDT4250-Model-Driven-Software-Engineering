/**
 */
package assignment2.impl;

import assignment2.Assignment2Package;
import assignment2.SheetsConfig;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sheets Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assignment2.impl.SheetsConfigImpl#getRanking <em>Ranking</em>}</li>
 *   <li>{@link assignment2.impl.SheetsConfigImpl#getSheet <em>Sheet</em>}</li>
 *   <li>{@link assignment2.impl.SheetsConfigImpl#getPlayer <em>Player</em>}</li>
 *   <li>{@link assignment2.impl.SheetsConfigImpl#getScore <em>Score</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SheetsConfigImpl extends MinimalEObjectImpl.Container implements SheetsConfig {
	/**
	 * The default value of the '{@link #getRanking() <em>Ranking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRanking()
	 * @generated
	 * @ordered
	 */
	protected static final String RANKING_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRanking() <em>Ranking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRanking()
	 * @generated
	 * @ordered
	 */
	protected String ranking = RANKING_EDEFAULT;
	/**
	 * The default value of the '{@link #getSheet() <em>Sheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheet()
	 * @generated
	 * @ordered
	 */
	protected static final String SHEET_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSheet() <em>Sheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheet()
	 * @generated
	 * @ordered
	 */
	protected String sheet = SHEET_EDEFAULT;
	/**
	 * The default value of the '{@link #getPlayer() <em>Player</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayer()
	 * @generated
	 * @ordered
	 */
	protected static final String PLAYER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPlayer() <em>Player</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayer()
	 * @generated
	 * @ordered
	 */
	protected String player = PLAYER_EDEFAULT;
	/**
	 * The default value of the '{@link #getScore() <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected static final String SCORE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getScore() <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected String score = SCORE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SheetsConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Assignment2Package.Literals.SHEETS_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRanking() {
		return ranking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRanking(String newRanking) {
		String oldRanking = ranking;
		ranking = newRanking;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.SHEETS_CONFIG__RANKING, oldRanking,
					ranking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSheet() {
		return sheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSheet(String newSheet) {
		String oldSheet = sheet;
		sheet = newSheet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.SHEETS_CONFIG__SHEET, oldSheet,
					sheet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPlayer() {
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlayer(String newPlayer) {
		String oldPlayer = player;
		player = newPlayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.SHEETS_CONFIG__PLAYER, oldPlayer,
					player));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScore() {
		return score;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScore(String newScore) {
		String oldScore = score;
		score = newScore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment2Package.SHEETS_CONFIG__SCORE, oldScore,
					score));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Assignment2Package.SHEETS_CONFIG__RANKING:
			return getRanking();
		case Assignment2Package.SHEETS_CONFIG__SHEET:
			return getSheet();
		case Assignment2Package.SHEETS_CONFIG__PLAYER:
			return getPlayer();
		case Assignment2Package.SHEETS_CONFIG__SCORE:
			return getScore();
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
		case Assignment2Package.SHEETS_CONFIG__RANKING:
			setRanking((String) newValue);
			return;
		case Assignment2Package.SHEETS_CONFIG__SHEET:
			setSheet((String) newValue);
			return;
		case Assignment2Package.SHEETS_CONFIG__PLAYER:
			setPlayer((String) newValue);
			return;
		case Assignment2Package.SHEETS_CONFIG__SCORE:
			setScore((String) newValue);
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
		case Assignment2Package.SHEETS_CONFIG__RANKING:
			setRanking(RANKING_EDEFAULT);
			return;
		case Assignment2Package.SHEETS_CONFIG__SHEET:
			setSheet(SHEET_EDEFAULT);
			return;
		case Assignment2Package.SHEETS_CONFIG__PLAYER:
			setPlayer(PLAYER_EDEFAULT);
			return;
		case Assignment2Package.SHEETS_CONFIG__SCORE:
			setScore(SCORE_EDEFAULT);
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
		case Assignment2Package.SHEETS_CONFIG__RANKING:
			return RANKING_EDEFAULT == null ? ranking != null : !RANKING_EDEFAULT.equals(ranking);
		case Assignment2Package.SHEETS_CONFIG__SHEET:
			return SHEET_EDEFAULT == null ? sheet != null : !SHEET_EDEFAULT.equals(sheet);
		case Assignment2Package.SHEETS_CONFIG__PLAYER:
			return PLAYER_EDEFAULT == null ? player != null : !PLAYER_EDEFAULT.equals(player);
		case Assignment2Package.SHEETS_CONFIG__SCORE:
			return SCORE_EDEFAULT == null ? score != null : !SCORE_EDEFAULT.equals(score);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Ranking: ");
		result.append(ranking);
		result.append(", Sheet: ");
		result.append(sheet);
		result.append(", Player: ");
		result.append(player);
		result.append(", Score: ");
		result.append(score);
		result.append(')');
		return result.toString();
	}

} //SheetsConfigImpl
