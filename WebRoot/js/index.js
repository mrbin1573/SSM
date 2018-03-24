$(window).resize(function(){
	tableWidth();
	});
$(function(){
	tableWidth();
})
function tableWidth(){
	var bodyWidth = $(document.body).width();

   if(bodyWidth >= 1250 && bodyWidth <= 1400 ){
   		$(".table").css("font-size","14px");
   }else if(bodyWidth < 1250){

	   $(".table").css("font-size","12px")
   }else{

	   $(".table").css("font-size","16px")
   }
}
