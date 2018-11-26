package com.example.daniela.hey;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView mShoppingList;
    private EditText mItemEdit;
    private Button mAddButton;
    private ArrayAdapter<String> mAdapter;

    Button button_id_0, button_id_1, button_id_2, button_id_3, button_id_4, button_id_5, button_id_6,
            button_id_7, button_id_8, button_id_9, math_add_button, math_minus_button, math_divide_button,
            math_multiply_button, math_decimal_button, math_clear_button, total_button;

    EditText sum_total;

    float mValueOne, mValueTwo;

    boolean mathAddition, mSubtract, mathMultiplication, mathDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_id_0 = (Button) findViewById(R.id.button_id_0);
        button_id_1 = (Button) findViewById(R.id.button_id_1);
        button_id_2 = (Button) findViewById(R.id.button_id_2);
        button_id_3 = (Button) findViewById(R.id.button_id_3);
        button_id_4 = (Button) findViewById(R.id.button_id_4);
        button_id_5 = (Button) findViewById(R.id.button_id_5);
        button_id_6 = (Button) findViewById(R.id.button_id_6);
        button_id_7 = (Button) findViewById(R.id.button_id_7);
        button_id_8 = (Button) findViewById(R.id.button_id_8);
        button_id_9 = (Button) findViewById(R.id.button_id_9);
        math_decimal_button = (Button) findViewById(R.id.math_decimal_button);
        math_add_button = (Button) findViewById(R.id.math_add_button);
        math_minus_button = (Button) findViewById(R.id.math_minus_button);
        math_multiply_button = (Button) findViewById(R.id.math_multiply_button);
        math_divide_button = (Button) findViewById(R.id.math_divide_button);
        math_clear_button = (Button) findViewById(R.id.math_clear_button);
        total_button = (Button) findViewById(R.id.total_button);
        sum_total = (EditText) findViewById(R.id.sum_total);

        button_id_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sum_total.setText(sum_total.getText() + "1");
            }
        });

        button_id_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sum_total.setText(sum_total.getText() + "2");
            }
        });

        button_id_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sum_total.setText(sum_total.getText() + "3");
            }
        });

        button_id_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sum_total.setText(sum_total.getText() + "4");
            }
        });

        button_id_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sum_total.setText(sum_total.getText() + "5");
            }
        });

        button_id_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sum_total.setText(sum_total.getText() + "6");
            }
        });

        button_id_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sum_total.setText(sum_total.getText() + "7");
            }
        });

        button_id_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sum_total.setText(sum_total.getText() + "8");
            }
        });

        button_id_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sum_total.setText(sum_total.getText() + "9");
            }
        });

        button_id_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sum_total.setText(sum_total.getText() + "0");
            }
        });

        math_add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (sum_total == null) {
                    sum_total.setText("");
                } else {
                    mValueOne = Float.parseFloat(sum_total.getText() + "");
                    mathAddition = true;
                    sum_total.setText(null);
                }
            }
        });

        math_minus_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(sum_total.getText() + "");
                mSubtract = true;
                sum_total.setText(null);
            }
        });

        math_multiply_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(sum_total.getText() + "");
                mathMultiplication = true;
                sum_total.setText(null);
            }
        });

        math_divide_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(sum_total.getText() + "");
                mathDivision = true;
                sum_total.setText(null);
            }
        });

        total_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(sum_total.getText() + "");

                if (mathAddition == true) {
                    sum_total.setText(mValueOne + mValueTwo + "");
                    mathAddition = false;
                }

                if (mSubtract == true) {
                    sum_total.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (mathMultiplication == true) {
                    sum_total.setText(mValueOne * mValueTwo + "");
                    mathMultiplication = false;
                }

                if (mathDivision == true) {
                    sum_total.setText(mValueOne / mValueTwo + "");
                    mathDivision = false;
                }
            }
        });

        math_clear_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sum_total.setText("");
            }
        });

        math_decimal_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sum_total.setText(sum_total.getText() + ".");
            }
        });

        mShoppingList = (ListView) findViewById(R.id.shopping_listView);
        mItemEdit = (EditText) findViewById(R.id.item_editText);
        mAddButton = (Button) findViewById(R.id.add_button);

        mAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);
        mShoppingList.setAdapter(mAdapter);

        mAddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String item = mItemEdit.getText().toString();
                mAdapter.add(item);
                mAdapter.notifyDataSetChanged();
                mItemEdit.setText("");

            }
        });
    };
}