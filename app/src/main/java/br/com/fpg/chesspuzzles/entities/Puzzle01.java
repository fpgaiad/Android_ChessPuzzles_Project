package br.com.fpg.chesspuzzles.entities;

import br.com.fpg.chesspuzzles.R;

/**
 * Created by felipegaiad on 14/01/18.
 */

public class Puzzle01 implements Puzzle {

    @Override
    public String getPuzzleNumber() {
        return "1.";
    }

    @Override
    public String getSource() {
        return "fonte: Illustrated London News";
    }

    @Override
    public String getMaxMoves() {
        return "mate em dois lances";
    }

    @Override
    public int getImageResourceId() {
        return R.drawable.puzzle01;
    }
}
