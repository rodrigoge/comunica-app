/*~ variável que recebe o ID das imagens ~*/
var imagem = imagem.id;

function carregarFundo(imagem)
{   
	/*~ variável que recebe o ID da DIV para realizar a troca do fundo ~*/
	var div = document.getElementById('div1');
	var div2 = document.getElementById('div2');
	
	if(div.click)
	{
		if(imagem == 0)
		{
			div.style.backgroundImage = "url('resources/img/feliz.png')";
			div.style.backgroundSize = "50%";
			div.style.backgroundPosition = "center";
			div.style.backgroundRepeat = "no-repeat";
		}
		else if(imagem == 1)
		{
			div.style.backgroundImage = "url('resources/img/triste.png')";
			div.style.backgroundSize = "50%";
			div.style.backgroundPosition = "center";
			div.style.backgroundRepeat = "no-repeat";
		}
		else if(imagem == 2)
		{
			div.style.backgroundImage = "url('resources/img/bravo.png')";
			div.style.backgroundSize = "50%";
			div.style.backgroundPosition = "center";
			div.style.backgroundRepeat = "no-repeat";
		}
		else if(imagem == 3)
		{
			div.style.backgroundImage = "url('resources/img/brinquedos.png')";
			div.style.backgroundSize = "50%";
			div.style.backgroundPosition = "center";
			div.style.backgroundRepeat = "no-repeat";
		}
		else if(imagem == 4)
		{
			div.style.backgroundImage = "url('resources/img/escovar.png')";
			div.style.backgroundSize = "50%";
			div.style.backgroundPosition = "center";
			div.style.backgroundRepeat = "no-repeat";
		}
		else if(imagem == 5)
		{
			div.style.backgroundImage = "url('resources/img/estudar.png')";
			div.style.backgroundSize = "50%";
			div.style.backgroundPosition = "center";
			div.style.backgroundRepeat = "no-repeat";
		}
		else if(imagem == 6)
		{
			div.style.backgroundImage = "url('resources/img/comer.png')";
			div.style.backgroundSize = "50%";
			div.style.backgroundPosition = "center";
			div.style.backgroundRepeat = "no-repeat";
		}
	}
	
	/* ------------------------- */
	
	if(div2.click)
	{
		if(imagem == 0)
		{
			div2.style.backgroundImage = "url('resources/img/feliz.png')";
			div2.style.backgroundSize = "50%";
			div2.style.backgroundPosition = "center";
			div2.style.backgroundRepeat = "no-repeat";
		}
		else if(imagem == 1)
		{
			div2.style.backgroundImage = "url('resources/img/triste.png')";
			div2.style.backgroundSize = "50%";
			div2.style.backgroundPosition = "center";
			div2.style.backgroundRepeat = "no-repeat";
		}
		else if(imagem == 2)
		{
			div2.style.backgroundImage = "url('resources/img/bravo.png')";
			div2.style.backgroundSize = "50%";
			div2.style.backgroundPosition = "center";
			div2.style.backgroundRepeat = "no-repeat";
		}
		else if(imagem == 3)
		{
			div2.style.backgroundImage = "url('resources/img/brinquedos.png')";
			div2.style.backgroundSize = "50%";
			div2.style.backgroundPosition = "center";
			div2.style.backgroundRepeat = "no-repeat";
		}
		else if(imagem == 4)
		{
			div2.style.backgroundImage = "url('resources/img/escovar.png')";
			div2.style.backgroundSize = "50%";
			div2.style.backgroundPosition = "center";
			div2.style.backgroundRepeat = "no-repeat";
		}
		else if(imagem == 5)
		{
			div2.style.backgroundImage = "url('resources/img/estudar.png')";
			div2.style.backgroundSize = "50%";
			div2.style.backgroundPosition = "center";
			div2.style.backgroundRepeat = "no-repeat";
		}
		else if(imagem == 6)
		{
			div2.style.backgroundImage = "url('resources/img/comer.png')";
			div2.style.backgroundSize = "50%";
			div2.style.backgroundPosition = "center";
			div2.style.backgroundRepeat = "no-repeat";
		}
	}
	
}

