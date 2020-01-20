package com.escacena.ejercicio05;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.escacena.ejercicio05.dummy.DummyContent;
import com.escacena.ejercicio05.dummy.DummyContent.DummyItem;

import java.util.ArrayList;
import java.util.List;

/**
 * A fragment representing a list of Items.
 * <p/>
 * Activities containing this fragment MUST implement the {@link OnListFragmentInteractionListener}
 * interface.
 */
public class VideoFragment extends Fragment {
    private int mColumnCount = 1;
    private IVideoListener videoListener;
    private List<Video> list;
    private MyVideoRecyclerViewAdapter adapter;

    public VideoFragment() {
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_video_list, container, false);

        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            if (mColumnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            }
            list = new ArrayList<>();
            list.add(new Video ("It's been real, but I'm out!","https://yt3.ggpht.com/a/AGF-l79FVckie4j9WT-4cEW6iu3gPd4GivQf_XNSWg=s288-c-k-c0xffffffff-no-rj-mo","2:03",500, "https://img.youtube.com/vi/IZXgjR9INsA/mqdefault.jpg","PewDiePie"));
            list.add(new Video ("My New Car!","https://yt3.ggpht.com/a/AGF-l79FVckie4j9WT-4cEW6iu3gPd4GivQf_XNSWg=s288-c-k-c0xffffffff-no-rj-mo","2:03",500, "https://img.youtube.com/vi/M_rfdz7vplU/mqdefault.jpg","PewDiePie"));
            list.add(new Video ("I hate Lilys Garden and her teeth","https://yt3.ggpht.com/a/AGF-l79FVckie4j9WT-4cEW6iu3gPd4GivQf_XNSWg=s288-c-k-c0xffffffff-no-rj-mo","2:03",500, "https://img.youtube.com/vi/IxhXSY24W2k/mqdefault.jpg","PewDiePie"));
            list.add(new Video ("EVERYTHING IS AWFUL","https://yt3.ggpht.com/a/AGF-l79FVckie4j9WT-4cEW6iu3gPd4GivQf_XNSWg=s288-c-k-c0xffffffff-no-rj-mo","2:03",500, "https://img.youtube.com/vi/h2K2-MdIva4/mqdefault.jpg","PPewDiePie"));

            adapter = new MyVideoRecyclerViewAdapter(context,R.layout.fragment_video,list);

            recyclerView.setAdapter(adapter);
        }
        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof IVideoListener) {
            videoListener = (IVideoListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement IVideoListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        videoListener = null;
    }


}
