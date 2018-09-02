package csadev.timetable;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

public class MainLoginActivity extends AppCompatActivity {
    ImageView teacher,student;
    MediaPlayer mediaPlayer;
    Animation animation;
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        animation=AnimationUtils.loadAnimation(MainLoginActivity.this,R.anim.zoomout);

        setContentView(R.layout.activity_main_login);
    teacher=(ImageView)findViewById(R.id.teacher);
    student=(ImageView)findViewById(R.id.student);
    mediaPlayer=MediaPlayer.create(this,R.raw.cold);
        teacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainLoginActivity.this,"teachers",Toast.LENGTH_SHORT);
            mediaPlayer.start();
            teacher.startAnimation(animation);

            }
        });

        student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainLoginActivity.this,"students",Toast.LENGTH_LONG);
                mediaPlayer.pause();

            }
        });
    }
}
