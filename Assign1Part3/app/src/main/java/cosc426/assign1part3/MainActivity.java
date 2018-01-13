package cosc426.assign1part3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void generate(View v){
        //get the 3 editText boxes
        EditText firstNameEditText = (EditText) findViewById(R.id.firstNameInput);
        EditText lastNameEditText = (EditText) findViewById(R.id.lastNameInput);
        EditText dobEditText = (EditText) findViewById(R.id.dobInput);

        //gets the text within the editText boxes
        String firstName = firstNameEditText.getText().toString();
        String lastName = lastNameEditText.getText().toString();
        String DOB = dobEditText.getText().toString();

        Generator generator = new Generator();
        generator.set(firstName, lastName, DOB); //sets the first, last names, and DOB on the generator file

        String username = generator.getUsername(); //sets the username equal to the returned value from generator class

        TextView userOutput = (TextView) findViewById(R.id.userOutput); //gets the output textview box
        userOutput.setText("Username: " + username);   //sets the formatted string to the output text in the textview

        String password = generator.getPassword(); //sets the password equal to the returned value from generator class

        TextView passwordOutput = (TextView) findViewById(R.id.passwordOutput); //gets the output textview box
        passwordOutput.setText("Password: " + password);   //sets the formatted string to the output text in the textview
    }
}