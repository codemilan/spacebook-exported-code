package com.example.project;
import android.support.v7.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.example.project.R;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.support.constraint.ConstraintLayout;
import android.widget.Switch;
import android.view.Menu;
import android.support.v7.widget.Toolbar;
/**
 *  Created by Artem.
 */
public class SignupVC extends AppCompatActivity {

	private ConstraintLayout signup;
	private TextView signUpLabel;
	private TextView itSFreeLabel;
	private ConstraintLayout signUpFields;
	private EditText yourNicknameTF;
	private EditText yourSpacemailTF;
	private EditText passwordTF;
	private View signUp;
	private TextView alreadyGaveUpYourLabel;
	private View logInButton;
	private TextView iAgreeWithIntergaLabel;
	public static Intent newIntent(Context context) {
		return new Intent(context, SignupVC.class);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.signup_vc);
		this.init();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.menu_signup, menu);
		return true;
	}

	public void setupToolbar() {
		Toolbar toolbar = (Toolbar) findViewById(R.id.activity_signup_vc_toolbar);
		setSupportActionBar(toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
	}

	public void init() {
		signup = this.findViewById(R.id.signup);
		signUpLabel = this.findViewById(R.id.sign_up_label);
		itSFreeLabel = this.findViewById(R.id.it_sfree_label);
		signUpFields = this.findViewById(R.id.sign_up_fields);
		yourNicknameTF = this.findViewById(R.id.your_nickname_tf);
		yourSpacemailTF = this.findViewById(R.id.your_spacemail_tf);
		passwordTF = this.findViewById(R.id.password_tf);
		signUp = this.findViewById(R.id.sign_up);
		alreadyGaveUpYourLabel = this.findViewById(R.id.already_gave_up_your_label);
		logInButton = this.findViewById(R.id.log_in_button);
		iAgreeWithIntergaLabel = this.findViewById(R.id.i_agree_with_interga_label);
		signUp.setOnClickListener(view -> {
			onSignUpPressed();
		});
		logInButton.setOnClickListener(view -> {
			onLogInPressed();
		});
		this.findViewById(R.id.switch_two).setOnClickListener(view -> {
			onSwitchValueChanged();
		});
		this.setupToolbar();
	}

	public void onLogInPressed() {
		this.startLoginVC();
	}

	public void onSwitchValueChanged() {

	}

	public void onSignUpPressed() {
		this.startTabBarHolderActivityOne();
	}

	public void startTabBarHolderActivityOne() {
		this.startActivity(TabBarHolderActivityOne.newIntent(this));
	}

	public void startLoginVC() {
		this.startActivity(LoginVC.newIntent(this));
	}


}
