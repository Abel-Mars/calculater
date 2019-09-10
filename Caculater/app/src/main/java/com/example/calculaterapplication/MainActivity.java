package com.example.calculaterapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.time.Instant;
import java.util.*;
public class MainActivity extends AppCompatActivity {
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        // 在这里添加屏幕切换后的操作
        if(newConfig.orientation==Configuration.ORIENTATION_LANDSCAPE){
            //横向
            TextView txt =(TextView)findViewById(R.id.TextView1);
            TextView txt3 =(TextView)findViewById(R.id.TextView2);
            String a = txt.getText().toString();
            String b = txt3.getText().toString();
            setContentView(R.layout.activity_main);
            TextView txt2 =(TextView)findViewById(R.id.TextView1);
            TextView txt4 =(TextView)findViewById(R.id.TextView2);
            txt2.setText(a);
            txt4.setText(b);
            setView();
            //Log.d("屏幕消息屏幕消息屏幕消息屏幕消息屏幕消息屏幕消息","横屏");
            // setContentView(R.layout.activity_main);

        }else{

            //竖向
            TextView txt =(TextView)findViewById(R.id.TextView1);
            TextView txt3 =(TextView)findViewById(R.id.TextView2);
            String a = txt.getText().toString();
            String b = txt3.getText().toString();
            //Log.d("屏幕消息屏幕消息屏幕消息屏幕消息屏幕消息屏幕消息","竖屏");
            setContentView(R.layout.activity_main2);
            TextView txt2 =(TextView)findViewById(R.id.TextView1);
            TextView txt4 =(TextView)findViewById(R.id.TextView2);
            txt2.setText(a);
            txt4.setText(b);
            setView();
          }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.option_normal_1:
                Intent intent =new Intent(MainActivity.this,HelpActivity.class);
                startActivity(intent)-
        }
        return super.onOptionsItemSelected(item);
    }
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("计算器");
        setView();
    }
    public void setView(){
        Button button0 = (Button)findViewById(R.id.button0);
        Button button1 = (Button)findViewById(R.id.button1);
        Button button2 = (Button)findViewById(R.id.button2);
        Button button3 = (Button)findViewById(R.id.button3);
        Button button4 = (Button)findViewById(R.id.button4);
        Button button5 = (Button)findViewById(R.id.button5);
        Button button6 = (Button)findViewById(R.id.button6);
        Button button7 = (Button)findViewById(R.id.button7);
        Button button8 = (Button)findViewById(R.id.button8);
        Button button9 = (Button)findViewById(R.id.button9);
        //number key
        Button buttonC = (Button)findViewById(R.id.button_c);
        Button buttonX = (Button)findViewById(R.id.button_back);
        Button button_add = (Button)findViewById(R.id.button_add);
        Button button_del = (Button)findViewById(R.id.button_del);
        Button button_cheng = (Button)findViewById(R.id.button_cheng);
        Button button_chu = (Button)findViewById(R.id.button_chu);
        Button button_point=(Button)findViewById(R.id.button_point);
        Button button_left = (Button)findViewById(R.id.button_left);
        Button button_right = (Button)findViewById(R.id.button_right);
        Button button_re = (Button)findViewById(R.id.button_result);
        Button button_cos = (Button)findViewById(R.id.button_cos);
        Button button_sin = (Button)findViewById(R.id.button_sin);
        Button button_tan = (Button)findViewById(R.id.button_tan);
        Button button_kf = (Button)findViewById(R.id.button_kf);
        Button button_cf = (Button)findViewById(R.id.button_cf);
        //function key
        Button button_dw = (Button)findViewById(R.id.button_dw);
        Button button_jz = (Button)findViewById(R.id.button_jz);
        //model key
        final TextView textView1 = (TextView)findViewById(R.id.TextView1);
        final TextView textView2 = (TextView)findViewById(R.id.TextView2);
        //view text
        button_dw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,DanweiActivity.class);
                startActivity(intent);
            }
        });
        button_jz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,JinzhiActivity.class);
                startActivity(intent);
            }
        });
        //model
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView1.setText("0");
                textView2.setText("0");
            }
        });
        buttonX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int llo = textView1.getText().length();
                if(llo!=1) {
                    String ss = textView1.getText().toString().substring(0, llo - 1);
                    textView1.setText(ss);
                }
                else{
                    textView1.setText("0");
                }
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char findnew=textView1.getText().toString().charAt(textView1.getText().toString().length()-1);
                if((!textView1.getText().toString().equals("0"))&&(findnew!=')')){
                    textView1.setText(textView1.getText().toString()+"0");
                }
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char findnew = textView1.getText().toString().charAt(textView1.getText().toString().length() - 1);
                if (findnew != ')') {
                    if (textView1.getText().toString().equals("0")) {
                        textView1.setText("1");
                    } else {
                        textView1.setText(textView1.getText().toString() + "1");
                    }
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char findnew = textView1.getText().toString().charAt(textView1.getText().toString().length() - 1);
                if (findnew != ')') {
                    if (textView1.getText().toString().equals("0")) {
                        textView1.setText("2");
                    } else {
                        textView1.setText(textView1.getText().toString() + "2");
                    }
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char findnew = textView1.getText().toString().charAt(textView1.getText().toString().length() - 1);
                if (findnew != ')') {
                    if (textView1.getText().toString().equals("0")) {
                        textView1.setText("3");
                    } else {
                        textView1.setText(textView1.getText().toString() + "3");
                    }
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char findnew = textView1.getText().toString().charAt(textView1.getText().toString().length() - 1);
                if (findnew != ')') {
                    if (textView1.getText().toString().equals("0")) {
                        textView1.setText("4");
                    } else {
                        textView1.setText(textView1.getText().toString() + "4");
                    }
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char findnew = textView1.getText().toString().charAt(textView1.getText().toString().length() - 1);
                if (findnew != ')') {
                    if (textView1.getText().toString().equals("0")) {
                        textView1.setText("5");
                    } else {
                        textView1.setText(textView1.getText().toString() + "5");
                    }
                }
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char findnew = textView1.getText().toString().charAt(textView1.getText().toString().length() - 1);
                if (findnew != ')') {
                    if (textView1.getText().toString().equals("0")) {
                        textView1.setText("6");
                    } else {
                        textView1.setText(textView1.getText().toString() + "6");
                    }
                }
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char findnew = textView1.getText().toString().charAt(textView1.getText().toString().length() - 1);
                if (findnew != ')') {
                    if (textView1.getText().toString().equals("0")) {
                        textView1.setText("7");
                    } else {
                        textView1.setText(textView1.getText().toString() + "7");
                    }
                }
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char findnew = textView1.getText().toString().charAt(textView1.getText().toString().length() - 1);
                if (findnew != ')') {
                    if (textView1.getText().toString().equals("0")) {
                        textView1.setText("8");
                    } else {
                        textView1.setText(textView1.getText().toString() + "8");
                    }
                }
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char findnew = textView1.getText().toString().charAt(textView1.getText().toString().length() - 1);
                if (findnew != ')') {
                    if (textView1.getText().toString().equals("0")) {
                        textView1.setText("9");
                    } else {
                        textView1.setText(textView1.getText().toString() + "9");
                    }
                }
            }
        });
        //number

        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char findnew = textView1.getText().toString().charAt(textView1.getText().toString().length() - 1);
                if(findnew==')'||findnew=='0'||findnew=='1'||findnew=='2'||findnew=='3'||findnew=='4'
                        ||findnew=='5' ||findnew=='6'||findnew=='7'||findnew=='8'||findnew=='9')
                    textView1.setText(textView1.getText().toString()+"+");
            }
        });
        button_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char findnew = textView1.getText().toString().charAt(textView1.getText().toString().length() - 1);
                if(findnew==')'||findnew=='0'||findnew=='1'||findnew=='2'||findnew=='3'||findnew=='4'
                        ||findnew=='5' ||findnew=='6'||findnew=='7'||findnew=='8'||findnew=='9')
                    textView1.setText(textView1.getText().toString()+"-");
            }
        });
        button_cheng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char findnew = textView1.getText().toString().charAt(textView1.getText().toString().length() - 1);
                if(findnew==')'||findnew=='0'||findnew=='1'||findnew=='2'||findnew=='3'||findnew=='4'
                        ||findnew=='5' ||findnew=='6'||findnew=='7'||findnew=='8'||findnew=='9')
                    textView1.setText(textView1.getText().toString()+"*");
            }
        });
        button_chu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char findnew = textView1.getText().toString().charAt(textView1.getText().toString().length() - 1);
                if(findnew==')'||findnew=='0'||findnew=='1'||findnew=='2'||findnew=='3'||findnew=='4'
                        ||findnew=='5' ||findnew=='6'||findnew=='7'||findnew=='8'||findnew=='9')
                    textView1.setText(textView1.getText().toString()+"/");
            }
        });
        button_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char findnew=textView1.getText().toString().charAt(textView1.getText().toString().length()-1);
                if(findnew=='0'||findnew=='1'||findnew=='2'||findnew=='3'||findnew=='4'
                        ||findnew=='5' ||findnew=='6'||findnew=='7'||findnew=='8'||findnew=='9')
                    textView1.setText(textView1.getText().toString()+".");
            }
        });
        //function1
        button_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView1.getText().toString().equals("0")){
                    textView1.setText("(");
                }else {
                    char findnew = textView1.getText().toString().charAt(textView1.getText().toString().length() - 1);
                    if (findnew != '0' && findnew != '1' && findnew != '2' && findnew != '3' && findnew != '4' && findnew != '5'
                            && findnew != '6' && findnew != '7' && findnew != '8' && findnew != '9' && findnew != '.') {
                        textView1.setText(textView1.getText().toString() + "(");
                    }
                }
            }
        });
        button_right.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                int numberl=appearNumber(textView1.getText().toString(),"(");
                int numberr=appearNumber(textView1.getText().toString(),")");
                char findnew=textView1.getText().toString().charAt(textView1.getText().toString().length()-1);
                if(numberr<numberl &&(findnew=='0'||findnew=='1'||findnew=='2'||findnew=='3'||findnew=='4'
                        ||findnew=='5' ||findnew=='6'||findnew=='7'||findnew=='8'||findnew=='9'))
                    textView1.setText(textView1.getText().toString()+")");
            }
            public int appearNumber(String srcText, String findText) {
                int count = 0;
                int index = 0;
                while ((index = srcText.indexOf(findText, index)) != -1) {
                    index = index + findText.length();
                    count++;
                }
                return count;
            }
        });

        //'('')'
        button_cf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char findnew=textView1.getText().toString().charAt(textView1.getText().toString().length()-1);
                if(findnew==')'||findnew=='0'||findnew=='1'||findnew=='2'||findnew=='3'||findnew=='4'
                        ||findnew=='5' ||findnew=='6'||findnew=='7'||findnew=='8'||findnew=='9'){
                    textView1.setText(textView1.getText().toString()+"^");
                }
            }
        });
        button_kf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char findnew=textView1.getText().toString().charAt(textView1.getText().toString().length()-1);
                if(textView1.getText().toString().equals("0")){
                    textView1.setText("√");
                }
                else {
                    if (findnew == '+' || findnew == '-' || findnew == '*' || findnew == '/' || findnew == '(') {
                        textView1.setText(textView1.getText().toString() + "√");
                    }
                }
            }
        });
        button_sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char findnew = textView1.getText().toString().charAt(textView1.getText().toString().length() - 1);
                if (textView1.getText().toString().equals("0")) {
                    textView1.setText("sin");
                } else {
                    if (findnew == '+' || findnew == '-' || findnew == '*' || findnew == '/' || findnew == '(') {
                        textView1.setText(textView1.getText().toString() + "sin");
                    }
                }
            }
        });
        button_cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char findnew=textView1.getText().toString().charAt(textView1.getText().toString().length()-1);
                if(textView1.getText().toString().equals("0")){
                    textView1.setText("cos");
                }
                else {
                    if (findnew == '+' || findnew == '-' || findnew == '*' || findnew == '/' || findnew == '(') {
                        textView1.setText(textView1.getText().toString() + "cos");
                    }
                }
            }
        });
        button_tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                char findnew=textView1.getText().toString().charAt(textView1.getText().toString().length()-1);
                if(textView1.getText().toString().equals("0")){
                    textView1.setText("tan");
                }
                else {
                    if (findnew == '+' || findnew == '-' || findnew == '*' || findnew == '/' || findnew == '(') {
                        textView1.setText(textView1.getText().toString() + "tan");
                    }
                }
            }
        });
        //function2
        button_re.setOnClickListener(new View.OnClickListener() {
            public double giveResult (String exp){
                String[] arr = exp.split("\\s+");
                for (String ss : arr) {
                    Log.i("d", ss);
                }
                //正则
                Stack<Double> stack = new Stack<Double>();
                for (String ss : arr) {

                    if (!(ss.equals("+") || ss.equals("-") || ss.equals("*") || ss.equals("/") || ss.equals("^") || ss.equals("c") || ss.equals("s") || ss.equals("t") || ss.equals("√"))) {
                        double kk = Double.valueOf(ss);
                        //Log.i("d",String.valueOf(kk) );
                        stack.push(kk);
                    }
                    if (ss.equals("+")) {
                        double a = stack.pop();
                        double b = stack.pop();
                        stack.push(a + b);
                    }
                    if (ss.equals("-")) {
                        double a = stack.pop();
                        double b = stack.pop();
                        stack.push(b - a);
                    }
                    if (ss.equals("*")) {
                        double a = stack.pop();
                        double b = stack.pop();
                        stack.push(a * b);
                    }
                    if (ss.equals("/")) {
                        double a = stack.pop();
                        double b = stack.pop();
                        stack.push(b / a);
                    }
                    if (ss.equals("^")) {
                        double a = stack.pop();
                        double b = stack.pop();
                        stack.push(Math.pow(b, a));
                    }
                    if (ss.equals("c")) {
                        double a = stack.pop();
                        stack.push(Math.cos(a));
                    }
                    if (ss.equals("s")) {
                        double a = stack.pop();
                        stack.push(Math.sin(a));
                    }
                    if (ss.equals("t")) {
                        double a = stack.pop();
                        stack.push(Math.tan(a));
                    }
                    if (ss.equals("√")) {
                        double a = stack.pop();
                        stack.push(Math.sqrt(a));
                    }
                }
                return stack.pop();
            }
            public int priority ( char fu){
                if (fu == '+' || fu == '-') {
                    return 1;
                }
                if (fu == '*' || fu == '/') {
                    return 2;
                }
                if (fu == '^') {
                    return 3;
                }
                if (fu == 'c' || fu == 's' || fu == 't' || fu == '√') {
                    return 4;
                }
                return 0;
            }

            public String suffixS (String inputs){
                Stack<Character> stack = new Stack<Character>();
                String suffix = "";
                int index = 0;
                int length = inputs.length();
                while (index < length) {
                    switch (inputs.charAt(index)) {

                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                        case '.':
                            suffix += inputs.charAt(index);
                            break;
                        case '√':
                            suffix += " ";
                            while (stack.size() != 0) {
                                char temp = stack.peek();
                                if (temp == '(') {
                                    break;
                                }
                                if (priority(temp) >= 4) {
                                    stack.pop();
                                    suffix += temp;
                                    suffix += " ";
                                } else {
                                    break;
                                }
                            }
                            stack.push(inputs.charAt(index));
                            break;
                        case 'c':
                        case 's':
                        case 't':
                            suffix += " ";
                            while (stack.size() != 0) {
                                char temp = stack.peek();
                                if (temp == '(') {
                                    break;
                                }
                                if (priority(temp) >= 4) {
                                    stack.pop();
                                    suffix += temp;
                                    suffix += " ";
                                } else {
                                    break;
                                }
                            }
                            stack.push(inputs.charAt(index));
                            index += 2;
                            break;
                        case '^':
                            suffix += " ";
                            while (stack.size() != 0) {
                                char temp = stack.peek();
                                if (temp == '(') {
                                    break;
                                }
                                if (priority(temp) >= 3) {
                                    stack.pop();
                                    suffix += temp;
                                    suffix += " ";
                                } else {
                                    break;
                                }
                            }
                            stack.push(inputs.charAt(index));
                            break;
                        case '*':
                        case '/':
                            suffix += " ";
                            while (stack.size() != 0) {
                                char temp2 = stack.peek();
                                if (temp2 == '(') {
                                    break;
                                }
                                if (priority(temp2) >= 2) {
                                    stack.pop();
                                    suffix += temp2;
                                    suffix += " ";
                                } else {
                                    break;
                                }

                            }
                            stack.push(inputs.charAt(index));
                            break;
                        case '(':
                            suffix += " ";
                            stack.push(inputs.charAt(index));
                            break;
                        case '+':                // 碰到'+''-'，将栈中所有运算符弹出，送到输出队列中
                        case '-':
                            suffix += " ";

                            while (stack.size() != 0) {
                                char temp = stack.peek();
                                if (temp == '(') {
                                    //stack.push('(');
                                    break;
                                }
                                if (priority(temp) >= 1) {
                                    stack.pop();
                                    suffix += temp;
                                    suffix += " ";
                                }
                            }
                            stack.push(inputs.charAt(index));
                            break;
                        case ')':
                            suffix += " ";
                            while (!stack.isEmpty() && stack.peek() != '(') {

                                suffix += stack.pop();
                                suffix += " ";

                            }
                            stack.pop();
                            break;

                    }
                    index++;
                }
                while (!stack.isEmpty()) {
                    suffix += " ";
                    suffix += stack.pop();

                }
                // Log.i("d", suffix);
                return suffix;
            }
            @Override
            public void onClick (View view){
                int numberl=appearNumber(textView1.getText().toString(),"(");
                int numberr=appearNumber(textView1.getText().toString(),")");
                char findnew=textView1.getText().toString().charAt(textView1.getText().toString().length()-1);
                if((numberl==numberr)&&(findnew=='0'||findnew=='1'||findnew=='2'||findnew=='3'||findnew=='4'
                        ||findnew=='5' ||findnew=='6'||findnew=='7'||findnew=='8'||findnew=='9'||findnew==')')) {
                    String inputs = textView1.getText().toString();
                    String out = "0+" + inputs;
                    String siffixs = suffixS(out);
                    /*for(String ss : arr){
                        System.out.println(ss);
                    }*/
                    double result = giveResult(siffixs);
                    //textView1.setText(siffixs);
                    textView2.setText(inputs + "=" + result);
                    textView1.setText(String.valueOf(result));
                }
            }
            public int appearNumber(String srcText, String findText) {
                int count = 0;
                int index = 0;
                while ((index = srcText.indexOf(findText, index)) != -1) {
                    index = index + findText.length();
                    count++;
                }
                return count;
            }
        });
    }
}
