package br.com.fpg.chesspuzzles.entities;

import java.io.Serializable;

/**
 * Created by felipegaiad on 14/01/18.
 */

public interface Puzzle extends Serializable {

    String getPuzzleNumber();

    String getSource();

    String getMaxMoves();

    int getImageResourceId();

}
