package sn.exemple.covid_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class personal_info extends menu {

    private static final int MODE_CREATE = 1;
    private static final int MODE_EDIT = 2;

    private EditText txt_prenom;
    private EditText txt_nom;
    //private TextView txt_adresse;
    private EditText txt_email;
    private EditText txt_telephone;
    private Button save;
    private TextView location;
    private Button buttonSave;
    //private Button buttonCancel;

    private Note note;
    private boolean needRefresh;
    private int mode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);

        this.txt_prenom = (EditText) findViewById(R.id.txt_prenom);
        this.txt_nom = (EditText) findViewById(R.id.txt_nom);
        this.location = (TextView) findViewById(R.id.btn_location);
        this.txt_email = (EditText) findViewById(R.id.txt_email);
        this.txt_telephone = (EditText) findViewById(R.id.txt_telephone);


        this.buttonSave = (Button) findViewById(R.id.btn_save);
        //this.buttonCancel = (Button)findViewById(R.id.button_cancel);

        this.buttonSave.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                buttonSaveClicked();
            }
        });


        Intent intent = this.getIntent();
        this.note = (Note) intent.getSerializableExtra("note");
        if (note == null) {
            this.mode = MODE_CREATE;
        } else {
            this.mode = MODE_EDIT;
            this.txt_prenom.setText(note.getPrenom());
            this.txt_nom.setText(note.getNom());
            this.location.setText(note.getAdresse());
            this.txt_email.setText(note.getEmail());
            this.txt_telephone.setText(note.getTelephone());
        }
    }

    // Utilisateur Cliquez sur le bouton Enregistrer.
    public void buttonSaveClicked() {
        MyDatabaseHelper db = new MyDatabaseHelper(this);

        Intent i = new Intent(getApplicationContext(), Questionnaire.class);


        String prenom = this.txt_prenom.getText().toString();
        String nom = this.txt_nom.getText().toString();
        String adresse = this.location.getText().toString();

        String email = this.txt_email.getText().toString();
        String telephone = this.txt_telephone.getText().toString();

        if (mode == MODE_CREATE) {
            this.note = new Note(prenom, nom, adresse, email, telephone);
            db.addNote(note);
        }
        startActivity(i);

        this.needRefresh = true;

        // Retour à MainActivity.
        this.onBackPressed();
    }

}