package com.egfavre.contactsandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnLongClickListener{

    //Set Variables
    EditText name;
    EditText phoneNumber;
    Button add;
    ListView listView;
    ArrayAdapter<String> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    add = (Button) findViewById(R.id.addButton);
    name = (EditText) findViewById(R.id.name);
    phoneNumber = (EditText) findViewById(R.id.phoneNumber);
    listView = (ListView) findViewById(R.id.listView);

    items = new ArrayAdapter(this, android.R.layout.simple_list_item_1);
    listView.setAdapter(items);

}
    @Override
    public void onClick(View v) {
        String nameStr = name.getText().toString();
        String phoneStr = phoneNumber.getText().toString();
        items.add(nameStr + phoneStr);
        name.setText("");
        phoneNumber.setText("");
    }

    //@Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        String item = items.getItem(position);
        items.remove(item);
        return true;
    }

    @Override
    public boolean onLongClick(View v) {
        return false;
    }
}











