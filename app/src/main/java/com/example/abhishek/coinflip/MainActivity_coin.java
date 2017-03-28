package com.example.abhishek.coinflip;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity_coin extends AppCompatActivity {

    ImageView coin_image;
    Random random;

    int check_side=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_coin);

        coin_image=(ImageView)findViewById(R.id.imageview_coin);
        random=new Random();
    }



    public void flip(View view)
    {

        check_side=random.nextInt(2);
       // Toast.makeText(this,check_side+"",Toast.LENGTH_SHORT).show();

        if(check_side==0)
        {
            coin_image.setImageResource(R.drawable.tails);
            Toast.makeText(this,"Tails !!",Toast.LENGTH_SHORT).show();
        }
        else if(check_side==1)
        {
            coin_image.setImageResource(R.drawable.heads);
            Toast.makeText(this,"Heads !!",Toast.LENGTH_SHORT).show();
        }

        RotateAnimation rotate_coin=new RotateAnimation(0,360,RotateAnimation.RELATIVE_TO_SELF,0.5f,RotateAnimation.RELATIVE_TO_SELF,0.5f);

        rotate_coin.setDuration(1000);
        coin_image.setAnimation(rotate_coin);





    }



}
