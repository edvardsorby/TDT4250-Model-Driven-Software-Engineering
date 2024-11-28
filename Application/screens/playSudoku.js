import { View, StyleSheet, TouchableOpacity, Text, TextInput, Alert, Pressable, Button } from "react-native";
import { useState, useEffect } from "react";
import CustomButton from "../components/button";
import AsyncStorage from "@react-native-async-storage/async-storage";
import { useTranslation } from "react-i18next";
import { globalStyles } from "../styles/global";

export default function PlaySudoku( { route } ) {

  const { t } = useTranslation();

  const { value, init, solution, difficulty, colors1 } = route.params;

  const pieces = [1,2,3,4,5,6,7,8,9]

  const initialValues = JSON.parse(JSON.stringify(init));

  // let sudoku = value;

  const [sudoku, setSudoku] = useState(value);

  const [selectedCell, setSelectedCell] = useState(null);

  const [colors, setColors] = useState([
    [0,0,0,0,0,0,0,0,0],
    [0,0,0,0,0,0,0,0,0],
    [0,0,0,0,0,0,0,0,0],
    [0,0,0,0,0,0,0,0,0],
    [0,0,0,0,0,0,0,0,0],
    [0,0,0,0,0,0,0,0,0],
    [0,0,0,0,0,0,0,0,0],
    [0,0,0,0,0,0,0,0,0],
    [0,0,0,0,0,0,0,0,0]
  ]);


  useEffect(() => {   
    if (colors1 != null) {
      setColors(colors1);
      console.log(colors1);
    }
  }, []);

  const changeCellColor = (row, col, color) => {
    setColors((prevColors) => {
      const updatedColors = [...prevColors];
      updatedColors[row][col] = color;
      return updatedColors;
    });
  };

  const findColor = function(n,i) {

    var color = colors[n][i];

    switch(color) {
      case 1:
        return globalStyles.green;
      case 2:
        return globalStyles.yellow;
      case 3:
        return globalStyles.red;
      default:
        return null;
    }
  }

  const newRow = function(n) {
    const cells = [];
    
    for (let i = 0; i < 9; i++) {
      const key = n + "" + i;
      let blank = true;
      if (!(initialValues[n][i] == 0)) blank = false
      cells.push(
        <Pressable 
          key={key} 
          onPress={() => 
            focus(key)
          }>
          <View 
            style={[styles.cell, i == 3 ? styles.marginLeft : null, i == 5 ? styles.marginRight : null, initialValues[n][i] != 0 ? globalStyles.greyedOut : null, selectedCell == key ? styles.selected : null]} 
            
            >
              <Text style={styles.cellText} >{sudoku[n][i] !== 0 ? sudoku[n][i].toString() : null}</Text>
            {/* <TextInput 
              keyboardType="numeric" 
              maxLength={1} 
              style={[styles.textInput, initialValues[n][i] != 0 ? globalStyles.greyedOutText : null]}
              defaultValue={sudoku[n][i] !== 0 ? sudoku[n][i].toString() : null}
              onChangeText={(e) => updateSudoku(e, key)}
              readOnly={initialValues[n][i] != 0 ? true : null}
              onFocus={() => {focus(key)}}
              selectTextOnFocus={true}
              /> */}
          </View>
        </Pressable>
      )
    }
    return cells;
  }

  let s = [];

  const newBoard = function() {
    const rows = [];
    for (let i = 0; i < 9; i++) {
      rows.push(
        <View style={[styles.row, i == 3 ? styles.marginTop : null, i == 5 ? styles.marginBottom : null]} key={i}>
          {newRow(i)}
        </View>
      )
    }
    s = rows;
    return rows;
  }


  const updateSudoku = function(piece, key) {

    console.log(selectedCell);
    // sudoku[key[0]][key[1]] = piece;
    setSudoku((prevValues) => {
      const updatedValues = [...prevValues];
      updatedValues[selectedCell[0]][selectedCell[1]] = piece; // Update the value of the selected cell
      return updatedValues;
    });
    console.log(sudoku);
  }

  const checkAnswer = function() {
    console.log(solution);
    console.log(sudoku);

    if (JSON.stringify(sudoku) === JSON.stringify(solution)) {
      console.log("Correct solution!");
      Alert.alert(t("Congratulations!"), t("You have solved the sudoku"));
    } else {
      console.log("Wrong solution");
      Alert.alert(t("Wrong!"), t("You have not solved the sudoku correctly"));
    }
  }

  const focus = function(key) {
    setSelectedCell(key);
    console.log(key);

    // setColors(prevColors => {
    //   const newColors = [...prevColors];
    //   newColors[selectedCell[0]][selectedCell[1]] = 1;
    //   return newColors;
    // });
  }
    
  const setGreen = function() {
    if (selectedCell === null) return;

    setColors(prevColors => {
      const newColors = [...prevColors];
      newColors[selectedCell[0]][selectedCell[1]] = 1;
      return newColors;
    });
  }
    
  const setYellow = function() {
    if (selectedCell === null) return;

      setColors(prevColors => {
      const newColors = [...prevColors];
      newColors[selectedCell[0]][selectedCell[1]] = 2;
      return newColors;
    });
  } 

  const setRed = function() {
    if (selectedCell === null) return;

    setColors(prevColors => {
      const newColors = [...prevColors];
      newColors[selectedCell[0]][selectedCell[1]] = 3;
      return newColors;
    });
  } 

  const setClear = function() {
    if (selectedCell === null) return;

    setColors(prevColors => {
      const newColors = [...prevColors];
      newColors[selectedCell[0]][selectedCell[1]] = 0;
      return newColors;
    });
  }

  const saveProgress = async () => {

    const progress = {
      value: sudoku,
      init: init,
      solution: solution,
      difficulty: difficulty,
      colors: colors
    }

    const key = "save";
    const jsonValue = JSON.stringify(progress);

    await AsyncStorage.setItem(key, jsonValue);
    console.log("progress saved");
    Alert.alert(t("Progress saved"));
  }


  const piecesList = function() {
    const piecesList = []
    for (let i = 0; i < pieces.length; i++) {
      const piece = pieces[i]
      piecesList.push(
        <View style={styles.pieceButton} >
          <Button 
            title={piece.toString()}
            onPress={() => updateSudoku(piece, selectedCell)} key={i}>
          </Button>
        </View>
      )
    }
    return piecesList;
  }



  return (
    <View style={[globalStyles.container, styles.container]}>
      <Text>{t("Difficulty")}: {t(difficulty)}</Text>
      <View style={styles.board}>
        {newBoard()}
      </View>
      <View style={styles.piecesContainer}>
        {piecesList()}
      </View>
      {/* <Text>{t("Color the cells")}:</Text>

      <View style={globalStyles.radioButtonGroup}>

      <TouchableOpacity onPress={setClear}>
          <View style={globalStyles.radioButton}>
              <View>
                <Text style={globalStyles.radioButtonText}>{t("None")}</Text>
              </View>
          </View>
        </TouchableOpacity>
  
        <TouchableOpacity onPress={setGreen}>
          <View style={globalStyles.radioButton}>
              <View style={globalStyles.selectedEasy}>
                <Text style={globalStyles.radioButtonText}>{t("Green")}</Text>
              </View>
          </View>
        </TouchableOpacity>

        <TouchableOpacity onPress={setYellow}>
        <View style={globalStyles.radioButton}>
              <View style={globalStyles.selectedMedium}>
                <Text style={globalStyles.radioButtonText}>{t("Yellow")}</Text>
              </View>
          </View>
        </TouchableOpacity>

        <TouchableOpacity onPress={setRed}>
        <View style={globalStyles.radioButton}>
              <View style={globalStyles.selectedHard}>
                <Text style={globalStyles.radioButtonText}>{t("Red")}</Text>
              </View>
          </View>
        </TouchableOpacity>
      </View> */}
      
      <CustomButton title={t("Check answer")} onPress={checkAnswer} />
      
    
    </View>

  )
}

