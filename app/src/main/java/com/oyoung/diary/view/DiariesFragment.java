package com.oyoung.diary.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.oyoung.diary.R;
import com.oyoung.diary.controller.DiariesController;

public class DiariesFragment extends Fragment {
    private DiariesController mController;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mController = new DiariesController(this);
    }

    /*@Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        inflater.inflate(R.menu.menu_write, menu);
    }*/

   /* @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_add:
                mController.gotoWriteDiary(getActivity().getSupportFragmentManager(), this);
                return true;
        }
        return false;
    }
*/
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_diaries, container, false);
        mController.setDiariesList(root.findViewById(R.id.diaries_list));
        return root;
    }

    @Override
    public void onResume() {
        super.onResume();
        mController.loadDiaries();
    }
}
