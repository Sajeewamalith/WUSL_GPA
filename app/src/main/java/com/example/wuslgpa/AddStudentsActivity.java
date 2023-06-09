package com.example.wuslgpa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class AddStudentsActivity extends AppCompatActivity {

    private EditText mStudentName,mCmisMarks,mMathMarks,
            mStatMarks,mImgtMarks, mEltnMarks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_students);

        // This is a new Student, so change the app bar to say "Add Students"
        setTitle(getString(R.string.add_student_activity_title));

        mStudentName = (EditText) findViewById(R.id.studentNameId);
        mCmisMarks = (EditText) findViewById(R.id.cmisMarksId);
        mMathMarks = (EditText) findViewById(R.id.mathMarksId);
        mStatMarks = (EditText) findViewById(R.id.statMarksId);
        mImgtMarks = (EditText) findViewById(R.id.imgtMarksId);
        mEltnMarks = (EditText) findViewById(R.id.eltnMarksId);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // This adds menu items to the app bar.
        getMenuInflater().inflate(R.menu.menu_add_student, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_save:
                // Save Student to database
                saveStudent();
                // Exit activity
                finish();
                return true;

        }
        return super.onOptionsItemSelected(item);
    }



    private void saveStudent() {

    }
}