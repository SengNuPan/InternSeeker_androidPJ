package com.example.sengnupan.android_pj;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

public class StoriesAdapter extends BaseAdapter implements Filterable{

    Context c;
    ArrayList<stories> stories;
    CustomFilter filter;
    ArrayList<stories> filterList;

    public StoriesAdapter(Context ctx,ArrayList<stories> stories) {

        this.c=ctx;
        this.stories=stories;
        this.filterList=stories;
    }


    public int getCount() {
        return stories.size();
    }


    public Object getItem(int pos) {

        return stories.get(pos);
    }


    public long getItemId(int pos) {

        return stories.indexOf(getItem(pos));
    }


    public View getView(int pos, View convertView, ViewGroup parent) {


        LayoutInflater inflater=(LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(convertView==null)
        {
            convertView=inflater.inflate(R.layout.list_view, null);
        }

        TextView nameTxt=(TextView) convertView.findViewById(R.id.companyName);
        TextView namedesc=(TextView) convertView.findViewById(R.id.desc);
        ImageView img=(ImageView) convertView.findViewById(R.id.companyLogo);

        ImageView star1=(ImageView)convertView.findViewById(R.id.star1);
        ImageView star2=(ImageView)convertView.findViewById(R.id.star2);
        ImageView star3=(ImageView)convertView.findViewById(R.id.star3);
        ImageView star4=(ImageView)convertView.findViewById(R.id.star4);
        ImageView star5=(ImageView)convertView.findViewById(R.id.star5);

        //SET DATA TO THEM
        nameTxt.setText(stories.get(pos).getMovieName());
        namedesc.setText(stories.get(pos).getAboutMovie());
        img.setImageResource(stories.get(pos).getImageId());


        if(stories.get(pos).getMovieName()=="Software Myanmar Co.,Ltd"){
            star1.setImageResource(R.drawable.star);
            star2.setImageResource(R.drawable.star);
            star3.setImageResource(R.drawable.star);
            star4.setImageResource(R.drawable.star_whit);
            star5.setImageResource(R.drawable.star_whit);

        }
        if(stories.get(pos).getMovieName()=="Nex4 Company Ltd"){
            star1.setImageResource(R.drawable.star);
            star2.setImageResource(R.drawable.star);
            star3.setImageResource(R.drawable.star);
            star4.setImageResource(R.drawable.star);
            star5.setImageResource(R.drawable.star_whit);


        }
        if(stories.get(pos).getMovieName()=="Bits Manager Co.,Ltd"){
            star1.setImageResource(R.drawable.star);
            star2.setImageResource(R.drawable.star);
            star3.setImageResource(R.drawable.star);
            star4.setImageResource(R.drawable.star);
            star5.setImageResource(R.drawable.star_whit);

        }
        if(stories.get(pos).getMovieName()=="High Quality Service Co.,Ltd"){
            star1.setImageResource(R.drawable.star);
            star2.setImageResource(R.drawable.star);
            star3.setImageResource(R.drawable.star_whit);
            star4.setImageResource(R.drawable.star_whit);
            star5.setImageResource(R.drawable.star_whit);
        }
        if(stories.get(pos).getMovieName()=="U.M.S Queen Co.,Ltd"){
            star1.setImageResource(R.drawable.star);
            star2.setImageResource(R.drawable.star);
            star3.setImageResource(R.drawable.star);
            star4.setImageResource(R.drawable.star_whit);
            star5.setImageResource(R.drawable.star_whit);

        }
        if(stories.get(pos).getMovieName()=="SignalBase Myanmar"){
            star1.setImageResource(R.drawable.star);
            star2.setImageResource(R.drawable.star);
            star3.setImageResource(R.drawable.star);
            star4.setImageResource(R.drawable.star);
            star5.setImageResource(R.drawable.star_whit);


        }
        if(stories.get(pos).getMovieName()=="GIC(Ygn)Co.,Ltd"){
            star1.setImageResource(R.drawable.star);
            star2.setImageResource(R.drawable.star);
            star3.setImageResource(R.drawable.star);
            star4.setImageResource(R.drawable.star);
            star5.setImageResource(R.drawable.star_whit);

        }
        if(stories.get(pos).getMovieName()=="Mspiral Co.,Ltd"){
            star1.setImageResource(R.drawable.star);
            star2.setImageResource(R.drawable.star);
            star3.setImageResource(R.drawable.star);
            star4.setImageResource(R.drawable.star);
            star5.setImageResource(R.drawable.star);
        }
        if(stories.get(pos).getMovieName()=="Ayeyarwady Bank"){
            star1.setImageResource(R.drawable.star);
            star2.setImageResource(R.drawable.star);
            star3.setImageResource(R.drawable.star);
            star4.setImageResource(R.drawable.star);
            star5.setImageResource(R.drawable.star);

        }
        if(stories.get(pos).getMovieName()=="GIC(Mdy)Co.,Ltd"){
            star1.setImageResource(R.drawable.star);
            star2.setImageResource(R.drawable.star);
            star3.setImageResource(R.drawable.star);
            star4.setImageResource(R.drawable.star_whit);
            star5.setImageResource(R.drawable.star_whit);


        }
        if(stories.get(pos).getMovieName()=="Marter Innovative Solution"){
            star1.setImageResource(R.drawable.star);
            star2.setImageResource(R.drawable.star);
            star3.setImageResource(R.drawable.star);
            star4.setImageResource(R.drawable.star);
            star5.setImageResource(R.drawable.star_whit);

        }
        if(stories.get(pos).getMovieName()=="T-Work System"){
            star1.setImageResource(R.drawable.star);
            star2.setImageResource(R.drawable.star);
            star3.setImageResource(R.drawable.star);
            star4.setImageResource(R.drawable.star);
            star5.setImageResource(R.drawable.star_whit);
        }

        if(stories.get(pos).getMovieName()=="Galaxy Software Service"){
            star1.setImageResource(R.drawable.star);
            star2.setImageResource(R.drawable.star);
            star3.setImageResource(R.drawable.star);
            star4.setImageResource(R.drawable.star);
            star5.setImageResource(R.drawable.star);


        }
        if(stories.get(pos).getMovieName()=="Orient Mandalay Co.,Ltd"){
            star1.setImageResource(R.drawable.star);
            star2.setImageResource(R.drawable.star);
            star3.setImageResource(R.drawable.star_whit);
            star4.setImageResource(R.drawable.star_whit);
            star5.setImageResource(R.drawable.star_whit);

        }
        if(stories.get(pos).getMovieName()=="Skynet(Mawlamyine)"){
            star1.setImageResource(R.drawable.star);
            star2.setImageResource(R.drawable.star);
            star3.setImageResource(R.drawable.star);
            star4.setImageResource(R.drawable.star_whit);
            star5.setImageResource(R.drawable.star_whit);
        }

        if(stories.get(pos).getMovieName()=="Myanmar_DCR(Yangon)"){
            star1.setImageResource(R.drawable.star);
            star2.setImageResource(R.drawable.star);
            star3.setImageResource(R.drawable.star);
            star4.setImageResource(R.drawable.star_whit);
            star5.setImageResource(R.drawable.star_whit);


        }
        if(stories.get(pos).getMovieName()=="Myanmar_DCR(Mdy)"){
            star1.setImageResource(R.drawable.star);
            star2.setImageResource(R.drawable.star);
            star3.setImageResource(R.drawable.star);
            star4.setImageResource(R.drawable.star);
            star5.setImageResource(R.drawable.star_whit);

        }
        if(stories.get(pos).getMovieName()=="Realistic Infotech(ygn)"){
            star1.setImageResource(R.drawable.star);
            star2.setImageResource(R.drawable.star);
            star3.setImageResource(R.drawable.star);
            star4.setImageResource(R.drawable.star);
            star5.setImageResource(R.drawable.star_whit);
        }

        if(stories.get(pos).getMovieName()=="Realistic Infotech(mdy)"){
            star1.setImageResource(R.drawable.star);
            star2.setImageResource(R.drawable.star);
            star3.setImageResource(R.drawable.star);
            star4.setImageResource(R.drawable.star_whit);
            star5.setImageResource(R.drawable.star_whit);


        }
        if(stories.get(pos).getMovieName()=="360ed Company Ltd"){
            star1.setImageResource(R.drawable.star);
            star2.setImageResource(R.drawable.star);
            star3.setImageResource(R.drawable.star);
            star4.setImageResource(R.drawable.star);
            star5.setImageResource(R.drawable.star);

        }
        if(stories.get(pos).getMovieName()=="TOSCO Company Ltd"){
            star1.setImageResource(R.drawable.star);
            star2.setImageResource(R.drawable.star);
            star3.setImageResource(R.drawable.star);
            star4.setImageResource(R.drawable.star);
            star5.setImageResource(R.drawable.star);
        }

        if(stories.get(pos).getMovieName()=="GIC(Mdy)Co.,Ltd"){
            star1.setImageResource(R.drawable.star);
            star2.setImageResource(R.drawable.star);
            star3.setImageResource(R.drawable.star);
            star4.setImageResource(R.drawable.star_whit);
            star5.setImageResource(R.drawable.star_whit);


        }
        if(stories.get(pos).getMovieName()=="NTT Data Myanmar"){
            star1.setImageResource(R.drawable.star);
            star2.setImageResource(R.drawable.star);
            star3.setImageResource(R.drawable.star);
            star4.setImageResource(R.drawable.star);
            star5.setImageResource(R.drawable.star_whit);

        }
        if(stories.get(pos).getMovieName()=="Acroquest Myanmar Co.,Ltd"){
            star1.setImageResource(R.drawable.star);
            star2.setImageResource(R.drawable.star);
            star3.setImageResource(R.drawable.star);
            star4.setImageResource(R.drawable.star);
            star5.setImageResource(R.drawable.star);
        }

        if(stories.get(pos).getMovieName()=="ICT Star Group Myanmar"){
            star1.setImageResource(R.drawable.star);
            star2.setImageResource(R.drawable.star);
            star3.setImageResource(R.drawable.star);
            star4.setImageResource(R.drawable.star_whit);
            star5.setImageResource(R.drawable.star_whit);


        }
        if(stories.get(pos).getMovieName()=="Ahtar Oo Company Ltd"){
            star1.setImageResource(R.drawable.star);
            star2.setImageResource(R.drawable.star);
            star3.setImageResource(R.drawable.star);
            star4.setImageResource(R.drawable.star);
            star5.setImageResource(R.drawable.star);

        }
              if(stories.get(pos).getMovieName()=="Asia Brightway"){
            star1.setImageResource(R.drawable.star);
            star2.setImageResource(R.drawable.star);
            star3.setImageResource(R.drawable.star);
            star4.setImageResource(R.drawable.star_whit);
            star5.setImageResource(R.drawable.star_whit);
        }

        if(stories.get(pos).getMovieName()=="Cyber Mission Myanmar"){
            star1.setImageResource(R.drawable.star);
            star2.setImageResource(R.drawable.star);
            star3.setImageResource(R.drawable.star_whit);
            star4.setImageResource(R.drawable.star_whit);
            star5.setImageResource(R.drawable.star_whit);
        }

        return convertView;
    }

    @Override
    public Filter getFilter() {
        // TODO Auto-generated method stub
        if(filter == null)
        {
            filter=new CustomFilter();
        }

        return filter;
    }

    //INNER CLASS
    class CustomFilter extends Filter
    {

        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            // TODO Auto-generated method stub

            FilterResults results=new FilterResults();

            if(constraint != null && constraint.length()>0)
            {
                //CONSTARINT TO UPPER
                constraint=constraint.toString().toUpperCase();

                ArrayList<stories> filters=new ArrayList<stories>();

                //get specific items
                for(int i=0;i<filterList.size();i++)
                {
                    if(filterList.get(i).getMovieName().toUpperCase().contains(constraint))
                    {
                        stories p=new stories( filterList.get(i).getImageId(),filterList.get(i).getMovieName(),filterList.get(i).getAboutMovie());

                        filters.add(p);
                    }
                }

                results.count=filters.size();
                results.values=filters;

            }else
            {
                results.count=filterList.size();
                results.values=filterList;

            }

            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            // TODO Auto-generated method stub

            stories=(ArrayList<stories>) results.values;
            notifyDataSetChanged();
        }

    }

}