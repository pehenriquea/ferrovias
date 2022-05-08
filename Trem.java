import java.util.Random;

public class Trem {
    public int vagoes[];
    public int n;
    private int tipoVagao;
    // quantidade de vagão de cada elemento
    private int milho;
    private int soja;
    private int arroz;
    private int cafe;
    private int ferro;
    private int calcario;
    private int cimento;
    private int eucalipto;

    // CONSTRUTOR
    public Trem() {
        vagoes = new int[100];
        Random gerador = new Random();

        // gerador dos 100 números aleatórios
        for (int i = 0; i < vagoes.length; i++) {

            tipoVagao = gerador.nextInt(8);
            vagoes[i] = tipoVagao;

            switch (tipoVagao) {
                case 0:
                    milho++;
                    n++;
                    break;

                case 1:
                    soja++;
                    n++;
                    break;

                case 2:
                    arroz++;
                    n++;
                    break;

                case 3:
                    cafe++;
                    n++;
                    break;

                case 4:
                    ferro++;
                    n++;
                    break;

                case 5:
                    calcario++;
                    n++;
                    break;

                case 6:
                    cimento++;
                    n++;
                    break;

                case 7:
                    eucalipto++;
                    n++;
                    break;
            }
        }

        quicksort(0, vagoes.length - 1, vagoes);

    }

    public void setMilho(int quantidade) {
        try {
            if (n + quantidade > 100) {
                throw new Exception("Não há espaço suficiente no vagão!\n");
            } else {
                for (int j = 0; j < quantidade; j++) {
                    Inserir(0, vagoes);
                }
            }

        } catch (Exception erro) {
            System.err.println(erro.getMessage());
        }

        System.out.println("A quantidade de vagões atual é: " + n);
        quicksort(0, vagoes.length - 1, vagoes);
    }

    public void removeMilho(int qtd) {
        int pos = 0;

        if (qtd > milho) {
            System.out.println("Quantidade inválida! Digite uma quantidade de milho que já esteja no trem.\n");
        } else {
            for (pos = 0; vagoes[pos] != 0; pos++)
                ;
            try {
                for (int j = 0; j < qtd; j++) {
                    remover(pos, vagoes);
                    milho--;
                }
            } catch (Exception erro) {
                System.err.println(erro.getMessage());
            }
        }
    }

    public int getMilho() {
        return milho;
    }

    public void setSoja(int quantidade) {
        try {
            if (n + quantidade > 100) {
                throw new Exception("Não há espaço suficiente no vagão!\n");
            } else {
                for (int j = 0; j < quantidade; j++) {
                    Inserir(1, vagoes);
                }
            }
        } catch (Exception erro) {
            System.err.println(erro.getMessage());
        }

        System.out.println("A quantidade de vagões atual é: " + n);
        quicksort(0, vagoes.length - 1, vagoes);
    }

    public void removeSoja(int qtd) {
        int pos = 0;

        if (qtd > soja) {
            System.out.println("Quantidade inválida! Digite uma quantidade de soja que já esteja no trem.\n");
        } else {
            for (pos = 0; vagoes[pos] != 1; pos++)
                ;
            try {
                for (int j = 0; j < qtd; j++) {
                    remover(pos, vagoes);
                    soja--;
                }
            } catch (Exception erro) {
                System.err.println(erro.getMessage());
            }
        }
    }

    public int getSoja() {
        return soja;
    }

    public void setArroz(int quantidade) {
        try {
            if (n + quantidade > 100) {
                throw new Exception("Não há espaço suficiente no vagão!\n");
            } else {
                for (int j = 0; j < quantidade; j++) {
                    Inserir(2, vagoes);
                }
            }
        } catch (Exception erro) {
            System.err.println(erro.getMessage());
        }

        System.out.println("A quantidade de vagões atual é: " + n);
        quicksort(0, vagoes.length - 1, vagoes);
    }

    public void removeArroz(int qtd) {
        int pos = 0;

        if (qtd > arroz) {
            System.out.println("Quantidade inválida! Digite uma quantidade de arroz que já esteja no trem.\n");
        } else {
            for (pos = 0; vagoes[pos] != 2; pos++)
                ;
            try {
                for (int j = 0; j < qtd; j++) {
                    remover(pos, vagoes);
                    arroz--;
                }
            } catch (Exception erro) {
                System.err.println(erro.getMessage());
            }
        }
    }

    public int getArroz() {
        return arroz;
    }

    public void setCafe(int quantidade) {
        try {
            if (n + quantidade > 100) {
                throw new Exception("Não há espaço suficiente no vagão!\n");
            } else {
                for (int j = 0; j < quantidade; j++) {
                    Inserir(3, vagoes);
                }
            }
        } catch (Exception erro) {
            System.err.println(erro.getMessage());
        }

        System.out.println("A quantidade de vagões atual é: " + n);
        quicksort(0, vagoes.length - 1, vagoes);
    }

    public void removeCafe(int qtd) {
        int pos = 0;

        if (qtd > cafe) {
            System.out.println("Quantidade inválida! Digite uma quantidade de cafe que já esteja no trem.\n");
        } else {
            for (pos = 0; vagoes[pos] != 3; pos++)
                ;
            try {
                for (int j = 0; j < qtd; j++) {
                    remover(pos, vagoes);
                    cafe--;
                }
            } catch (Exception erro) {
                System.err.println(erro.getMessage());
            }
        }
    }

