$("document").ready(function () {
   $("#button").click(function () {
       $("div").animate({height:'80px',width:'80%'},3000,function () {
           alert("1232")
       });

       $("#stop").click(function () {
           $("div").stop()
       });
   });
});


// $("document").ready(function () {
//    $("#button").click(function () {
//        $("p").fadeOut(1000);
//    });
// });





// $("document").ready(function () {
//     $("#button").click(function () {
//         $("p").toggle();
//     });
// });

// $("document").ready(function () {
//     $("#button").click(function () {
//         $("p").fadeIn(3000);
//     });
// });