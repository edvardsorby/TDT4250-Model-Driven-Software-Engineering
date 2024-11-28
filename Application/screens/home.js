import { View, StyleSheet, Image, Text } from "react-native";
import { useEffect, useState } from "react";
import { useTranslation } from "react-i18next";
import CustomButton from "../components/button";
import { initializeData } from "../data/sampleData";
import { globalStyles } from "../styles/global";
import boardGame from "../src-gen/bg.js";

export default function Home({ navigation }) {

  const {t, i18n} = useTranslation();


  const [langLoaded, setLangloaded] = useState(false);

  useEffect(() => {
    if (i18n.isInitialized) {
      setLangloaded(true); 
    }
    initializeData();
  });

  return (
    <View style={globalStyles.container}>
      {/* <Image source={require('../assets/sudoku-logo.png')} style={styles.logo}/> */}
      <Text style={styles.header}>{boardGame.boardGameName}</Text>
      <CustomButton title={langLoaded ? t("Play") : ""} onPress={() => navigation.navigate('PlayBoardGame2')}/>
      <CustomButton title={"Play Chat Game"} onPress={() => navigation.navigate('PlayChatGame')}/>
      <CustomButton title={"Play Tic-Tac-Toe"} onPress={() => navigation.navigate('PlayExperimental')}/>
      <CustomButton title={"Play Sudoku"} onPress={() => navigation.navigate('PlaySudoku')}/>
      <CustomButton title={"Play Chess"} onPress={() => navigation.navigate('PlayChess')}/>
      <CustomButton title={"Play Sudoku (old)"} onPress={() => navigation.navigate('StartSudoku')}/>
      {/* <CustomButton title={langLoaded ? t("Add/remove sudoku grids") : ""} onPress={() => navigation.navigate('SudokuList')}/> */}
    </View>
  )
}

const styles = StyleSheet.create({
  header: {
    fontWeight: 'bold',
    fontSize: 48,
    textAlign: 'center',
    marginBottom: 150,
    marginTop: 0,
    marginHorizontal: 50
  },
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
    paddingBottom: 100
  },
  logo: {
    width: 206,
    height: 204,
    marginBottom: 100
  },
  button: {
    margin: 10,
    backgroundColor: "green",
    width: '90%',
    color: "#000000"
  },


})