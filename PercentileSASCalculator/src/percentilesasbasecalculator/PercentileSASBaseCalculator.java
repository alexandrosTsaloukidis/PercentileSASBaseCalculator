/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percentilesasbasecalculator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ATsaloukidis
 */
public class PercentileSASBaseCalculator {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
       PercentileCalc percentileCalc = new PercentileCalc();
       List<Double> listExp = new ArrayList<>();
       
		listExp.add(0.24409);
		listExp.add(0.71131);
		listExp.add(0.61891);
		listExp.add(1.36668);
		listExp.add(1.56435);
		listExp.add(0.55225);
		listExp.add(-0.82697);
		listExp.add(-1.14511);
		listExp.add(1.02596);
		listExp.add(2.22285);
		listExp.add(-0.92542);
		listExp.add(0.59798);
		listExp.add(0.12966);
		listExp.add(1.19843);
		listExp.add(-0.41875);
		listExp.add(-0.18874);
		listExp.add(0.47252);
		listExp.add(-0.40818);
		listExp.add(-0.00568);
		listExp.add(-0.71784);
		listExp.add(-0.05281);
		listExp.add(-0.47895);
		listExp.add(-1.60518);
		listExp.add(-1.39607);
		listExp.add(-0.38174);
		listExp.add(-0.22608);
		listExp.add(0.11316);
		listExp.add(-0.13663);
		listExp.add(-1.49921);
		listExp.add(0.12128);
		listExp.add(-1.01317);
		listExp.add(0.91465);
		listExp.add(-0.28372);
		listExp.add(-1.01256);
		listExp.add(-1.01268);
		listExp.add(1.22828);
		listExp.add(-0.55294);
		listExp.add(-0.52514);
		listExp.add(-0.51066);
		listExp.add(-0.18795);
		listExp.add(0.45051);
		listExp.add(-0.4727);
		listExp.add(1.08635);
		listExp.add(-0.16507);
		listExp.add(-0.65624);
		listExp.add(1.32098);
		listExp.add(2.59959);
		listExp.add(0.10422);
		listExp.add(0.63716);
		listExp.add(-0.4817);
		listExp.add(-0.02241);
		listExp.add(0.01791);
		listExp.add(-1.02658);
		listExp.add(-0.56343);
		listExp.add(0.61514);
		listExp.add(0.805);
		listExp.add(0.41852);
		listExp.add(0.99944);
		listExp.add(-1.28885);
		listExp.add(-1.27881);
		listExp.add(0.74939);
		listExp.add(-0.83946);
		listExp.add(-0.55795);
		listExp.add(-0.8686);
		listExp.add(1.62023);
		listExp.add(0.69623);
		listExp.add(0.09829);
		listExp.add(0.32702);
		listExp.add(-1.29493);
		listExp.add(0.31481);
		listExp.add(1.27362);
		listExp.add(-0.93631);
		listExp.add(0.34213);
		listExp.add(-0.2552);
		listExp.add(-0.31152);
		listExp.add(1.48584);
		listExp.add(0.00374);
		listExp.add(0.50167);
		listExp.add(0.50603);
		listExp.add(-1.68245);
		listExp.add(-1.94362);
		listExp.add(1.6353);
		listExp.add(-0.85889);
		listExp.add(-0.55811);
		listExp.add(0.27655);
		listExp.add(0.12674);
		listExp.add(-1.48643);
		listExp.add(0.14444);
		listExp.add(2.57237);
		listExp.add(1.78284);
		listExp.add(-0.27438);
		listExp.add(-0.88682);
		listExp.add(0.85031);
		listExp.add(-1.62738);
		listExp.add(-1.1365);
		listExp.add(-1.10554);
		listExp.add(-1.78832);
		listExp.add(-1.26498);
		listExp.add(0.89028);
		listExp.add(-2.23744);

       System.out.println(percentileCalc.SimplePercnetile(listExp, 0));
       System.out.println(percentileCalc.SimplePercnetile(listExp, 0.05));
       System.out.println(percentileCalc.SimplePercnetile(listExp, 0.1));
       System.out.println(percentileCalc.SimplePercnetile(listExp, 0.25));
       System.out.println(percentileCalc.SimplePercnetile(listExp, 0.5));
       System.out.println(percentileCalc.SimplePercnetile(listExp, 0.75));
       System.out.println(percentileCalc.SimplePercnetile(listExp, 0.90));
       System.out.println(percentileCalc.SimplePercnetile(listExp, 0.95));
       System.out.println(percentileCalc.SimplePercnetile(listExp, 1));
    }
    
}
