package com.example.exo3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBoxMultipleVersions, checkBoxModelViewController, checkBoxMainValue, checkBoxMandatoryValidated;
    private RadioButton radioButtonOui, radioButtonNon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Récupération des CheckBox
        checkBoxMultipleVersions = findViewById(R.id.mvc_multiple_versions);
        checkBoxModelViewController = findViewById(R.id.mvc_model_view);
        checkBoxMainValue = findViewById(R.id.mvc_main_value);
        checkBoxMandatoryValidated = findViewById(R.id.mvc_mandatory_validated);

        // Récupération des RadioButton
        radioButtonOui = findViewById(R.id.jsp_syntax_oui);
        radioButtonNon = findViewById(R.id.jsp_syntax_non);

        // Bouton Suivant
        Button nextButton = findViewById(R.id.button_next);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                // Récupérer le contenu sélectionné
                boolean isMultipleVersionsSelected = checkBoxMultipleVersions.isChecked();
                boolean isModelViewControllerSelected = checkBoxModelViewController.isChecked();
                boolean isMainValueSelected = checkBoxMainValue.isChecked();
                boolean isMandatoryValidatedSelected = checkBoxMandatoryValidated.isChecked();
                boolean isSyntaxOuiSelected = radioButtonOui.isChecked();
                boolean isSyntaxNonSelected = radioButtonNon.isChecked();

                // Envoyer les informations à l'autre activité
                intent.putExtra("mvc_multiple_versions", isMultipleVersionsSelected);
                intent.putExtra("mvc_model_view", isModelViewControllerSelected);
                intent.putExtra("mvc_main_value", isMainValueSelected);
                intent.putExtra("mvc_mandatory_validated", isMandatoryValidatedSelected);
                intent.putExtra("jsp_syntax_oui", isSyntaxOuiSelected);
                intent.putExtra("jsp_syntax_non", isSyntaxNonSelected);

                // Démarrer l'activité de résultats
                startActivity(intent);
            }
        });

        // Bouton Quitter
        Button quitButton = findViewById(R.id.button_quit);
        quitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();  // Quitter l'activité actuelle
            }
        });
    }
}