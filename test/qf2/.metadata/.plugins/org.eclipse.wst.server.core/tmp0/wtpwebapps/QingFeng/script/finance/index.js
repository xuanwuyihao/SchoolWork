/* Code by Sean @ http://www.ohsean.net */
var __links = document.querySelectorAll('a');
function __linkClick(e) { 
	parent.window.postMessage(this.href, '*');
} ;
for (var i = 0, l = __links.length; i < l; i++) {
	if ( __links[i].getAttribute('data-t') == '_blank' ) { 
		__links[i].addEventListener('click', __linkClick, false);
	}
}