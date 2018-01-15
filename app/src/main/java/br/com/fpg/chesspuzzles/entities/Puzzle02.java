package br.com.fpg.chesspuzzles.entities;

import br.com.fpg.chesspuzzles.R;

/**
 * Created by felipegaiad on 14/01/18.
 */

public class Puzzle02 implements Puzzle {

    @Override
    public String getPuzzleNumber() {
        return "2.";
    }

    @Override
    public String getSource() {
        return "fonte: Sheffield Weekly Independent";
    }

    @Override
    public String getMaxMoves() {
        return "mate em dois lances";
    }

    @Override
    public int getImageResourceId() {
        return R.drawable.puzzle02;
    }
}
