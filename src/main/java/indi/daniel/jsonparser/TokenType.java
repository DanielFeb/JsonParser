package indi.daniel.jsonparser;

public enum TokenType {
   DOLLAR, //$
   DOT, //.
   STRING, //object or array name
   INDEX, //array index
   START_INDEX, // [
   END_INDEX, // ]
}
