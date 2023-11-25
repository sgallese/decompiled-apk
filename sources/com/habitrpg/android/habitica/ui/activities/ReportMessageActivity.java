package com.habitrpg.android.habitica.ui.activities;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.databinding.ActivityReportMessageBinding;
import com.habitrpg.android.habitica.ui.helpers.KeyboardUtilKt;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.MarkdownParserKt;

/* compiled from: ReportMessageActivity.kt */
/* loaded from: classes4.dex */
public final class ReportMessageActivity extends Hilt_ReportMessageActivity {
    public static final int $stable = 8;
    private ActivityReportMessageBinding binding;
    private String groupID;
    private boolean isReporting;
    private String messageID;
    private float raisedElevation;
    public SocialRepository socialRepository;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onCreate$lambda$0(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(ReportMessageActivity reportMessageActivity, View view) {
        qc.q.i(reportMessageActivity, "this$0");
        reportMessageActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$2(ReportMessageActivity reportMessageActivity, View view) {
        qc.q.i(reportMessageActivity, "this$0");
        reportMessageActivity.reportMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$3(ReportMessageActivity reportMessageActivity, View view) {
        qc.q.i(reportMessageActivity, "this$0");
        reportMessageActivity.finish();
    }

    private final void reportMessage() {
        if (this.isReporting) {
            return;
        }
        this.isReporting = true;
        if (this.messageID != null) {
            ad.i.d(androidx.lifecycle.w.a(this), ExceptionHandler.Companion.coroutine(new ReportMessageActivity$reportMessage$1$1(this)), null, new ReportMessageActivity$reportMessage$1$2(this, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setStatusBarDim(boolean z10) {
        if (z10) {
            ActivityReportMessageBinding activityReportMessageBinding = this.binding;
            if (activityReportMessageBinding == null) {
                qc.q.z("binding");
                activityReportMessageBinding = null;
            }
            activityReportMessageBinding.appBar.setElevation(0.0f);
            getWindow().setStatusBarColor(ContextExtensionsKt.getThemeColor(this, R.attr.colorPrimaryDark));
            ActivityReportMessageBinding activityReportMessageBinding2 = this.binding;
            if (activityReportMessageBinding2 == null) {
                qc.q.z("binding");
                activityReportMessageBinding2 = null;
            }
            activityReportMessageBinding2.closeButton.setVisibility(8);
            ActivityReportMessageBinding activityReportMessageBinding3 = this.binding;
            if (activityReportMessageBinding3 == null) {
                qc.q.z("binding");
                activityReportMessageBinding3 = null;
            }
            activityReportMessageBinding3.toolbarTitle.setTypeface(null, 1);
        } else {
            ActivityReportMessageBinding activityReportMessageBinding4 = this.binding;
            if (activityReportMessageBinding4 == null) {
                qc.q.z("binding");
                activityReportMessageBinding4 = null;
            }
            activityReportMessageBinding4.appBar.setElevation(8.0f);
            getWindow().setStatusBarColor(androidx.core.content.a.c(this, R.color.offset_background));
            ActivityReportMessageBinding activityReportMessageBinding5 = this.binding;
            if (activityReportMessageBinding5 == null) {
                qc.q.z("binding");
                activityReportMessageBinding5 = null;
            }
            activityReportMessageBinding5.closeButton.setVisibility(0);
            ActivityReportMessageBinding activityReportMessageBinding6 = this.binding;
            if (activityReportMessageBinding6 == null) {
                qc.q.z("binding");
                activityReportMessageBinding6 = null;
            }
            activityReportMessageBinding6.toolbarTitle.setTypeface(null, 0);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            setSystemBarTheme(z10);
        }
    }

    @Override // android.app.Activity
    public void finish() {
        KeyboardUtilKt.dismissKeyboard(this);
        super.finish();
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity
    public View getContentView(Integer num) {
        ActivityReportMessageBinding inflate = ActivityReportMessageBinding.inflate(getLayoutInflater());
        qc.q.h(inflate, "inflate(...)");
        this.binding = inflate;
        if (inflate == null) {
            qc.q.z("binding");
            inflate = null;
        }
        CoordinatorLayout root = inflate.getRoot();
        qc.q.h(root, "getRoot(...)");
        return root;
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity
    protected Integer getLayoutResId() {
        return Integer.valueOf((int) R.layout.activity_report_message);
    }

    public final SocialRepository getSocialRepository() {
        SocialRepository socialRepository = this.socialRepository;
        if (socialRepository != null) {
            return socialRepository;
        }
        qc.q.z("socialRepository");
        return null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, androidx.fragment.app.q, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityReportMessageBinding activityReportMessageBinding = this.binding;
        ActivityReportMessageBinding activityReportMessageBinding2 = null;
        if (activityReportMessageBinding == null) {
            qc.q.z("binding");
            activityReportMessageBinding = null;
        }
        setSupportActionBar(activityReportMessageBinding.toolbar);
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.E("");
        }
        ActivityReportMessageBinding activityReportMessageBinding3 = this.binding;
        if (activityReportMessageBinding3 == null) {
            qc.q.z("binding");
            activityReportMessageBinding3 = null;
        }
        this.raisedElevation = activityReportMessageBinding3.appBar.getElevation();
        setStatusBarDim(true);
        ActivityReportMessageBinding activityReportMessageBinding4 = this.binding;
        if (activityReportMessageBinding4 == null) {
            qc.q.z("binding");
            activityReportMessageBinding4 = null;
        }
        activityReportMessageBinding4.bottomSheet.setOnTouchListener(new View.OnTouchListener() { // from class: com.habitrpg.android.habitica.ui.activities.z1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean onCreate$lambda$0;
                onCreate$lambda$0 = ReportMessageActivity.onCreate$lambda$0(view, motionEvent);
                return onCreate$lambda$0;
            }
        });
        ActivityReportMessageBinding activityReportMessageBinding5 = this.binding;
        if (activityReportMessageBinding5 == null) {
            qc.q.z("binding");
            activityReportMessageBinding5 = null;
        }
        activityReportMessageBinding5.touchOutside.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.activities.a2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReportMessageActivity.onCreate$lambda$1(ReportMessageActivity.this, view);
            }
        });
        ActivityReportMessageBinding activityReportMessageBinding6 = this.binding;
        if (activityReportMessageBinding6 == null) {
            qc.q.z("binding");
            activityReportMessageBinding6 = null;
        }
        TextView textView = activityReportMessageBinding6.reportExplanationTextview;
        qc.q.h(textView, "reportExplanationTextview");
        MarkdownParserKt.setMarkdown(textView, getString(R.string.report_explanation));
        ActivityReportMessageBinding activityReportMessageBinding7 = this.binding;
        if (activityReportMessageBinding7 == null) {
            qc.q.z("binding");
            activityReportMessageBinding7 = null;
        }
        BottomSheetBehavior.k0(activityReportMessageBinding7.bottomSheet).Y(new BottomSheetBehavior.f() { // from class: com.habitrpg.android.habitica.ui.activities.ReportMessageActivity$onCreate$3
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
            public void onSlide(View view, float f10) {
                qc.q.i(view, "bottomSheet");
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
            @SuppressLint({"SwitchIntDef"})
            public void onStateChanged(View view, int i10) {
                qc.q.i(view, "bottomSheet");
                if (i10 == 3) {
                    ReportMessageActivity.this.setStatusBarDim(false);
                } else if (i10 != 5) {
                    ReportMessageActivity.this.setStatusBarDim(true);
                } else {
                    ReportMessageActivity.this.finish();
                }
            }
        });
        ReportMessageActivityArgs reportMessageActivityArgs = (ReportMessageActivityArgs) new k3.g(qc.g0.b(ReportMessageActivityArgs.class), new ReportMessageActivity$onCreate$$inlined$navArgs$1(this)).getValue();
        this.messageID = reportMessageActivityArgs.getMessageID();
        this.groupID = reportMessageActivityArgs.getGroupID();
        ActivityReportMessageBinding activityReportMessageBinding8 = this.binding;
        if (activityReportMessageBinding8 == null) {
            qc.q.z("binding");
            activityReportMessageBinding8 = null;
        }
        activityReportMessageBinding8.titleTextView.setText(getString(R.string.report_message_title, reportMessageActivityArgs.getProfileName()));
        ActivityReportMessageBinding activityReportMessageBinding9 = this.binding;
        if (activityReportMessageBinding9 == null) {
            qc.q.z("binding");
            activityReportMessageBinding9 = null;
        }
        activityReportMessageBinding9.messageTextView.setText(reportMessageActivityArgs.getText());
        ActivityReportMessageBinding activityReportMessageBinding10 = this.binding;
        if (activityReportMessageBinding10 == null) {
            qc.q.z("binding");
            activityReportMessageBinding10 = null;
        }
        activityReportMessageBinding10.reportButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.activities.b2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReportMessageActivity.onCreate$lambda$2(ReportMessageActivity.this, view);
            }
        });
        ActivityReportMessageBinding activityReportMessageBinding11 = this.binding;
        if (activityReportMessageBinding11 == null) {
            qc.q.z("binding");
        } else {
            activityReportMessageBinding2 = activityReportMessageBinding11;
        }
        activityReportMessageBinding2.closeButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.activities.c2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReportMessageActivity.onCreate$lambda$3(ReportMessageActivity.this, view);
            }
        });
    }

    public final void setSocialRepository(SocialRepository socialRepository) {
        qc.q.i(socialRepository, "<set-?>");
        this.socialRepository = socialRepository;
    }

    public final void setSystemBarTheme(boolean z10) {
        int i10;
        int systemUiVisibility = getWindow().getDecorView().getSystemUiVisibility();
        View decorView = getWindow().getDecorView();
        if (z10) {
            i10 = systemUiVisibility & (-8193);
        } else {
            i10 = systemUiVisibility | 8192;
        }
        decorView.setSystemUiVisibility(i10);
    }
}
