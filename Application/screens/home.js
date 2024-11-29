import { View, StyleSheet, Image, Text } from "react-native";
import { useEffect, useState } from "react";
import { useTranslation } from "react-i18next";
import CustomButton from "../components/button";
import { initializeData } from "../data/sampleData";
import { globalStyles } from "../styles/global";
import config from "../src-gen/config.js"

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
      <Text style={styles.header}>{config.title}</Text>
      <Text>{config.pieces.join('')}</Text>
      {/* <CustomButton title={langLoaded ? t("Play") : ""} onPress={() => navigation.navigate('PlayBoardGame')}/> */}
      <CustomButton title={"Play"} onPress={() => navigation.navigate('BoardGame')}/>
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