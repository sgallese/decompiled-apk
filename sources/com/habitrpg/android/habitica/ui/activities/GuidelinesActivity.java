package com.habitrpg.android.habitica.ui.activities;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.habitrpg.android.habitica.R;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* compiled from: GuidelinesActivity.kt */
/* loaded from: classes4.dex */
public final class GuidelinesActivity extends Hilt_GuidelinesActivity {
    public static final int $stable = 0;

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity
    protected Integer getLayoutResId() {
        return Integer.valueOf((int) R.layout.activity_guidelines);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, androidx.fragment.app.q, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setupToolbar((Toolbar) findViewById(R.id.toolbar));
        FirebasePerfOkHttpClient.enqueue(new OkHttpClient().newCall(new Request.Builder().url("https://s3.amazonaws.com/habitica-assets/mobileApp/endpoint/community-guidelines.md").build()), new GuidelinesActivity$onCreate$1(this));
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        qc.q.i(menuItem, "item");
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
