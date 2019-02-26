package com.example.sengnupan.android_pj;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;



import java.util.ArrayList;
import java.util.List;

public class their_activites extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AlbumsAdapter adapter;
    private List<Album> companyList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_their_activites);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // initCollapsingToolbar();
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        companyList = new ArrayList<>();
        adapter = new AlbumsAdapter(this, companyList);

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new GridSpacingItemDecoration(1, dpToPx(10), true));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
        prepareCompany();

        if (getIntent().getExtras() != null) {
        //   Toast.makeText(this, "Search Company ", Toast.LENGTH_SHORT).show();
        }

    }


    private void prepareCompany() {

    int[]sbm ={R.drawable.sb1,R.drawable.sb2,R.drawable.sb3

    };
        int[]nex4={R.drawable.nex1,R.drawable.nex2,R.drawable.nex3,R.drawable.nex4

        };

        //int[]ahtar ={R.drawable.ahtar1,R.drawable.ahtar2,R.drawable.ahtar3

        //};
       // int[]orient={R.drawable.o1,R.drawable.o2,R.drawable.o3,R.drawable.o4,R.drawable.o5

       // };

       // int[]acroquest ={R.drawable.acro1,R.drawable.acro2,R.drawable.acro3,R.drawable.acro4,R.drawable.acro5,R.drawable.acro6

       // };


    /*    int[]gicygn ={R.drawable.gic1,R.drawable.gic2

        };
        int[]bits={R.drawable.bits1,R.drawable.bits2,R.drawable.bits3,R.drawable.bits4,R.drawable.bits5

        };

        int[]asia ={R.drawable.asia1,R.drawable.asia3

        };
        int[]twork={R.drawable.t1,R.drawable.t2,R.drawable.t3,R.drawable.t4

        };

        int[]aya ={R.drawable.aya2,R.drawable.aya3,R.drawable.aya4


        };
        int[]softmyan={R.drawable.sw1,R.drawable.sw2,R.drawable.sw3

        };

        int[]marter ={R.drawable.mt1,R.drawable.mt2,
                R.drawable.mt3,
                R.drawable.mt4,
                R.drawable.mt5,
                R.drawable.mt6,


        };
      // int[]ums={

      // };

        int[]galaxy ={R.drawable.gs1,R.drawable.gs2,R.drawable.gs3,R.drawable.gs4,R.drawable.gs5,R.drawable.gs6,

        };
        int[]ictstar={R.drawable.ict1,R.drawable.ict2,R.drawable.ict3

        };

        int[]hqs ={R.drawable.hqs1

        };
        int[]cybermission={
R.drawable.cyber1
        };

        int[]dcrmdy ={
R.drawable.dcr1,R.drawable.dcr2,R.drawable.dcr3,R.drawable.dcr4,R.drawable.dcr5,R.drawable.dcr6
        };

        int[]rigmdy ={
R.drawable.rg1,R.drawable.rg2,R.drawable.rg3
        };

        int[]ed ={R.drawable.ed1,R.drawable.ed2,R.drawable.ed3,R.drawable.ed4

        };
        int[]ntt={R.drawable.nt1,R.drawable.nt2,R.drawable.nt3,R.drawable.nt4

        };

     //   int[]mspiral={

       // };
*/

        Album a= new Album(sbm,R.drawable.love_white);
        companyList.add(a);

        Album b= new Album(nex4,R.drawable.love_white);
        companyList.add(b);

       // Album c= new Album(ahtar,R.drawable.love_white);
       // companyList.add(c);

       // Album d= new Album(orient,R.drawable.love_white);
       // companyList.add(d);
       // Album e= new Album(acroquest,R.drawable.love_white);
       // companyList.add(e);

       /* Album g= new Album(gicygn,R.drawable.love_white);
        companyList.add(g);

        Album h= new Album(bits,R.drawable.love_white);
        companyList.add(h);
        Album i= new Album(asia,R.drawable.love_white);
        companyList.add(i);

        Album j= new Album(twork,R.drawable.love_white);
        companyList.add(j);
        Album k= new Album(aya,R.drawable.love_white);
        companyList.add(k);

        Album l= new Album(softmyan,R.drawable.love_white);
        companyList.add(l);
        Album m= new Album(marter,R.drawable.love_white);
        companyList.add(m);

      //  Album n= new Album(ums,R.drawable.love_white);
       // companyList.add(n);
        Album o= new Album(galaxy,R.drawable.love_white);
        companyList.add(o);

        Album p= new Album(ictstar,R.drawable.love_white);
        companyList.add(p);

        Album q= new Album(hqs,R.drawable.love_white);
        companyList.add(q);

        Album r= new Album(cybermission,R.drawable.love_white);
        companyList.add(r);
        Album s= new Album(dcrmdy,R.drawable.love_white);
        companyList.add(s);


        Album u= new Album(rigmdy,R.drawable.love_white);
        companyList.add(u);


        Album w= new Album(ed,R.drawable.love_white);
        companyList.add(w);

        Album x= new Album(ntt,R.drawable.love_white);
        companyList.add(x);
      //  Album y= new Album(mspiral,R.drawable.love_white);
       // companyList.add(y);
*/
        adapter.notifyDataSetChanged();
    }




    public class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {

        private int spanCount;
        private int spacing;
        private boolean includeEdge;

        public GridSpacingItemDecoration(int spanCount, int spacing, boolean includeEdge) {
            this.spanCount = spanCount;
            this.spacing = spacing;
            this.includeEdge = includeEdge;
        }

        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            int position = parent.getChildAdapterPosition(view); // item position
            int column = position % spanCount; // item column

            if (includeEdge) {
                outRect.left = spacing - column * spacing / spanCount; // spacing - column * ((1f / spanCount) * spacing)
                outRect.right = (column + 1) * spacing / spanCount; // (column + 1) * ((1f / spanCount) * spacing)

                if (position < spanCount) { // top edge
                    outRect.top = spacing;
                }
                outRect.bottom = spacing; // item bottom
            } else {
                outRect.left = column * spacing / spanCount; // column * ((1f / spanCount) * spacing)
                outRect.right = spacing - (column + 1) * spacing / spanCount; // spacing - (column + 1) * ((1f /    spanCount) * spacing)
                if (position >= spanCount) {
                    outRect.top = spacing; // item top
                }
            }
        }
    }


    private int dpToPx(int dp) {
        Resources r = getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
    }

}




