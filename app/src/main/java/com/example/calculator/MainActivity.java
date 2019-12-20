package com.example.calculator;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Logic
    double num, ans;
    int calculation;
    public double factorial (double num){
        int integr = (int)num;
        if(integr <= 1){
            return 1;
        }
        return integr * factorial(integr - 1);
    }
    public void operation(TextView formulaBar, TextView resultBar){
        switch (calculation){
            case 1:
                ans = num + Double.parseDouble(formulaBar.getText()+"");
                resultBar.setText((num + "+" + Double.parseDouble(formulaBar.getText()+"")));
                formulaBar.setText(Double.toString(ans));
                break;
            case 2:
                ans = num - Double.parseDouble(formulaBar.getText()+"");
                resultBar.setText((num + "-" + Double.parseDouble(formulaBar.getText()+"")));
                formulaBar.setText(Double.toString(ans));
                break;
            case 3:
                ans = num * Double.parseDouble(formulaBar.getText()+"");
                resultBar.setText((num + "*" + Double.parseDouble(formulaBar.getText()+"")));
                formulaBar.setText(Double.toString(ans));
                break;
            case 4:
                ans = num / Double.parseDouble(formulaBar.getText()+"");
                resultBar.setText((num + "/" + Double.parseDouble(formulaBar.getText()+"")));
                formulaBar.setText(Double.toString(ans));
                break;
            case 5:
                ans = num + 1;
                formulaBar.setText(Double.toString(ans));
                resultBar.setText((ans + "++"));
                break;
            case 6:
                ans = num - 1;
                formulaBar.setText(Double.toString(ans));
                resultBar.setText((ans + "--"));
                break;
            case 7:
                ans = factorial(num);
                formulaBar.setText(Double.toString(ans));
                resultBar.setText((ans + " F"));
                break;
                default:
                    ans = 0;
                    num = 0;
                    calculation = 0;
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        /////////My Code

        //Line
        final TextView formulaBar = (TextView) findViewById(R.id.formulaBar);
        final TextView resultBar = (TextView) findViewById(R.id.resultBar);
        //Line buttons
        Button ceBTN = (Button) findViewById(R.id.ceBTN);
        Button clearBTN = (Button) findViewById(R.id.clearBTN);

        //Operator buttons
        Button plusBTN = (Button) findViewById(R.id.plusBTN);
        Button minusBTN = (Button) findViewById(R.id.minusBTN);
        Button multiplyBTN = (Button) findViewById(R.id.multiplyBTN);
        Button divideBTN = (Button) findViewById(R.id.divideBTN);
        Button incrementBTN = (Button) findViewById(R.id.incrementBTN);
        Button waneBTN = (Button) findViewById(R.id.waneBTN);
        Button factorialBTN = (Button) findViewById(R.id.factorialBTN);
        Button equalBTN = (Button) findViewById(R.id.equalBTN);
        Button dotBTN = (Button) findViewById(R.id.dot);

        //Number buttons
        Button zeroBTN = (Button) findViewById(R.id.zero);
        Button oneBTN = (Button) findViewById(R.id.one);
        Button twoBTN = (Button) findViewById(R.id.two);
        Button threeBTN = (Button) findViewById(R.id.three);
        Button fourBTN = (Button) findViewById(R.id.four);
        Button fiveBTN = (Button) findViewById(R.id.five);
        Button sixBTN = (Button) findViewById(R.id.six);
        Button sevenBTN = (Button) findViewById(R.id.seven);
        Button eightBTN = (Button) findViewById(R.id.eight);
        Button nineBTN = (Button) findViewById(R.id.nine);

        //Typing

        //Input cleaning
        ceBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int length = formulaBar.getText().length();
                int number = formulaBar.getText().length() - 1;
                String store;

                if(length > 0){
                    StringBuilder back = new StringBuilder(formulaBar.getText());
                    back.deleteCharAt(number);
                    store = back.toString();
                    formulaBar.setText(store);
                }
            }
        });
        clearBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultBar.setText("");
                formulaBar.setText("");
                num = 0;
                ans = 0;
                calculation = 0;
            }
        });

        //Number Buttons
        zeroBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formulaBar.setText(formulaBar.getText() + "0");
            }
        });
        oneBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formulaBar.setText(formulaBar.getText() + "1");
            }
        });
        twoBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formulaBar.setText(formulaBar.getText() + "2");
            }
        });
        threeBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formulaBar.setText(formulaBar.getText() + "3");
            }
        });
        fourBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formulaBar.setText(formulaBar.getText() + "4");
            }
        });
        fiveBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formulaBar.setText(formulaBar.getText() + "5");
            }
        });
        sixBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formulaBar.setText(formulaBar.getText() + "6");
            }
        });
        sevenBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formulaBar.setText(formulaBar.getText() + "7");
            }
        });
        eightBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formulaBar.setText(formulaBar.getText() + "8");
            }
        });
        nineBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formulaBar.setText(formulaBar.getText() + "9");
            }
        });


        //Operator Buttons
        dotBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = formulaBar.getText().toString();
                if(temp.isEmpty() || formulaBar.getText().toString().matches("-")){
                    formulaBar.setText("");
                }else{
                    if(temp.indexOf('.') == -1){
                        formulaBar.setText(formulaBar.getText().toString() + ".");
                    }
                    else formulaBar.setText(formulaBar.getText().toString() + "");
                }
            }
        });
        plusBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = formulaBar.getText().toString();
                if (temp.isEmpty() || formulaBar.getText().toString().matches("-")) {
                    formulaBar.setText("");
                } else {
                    num = Double.parseDouble(formulaBar.getText().toString());
                    calculation = 1;
                    resultBar.setText(num + "+");
                    formulaBar.setText("");
                }
            }
        });
        minusBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(formulaBar.getText().toString().matches("") || formulaBar.getText().toString().matches("-")){
                    formulaBar.setText("-");
                    String temp = formulaBar.getText().toString();
                    if(temp.isEmpty()){
                        formulaBar.setText("");
                    }else{
                        if(temp.indexOf('-') == -1){
                            formulaBar.setText(formulaBar.getText().toString() + "-");
                        }
                        else formulaBar.setText(formulaBar.getText().toString() + "");
                    }
                }else{
                    num = Double.parseDouble(formulaBar.getText().toString());
                    calculation = 2;
                    resultBar.setText(num + "-");
                    formulaBar.setText("");
                }
            }
        });
        multiplyBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(formulaBar.getText().toString().matches("") || formulaBar.getText().toString().matches("-")){
                    formulaBar.setText("");
                }else{
                    num = Double.parseDouble(formulaBar.getText().toString());
                    calculation = 3;
                    resultBar.setText(num + "*");
                    formulaBar.setText("");
                }
            }
        });
        divideBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (formulaBar.getText().toString().matches("") || formulaBar.getText().toString().matches("-")) {
                    formulaBar.setText("");
                }else {
                    num = Double.parseDouble(formulaBar.getText().toString());
                    calculation = 4;
                    resultBar.setText(num + "/");
                    formulaBar.setText("");
                }
            }
        });


        //Answer Buttons
        incrementBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (formulaBar.getText().toString().matches("") || formulaBar.getText().toString().matches("-")) {
                    formulaBar.setText("");
                } else {
                    num = Double.parseDouble(formulaBar.getText().toString());
                    calculation = 5;
                    resultBar.setText(num + "++");
                    formulaBar.setText("");
                    operation(formulaBar, resultBar);
                }
            }
        });
        waneBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (formulaBar.getText().toString().matches("") || formulaBar.getText().toString().matches("-")) {
                    formulaBar.setText("");
                } else {
                    num = Double.parseDouble(formulaBar.getText().toString());
                    calculation = 6;
                    resultBar.setText(num + "--");
                    formulaBar.setText("");
                    operation(formulaBar, resultBar);
                }
            }
        });
        factorialBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (formulaBar.getText().toString().matches("") || formulaBar.getText().toString().matches("-")) {
                    formulaBar.setText("");
                } else {
                    num = Double.parseDouble(formulaBar.getText().toString());
                    if(num < 0){
                        formulaBar.setText("");
                    }else{
                        calculation = 7;
                        resultBar.setText(num + " F");
                        formulaBar.setText("");
                        operation(formulaBar, resultBar);
                    }
                }
            }
        });
        equalBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (formulaBar.getText().toString().matches("") || formulaBar.getText().toString().matches("-")) {
                    formulaBar.setText("");
                }else {
                    operation(formulaBar, resultBar);
                }
            }
        });
    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
