# _Padroes de projeto_
## _1- Padrao de Projeto Chain of Responsibility_
O padrao de projeto Chain of Responsibility é um padrao comportamental que permite que voce passe pedidos por uma corrente de handlers. Caso um handler  consiga solucionar o problema, ele resolve, caso contrario passa para outro handler que extende sua funcionalidade. Dessa forma este processo se repete ate que se encontre um handler capaz de solucionar o problema. Estes handlers tornam o codigo mais eficiente, por possibilitar a extensibilidade de funcionalidades, com a adicao de novos handlers por exemplo, e por dividir grandes problemas em fases mais simples.

Um exemplo de uso criado desse padrao foi um sistema de processamento de chaves PIX bancarias, onde as chaves podem ser de diferentes tipos, como CPF, nome, copia e cola, entre outros. Porem, em um software com boa usabilidade, o usuario tem o mesmo campo para informar qualquer uma das chaves, sendo responsabilidade do software para encontrar qual tipo de chave o usuario informou.
Dessa forma sao criados handlers para cada tipo de chave, possibilitando a flexibilidade de codigo com a adicao ou exclusao de tipos de chaves no codigo.

## _2- Padrao de Projeto Builder_
Este padrao de projeto Builder visa lidar com a criacao de objetos complexos que requerem uma inicializacao com muitos parametros e sobclasses dos objetos. Dessa maneira, este padrao tem como objetivo construir objetos complexos passo a passo, com apenas as etapas necessarias em cada builder. Nesse modo, o     codigo de contrucao dos objetos sao tirados de dentro da classe, e colocados nos builders, que sao objetos separados. Cada builder possui uma etapa de contrucao de acordo com cada parte do objeto. Essa implementacao resolve a problematica de repeticao de codigos, pois possibilita o uso do mesmo builder para diferentes objetos, e tambem a criacao em etapas menos complexas de objetos.

Um exemplo dessa implementacao pode ser pensado na contrucao de casas. O codigo possui uma classe Casa final e seu builder ContrutorCasa, e as classes ConstrutorCasaSimples e ConstrutorCasaLuxuosa. Dessa forma o usuario pode criar diferentes cass a partir do mesmo "diretor" DiretorConstrucao.

## _3- Padrao de Projeto Adapter_
O padrao de projeto Adapter e uma solução para permitir que objetos imcompativeis a principio cooperem entre si, com a integracao destes componentes com interfaces diferentes sem mudar seus codigos internos, por meio de "adaptadores". Como fazemos na vida real por exemplo com "T`s", que sao adaptadores de diferentes tipos de tomadas para um tipo mais simples que sera compativel com a saida de energia da casa.

Um exemplo de uso do padrao Adapter pode ser em um software de moledagem 3D, que lida com objetos geometricos como quadrados, circulos etc. Porem cada objeto tem sua propia forma de calcular areas, dessa forma, a principio nao seria possivel que esse sistema lide com diferentes tipos de modelos, sendo necessario assim um adaptador para integrar todos os objetos geometricos ao sistema de modelagem. Esses adaptadores irao envolver as classes existentes dos objetos geometricos e traduzir suas chamadas de metodos para uma forma unificada para o software receber. Isso permite que o sistema de modelagem 3D processe diferentes tipos de objetos geometricos sem precisar modificar seu código interno.

