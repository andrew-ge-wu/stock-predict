package com.thinkbig.ai.stockanalysis.algorithm;

import com.circuitwall.ml.algorithm.evolution.EvolutionAlgorithm;

public class StockPredictionAlgorithm implements EvolutionAlgorithm {


    public StockPredictionAlgorithm() {
    }

    public void processBestChild(Comparable[] bestChild, int round, double score) {
    }

    public Comparable[] generateParent() {
        return new Comparable[0];
    }

    public Comparable[] mutate(Comparable[] orig) {
        return new Comparable[0];
    }

    public Double scoreIndividual(Comparable[] individual) {
        return null;
    }
}
