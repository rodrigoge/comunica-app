/*~ variável que recebe o ID das imagens ~*/
var imagem = imagem.id;

function carregarFundo(imagem)
{   
	/*~ variável que recebe o ID da DIV para realizar a troca do fundo ~*/
	var div = document.getElementsByClass('card').id;
	div.style.backgroundSize = "50%";
	div.style.backgroundPosition = "center";
	div.style.backgroundRepeat = "no-repeat";
	
	if(div.click)
	{
		if(imagem == 0)
		{
			div.style.backgroundImage = "url('resources/img/'"+imagem+"'.png')";

		}
		else if(imagem == 1)
		{
			div.style.backgroundImage = "url('resources/img/triste.png')";

		}
		else if(imagem == 2)
		{
			div.style.backgroundImage = "url('resources/img/bravo.png')";
		}
		else if(imagem == 3)
		{
			div.style.backgroundImage = "url('resources/img/brinquedos.png')";
		}
		else if(imagem == 4)
		{
			div.style.backgroundImage = "url('resources/img/escovar.png')";
		}
		else if(imagem == 5)
		{
			div.style.backgroundImage = "url('resources/img/estudar.png')";
		}
		else if(imagem == 6)
		{
			div.style.backgroundImage = "url('resources/img/comer.png')";
			div.style.backgroundSize = "50%";
			div.style.backgroundPosition = "center";
			div.style.backgroundRepeat = "no-repeat";
		}
	}

	
}

