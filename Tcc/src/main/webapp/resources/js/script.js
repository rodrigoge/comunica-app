function voltar() {
	window.history.back();
}

function imprimir() {
	window.print();
}

function handleDrop(event, ui) 
{
	var droppedCar = ui.draggable;
	droppedCar.fadeOut('fast');
}

function incrementaValor(valorMaximo) {
	var value = parseInt(document.getElementById('pontos').value, 9);
	var check = document.getElementById("check1");
	if(check.checked)
	{
		value = isNaN(value) ? 0 : value;
		if (value >= valorMaximo) {
			value = valorMaximo;
		} else {
			value++;
		}
	}
	else
	{
		value = value - 1;
	}
	document.getElementById('pontos').value = value;
}

function incrementaValor2(valorMaximo) {
	var value = parseInt(document.getElementById('pontos').value, 9);
	var check = document.getElementById("check2");
	if(check.checked)
	{
		value = isNaN(value) ? 0 : value;
		if (value >= valorMaximo) {
			value = valorMaximo;
		} else {
			value++;
		}
	}
	else
	{
		value = value - 1;
	}
	document.getElementById('pontos').value = value;
}

function incrementaValor3(valorMaximo) {
	var value = parseInt(document.getElementById('pontos').value, 9);
	var check = document.getElementById("check3");
	if(check.checked)
	{
		value = isNaN(value) ? 0 : value;
		if (value >= valorMaximo) {
			value = valorMaximo;
		} else {
			value++;
		}
	}
	else
	{
		value = value - 1;
	}
	document.getElementById('pontos').value = value;
}
