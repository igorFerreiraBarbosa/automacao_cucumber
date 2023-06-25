# language: pt

Funcionalidade: Adicao de produtos ao carrinho de compras
  
  
  Contexto:
  	Dado que estou na home page
  	

	
  Cenario: Validar especificacoes do produto
  	E que clico na opcao Special Offer
		Quando clico no botao See offer
		Entao sera mostrada as especificacoes do produto
  
 
  Cenario: Validar alteracao de cor do produto no carrinho
  	E que clico na opcao Special Offer
		E clico no botao See offer
		Quando altero a cor do produto
		E clico no botao Add to cart
		Entao o produto sera adicionado ao carrinho com a cor selacionada
		
	
	Cenario: Validar pagina de checkout
		Dado que pesquiso o produto pelo ícone de lupa
		E seleciono o produto pesquisado
		E altero a cor do produto
		E altero a quantidade de produtos que desejo comprar
		E clico no botao Add to cart
		Quando acesso a pagina de checkout
		Entao a soma dos precos sera igual na pagina de checkout
	
	Cenario: Remover produto do carrinho de compras
		E que clico na opcao Special Offer
		E clico no botao See offer
		E clico no botao Add to cart
		E clico no carrinho de compras
		Quando removo o produto do carrinho de compras
		Entao o carrinho de compras ficara vazio


