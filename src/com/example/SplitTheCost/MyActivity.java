package com.example.SplitTheCost;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button btn = (Button)findViewById(R.id.btnCalc);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //オブジェクトを取得
                EditText etxtNum = (EditText)findViewById(R.id.etxtNum);
                EditText etxtMoney = (EditText)findViewById(R.id.etxtMoney);
                TextView txtResult = (TextView)findViewById(R.id.txtResult);
                TextView txtOneMoney = (TextView)findViewById(R.id.txtOneMoney);
                TextView txtYen = (TextView)findViewById(R.id.txtYen);

                //入力内容を取得
                String strNum = etxtNum.getText().toString();
                String strMoney = etxtMoney.getText().toString();

                //数値に変換
                int num = Integer.parseInt(strNum);
                int money = Integer.parseInt(strMoney);

                //割り勘計算
                int result = money / num;

                //結果表示用テキストに設定
                txtResult.setText(Integer.toString(result));

                //結果表示用テキストを表示
                txtOneMoney.setVisibility(View.VISIBLE);
                txtResult.setVisibility(View.VISIBLE);
                txtYen.setVisibility(View.VISIBLE);
            }
        });
    }
}
