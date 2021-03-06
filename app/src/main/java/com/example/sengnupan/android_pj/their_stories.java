package com.example.sengnupan.android_pj;

import java.util.ArrayList;

import android.app.ActionBar;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.SearchView.OnQueryTextListener;

public class their_stories extends AppCompatActivity {
    ListView lv;
    SearchView sv;
    String[] names={ "Software Myanmar Co.,Ltd",
    "Nex4 Company Ltd","Bits Manager Co.,Ltd",  "High Quality Service Co.,Ltd",
            "U.M.S Queen Co.,Ltd",  "SignalBase Myanmar ",
            "GIC(Ygn)Co.,Ltd",  "Mspiral Company.,Ltd",   "Ayeyarwady Bank",   " GIC(Mdy)Co.,Ltd", "Marter Innovative Solution", "T-Work System",  "Galaxy Software Service",
            "Orient Mandalay Co.,Ltd", "Skynet(Mawlamyine)","T-Work System", "Myanmar DCR_(Yangon)","Myanmar DCR_(Mdy)","Realistic Infotech (ygn)", "Realistic Infotech (mdy)",  "360ed Company Ltd",
            "TOSCO Companu Ltd",   "NTT Data Myanmar",  "Acroquest Myanmar Co.,Ltd",  " ICT Star Group Myanmar","Ahtar Oo Company Ltd",
            "Asia Brightway","Cyber Mission Myanmar"};
   String[]desc={"Database နဲ ့Business level ကို သိဖို ့လိုတယ္။ Customer service ေပးရပါတယ္။ Project တစ္ပိုင္းျပီးတိုင္း report တင္ရတယ္၊ Design, step by step checking နဲ ့ testing လုပ္ရပါတယ္။ ",
           "V Sphere သံုးတယ္၊ Network overall ကို အေျခခံမွစျပီး specialized ျဖစ္သည္အထိ သင္ၾကားေပးပါသည္။ Supervisor တစ္ေယာက္ assistant တစ္ေယာက္ထားေပးပါတယ္။  အထူးသျဖင့္ virtualization နဲ ့ ပတ္သတ္တဲ့သူလိုပါတယ္။",
           " W3school website ကေန Self-study လုပ္ရပါတယ္။ Electronic E-commerce လိုမ်ိဳးလုပ္ရပါတယ္။ version control system ကိုလည္းသိဖို ့လိုပါတယ္။ intern ၁ ေယာက္ supervisor ၂ ေယာက္ (သို ့မဟုတ္) intern ၂ ေယာက္ supervisor ၁ ေယာက္ ထားေပးပါတယ္။",
           "Android Studio 3သံုးရတယ္။ သူတို ့ေပးတဲ့ Project ကို Data model ေဆာက္ရတယ္။Wi-Fi ေကာင္းတယ္။",
           "EMdy, MCDC web portal ေတြ wordpress  နဲ ့design ပိုင္းကိုလည္း ေလ့လာလုပ္ေဆာင္ရပါတယ္။ သူတို ့ project ေတြလည္း ေလ့လာခြင့္ရခဲ့ပါတယ္။ Supervisor ၁ ေယာက္လည္းထားေပးပါတယ္။",
           "PHP သီးသန္ ့ေရးရပါတယ္။ Normalization နဲ ့ error ရွာတာမ်ားမ်ားေလ့က်င့္ရမယ္။ Supervisor တစ္ေယာက္စီေပးပါတယ္။ တကယ္ run ေနတဲ့ real world project က္ိုေတာ့မေလ့လာခဲ့ရပါ။",
           "Spring Boot သံုးျပီး system ၁ ခုေရးခဲ့ရတယ္၊ ၈ နာရီမွ ၈ နာရီခဲြထိ Japan စာသင္ၾကားရျပီး ေသာၾကာေန ့မွာ Business Manner သင္ရပါတယ္။ IT ပိုင္းေတာ့ သိပ္မရခဲ့ပါ၊",
           "Drupal(CMS) သံုးရပါတယ္၊Design ပိုင္းစိတ္၀င္စားသူမ်ားအတြက္အဆင္ေျပပါတယ္။ Photoshop skill နဲ ့English skill တက္လာတယ္။ Customerနဲ ့မေတြ ့ရပါ။ Wi-Fi ေကာင္းသလို  company တြင္းဆက္ဆံေရးမွာ Stress မရွိပါ။",
           "Intern ဆင္းမည့္သူမ်ား card ၄ မိ်ဳးအေၾကာင္းသိျပီး customer ကိုရွင္းျပနိုင္ရပါမယ္။ Point Of Sale,Mobile Banking နဲ ့ Database အပိုင္းေလ့လာခဲ့ရပါတယ္။",
           "Project ၂ခုလုပ္ခဲ့ရျပီး supervisor ၂ေယာက္ေပးထားပါတယ္၊ Flow-chart ေသခ်ာလုပ္ရျပီး အခ်ိန္တိက်ရပါမယ္။ Japan Listening Skill ပိုေကာင္းလာပါတယ္။  ",
           "Spring Boot, react JS ကိုသံုးျပီး System တစ္ခုေရးရပါတယ္။ Database ေဆာက္ခဲ့ရသလို program တစ္ခုေရးျပီးတိုင္း documentation ေရးရပါတယ္။ Meeting မွာ English လိုေျပာရပါတယ္။ Wi-Fi လည္းရျပီး companyက family type ျဖစ္ပါတယ္။ လစာမရရွိပါ။",
           "Supervisor အမ်ားၾကီးထားေပးသလို သူတို ့ကိုယ္တိုင္ သင္ေပးတာလည္း ရွိပါတယ္။ Morning meeting ၁၅မိနစ္ လုပ္ရျပီး တစ္ေန ့စာအလုပ္ကို ေျပာရပါတယ္။ ၄နာရီ မွ ၅နာရီထိ စာသင္ေပးပါတယ္။",
           "Customer နဲ ့ေတြ ့ရတဲ့အတြက္ real business flow ကိုသိနိုင္တယ္။ တစ္ပတ္တစ္ခါ meeting ရွိတယ္။ လစာ (၁၅၀၀၀၀) ေပးပါတယ္။",
           "Accounting ပိုင္းနဲ ့Testing ပိုင္းအဓိကလုပ္ရတယ္၊ Hot Line Service အေနနဲ ့နယ္အထိသြားရတာမ်ိဴးရွိပါတယ္။ Service ေပးတဲ့ company ျဖစ္လုိ ့customer အိမ္ထိလိုက္အိပ္ရတာလည္းရွိတယ္။ မနက္တ္ိုင္း Stand-up meeting လုပ္ရပါတယ္။ ",
           "Editor ပိုင္းမွာလုပ္ခဲ့ရတယ္၊ IT field နဲ ့ေတာ့မထိေတြ ့ခဲ့ရဘူး၊ meeting မရွိပါ၊ Branch (၁၂၀) ေလာက္ရွိပါတယ္။",
           "Supervisor အမ်ားၾကီးထားေပးသလို သူတို ့ကိုယ္တိုင္ သင္ေပးတာလည္း ရွိပါတယ္။ Morning meeting ၁၅မိနစ္ လုပ္ရျပီး တစ္ေန ့စာအလုပ္ကို ေျပာရပါတယ္။ ၄နာရီ မွ ၅နာရီထိ စာသင္ေပးပါတယ္။",
           "Software development 3 ပတ္အတြင္း Java နဲ ့ system ေရးရပါတယ္၊ company laptop ပဲသံုးရပါတယ္။ ၂ ေယာက္ ၁ ဖြဲ ့ ဖြဲ ့ျပီး supervisor တစ္ေယာက္စီေပးထားပါတယ္။ Testing နဲ ့ error ရွာနိုင္တာ လုပ္နိုင္ရပါမယ္။",
           "ပထမတစ္ပတ္မွာ framework ကိုေလ့လာရပါတယ္။ ၂ ေယာက္ ၁ ဖြဲ ့ ဖြဲ ့ျပီး supervisor တစ္ေယာက္စီေပးထားပါတယ္။ customer နဲ ့မေတြ ့ရဘူး၊ testing and review ကို ၂ ပတ္လုပ္ရတယ္။ ",
           "Company ကေရြးေပးတဲ့ Proj title ကို J2SE, NetBean နဲ ့သံုးခဲ့ရတယ္။",
           "UI/Database design ေပးျပီးသားမွာ code ေရးရပါတယ္၊ comp ကေရးတဲ့ proj ေတြကို testing နဲ ့ report လုပ္ရတယ္။ Supervisor မရွိသလို customer နဲ ့လည္းမေတြ ့ရပါ။",
           "AR,VR,360Maker and Audio ဆိုျပီး Department  ၄ခုရွိပါတယ္။ Dept တိုင္းမွာ intern ၾကည့္ေပးတဲ့ menter ေတြထားေပးပါတယ္။ Wi-Fi ေကာင္းတယ္ ၊ သင္ေထာက္ကူ proj ေတြအဓိက ေရးခဲ့ရတယ္။ ",
           "Training company ျဖစ္ျပီး Java နဲ ့လုပ္ရပါတယ္။ Software engineering လုပ္နိုင္ရျပီး Project deadline တိက်ပါတယ္။ ေန ့တိုင္း Japan စာ ၂နာရီသင္ရပါတယ္။",
           "Spring Hibernate ကိုသံုးတယ္။Intern  ၆ေယာက္အတြက္ supervisor ၂ေယာက္ေပးထားပါတယ္။ Information security ကိုအဓိကထားတဲ့ company ျဖစ္တယ္။ ညေနတိုင္း report ေရးရျပီး Kick-off meeting ရွိပါတယ္။ လစာ ၄၀၀၀၀ ေပးတယ္၊ Customer နဲ ့မေတြ ့ရပါ။ ",
           "Spring Boot, Android hybrid ကိုသံုးျပီး project ေရးရပါတယ္၊ Japan စာ skill ကို သိပ္အေလးမထားေပမဲ့ English skill ကုိေတာ့  focus လုပ္သင့္တယ္၊ လက္ရွိနဲ ့ ေနာက္ဆံုး Trend Technology ကိုမသိခဲ့ရပါ။ တစ္ပတ္မွာ meeting ၂ ၾကိမ္ရွိျပီး ေန ့စဥ္ report ေရးရပါတယ္။ ၂ လ အထက္မွသာ certificate ရပါမယ္။",
           "Spring framework နဲ ့ Android သံုးရပါတယ္၊ Human resource management  system, presentation skill နဲ ့Accounting ပိုင္း ပ္ိုရခဲ့တယ္။ ေသာၾကာေန ့တိုင္း  presentation ရွိျပီး တစ္ပတ္စာ လိုအပ္သမ်ွျပန္ေျပာေပးတယ္။ Japan စာကို မနက္ခင္းနဲ ့ ေန ့လည္ပိုင္းမွာ နာရီ၀က္သင္ေပးပါတယ္။",
           "Programming language ေရြးစရာမ်ားျပီး Workplace ေကာင္းမြန္တယ္။ Back end company ျဖစ္တဲ့ Jarplay Com., က Project Frameworkေပးတယ္။ Intern ေတြအေပၚယံုၾကည္ေပးတယ္၊ Stress ေတြ strict ေတြလည္း မ်ားၾကီးမရွိတဲ့အျပင္ လစာ(၁၆၀၀၀)လည္းေပးပါတယ္၊ Jarplay Company က guideline ခ်ေပးနိုင္ေပမဲ့ Ahtar Oo ကေတာ့ခ်မေပးနိုင္ပါ။",
           "Customer နားလည္တဲ့ပံုစံနဲ ့ code ေရးရတယ္၊ Entity Framework သံုးျပီး အပတ္စဥ္  presentation ေပးရတယ္။ Interns မ်ားအတြက္ အခန္းသီးသန္ ့ေပးထားျပီး Wi-Fi free ရတယ္။၀န္ထမ္းအခ်င္းခ်င္း communication အားနည္းတယ္။",

           "Self-study framework လုပ္ရတယ္၊ Unit testing နဲ ့Integration testing သံုးရတယ္၊ Line count ကအစေရတြက္ရတယ္၊ Supervisor ၄ ေယာက္ထားေပးတယ္။ Database, UI design ခ်ေပးပါတယ္။ Internet လိုင္းေကာင္းတယ္။ ကိုုယ့္အရည္အခ်င္းအလိုက္ Japan ပို ့ေပးတယ္၊ လစာ (၁၈၀၀၀၀) ေလာက္ရပါတယ္။"};
    int[] images={R.drawable.softwaremyan,
    R.drawable.nex,
    R.drawable.bits,
    R.drawable.hqs,
    R.drawable.ums,
    R.drawable.sbm,
    R.drawable.gic,
    R.drawable.mspiral,
    R.drawable.aya,
    R.drawable.gic,
    R.drawable.marter,
    R.drawable.twork,
    R.drawable.galaxy,
    R.drawable.orient,
    R.drawable.skynet,
    R.drawable.twork,
    R.drawable.dcr,
    R.drawable.dcr,
    R.drawable.rig,
    R.drawable.rig,
    R.drawable.ed,
    R.drawable.tosco,
    R.drawable.nttdata,
    R.drawable.acroquest,
    R.drawable.ictstargp,
    R.drawable.ahtar,
    R.drawable.asia,
    R.drawable.cyber
    };

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_their_stories);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        final android.support.v7.app.ActionBar ab = getSupportActionBar();
        //ab.setHomeAsUpIndicator(R.drawable.ic_menu);
        ab.setDisplayHomeAsUpEnabled(true);

        lv=(ListView) findViewById(R.id.list_view);
        sv=(SearchView) findViewById(R.id.searchView1);
        final StoriesAdapter adapter=new StoriesAdapter(this, getPlayers());
        lv.setAdapter(adapter);
        sv.setOnQueryTextListener(new OnQueryTextListener() {
            public boolean onQueryTextSubmit(String arg0) {
                // TODO Auto-generated method stub
                return false;
            }
            @Override
            public boolean onQueryTextChange(String query) {
                // TODO Auto-generated method stub

                adapter.getFilter().filter(query);

                return false;
            }
        });

    }

    private ArrayList<stories> getPlayers()
    {
        ArrayList<stories> players=new ArrayList<stories>();
        stories p;

        for(int i=0;i<names.length;i++)
        {
            p=new stories(images[i],names[i],desc[i]);
            players.add(p);
        }

        return players;
    }

}