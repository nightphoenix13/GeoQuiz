package com.bignerdranch.android.geoquiz;

public class TrueFalse
{
	private int mQuestion;
	private boolean mTrueQuestion;
	
	public TrueFalse(int question, boolean trueQuestion)
	{
		setClass(question, trueQuestion);		
	} // TrueFalse method end
	
	private void setClass(int q, boolean tq) // class set method start
	{
		setQuestion(q);
		setTrueQuestion(tq);
	} // class set method end
	
	public void setQuestion(int q) // mQuestion set method start
	{
		mQuestion = q;
	} // mQuestion set method end
	
	public void setTrueQuestion(boolean tq) // mTrueQuestion set method start
	{
		mTrueQuestion = tq;
	} // mTrueQuestion set method end
	
	public int getQuestion() // mQuestion get method start
	{
		return mQuestion;
	} // mQuestion get method end
	
	public boolean isTrueQuestion() // mTrueQuestion get method start
	{
		return mTrueQuestion;
	} // mTrueQuestion get method end
}
