package com.hfad.test3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.hfad.test3.MainActivity;
import com.hfad.test3.R;
import com.hfad.test3.problemActivity;
import com.hfad.test3.ui.dashboard.DashboardViewModel;

public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;
    //得到片段自己的视图
    //View view=getView();
   /*static interface Listener{
        void itemClicked(long id);
    }

    private Listener listener;*/

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
        //定义列表的接口
        ListView listView=(ListView)root.findViewById(R.id.text_dashboard);
        AdapterView.OnItemClickListener onItemClickListener=new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Intent intent=new Intent(getActivity(), problemActivity.class);
                    startActivity(intent);
                }
                if (position==1){
                    Intent intent=new Intent(getActivity(), feedbackActivity.class);
                    startActivity(intent);
                }
                if (position==2){
                    Intent intent=new Intent(getActivity(), aboutActivity.class);
                    startActivity(intent);
                }
            }
        };
        listView.setOnItemClickListener(onItemClickListener);

        return root;
    }
   /* @Override
   public void onAttach(Context context){
        super.onAttach(context);
        this.listener=(Listener)context;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {

        if (listener!=null){
            listener.itemClicked(id);
        }
    }*/
}