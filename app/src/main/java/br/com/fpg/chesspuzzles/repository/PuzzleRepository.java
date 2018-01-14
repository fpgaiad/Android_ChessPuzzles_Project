package br.com.fpg.chesspuzzles.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.fpg.chesspuzzles.entities.Puzzle;
import br.com.fpg.chesspuzzles.entities.Puzzle01;
import br.com.fpg.chesspuzzles.entities.Puzzle02;
import br.com.fpg.chesspuzzles.entities.Puzzle03;
import br.com.fpg.chesspuzzles.entities.Puzzle04;

/**
 * Created by felipegaiad on 14/01/18.
 */

public class PuzzleRepository {

    public static Puzzle getPuzzle01() {
        return new Puzzle01();
    }

    public static Puzzle getPuzzle02() {
        return new Puzzle02();
    }

    public static Puzzle getPuzzle03() {
        return new Puzzle03();
    }

    public static Puzzle getPuzzle04() {
        return new Puzzle04();
    }

    public static List<Puzzle> getAllPuzzles() {
        List<Puzzle> puzzles = new ArrayList<>();

        puzzles.add(getPuzzle01());
        puzzles.add(getPuzzle02());
        puzzles.add(getPuzzle03());
        puzzles.add(getPuzzle04());

        return puzzles;
    }

}
