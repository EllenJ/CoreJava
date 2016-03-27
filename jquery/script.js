$(document).ready(function() {
var $wrapper=$('#scroller a img');
$wrapper.css({left:0});
var animator = function(imgblock) {
imgblock.animate(
{left:-770}, 5000,
function() {
imgblock.css({left:450});
animator($(this));
}
);
}
animator($wrapper);
$wrapper.hover(
function(){
$wrapper.stop();
},
function(){
animator($wrapper);
}
);
});
/*$(document).ready(function() {
$(".imge").hide();
$('.imge:first').fadeIn('slow');
$('.imge').hover(
function(){
$(this).fadeIn('slow');
},
function(){
var next = ($(this).next().length) ? $(this).next() :$('.imge:first');
$(this).fadeOut('slow');
next.fadeIn('slow');
}
);
});*/

/*$(document).ready(function() {
var $wrapper=$('#scroller a img');
$wrapper.css({bottom:750});
var animator = function(imgblock) {
imgblock.animate(
{bottom:-460}, 5000,
function() {
imgblock.css({bottom:750});
animator($(this));
}
);
}
animator($wrapper);
});*/