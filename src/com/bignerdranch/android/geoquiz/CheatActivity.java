package com.bignerdranch.android.geoquiz;

import android.app.*;
import android.content.Intent;
import android.os.*;
import android.util.Log;
import android.view.*;
import android.view.View.*;
import android.widget.*;

public class CheatActivity extends Activity
{
	
	public static final String EXTRA_ANSWER_IS_TRUE = 
			"com.bignerdranch.andriod.geoquiz.answer_is_true";
	public static final String EXTRA_ANSWER_SHOWN = 
			"com.bignerdranch.android.geoquiz.answer_shown";
	private boolean mAnswerIsTrue;
	private TextView mAnswerTextView;
	private Button mShowAnswer;
	
	private static final String TAG = "CheatActivity";
	private static final String CHEAT_RESULT = "cheat_result";
	
	private void setAnswerShownResult(boolean isAnswerShown)
	{
		Intent data = new Intent();
		data.putExtra(EXTRA_ANSWER_SHOWN, isAnswerShown);
		setResult(RESULT_OK, data);
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cheat);
		setAnswerShownResult(false);
		
		mAnswerIsTrue = getIntent().getBooleanExtra(EXTRA_ANSWER_IS_TRUE, false);
		
		mAnswerTextView = (TextView)findViewById(R.id.answerTextView);
		
		mShowAnswer = (Button)findViewById(R.id.showAnswerButton);
		mShowAnswer.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				if (mAnswerIsTrue)
				{
					mAnswerTextView.setText(R.string.true_button);
				} // end if
				else
				{
					mAnswerTextView.setText(R.string.false_button);
				} // end else
				setAnswerShownResult(true);
			}
		});
		
		if (savedInstanceState != null)
		{
			mAnswerIsTrue = savedInstanceState.getBoolean(CHEAT_RESULT);
		}
	}
	
	@Override
	public void onSaveInstanceState(Bundle savedInstanceState)
	{
		super.onSaveInstanceState(savedInstanceState);
		Log.i(TAG, "onSaveInstanceState");
		savedInstanceState.putBoolean(CHEAT_RESULT, mAnswerIsTrue);
	}

} // Cheat Activity class end
