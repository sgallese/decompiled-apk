package com.habitrpg.android.habitica.helpers;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.play.core.review.ReviewInfo;
import qc.q;

/* compiled from: ReviewManager.kt */
/* loaded from: classes4.dex */
public final class ReviewManager {
    private static final String INITIAL_CHECKINS_KEY = "InitialCheckins";
    private static final String LAST_REVIEW_CHECKIN_KEY = "LastReviewCheckin";
    private static final String REVIEW_REQUEST_COUNT_KEY = "ReviewRequestCount";
    private static final String SHOULD_QUEUE_REVIEW = "ShouldQueueReview";
    private final AppConfigManager configManager;
    private final z7.a reviewManager;
    private final SharedPreferences sharedPref;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ReviewManager.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(qc.h hVar) {
            this();
        }
    }

    public ReviewManager(Context context, AppConfigManager appConfigManager) {
        q.i(context, "context");
        q.i(appConfigManager, "configManager");
        this.configManager = appConfigManager;
        z7.a a10 = com.google.android.play.core.review.a.a(context);
        q.h(a10, "create(...)");
        this.reviewManager = a10;
        this.sharedPref = context.getSharedPreferences("ReviewPrefs", 0);
    }

    private final boolean canRequestReview(int i10) {
        if (!this.configManager.enableReviewPrompt()) {
            return false;
        }
        int i11 = this.sharedPref.getInt(INITIAL_CHECKINS_KEY, -1);
        boolean z10 = this.sharedPref.getBoolean(SHOULD_QUEUE_REVIEW, false);
        int i12 = this.sharedPref.getInt(LAST_REVIEW_CHECKIN_KEY, -1);
        if (!z10) {
            SharedPreferences sharedPreferences = this.sharedPref;
            q.h(sharedPreferences, "sharedPref");
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean(SHOULD_QUEUE_REVIEW, true);
            edit.apply();
        }
        if (i11 == -1) {
            SharedPreferences sharedPreferences2 = this.sharedPref;
            q.h(sharedPreferences2, "sharedPref");
            SharedPreferences.Editor edit2 = sharedPreferences2.edit();
            edit2.putInt(INITIAL_CHECKINS_KEY, i10);
            edit2.apply();
            return true;
        } else if (this.sharedPref.getInt(REVIEW_REQUEST_COUNT_KEY, 0) >= 5 || i10 - i11 > 75) {
            return false;
        } else {
            if (i12 != -1 && i10 - i12 < 5) {
                return false;
            }
            return true;
        }
    }

    private final void incrementReviewRequestCount() {
        int i10 = this.sharedPref.getInt(REVIEW_REQUEST_COUNT_KEY, 0);
        SharedPreferences sharedPreferences = this.sharedPref;
        q.h(sharedPreferences, "sharedPref");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt(REVIEW_REQUEST_COUNT_KEY, i10 + 1);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestReview$lambda$3(final ReviewManager reviewManager, androidx.appcompat.app.d dVar, c8.d dVar2) {
        q.i(reviewManager, "this$0");
        q.i(dVar, "$activity");
        q.i(dVar2, "task");
        if (dVar2.g()) {
            Object e10 = dVar2.e();
            q.h(e10, "getResult(...)");
            c8.d<Void> a10 = reviewManager.reviewManager.a(dVar, (ReviewInfo) e10);
            q.h(a10, "launchReviewFlow(...)");
            a10.a(new c8.a() { // from class: com.habitrpg.android.habitica.helpers.b
                @Override // c8.a
                public final void a(c8.d dVar3) {
                    ReviewManager.requestReview$lambda$3$lambda$2(ReviewManager.this, dVar3);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestReview$lambda$3$lambda$2(ReviewManager reviewManager, c8.d dVar) {
        q.i(reviewManager, "this$0");
        q.i(dVar, "<anonymous parameter 0>");
        reviewManager.incrementReviewRequestCount();
    }

    public final void requestReview(final androidx.appcompat.app.d dVar, int i10) {
        q.i(dVar, "activity");
        if (!canRequestReview(i10)) {
            return;
        }
        c8.d<ReviewInfo> b10 = this.reviewManager.b();
        q.h(b10, "requestReviewFlow(...)");
        b10.a(new c8.a() { // from class: com.habitrpg.android.habitica.helpers.c
            @Override // c8.a
            public final void a(c8.d dVar2) {
                ReviewManager.requestReview$lambda$3(ReviewManager.this, dVar, dVar2);
            }
        });
        SharedPreferences sharedPreferences = this.sharedPref;
        q.h(sharedPreferences, "sharedPref");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt(LAST_REVIEW_CHECKIN_KEY, i10);
        edit.apply();
    }
}
