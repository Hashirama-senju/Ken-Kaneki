package csadev.timetable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Teacher_login extends AppCompatActivity {

    Button signin;
    ImageButton googlelogo;
    TextView year,name;
    ImageView icon;

    Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_login);


        signin=(Button)findViewById(R.id.signin_button);
        googlelogo=(ImageButton)findViewById(R.id.google_logo);

        year=(TextView)findViewById(R.id.year);
        name=(TextView)findViewById(R.id.name);

        icon=(ImageView)findViewById(R.id.icon);

        animation=AnimationUtils.loadAnimation(Teacher_login.this,R.anim.bounce);

        icon.startAnimation(animation);


    }
}
