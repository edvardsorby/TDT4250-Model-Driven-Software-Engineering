/**
 */
package assignment2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see assignment2.Assignment2Factory
 * @model kind="package"
 * @generated
 */
public interface Assignment2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "assignment2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/assignment2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "assignment2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Assignment2Package eINSTANCE = assignment2.impl.Assignment2PackageImpl.init();

	/**
	 * The meta object id for the '{@link assignment2.impl.AppImpl <em>App</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment2.impl.AppImpl
	 * @see assignment2.impl.Assignment2PackageImpl#getApp()
	 * @generated
	 */
	int APP = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__RULES = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Board</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__BOARD = 3;

	/**
	 * The feature id for the '<em><b>Single Player</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__SINGLE_PLAYER = 4;

	/**
	 * The feature id for the '<em><b>Multi Player</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__MULTI_PLAYER = 5;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__ALGORITHM = 6;

	/**
	 * The feature id for the '<em><b>Online</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__ONLINE = 7;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__PLATFORM = 8;

	/**
	 * The feature id for the '<em><b>Multi Platform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__MULTI_PLATFORM = 9;

	/**
	 * The number of structural features of the '<em>App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assignment2.impl.RulesImpl <em>Rules</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment2.impl.RulesImpl
	 * @see assignment2.impl.Assignment2PackageImpl#getRules()
	 * @generated
	 */
	int RULES = 1;

	/**
	 * The feature id for the '<em><b>Customizable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES__CUSTOMIZABLE = 0;

	/**
	 * The feature id for the '<em><b>Maximum Players</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES__MAXIMUM_PLAYERS = 1;

	/**
	 * The feature id for the '<em><b>Minimum Players</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES__MINIMUM_PLAYERS = 2;

	/**
	 * The number of structural features of the '<em>Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assignment2.impl.BoardImpl <em>Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment2.impl.BoardImpl
	 * @see assignment2.impl.Assignment2PackageImpl#getBoard()
	 * @generated
	 */
	int BOARD = 2;

	/**
	 * The feature id for the '<em><b>Standard Start Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__STANDARD_START_POINT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__NAME = 1;

	/**
	 * The feature id for the '<em><b>Sheets Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__SHEETS_CONFIG = 2;

	/**
	 * The number of structural features of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assignment2.impl.AlgorithmImpl <em>Algorithm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment2.impl.AlgorithmImpl
	 * @see assignment2.impl.Assignment2PackageImpl#getAlgorithm()
	 * @generated
	 */
	int ALGORITHM = 3;

	/**
	 * The number of structural features of the '<em>Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assignment2.impl.SolverImpl <em>Solver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment2.impl.SolverImpl
	 * @see assignment2.impl.Assignment2PackageImpl#getSolver()
	 * @generated
	 */
	int SOLVER = 4;

	/**
	 * The number of structural features of the '<em>Solver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_FEATURE_COUNT = ALGORITHM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Solver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVER_OPERATION_COUNT = ALGORITHM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link assignment2.impl.ProblemGeneratorImpl <em>Problem Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment2.impl.ProblemGeneratorImpl
	 * @see assignment2.impl.Assignment2PackageImpl#getProblemGenerator()
	 * @generated
	 */
	int PROBLEM_GENERATOR = 5;

	/**
	 * The number of structural features of the '<em>Problem Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_GENERATOR_FEATURE_COUNT = ALGORITHM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Problem Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBLEM_GENERATOR_OPERATION_COUNT = ALGORITHM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link assignment2.impl.PlatformImpl <em>Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment2.impl.PlatformImpl
	 * @see assignment2.impl.Assignment2PackageImpl#getPlatform()
	 * @generated
	 */
	int PLATFORM = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__NAME = 0;

	/**
	 * The number of structural features of the '<em>Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assignment2.impl.SheetsConfigImpl <em>Sheets Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment2.impl.SheetsConfigImpl
	 * @see assignment2.impl.Assignment2PackageImpl#getSheetsConfig()
	 * @generated
	 */
	int SHEETS_CONFIG = 7;

	/**
	 * The feature id for the '<em><b>Ranking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEETS_CONFIG__RANKING = 0;

	/**
	 * The feature id for the '<em><b>Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEETS_CONFIG__SHEET = 1;

	/**
	 * The feature id for the '<em><b>Player</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEETS_CONFIG__PLAYER = 2;

	/**
	 * The feature id for the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEETS_CONFIG__SCORE = 3;

	/**
	 * The number of structural features of the '<em>Sheets Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEETS_CONFIG_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Sheets Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEETS_CONFIG_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link assignment2.App <em>App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App</em>'.
	 * @see assignment2.App
	 * @generated
	 */
	EClass getApp();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.App#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see assignment2.App#getName()
	 * @see #getApp()
	 * @generated
	 */
	EAttribute getApp_Name();

	/**
	 * Returns the meta object for the reference '{@link assignment2.App#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rules</em>'.
	 * @see assignment2.App#getRules()
	 * @see #getApp()
	 * @generated
	 */
	EReference getApp_Rules();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.App#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see assignment2.App#getDescription()
	 * @see #getApp()
	 * @generated
	 */
	EAttribute getApp_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link assignment2.App#getBoard <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Board</em>'.
	 * @see assignment2.App#getBoard()
	 * @see #getApp()
	 * @generated
	 */
	EReference getApp_Board();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.App#isSinglePlayer <em>Single Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Single Player</em>'.
	 * @see assignment2.App#isSinglePlayer()
	 * @see #getApp()
	 * @generated
	 */
	EAttribute getApp_SinglePlayer();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.App#isMultiPlayer <em>Multi Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi Player</em>'.
	 * @see assignment2.App#isMultiPlayer()
	 * @see #getApp()
	 * @generated
	 */
	EAttribute getApp_MultiPlayer();

	/**
	 * Returns the meta object for the reference list '{@link assignment2.App#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Algorithm</em>'.
	 * @see assignment2.App#getAlgorithm()
	 * @see #getApp()
	 * @generated
	 */
	EReference getApp_Algorithm();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.App#isOnline <em>Online</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Online</em>'.
	 * @see assignment2.App#isOnline()
	 * @see #getApp()
	 * @generated
	 */
	EAttribute getApp_Online();

	/**
	 * Returns the meta object for the reference list '{@link assignment2.App#getPlatform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Platform</em>'.
	 * @see assignment2.App#getPlatform()
	 * @see #getApp()
	 * @generated
	 */
	EReference getApp_Platform();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.App#isMultiPlatform <em>Multi Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi Platform</em>'.
	 * @see assignment2.App#isMultiPlatform()
	 * @see #getApp()
	 * @generated
	 */
	EAttribute getApp_MultiPlatform();

	/**
	 * Returns the meta object for class '{@link assignment2.Rules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rules</em>'.
	 * @see assignment2.Rules
	 * @generated
	 */
	EClass getRules();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.Rules#isCustomizable <em>Customizable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customizable</em>'.
	 * @see assignment2.Rules#isCustomizable()
	 * @see #getRules()
	 * @generated
	 */
	EAttribute getRules_Customizable();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.Rules#getMaximumPlayers <em>Maximum Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Players</em>'.
	 * @see assignment2.Rules#getMaximumPlayers()
	 * @see #getRules()
	 * @generated
	 */
	EAttribute getRules_MaximumPlayers();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.Rules#getMinimumPlayers <em>Minimum Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Players</em>'.
	 * @see assignment2.Rules#getMinimumPlayers()
	 * @see #getRules()
	 * @generated
	 */
	EAttribute getRules_MinimumPlayers();

	/**
	 * Returns the meta object for class '{@link assignment2.Board <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Board</em>'.
	 * @see assignment2.Board
	 * @generated
	 */
	EClass getBoard();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.Board#isStandardStartPoint <em>Standard Start Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Start Point</em>'.
	 * @see assignment2.Board#isStandardStartPoint()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_StandardStartPoint();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.Board#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see assignment2.Board#getName()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_Name();

	/**
	 * Returns the meta object for the containment reference '{@link assignment2.Board#getSheetsConfig <em>Sheets Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sheets Config</em>'.
	 * @see assignment2.Board#getSheetsConfig()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_SheetsConfig();

	/**
	 * Returns the meta object for class '{@link assignment2.Algorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Algorithm</em>'.
	 * @see assignment2.Algorithm
	 * @generated
	 */
	EClass getAlgorithm();

	/**
	 * Returns the meta object for class '{@link assignment2.Solver <em>Solver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solver</em>'.
	 * @see assignment2.Solver
	 * @generated
	 */
	EClass getSolver();

	/**
	 * Returns the meta object for class '{@link assignment2.ProblemGenerator <em>Problem Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Problem Generator</em>'.
	 * @see assignment2.ProblemGenerator
	 * @generated
	 */
	EClass getProblemGenerator();

	/**
	 * Returns the meta object for class '{@link assignment2.Platform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform</em>'.
	 * @see assignment2.Platform
	 * @generated
	 */
	EClass getPlatform();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.Platform#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see assignment2.Platform#getName()
	 * @see #getPlatform()
	 * @generated
	 */
	EAttribute getPlatform_Name();

	/**
	 * Returns the meta object for class '{@link assignment2.SheetsConfig <em>Sheets Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sheets Config</em>'.
	 * @see assignment2.SheetsConfig
	 * @generated
	 */
	EClass getSheetsConfig();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.SheetsConfig#getRanking <em>Ranking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ranking</em>'.
	 * @see assignment2.SheetsConfig#getRanking()
	 * @see #getSheetsConfig()
	 * @generated
	 */
	EAttribute getSheetsConfig_Ranking();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.SheetsConfig#getSheet <em>Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sheet</em>'.
	 * @see assignment2.SheetsConfig#getSheet()
	 * @see #getSheetsConfig()
	 * @generated
	 */
	EAttribute getSheetsConfig_Sheet();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.SheetsConfig#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Player</em>'.
	 * @see assignment2.SheetsConfig#getPlayer()
	 * @see #getSheetsConfig()
	 * @generated
	 */
	EAttribute getSheetsConfig_Player();

	/**
	 * Returns the meta object for the attribute '{@link assignment2.SheetsConfig#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Score</em>'.
	 * @see assignment2.SheetsConfig#getScore()
	 * @see #getSheetsConfig()
	 * @generated
	 */
	EAttribute getSheetsConfig_Score();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Assignment2Factory getAssignment2Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link assignment2.impl.AppImpl <em>App</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment2.impl.AppImpl
		 * @see assignment2.impl.Assignment2PackageImpl#getApp()
		 * @generated
		 */
		EClass APP = eINSTANCE.getApp();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP__NAME = eINSTANCE.getApp_Name();
		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__RULES = eINSTANCE.getApp_Rules();
		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP__DESCRIPTION = eINSTANCE.getApp_Description();
		/**
		 * The meta object literal for the '<em><b>Board</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__BOARD = eINSTANCE.getApp_Board();
		/**
		 * The meta object literal for the '<em><b>Single Player</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP__SINGLE_PLAYER = eINSTANCE.getApp_SinglePlayer();
		/**
		 * The meta object literal for the '<em><b>Multi Player</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP__MULTI_PLAYER = eINSTANCE.getApp_MultiPlayer();
		/**
		 * The meta object literal for the '<em><b>Algorithm</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__ALGORITHM = eINSTANCE.getApp_Algorithm();
		/**
		 * The meta object literal for the '<em><b>Online</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP__ONLINE = eINSTANCE.getApp_Online();
		/**
		 * The meta object literal for the '<em><b>Platform</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__PLATFORM = eINSTANCE.getApp_Platform();
		/**
		 * The meta object literal for the '<em><b>Multi Platform</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP__MULTI_PLATFORM = eINSTANCE.getApp_MultiPlatform();
		/**
		 * The meta object literal for the '{@link assignment2.impl.RulesImpl <em>Rules</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment2.impl.RulesImpl
		 * @see assignment2.impl.Assignment2PackageImpl#getRules()
		 * @generated
		 */
		EClass RULES = eINSTANCE.getRules();
		/**
		 * The meta object literal for the '<em><b>Customizable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULES__CUSTOMIZABLE = eINSTANCE.getRules_Customizable();
		/**
		 * The meta object literal for the '<em><b>Maximum Players</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULES__MAXIMUM_PLAYERS = eINSTANCE.getRules_MaximumPlayers();
		/**
		 * The meta object literal for the '<em><b>Minimum Players</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULES__MINIMUM_PLAYERS = eINSTANCE.getRules_MinimumPlayers();
		/**
		 * The meta object literal for the '{@link assignment2.impl.BoardImpl <em>Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment2.impl.BoardImpl
		 * @see assignment2.impl.Assignment2PackageImpl#getBoard()
		 * @generated
		 */
		EClass BOARD = eINSTANCE.getBoard();
		/**
		 * The meta object literal for the '<em><b>Standard Start Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD__STANDARD_START_POINT = eINSTANCE.getBoard_StandardStartPoint();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD__NAME = eINSTANCE.getBoard_Name();
		/**
		 * The meta object literal for the '<em><b>Sheets Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD__SHEETS_CONFIG = eINSTANCE.getBoard_SheetsConfig();
		/**
		 * The meta object literal for the '{@link assignment2.impl.AlgorithmImpl <em>Algorithm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment2.impl.AlgorithmImpl
		 * @see assignment2.impl.Assignment2PackageImpl#getAlgorithm()
		 * @generated
		 */
		EClass ALGORITHM = eINSTANCE.getAlgorithm();
		/**
		 * The meta object literal for the '{@link assignment2.impl.SolverImpl <em>Solver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment2.impl.SolverImpl
		 * @see assignment2.impl.Assignment2PackageImpl#getSolver()
		 * @generated
		 */
		EClass SOLVER = eINSTANCE.getSolver();
		/**
		 * The meta object literal for the '{@link assignment2.impl.ProblemGeneratorImpl <em>Problem Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment2.impl.ProblemGeneratorImpl
		 * @see assignment2.impl.Assignment2PackageImpl#getProblemGenerator()
		 * @generated
		 */
		EClass PROBLEM_GENERATOR = eINSTANCE.getProblemGenerator();
		/**
		 * The meta object literal for the '{@link assignment2.impl.PlatformImpl <em>Platform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment2.impl.PlatformImpl
		 * @see assignment2.impl.Assignment2PackageImpl#getPlatform()
		 * @generated
		 */
		EClass PLATFORM = eINSTANCE.getPlatform();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATFORM__NAME = eINSTANCE.getPlatform_Name();
		/**
		 * The meta object literal for the '{@link assignment2.impl.SheetsConfigImpl <em>Sheets Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment2.impl.SheetsConfigImpl
		 * @see assignment2.impl.Assignment2PackageImpl#getSheetsConfig()
		 * @generated
		 */
		EClass SHEETS_CONFIG = eINSTANCE.getSheetsConfig();
		/**
		 * The meta object literal for the '<em><b>Ranking</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHEETS_CONFIG__RANKING = eINSTANCE.getSheetsConfig_Ranking();
		/**
		 * The meta object literal for the '<em><b>Sheet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHEETS_CONFIG__SHEET = eINSTANCE.getSheetsConfig_Sheet();
		/**
		 * The meta object literal for the '<em><b>Player</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHEETS_CONFIG__PLAYER = eINSTANCE.getSheetsConfig_Player();
		/**
		 * The meta object literal for the '<em><b>Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHEETS_CONFIG__SCORE = eINSTANCE.getSheetsConfig_Score();

	}

} //Assignment2Package
