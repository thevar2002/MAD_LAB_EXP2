package LAB.Experiment2;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String name,regnNo,dept;

        TextView displayStudentName = findViewById(R.id.display_student_name);
        TextView displayStudentRegNo = findViewById(R.id.display_student_regnNo);
        TextView displayStudentDept = findViewById(R.id.display_student_dept);

        Intent ResultIntent = getIntent();

        name = ResultIntent.getStringExtra("studentName");
        regnNo =ResultIntent.getStringExtra("studentRegnNo");
        dept = ResultIntent.getStringExtra("studentDept");

        displayStudentName.setText(name);
        displayStudentDept.setText(dept);
        displayStudentRegNo.setText(regnNo);
    }
}