/**
 * Author:  Gabriel de Oliveira Ferreira
 * Created: 08/10/2018
 */
DROP DATABASE IF EXISTS filme;
CREATE DATABASE filme;
use FILME;

CREATE TABLE filmes(
nome VARCHAR(100),
diretor VARCHAR(100),
categoria VARCHAR(100),
atorPrincipal VARCHAR(100),
faixaEtaria VARCHAR(100),
idiomaOriginal VARCHAR(100),
tempoFilme SMALLINT,
ano INT, 
faturamento DOUBLE,
orcamento DOUBLE,
legenda BOOLEAN,
dublado BOOLEAN
);

