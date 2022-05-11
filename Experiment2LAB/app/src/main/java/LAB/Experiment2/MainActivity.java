package LAB.Experiment2;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText NameOfStudentField = findViewById(R.id.name_Of_Student_Field);
        EditText RegnNoOfStudentField = findViewById(R.id.Regn_Of_Student_Field);
        Button SubmitButton = findViewById(R.id.Submit_Button);
        Spinner DeptOfStudentSpinner = findViewById(R.id.Dept_Of_Student_Spinner);

        String[] Departments = {"Information Tech.","Computer Science","EEE","ECE","Mechanical","Civil","Automobile"};

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_item,Departments);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        DeptOfStudentSpinner.setAdapter(adapter);

        SubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name,regnNo,dept;

                name=NameOfStudentField.getText().toString();
                regnNo=RegnNoOfStudentField.getText().toString();
                dept=DeptOfStudentSpinner.getSelectedItem().toString();

                Intent displayResultIntent = new Intent(MainActivity.this,MainActivity2.class);

                displayResultIntent.putExtra("studentName",name);
                displayResultIntent.putExtra("studentDept",dept);
                displayResultIntent.putExtra("studentRegnNo",regnNo);

                startActivity(displayResultIntent);
            }
        });


    }
}