package br.com.fpg.chesspuzzles.ui;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.com.fpg.chesspuzzles.R;
import br.com.fpg.chesspuzzles.entities.Puzzle;
import br.com.fpg.chesspuzzles.repository.PuzzleRepository;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Puzzle puzzle04 = PuzzleRepository.getPuzzle04();

        fragmentTransaction.add(R.id.root_layout, PuzzleFragment.newInstance(puzzle04));
        fragmentTransaction.commit();
    }
}
