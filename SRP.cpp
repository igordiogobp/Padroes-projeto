#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

//Classe ferindo o Princípio da Responsabilidade Única
class imprimeImc{
public:
    float calculaImc(float peso, float altura) {
        float imc;
        imc = peso / (altura * altura);
        return imc;
    }

    void imprimirImc(float imc) {
        printf("IMC: %.2f\n", imc);
    }
};

// Classes aplicando o Princípio da Responsabilidade Única
class calcularImc {
public:
    float calculaImc(float peso, float altura) {
        float imc;
        imc = peso / (altura * altura);
        return imc;
    }
};

class imprimirIMC {
public:
    void imprimirImc(float imc) {
        printf("IMC: %.2f\n", imc);
    }
};

int main(){

    return 0;
}