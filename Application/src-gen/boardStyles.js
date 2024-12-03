import { StyleSheet } from "react-native";
import { RFValue } from "react-native-responsive-fontsize";

export const boardStyles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: "center",
    alignItems: "center",
    backgroundColor: "azure",//VARIABEL
  },
  title: {
    fontSize: 36,
    marginBottom: 20,
    color: "#023535",//VARIABEL
  },
  board: {
    flexDirection: "row",
    flexWrap: "wrap",
    width: 300, 
    height: 300,
    marginBottom: 20
  },
  cell: {
    width:  300 / 3,
    height:  300 / 3,
    borderWidth: 2,
    borderColor: "black",//VARIABEL
    justifyContent: "center",
    alignItems: "center",
    backgroundColor: "#fff", //VARIABEL
  },
  cellText: {
    fontSize: 35-3,
    fontWeight: "bold",
  },
  message: {
    fontSize: 24,
    marginVertical: 10,
    color: "#023535",
  },
  rules: {
    padding: 5,
    paddingHorizontal: 20,
    marginBottom: 10,
    backgroundColor: "#ffff99",
    borderRadius: 5,
  },
  rule: {
    margin: 0,
    fontSize: 16
  }
});


