import Home from './screens/home';
import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';
import {useTranslation} from 'react-i18next'; 
import './i18n/i18n'; 
import LangButton from './components/langButton.js';
import BoardGame from './src-gen/boardGame.js';


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
        <Stack.Screen name='BoardGame' component={BoardGame} />
        {/* <Stack.Screen name='PlaySudokuOld' component={PlaySudokuOld} 
          options={{
            headerTitle: t("Playing Sudoku"),
          }}
        /> */}
        {/* <Stack.Screen name='AddSudoku' component={AddSudoku} /> */}
        {/* <Stack.Screen name='SudokuList' component={SudokuList} 
          options={({ navigation }) => ({
            headerRight: () => (
              <CustomButton title={t("Add new")} onPress={() => navigation.navigate('AddSudoku')} />
            )
          })}
        /> */}
      </Stack.Navigator>
    </NavigationContainer>
  );
}