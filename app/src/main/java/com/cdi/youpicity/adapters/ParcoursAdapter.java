package com.cdi.youpicity.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.cdi.youpicity.Home;
import com.cdi.youpicity.MainActivity;
import com.cdi.youpicity.models.Parcours;

import java.util.List;
import com.cdi.youpicity.R;
import com.cdi.youpicity.parcours.ParcoursActivity;

/**
 * Created by Administrateur on 31/08/2017.
 */

public class ParcoursAdapter extends ArrayAdapter<Parcours> {

    public ParcoursAdapter(Context context,List<Parcours> parcours) {

        super(context, 0, parcours);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.model_liste_parcours,parent, false);
        }

        ParcourViewHolder viewHolder = (ParcourViewHolder) convertView.getTag();
        if(viewHolder == null){
            viewHolder = new ParcourViewHolder();
            viewHolder.title = (TextView) convertView.findViewById(R.id.typeParcours);
            viewHolder.time = (TextView) convertView.findViewById(R.id.time);
            viewHolder.villeParcours = (ImageView) convertView.findViewById(R.id.imageParcours);
            viewHolder.link = (LinearLayout) convertView.findViewById(R.id.link);
            convertView.setTag(viewHolder);
        }

        final Parcours parcour = getItem(position);

        //il ne reste plus qu'à remplir notre vue
        viewHolder.title.setText(parcour.getTitle());
        viewHolder.time.setText(parcour.getTime());
        viewHolder.villeParcours.setImageResource(parcour.getImg());
        viewHolder.link.setOnClickListener(new View.OnClickListener()  {


            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ParcoursActivity.class);
                intent.putExtra("id", parcour.getTitle() );
                intent.putExtra("time", parcour.getTime() );
                intent.putExtra("img", parcour.getImg() );
                getContext().startActivity(intent);

                /*Context context = getContext();
                CharSequence text = "Hello toast!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();*/
            }
        });

        return convertView;
    }



    private class ParcourViewHolder{
        public TextView title;
        public TextView time;
        public ImageView villeParcours;
        public LinearLayout link;
        public TextView parcourDetails;
    }
}



