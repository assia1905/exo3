package com.example.exo3;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Récupérer les informations envoyées depuis MainActivity
        TextView resultTextView = findViewById(R.id.resultTextView);

        boolean mvcMultipleVersions = getIntent().getBooleanExtra("mvc_multiple_versions", false);
        boolean mvcModelViewController = getIntent().getBooleanExtra("mvc_model_view", false);
        boolean mvcMainValue = getIntent().getBooleanExtra("mvc_main_value", false);
        boolean mvcMandatoryValidated = getIntent().getBooleanExtra("mvc_mandatory_validated", false);
        boolean jspSyntaxOui = getIntent().getBooleanExtra("jsp_syntax_oui", false);
        boolean jspSyntaxNon = getIntent().getBooleanExtra("jsp_syntax_non", false);

        // Créer un résumé des réponses
        StringBuilder resultBuilder = new StringBuilder();
        resultBuilder.append("1. Le pattern MVC signifie :\n");
        if (mvcMultipleVersions) {
            resultBuilder.append("- Multiple Versions Combined\n");
        }
        if (mvcModelViewController) {
            resultBuilder.append("- Model View Controller\n");
        }
        if (mvcMainValue) {
            resultBuilder.append("- Main Value Compiled\n");
        }
        if (mvcMandatoryValidated) {
            resultBuilder.append("- Mandatory Validated Controls\n");
        }

        resultBuilder.append("\n2. La syntaxe ${x} est permise dans une JSP :\n");
        if (jspSyntaxOui) {
            resultBuilder.append("- OUI\n");
        } else if (jspSyntaxNon) {
            resultBuilder.append("- NON\n");
        }

        // Afficher le résultat dans le TextView
        resultTextView.setText(resultBuilder.toString());
    }
}