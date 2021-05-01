package sn.exemple.covid_project;/*


import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

public class Mydb extends SQLiteOpenHelper {

    private static final String TAG = "SQLite";

    // Version base de données
    private static final int DATABASE_VERSION = 1;

    // nom base de données
    private static final String DATABASE_NAME = "Personne";

    // Nom Table : Note.
    private static final String TABLE_Personne = "Personne";

    private static final String COLUMN_Email = "email";
    private static final String COLUMN_nom = "nom";
    private static final String COLUMN_prenom = "prenom";
    private static final String COLUMN_tel = "tel";
    private static final String COLUMN_Adresse = "adresse";

    public Mydb(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.i(TAG, "Personne.onCreate ... ");
        // Script.
        String script = "CREATE TABLE " + TABLE_Personne + "(" + COLUMN_prenom + " String PRIMARY KEY,"
                + COLUMN_nom + " String," + COLUMN_Adresse + " String," + COLUMN_Email + " String,"
                + COLUMN_tel + " String" +
                ")";
        // Execution Script.
        db.execSQL(script);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void addNote(personal_info p1) {

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put(COLUMN_prenom, p1.getPrenom());
        values.put(COLUMN_nom, p1.getNom());
        values.put(COLUMN_Adresse, p1.getAdresse());
        values.put(COLUMN_Email, p1.getEmail());
        values.put(COLUMN_tel, p1.getTelephone());
        //Toast.makeText(get, "les donnees sont enregisttrer ", Toast.LENGTH_LONG).show();


        // Insertion d'une ligne
        db.insert(TABLE_Personne, null, values);

        // Fermeture de la connexion à la base de données
        db.close();
    }


}

*/
