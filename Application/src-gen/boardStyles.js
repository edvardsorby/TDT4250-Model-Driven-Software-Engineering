import { StyleSheet } from "react-native";
import { RFValue } from "react-native-responsive-fontsize";

export const boardStyles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: "center",
    alignItems: "center",
    backgroundColor: "azure",
  },
  title: {
    fontSize: 36,
    marginBottom: 10,
    color: "#023535",
  },
  board: {
    flexDirection: "row",
    flexWrap: "wrap",
    width: 300,
    height: 300,
    marginBottom: 20
  },
  cell: {
    width:  300 / 5,
    height:  300 / 5,
    borderWidth: 2,
    borderColor: "black",
    justifyContent: "center",
    alignItems: "center",
    backgroundColor: "#fff",
  },
  cellText: {
    fontSize: 35 - 5,
    fontWeight: "bold",
  },
  message: {
    fontSize: 24,
    marginVertical: 5,
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
    fontSize: 16,
  }
});

