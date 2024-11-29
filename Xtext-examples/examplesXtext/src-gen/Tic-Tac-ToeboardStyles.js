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
    fontSize: 24,
    marginBottom: 20,
    color: "#023535",//VARIABEL
  },
  board: {
    flexDirection: "row",
    flexWrap: "wrap",
    width: 300, 
    height: 300, 
  },
  cell: {
    width:  300 / 5,
    height:  300 / 5,
    borderWidth: 2,
    borderColor: "black",//VARIABEL
    justifyContent: "center",
    alignItems: "center",
    backgroundColor: "#fff", //VARIABEL
  },
  cellText: {
    fontSize: RFValue(32, 812),
    fontWeight: "bold",
  },
  message: {
    fontSize: 18,
    marginVertical: 10,
    color: "#023535",
  },
});
