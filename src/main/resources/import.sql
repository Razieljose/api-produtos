CREATE TABLE tb_usuario(
    ID INTEGER PRIMARY KEY AUTO_INCREMENT,
    LOGIN VARCHAR(50) NOT NULL,
    SENHA VARCHAR(255) NOT NULL,
    ADMIN BOOL DEFAULT FALSE
);

CREATE TABLE tb_produto (
    ID INTEGER PRIMARY KEY AUTO_INCREMENT,
    NOME VARCHAR(100),
    DESCRICAO VARCHAR(255),
    QUANTIDADE INTEGER
);

CREATE TABLE tb_vendedor(
    ID INTEGER PRIMARY KEY AUTO_INCREMENT,
    NOME VARCHAR(50),
    SETOR VARCHAR(50)
    );