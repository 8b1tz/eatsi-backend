TRUNCATE  usuario 	  CASCADE;
TRUNCATE  restaurante CASCADE;
TRUNCATE  produto	  CASCADE;
TRUNCATE  pedido 	  CASCADE;
TRUNCATE  endereco 	  CASCADE;



-- POVOANDO USUARIOS

INSERT into usuario
( id, nome, email, senha, telefone)
values (0, 'Gustavo Wagner','guga@gmail.com','123123', '12345694056');

INSERT into usuario
(id,  nome, email, senha, telefone)
values (1, 'Ana Julia','ana@gmail.com','123321', '12345677556');

INSERT into usuario
(id,  nome, email, senha, telefone)
values (2, 'Yohanna','yohanna@gmail.com','321123', '15677894056');


-- POVOANDO ENDERECO

INSERT INTO public.endereco
(id, cep, numero_do_local)
VALUES(0, '123123', 34);

INSERT INTO public.endereco
(id, cep, numero_do_local)
VALUES(1, '321321', 65);

INSERT INTO public.endereco
(id, cep, numero_do_local) 
VALUES(2, '367321', 45);

INSERT INTO public.endereco
(id, cep, numero_do_local)
VALUES(3, '213213', 82);

INSERT INTO public.endereco
(id, cep, numero_do_local)
VALUES(4, '321321', 69);

INSERT INTO public.endereco
(id, cep, numero_do_local)
VALUES(5, '213213', 88);




-- POVOANDO RESTAURANTES


INSERT INTO restaurante
(id, cnpj, descricao, imagem, nome, nota, telefone, endereco_id)
VALUES(0, '123123', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.',
	 'https://catracalivre.com.br/wp-content/uploads/sites/8/2016/10/habibs-2.jpg',
	 'Habbibs', 5, '421321331', 0);


INSERT INTO restaurante
(id, cnpj, descricao,  imagem, nome, nota, telefone, endereco_id)
VALUES(1, '145523', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.',
	'https://astron.com.br/wp-content/uploads/2017/07/pizza-site-or.jpg',
	 'Pizzaria do Zé', 4, '898921331', 1
);


INSERT INTO restaurante
(id, cnpj, descricao,  imagem, nome, nota, telefone, endereco_id)
VALUES(2, '789123', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.',
	'https://www.alegrafoods.com.br/wp-content/uploads/2020/09/hot-dogs-pwy2hz8-620x350.jpg',
	 'Hot Dog do João', 3.2, '443434331', 2
);

-- POVOANDO PRODUTOS

INSERT INTO produto
(id, descricao, imagem, nome, preco, restaurante_id)
VALUES(0, 'Lorem ipsum dolor sit amet', 'https://www.alegrafoods.com.br/wp-content/uploads/2020/09/hot-dogs-pwy2hz8-620x350.jpg',
	'Hot Dog de Frango', 15, 2);
	
INSERT INTO produto
(id, descricao, imagem, nome, preco, restaurante_id)
VALUES(1, 'Lorem ipsum dolor sit amet', 'https://astron.com.br/wp-content/uploads/2017/07/pizza-site-or.jpg',
	'Pizza de Frango', 50, 1);
	
INSERT INTO produto
(id, descricao, imagem, nome, preco, restaurante_id)
VALUES(2, 'Lorem ipsum dolor sit amet', 'https://catracalivre.com.br/wp-content/uploads/sites/8/2016/10/habibs-2.jpg',
	'Esfirra Frango', 4, 0);

-- POVOANDO PEDIDOS

INSERT INTO pedido
(id, datahora, preco_total, status, restaurante_id, usuario_id)
VALUES(0, '23/11/2020', 4, 'E', 0, 1);

INSERT INTO pedido
(id, datahora, preco_total, status, restaurante_id, usuario_id)
VALUES(1, '20/02/2021', 4, 'V', 0, 1);

INSERT INTO pedido
(id, datahora, preco_total, status, restaurante_id, usuario_id)
VALUES(2, '13/01/2021', 55, 'C', 1, 2);

-- POVOANDO PRODUTO-PEDIDO

INSERT INTO produto_pedidos
(produtos_id, pedidos_id) 
VALUES(0, 2);

INSERT INTO produto_pedidos
(produtos_id, pedidos_id) 
VALUES(1, 0);

INSERT INTO produto_pedidos
(produtos_id, pedidos_id) 
VALUES(1, 2);


-- POVOANDO ENDERECO-USUARIO

INSERT INTO public.endereco_usuarios
(enderecos_id, usuarios_id)
VALUES(3, 0);

INSERT INTO public.endereco_usuarios
(enderecos_id, usuarios_id)
VALUES(4, 1);


INSERT INTO public.endereco_usuarios
(enderecos_id, usuarios_id)
VALUES(5, 2);


