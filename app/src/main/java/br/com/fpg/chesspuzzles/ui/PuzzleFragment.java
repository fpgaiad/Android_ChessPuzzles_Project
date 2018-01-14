package br.com.fpg.chesspuzzles.ui;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import br.com.fpg.chesspuzzles.R;
import br.com.fpg.chesspuzzles.entities.Puzzle;



public class PuzzleFragment extends Fragment {


    private static Puzzle puzzle;

    public PuzzleFragment() {
        // Required empty public constructor
    }

    public static PuzzleFragment newInstance(Puzzle puzzle) {
        PuzzleFragment.puzzle = puzzle;
        PuzzleFragment puzzleFragment = new PuzzleFragment();
        Bundle args = new Bundle();
        args.putSerializable("puzzleKey", puzzle);
        puzzleFragment.setArguments(args);
        return puzzleFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            puzzle = (Puzzle) getArguments().getSerializable("puzzleKey");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_puzzle, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        ImageView imgChessTable = view.findViewById(R.id.img_chess_table);
        TextView txtMaxMoves = view.findViewById(R.id.txt_max_moves);
        TextView txtPuzzleSource = view.findViewById(R.id.txt_puzzle_source);

        if (puzzle != null) {
            imgChessTable.setImageResource(puzzle.getImageResourceId());
            txtMaxMoves.setText(puzzle.getMaxMoves());
            txtPuzzleSource.setText(puzzle.getSource());
        }
    }
}
