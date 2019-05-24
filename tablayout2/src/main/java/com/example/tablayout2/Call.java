package com.example.tablayout2;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Call extends Fragment {

//    String data[] = new String[]{"Mayank Singh","BTECH","HCL","Software Engg."};

    public Call() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_call, container, false);
        setHasOptionsMenu(true);
        return v;
    }

    // -----------------------------------------------------------------------------------------------------

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.call, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.action_call) {
            Toast.makeText(getActivity(), "Clicked on" + item.getTitle(), Toast.LENGTH_SHORT).show();
        }


        return true;
    }

}

    //------------------------------------------------------------------------------------------------------


//class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder>
//{
//
//    @Override
//    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
//
//        return null;
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull MyHolder myHolder, int i) {
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return 0;
//    }
//
//    class MyHolder extends RecyclerView.ViewHolder
//    {
//
//        public MyHolder(@NonNull View itemView) {
//            super(itemView);
//        }
//    }