const styles = StyleSheet.create({
  header: {
    fontWeight: 'bold',
    fontSize: 24,
    textAlign: 'center',
    marginBottom: 30
  },
  board: {
    backgroundColor: '#333333',
    display: 'flex',
    padding: 1,
  },
  row: {
    display: 'flex',
    flexDirection: 'row'
  },
  cell: {
    width: 30,
    height: 30,
    margin: 1,
    backgroundColor: 'white',
    textAlign: 'center'
  },
  cellText: {
    textAlign: 'center',
    fontSize: 20
  },
  // marginLeft: {
  //   marginLeft: 3,
  // },
  // marginRight: {
  //   marginRight: 3,
  // },
  // marginTop: {
  //   marginTop: 3,
  // },
  // marginBottom: {
  //   marginBottom: 3,
  // },
  textInput: {
    fontSize: 20,
    textAlign: 'center'
  },
  greyedOut: {
    backgroundColor: '#ddd'
  },
  bold: {
    fontWeight: 'bold'
  },
  container: {
    justifyContent: 'flex-start',
    paddingTop: 20
  },
  piecesContainer: {
    display: 'flex',
    flexDirection: 'row',
    flexWrap: 'wrap',
    justifyContent: 'center',
    paddingHorizontal: 20
  },
  pieceButton: {
    width: 35,
    height: 35,
    margin: 1,
    borderRadius: 1
  },
  selected: {
    backgroundColor: '#BBBBFF'
  }
})