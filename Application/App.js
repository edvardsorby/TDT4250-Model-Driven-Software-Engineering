import AddSudoku from './screens/addSudoku';
import Home from './screens/home';
import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';
import StartSudoku from './screens/startSudoku.js';
import PlaySudoku from './screens/playSudoku.js';
import SudokuList from './screens/sudokuList.js';
import TicTacToe from './screens/tictactoe.js';
import {useTranslation} from 'react-i18next'; 
import './i18n/i18n'; 
import CustomButton from './components/button.js';
import LangButton from './components/langButton.js';
import Sudoku from './screens/sudoku.js';
import PlaySudokuOld from './screens/playSudoku.js';
import Chess from './screens/chess.js';
import BoardGame from './screens/boardGame.js';
import BoardGame2 from './screens/boardGame.js';
import ChatGame from './screens/chatgame.js';


const Stack = createNativeStackNavigator();

export default function App() {

  const {t, i18n} = useTranslation(); 


  return (
    <NavigationContainer>
      <Stack.Navigator
         screenOptions={{
          headerTitle: ''
        }}
      >
        <Stack.Screen name={t('Home')} component={Home} 
          options={{
            animation: 'none',
            headerRight: () => (
            <LangButton />
            )
          }}
        />
        <Stack.Screen name='StartSudoku' component={StartSudoku} />
        <Stack.Screen name='PlayExperimental' component={TicTacToe} />
        <Stack.Screen name='PlaySudoku' component={Sudoku} />
        <Stack.Screen name='PlayChess' component={Chess} />
        <Stack.Screen name='PlayChatGame' component={ChatGame} />
        <Stack.Screen name='PlayBoardGame2' component={BoardGame2} 
               options={{
                headerTitle: "hallo",
              }}
        />
        <Stack.Screen name='PlaySudokuOld' component={PlaySudokuOld} 
          options={{
            headerTitle: t("Playing Sudoku"),
          }}
        />
        <Stack.Screen name='AddSudoku' component={AddSudoku} />
        <Stack.Screen name='SudokuList' component={SudokuList} 
          options={({ navigation }) => ({
            headerRight: () => (
              <CustomButton title={t("Add new")} onPress={() => navigation.navigate('AddSudoku')} />
            )
          })}
        />
      </Stack.Navigator>
    </NavigationContainer>
  );
}