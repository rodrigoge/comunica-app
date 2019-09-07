function voltar()
{
	window.history.back();
}

/*~ variável que recebe o ID das imagens ~*/
var imagem = imagem.id;

function carregarFundo(imagem)
{   
	/*~ variável que recebe o ID da DIV para realizar a troca do fundo ~*/
	var div = document.getElementById('div1');
	
	if(div.click)
	{
		if(imagem == 0)
		{
			div.style.backgroundImage = "url('resources/img/imagens-projeto/feliz.png')";

		}
		else if(imagem == 1)
		{
			div.style.backgroundImage = "url('resources/img/imagens-projeto/triste.png')";

		}
		else if(imagem == 2)
		{
			div.style.backgroundImage = "url('resources/img/imagens-projeto/bravo.png')";
		}
		else if(imagem == 3)
		{
			div.style.backgroundImage = "url('resources/img/imagens-projeto/brinquedos.png')";

		}
		else if(imagem == 4)
		{
			div.style.backgroundImage = "url('resources/img/imagens-projeto/escovar.png')";
		}
		else if(imagem == 5)
		{
			div.style.backgroundImage = "url('resources/img/imagens-projeto/estudar.png')";
		}
		else if(imagem == 6)
		{
			div.style.backgroundImage = "url('resources/img/imagens-projeto/comer.png')";
		}
	}

	
}

