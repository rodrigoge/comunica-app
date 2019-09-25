function voltar() {
	window.history.back();
}

function imprimir() {
	window.print();
}

function handleDrop(event, ui) {
	var droppedCar = ui.draggable;

	droppedCar.fadeOut('fast');
}
