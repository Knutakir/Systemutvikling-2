window.onload = function seHvorLengeDetErTilJul() {
  //var jul = new Date("September 24, 2016 00:00:00");
  //var jul = new Date("November 24, 2016 00:00:00");
  var jul = new Date("December 24, 2016 00:00:00");
  var idag = new Date();
  idag = Date.now();
  var forskjell = Math.round((jul - idag) / 1000 / 3600 / 24); //Forskjell i dager, runder også opp dersom det ikke er et helt tall, noe det mest sannsynelig ikke er.
  var tekst = document.getElementById("tekst");

  if(forskjell > 91.5) { //=30.5 * 3 (for tre måneder)
    tekst.className = "overTre";
  } else if (forskjell < 30.5) {
    tekst.className = "underEnMnd";
  } else {
    tekst.className = "mellomEnOgTre";
  }


  tekst.innerHTML = "Det er " + forskjell + " dager til jul!";
}
