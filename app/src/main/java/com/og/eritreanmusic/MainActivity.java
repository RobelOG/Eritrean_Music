package com.og.eritreanmusic;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.google.android.youtube.player.YouTubePlayerView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;


public class MainActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

    private static final int RECOVERY_REQUEST = 1;
    private YouTubePlayerView youTubeView;
    private YouTubePlayer player;

    private InterstitialAd interAd;

    Button button;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button10;
    Button button11;
  Button button12;
    Button button13;
    Button button14;
    Button button15;
 /*   Button button16;
*/


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton();
        addListenerOnButton1();
        addListenerOnButton2();
        addListenerOnButton3();
        addListenerOnButton4();
       addListenerOnButton5();
         addListenerOnButton5();
        addListenerOnButton6();
       addListenerOnButton7();
         addListenerOnButton8();
        addListenerOnButton9();
        addListenerOnButton10();
        addListenerOnButton11();
       addListenerOnButton12();
        addListenerOnButton13();
        addListenerOnButton14();
        addListenerOnButton15();
 /*       addListenerOnButton16();
*/

        interAd = new InterstitialAd(this);
        interAd.setAdUnitId("ca-app-pub-9251526379542850/4690296122");


//		AdView adView =(AdView) findViewById(R.id.adView);


        AdRequest adRequest = new AdRequest.Builder()
                .build();

        interAd.loadAd(adRequest);
        interAd.setAdListener(new AdListener()	{
            @Override
            public void onAdLoaded(){
                displayInterstitial();
            }

        });
//		adView.loadAd(adRequest);







        youTubeView = (YouTubePlayerView) findViewById(R.id.youtube_view);
        youTubeView.initialize(Config.YOUTUBE_API_KEY, this);



    }

    public void displayInterstitial()	{

        if(interAd.isLoaded()){
            interAd.show();
        }
    }

    /*Code for button*/
    public void addListenerOnButton() {
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                nextVideo(player);
            }
        });
    }
    public void addListenerOnButton1() {
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                nextVideo1(player);
            }
        });
    }
    public void addListenerOnButton2() {
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                nextVideo2(player);
            }
        });
    }
        public void addListenerOnButton3() {
            button3 = (Button) findViewById(R.id.button3);
            button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View arg0) {
                    nextVideo3(player);
                }
            });
        }
        public void addListenerOnButton4() {
            button4 = (Button) findViewById(R.id.button4);
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View arg0) {
                    nextVideo4(player);
                }
            });
        }
            public void addListenerOnButton5() {
                button5 = (Button) findViewById(R.id.button5);
                button5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        nextVideo5(player);
                    }
                });
            }
            public void addListenerOnButton6() {
                button6 = (Button) findViewById(R.id.button6);
                button6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        nextVideo6(player);
                    }
                });
            }
            public void addListenerOnButton7() {
                button7 = (Button) findViewById(R.id.button7);
                button7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        nextVideo7(player);
                    }
                });
            }
            public void addListenerOnButton8() {
                button8 = (Button) findViewById(R.id.button8);
                button8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        nextVideo8(player);
                    }
                });
            }
            public void addListenerOnButton9() {
                button9 = (Button) findViewById(R.id.button9);
                button9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        nextVideo9(player);
                    }
                });
            }
    public void addListenerOnButton10() {
                          button10 = (Button) findViewById(R.id.button10);
                          button10.setOnClickListener(new View.OnClickListener() {
                              @Override
                              public void onClick(View arg0) {
                                  nextVideo10(player);
                              }
                          });
                  }
    public void addListenerOnButton11() {
                          button11 = (Button) findViewById(R.id.button11);
                          button11.setOnClickListener(new View.OnClickListener() {
                              @Override
                              public void onClick(View arg0) {
                                  nextVideo11(player);
                              }
                          });
                      }
    public void addListenerOnButton12() {
                              button12 = (Button) findViewById(R.id.button12);
                              button12.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View arg0) {
                                      nextVideo12(player);
                                  }
                              });
                          }
    public void addListenerOnButton13() {
        button13 = (Button) findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View arg0) {nextVideo13(player);
                                  }
                              });
                          }
    public void addListenerOnButton14() {
        button14 = (Button) findViewById(R.id.button14);
        button14.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View arg0) {nextVideo14(player);
                                  }
                              });
                          }
    public void addListenerOnButton15() {

        button15 = (Button) findViewById(R.id.button15);

        button15.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View arg0) {nextVideo15(player);
                                  }
                              });

                          }


/*
    public void addListenerOnButton16() {
        button16 = (Button) findViewById(R.id.button16);
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                nextVideo(player);
            }
        });
    }
*/

    @Override
    public void onInitializationSuccess(Provider provider, YouTubePlayer player, boolean wasRestored) {
        this.player = player;
        if (!wasRestored) {
            player.cueVideo("QYg0PY_33E0");
        }
    }
    @Override
    public void onInitializationFailure(Provider provider, YouTubeInitializationResult errorReason) {
       /*


        if (errorReason.isUserRecoverableError()) {
            errorReason.getErrorDialog(this, RECOVERY_REQUEST).show();
        } else {
            String error = String.format(getString(R.string.player_error), errorReason.toString());
            Toast.makeText(this, error, Toast.LENGTH_LONG).show();
        }


        */
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == RECOVERY_REQUEST) {
            // Retry initialization if user performed a recovery action
            getYouTubePlayerProvider().initialize(Config.YOUTUBE_API_KEY, this);
        }
    }

    protected Provider getYouTubePlayerProvider() {
        return youTubeView;
    }
/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    */

    public void nextVideo(YouTubePlayer player){player.cueVideo("CbrMAALZOj0");}
    public void nextVideo1(YouTubePlayer player){player.cueVideo("maQsC09UzL4");}
    public void nextVideo2(YouTubePlayer player){player.cueVideo("Ad0G3BBSBpc");}
    public void nextVideo3(YouTubePlayer player){player.cueVideo("MPuWM_EdE7A");}
    public void nextVideo4(YouTubePlayer player){player.cueVideo("CEz0SndbVZY");}
    public void nextVideo5(YouTubePlayer player){player.cueVideo("8VVhsc3bKyI");}
   public void nextVideo6(YouTubePlayer player){player.cueVideo("sqUyAEK-HQM");}
    public void nextVideo7(YouTubePlayer player){player.cueVideo("BimRyZU2v10");}
     public void nextVideo8(YouTubePlayer player){player.cueVideo("eJmjDzqMQyE");}
    public void nextVideo9(YouTubePlayer player){player.cueVideo("CtNOXXhmp3Q");}
    public void nextVideo10(YouTubePlayer player){player.cueVideo("wzHHizYj-bM");}
    public void nextVideo11(YouTubePlayer player){player.cueVideo("g0M1FbhfBjQ");}
    public void nextVideo12(YouTubePlayer player){player.cueVideo("h_-lvjoKGQs");}
    public void nextVideo13(YouTubePlayer player){player.cueVideo("Rbp1iYYktNM");}
    public void nextVideo14(YouTubePlayer player){player.cueVideo("p06hKfRwvHw");}
    public void nextVideo15(YouTubePlayer player){player.cueVideo("AJOhThfT5hA");}
    public void nextVideo16(YouTubePlayer player){player.cueVideo("BimRyZU2v10");}


}
