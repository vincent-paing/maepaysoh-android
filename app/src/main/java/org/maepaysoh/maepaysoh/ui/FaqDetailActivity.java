package org.maepaysoh.maepaysoh.ui;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import org.maepaysoh.maepaysoh.R;
import org.maepaysoh.maepaysoh.models.FaqDatum;

/**
 * Created by yemyatthu on 8/6/15.
 */
public class FaqDetailActivity extends BaseActivity {
  public static final String FAQ_CONSTANT = "org.maepaysoh.maepaysoh.ui.FaqDetailActivity";

  // Ui elements
  private Toolbar mToolbar;
  private View mToolbarShadow;
  private TextView mQuestion;
  private TextView mAnswer;

  private FaqDatum mFaqDatum;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_faq_detail);
    mToolbar = (Toolbar) findViewById(R.id.faq_detail_toolbar);
    mToolbarShadow = findViewById(R.id.faq_detail_toolbar_shadow);
    hideToolBarShadowForLollipop(mToolbar, mToolbarShadow);

    mQuestion = (TextView) findViewById(R.id.faq_question);
    mAnswer = (TextView) findViewById(R.id.faq_answer);
    setSupportActionBar(mToolbar);
    ActionBar mActionBar = getSupportActionBar();
    if (mActionBar != null) {
      // Showing Back Arrow  <-
      mActionBar.setDisplayHomeAsUpEnabled(true);
    }
    mFaqDatum = (FaqDatum) getIntent().getSerializableExtra(FAQ_CONSTANT);
    if (mFaqDatum != null) {
      mQuestion.setText(mFaqDatum.getQuestion());
      mAnswer.setText(mFaqDatum.getAnswer());
    }
  }

  @Override public boolean onOptionsItemSelected(MenuItem item) {
    switch (item.getItemId()) {
      case android.R.id.home:
        finish();
        return true;
      default:
        return super.onOptionsItemSelected(item);
    }
  }
}
