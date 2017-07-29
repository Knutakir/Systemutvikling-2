$(document).ready(function() {

  $(".boksTest").click(function() {
    $(".startNewGame").css("display", "inline");
    $(".boksTest").fadeOut();
  });

  $(".boksTest").mouseover(function() {
    var randomLeft = window.innerWidth * (Math.random() * 0.9) + 10;
    var randomTop = window.innerHeight * (Math.random() * 0.8) + 10;

    $(".boksTest").animate({
      left: randomLeft,

      top: randomTop
    }, "slow");
  });

  $(".startNewGame").click(function() {
    $(".startNewGame").css("display", "none");
    $(".boksTest").fadeIn();
  });
});
