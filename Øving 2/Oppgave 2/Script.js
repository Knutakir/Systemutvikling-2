function enkeltTrykk(denneKlassen) {
  if (denneKlassen.className == "tabellrute") {
    denneKlassen.className = "spillerEn";
  } else {
    denneKlassen.className = "tabellrute";
  }
}

function dobbeltTrykk(denneKlassen) {
  if (denneKlassen.className == "tabellrute") {
    denneKlassen.className = "spillerTo";
  } else {
    denneKlassen.className = "tabellrute";
  }
}
