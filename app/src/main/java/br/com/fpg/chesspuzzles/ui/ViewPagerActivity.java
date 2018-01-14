package br.com.fpg.chesspuzzles.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

import br.com.fpg.chesspuzzles.R;
import br.com.fpg.chesspuzzles.entities.Puzzle;
import br.com.fpg.chesspuzzles.repository.PuzzleRepository;

public class ViewPagerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        ViewPager pagerPuzzles = findViewById(R.id.pager_puzzles);
        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager(), PuzzleRepository.getAllPuzzles());
        pagerPuzzles.setAdapter(pagerAdapter);
    }

    private class PagerAdapter extends FragmentPagerAdapter {

        private final List<Puzzle> puzzleList;

        public PagerAdapter(FragmentManager fm, List<Puzzle> puzzleList) {
            super(fm);
            this.puzzleList = puzzleList;
        }

        @Override
        public Fragment getItem(int position) {
            Puzzle puzzle = puzzleList.get(position);
            return PuzzleFragment.newInstance(puzzle);
        }

        @Override
        public int getCount() {
            return puzzleList.size();
        }
    }
}

