package com.habitrpg.android.habitica.ui.activities;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.api.MaintenanceApiService;
import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.databinding.ActivityMaintenanceBinding;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import com.habitrpg.common.habitica.helpers.MarkdownParserKt;

/* compiled from: MaintenanceActivity.kt */
/* loaded from: classes4.dex */
public final class MaintenanceActivity extends Hilt_MaintenanceActivity {
    public static final int $stable = 8;
    public ApiClient apiClient;
    private ActivityMaintenanceBinding binding;
    private boolean isDeprecationNotice;
    public MaintenanceApiService maintenanceService;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(MaintenanceActivity maintenanceActivity, View view) {
        qc.q.i(maintenanceActivity, "this$0");
        maintenanceActivity.openInPlayStore();
    }

    private final void openInPlayStore() {
        String packageName = getPackageName();
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + packageName)));
        } catch (ActivityNotFoundException unused) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + packageName)));
        }
    }

    public final ApiClient getApiClient() {
        ApiClient apiClient = this.apiClient;
        if (apiClient != null) {
            return apiClient;
        }
        qc.q.z("apiClient");
        return null;
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity
    public View getContentView(Integer num) {
        ActivityMaintenanceBinding inflate = ActivityMaintenanceBinding.inflate(getLayoutInflater());
        qc.q.h(inflate, "inflate(...)");
        this.binding = inflate;
        if (inflate == null) {
            qc.q.z("binding");
            inflate = null;
        }
        ScrollView root = inflate.getRoot();
        qc.q.h(root, "getRoot(...)");
        return root;
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity
    protected Integer getLayoutResId() {
        return Integer.valueOf((int) R.layout.activity_maintenance);
    }

    public final MaintenanceApiService getMaintenanceService() {
        MaintenanceApiService maintenanceApiService = this.maintenanceService;
        if (maintenanceApiService != null) {
            return maintenanceApiService;
        }
        qc.q.z("maintenanceService");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, androidx.fragment.app.q, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        Uri uri;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }
        ActivityMaintenanceBinding activityMaintenanceBinding = this.binding;
        ActivityMaintenanceBinding activityMaintenanceBinding2 = null;
        if (activityMaintenanceBinding == null) {
            qc.q.z("binding");
            activityMaintenanceBinding = null;
        }
        activityMaintenanceBinding.titleTextView.setText(extras.getString("title"));
        ActivityMaintenanceBinding activityMaintenanceBinding3 = this.binding;
        if (activityMaintenanceBinding3 == null) {
            qc.q.z("binding");
            activityMaintenanceBinding3 = null;
        }
        ImageView imageView = activityMaintenanceBinding3.imageView;
        String string = extras.getString("imageUrl");
        if (string != null) {
            uri = Uri.parse(string);
        } else {
            uri = null;
        }
        imageView.setImageURI(uri);
        ActivityMaintenanceBinding activityMaintenanceBinding4 = this.binding;
        if (activityMaintenanceBinding4 == null) {
            qc.q.z("binding");
            activityMaintenanceBinding4 = null;
        }
        TextView textView = activityMaintenanceBinding4.descriptionTextView;
        qc.q.h(textView, "descriptionTextView");
        MarkdownParserKt.setMarkdown(textView, extras.getString("description"));
        ActivityMaintenanceBinding activityMaintenanceBinding5 = this.binding;
        if (activityMaintenanceBinding5 == null) {
            qc.q.z("binding");
            activityMaintenanceBinding5 = null;
        }
        activityMaintenanceBinding5.descriptionTextView.setMovementMethod(LinkMovementMethod.getInstance());
        boolean z10 = extras.getBoolean("deprecationNotice");
        this.isDeprecationNotice = z10;
        if (z10) {
            ActivityMaintenanceBinding activityMaintenanceBinding6 = this.binding;
            if (activityMaintenanceBinding6 == null) {
                qc.q.z("binding");
                activityMaintenanceBinding6 = null;
            }
            activityMaintenanceBinding6.playStoreButton.setVisibility(0);
        } else {
            ActivityMaintenanceBinding activityMaintenanceBinding7 = this.binding;
            if (activityMaintenanceBinding7 == null) {
                qc.q.z("binding");
                activityMaintenanceBinding7 = null;
            }
            activityMaintenanceBinding7.playStoreButton.setVisibility(8);
        }
        ActivityMaintenanceBinding activityMaintenanceBinding8 = this.binding;
        if (activityMaintenanceBinding8 == null) {
            qc.q.z("binding");
        } else {
            activityMaintenanceBinding2 = activityMaintenanceBinding8;
        }
        activityMaintenanceBinding2.playStoreButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.activities.r1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MaintenanceActivity.onCreate$lambda$0(MaintenanceActivity.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, androidx.fragment.app.q, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!this.isDeprecationNotice) {
            ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this), null, new MaintenanceActivity$onResume$1(this, null), 1, null);
        }
    }

    public final void setApiClient(ApiClient apiClient) {
        qc.q.i(apiClient, "<set-?>");
        this.apiClient = apiClient;
    }

    public final void setMaintenanceService(MaintenanceApiService maintenanceApiService) {
        qc.q.i(maintenanceApiService, "<set-?>");
        this.maintenanceService = maintenanceApiService;
    }
}