    public int getCafe() {
        return cafe;
    }

    public void setFerro(int quantidade) {
        try {
            if (n + quantidade > 100) {
                throw new Exception("Não há espaço suficiente no vagão!\n");
            } else {
                for (int j = 0; j < quantidade; j++) {
                    Inserir(4, vagoes);
                }
            }
        } catch (Exception erro) {
            System.err.println(erro.getMessage());
        }

        System.out.println("A quantidade de vagões atual é: " + n);
        quicksort(0, vagoes.length - 1, vagoes);
    }

    public void removeFerro(int qtd) {
        int pos = 0;

        if (qtd > ferro) {
            System.out.println("Quantidade inválida! Digite uma quantidade de ferro que já esteja no trem.\n");
        } else {
            for (pos = 0; vagoes[pos] != 4; pos++)
                ;
            try {
                for (int j = 0; j < qtd; j++) {
                    remover(pos, vagoes);
                    ferro--;
                }
            } catch (Exception erro) {
                System.err.println(erro.getMessage());
            }
        }
    }

    public int getFerro() {
        return ferro;
    }

    public void setCalcario(int quantidade) {
        try {
            if (n + quantidade > 100) {
                throw new Exception("Não há espaço suficiente no vagão!\n");
            } else {
                for (int j = 0; j < quantidade; j++) {
                    Inserir(5, vagoes);
                }
            }
        } catch (Exception erro) {
            System.err.println(erro.getMessage());
        }

        System.out.println("A quantidade de vagões atual é: " + n);
        quicksort(0, vagoes.length - 1, vagoes);
    }

    public void removeCalcario(int qtd) {
        int pos = 0;

        if (qtd > calcario) {
            System.out.println("Quantidade inválida! Digite uma quantidade de calcario que já esteja no trem.\n");
        } else {
            for (pos = 0; vagoes[pos] != 5; pos++)
                ;
            try {
                for (int j = 0; j < qtd; j++) {
                    remover(pos, vagoes);
                    calcario--;
                }
            } catch (Exception erro) {
                System.err.println(erro.getMessage());
            }
        }
    }

    public int getCalcario() {
        return calcario;
    }

    public void setCimento(int quantidade) {
        try {
            for (int j = 0; j < quantidade; j++) {
                Inserir(6, vagoes);
            }

        } catch (Exception erro) {
            System.err.println(erro.getMessage());
        }

        System.out.println("A quantidade de vagões atual é: " + n);
        quicksort(0, vagoes.length - 1, vagoes);
    }

    public void removeCimento(int qtd) {
        int pos = 0;

        if (qtd > cimento) {
            System.out.println("Quantidade inválida! Digite uma quantidade de cimento que já esteja no trem.\n");
        } else {
            for (pos = 0; vagoes[pos] != 6; pos++)
                ;
            try {
                for (int j = 0; j < qtd; j++) {
                    remover(pos, vagoes);
                    cimento--;
                }
            } catch (Exception erro) {
                System.err.println(erro.getMessage());
            }
        }
    }

    public int getCimento() {
        return cimento;
    }

    public void setEucalipto(int quantidade) {
        try {
            if (n + quantidade > 100) {
                throw new Exception("Não há espaço suficiente no vagão!\n");
            } else {
                for (int j = 0; j < quantidade; j++) {
                    Inserir(7, vagoes);
                }
            }

        } catch (Exception erro) {
            System.err.println(erro.getMessage());
        }

        System.out.println("A quantidade de vagões atual é: " + n);
        quicksort(0, vagoes.length - 1, vagoes);
    }

    public void removeEucalipto(int qtd) {
        int pos = 0;

        if (qtd > eucalipto) {
            System.out.println("Quantidade inválida! Digite uma quantidade de eucalipto que já esteja no trem.\n");
        } else {
            for (pos = 0; vagoes[pos] != 7; pos++)
                ;
            try {
                for (int j = 0; j < qtd; j++) {
                    remover(pos, vagoes);
                    eucalipto--;
                }
            } catch (Exception erro) {
                System.err.println(erro.getMessage());
            }
        }
    }

    public int getEucalipto() {
        return eucalipto;
    }

    public void remover(int pos, int vagoes[]) throws Exception {
        if (n == 0 || pos >= n) {
            throw new Exception("Erro! Trem está vazio.\n");
        }

        if (pos < 0) {
            throw new Exception("Erro! Posição inválida\n");
        }

        n--;

        for (int i = pos; i < n; i++) {
            vagoes[i] = vagoes[i + 1];
        }
    }

    public void Inserir(int elemento, int vagoes[]) throws Exception {

        if (n >= 100) {
            throw new Exception("Erro! O trem está cheio.\n");
        }

        vagoes[n] = elemento;

        n++;

    }

    public static void quicksort(int esq, int dir, int array[]) {

        int i = esq, j = dir, pivo = array[(esq + dir) / 2], auxTroca;
        while (i <= j) {
            while (array[i] < pivo) {
                i++;
            }
            while (array[j] > pivo) {
                j--;
            }
            if (i <= j) {
                auxTroca = array[i];
                array[i] = array[j];
                array[j] = auxTroca;
                i++;
                j--;
            }
        }

        if (esq < j) {
            quicksort(esq, j, array);
        }
        if (i < dir) {
            quicksort(i, dir, array);
        }

    }

}