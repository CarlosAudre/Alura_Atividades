package Streaming.calculos;

import Streaming.modelos.Titulo;

public class CalculadoraDeTempo {
        private int tempoTotal = 0;

       /* public void inclui(Filme f){
            tempoTotal += f.getDuracaoEmMinutos();
        }

         public void inclui(Serie s){
        tempoTotal += s.getDuracaoEmMinutos();
         }*/

        public void inclui(Titulo titulo){
                tempoTotal += titulo.getDuracaoEmMinutos();
        }


    public int getTempoTotal() {
            return tempoTotal;
        }

        public void setTempoTotal(int tempoTotal) {
            this.tempoTotal = tempoTotal;
        }

    }


