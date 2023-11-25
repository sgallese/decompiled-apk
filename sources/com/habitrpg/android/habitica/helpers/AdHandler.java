package com.habitrpg.android.habitica.helpers;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.habitrpg.android.habitica.helpers.AdHandler;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import dc.r;
import dc.w;
import ec.m0;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import pc.l;
import qc.q;

/* compiled from: AdHandler.kt */
/* loaded from: classes4.dex */
public final class AdHandler implements OnUserEarnedRewardListener {
    public static final String TAG = "AdHandler";
    private static SharedPreferences sharedPreferences;
    private final Activity activity;
    private final l<Boolean, w> rewardAction;
    private RewardedAd rewardedAd;
    private final AdType type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static Companion.AdStatus currentAdStatus = Companion.AdStatus.UNINITIALIZED;
    private static Map<AdType, Date> nextAdAllowed = new LinkedHashMap();

    /* compiled from: AdHandler.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AdHandler.kt */
        /* loaded from: classes4.dex */
        public static final class AdStatus {
            private static final /* synthetic */ jc.a $ENTRIES;
            private static final /* synthetic */ AdStatus[] $VALUES;
            public static final AdStatus UNINITIALIZED = new AdStatus("UNINITIALIZED", 0);
            public static final AdStatus INITIALIZING = new AdStatus("INITIALIZING", 1);
            public static final AdStatus READY = new AdStatus("READY", 2);
            public static final AdStatus DISABLED = new AdStatus("DISABLED", 3);

            private static final /* synthetic */ AdStatus[] $values() {
                return new AdStatus[]{UNINITIALIZED, INITIALIZING, READY, DISABLED};
            }

            static {
                AdStatus[] $values = $values();
                $VALUES = $values;
                $ENTRIES = jc.b.a($values);
            }

            private AdStatus(String str, int i10) {
            }

            public static jc.a<AdStatus> getEntries() {
                return $ENTRIES;
            }

            public static AdStatus valueOf(String str) {
                return (AdStatus) Enum.valueOf(AdStatus.class, str);
            }

            public static AdStatus[] values() {
                return (AdStatus[]) $VALUES.clone();
            }
        }

        /* compiled from: AdHandler.kt */
        /* loaded from: classes4.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AdStatus.values().length];
                try {
                    iArr[AdStatus.READY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AdStatus.DISABLED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AdStatus.UNINITIALIZED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AdStatus.INITIALIZING.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(qc.h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void initialize$lambda$2(pc.a aVar, InitializationStatus initializationStatus) {
            q.i(aVar, "$onComplete");
            q.i(initializationStatus, "it");
            Companion companion = AdHandler.Companion;
            AdHandler.currentAdStatus = AdStatus.READY;
            aVar.invoke();
            com.google.firebase.crashlytics.a.a().d(new Throwable("Ads Initialized"));
        }

        public final void initialize(Context context, final pc.a<w> aVar) {
            q.i(context, "context");
            q.i(aVar, "onComplete");
            if (AdHandler.currentAdStatus == AdStatus.UNINITIALIZED) {
                AdHandler.currentAdStatus = AdStatus.INITIALIZING;
                MobileAds.initialize(context, new OnInitializationCompleteListener() { // from class: com.habitrpg.android.habitica.helpers.a
                    @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
                    public final void onInitializationComplete(InitializationStatus initializationStatus) {
                        AdHandler.Companion.initialize$lambda$2(pc.a.this, initializationStatus);
                    }
                });
            }
        }

        public final boolean isAllowed(AdType adType) {
            q.i(adType, TaskFormActivity.TASK_TYPE_KEY);
            Date nextAdAllowedDate = nextAdAllowedDate(adType);
            if (nextAdAllowedDate == null || !nextAdAllowedDate.after(new Date())) {
                return false;
            }
            return true;
        }

        public final Date nextAdAllowedDate(AdType adType) {
            q.i(adType, TaskFormActivity.TASK_TYPE_KEY);
            return (Date) AdHandler.nextAdAllowed.get(adType);
        }

        public final void setNextAllowedDate(AdType adType) {
            q.i(adType, TaskFormActivity.TASK_TYPE_KEY);
            Date cooldownTime = adType.getCooldownTime();
            SharedPreferences sharedPreferences = null;
            if (cooldownTime != null) {
                AdHandler.nextAdAllowed.put(adType, cooldownTime);
                SharedPreferences sharedPreferences2 = AdHandler.sharedPreferences;
                if (sharedPreferences2 == null) {
                    q.z("sharedPreferences");
                } else {
                    sharedPreferences = sharedPreferences2;
                }
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putLong("nextAd" + adType.name(), cooldownTime.getTime());
                edit.apply();
                return;
            }
            AdHandler.nextAdAllowed.remove(adType);
            SharedPreferences sharedPreferences3 = AdHandler.sharedPreferences;
            if (sharedPreferences3 == null) {
                q.z("sharedPreferences");
            } else {
                sharedPreferences = sharedPreferences3;
            }
            SharedPreferences.Editor edit2 = sharedPreferences.edit();
            edit2.remove("nextAd" + adType.name());
            edit2.apply();
        }

        public final void setup(SharedPreferences sharedPreferences) {
            q.i(sharedPreferences, "sharedPrefs");
            AdHandler.sharedPreferences = sharedPreferences;
            for (AdType adType : AdType.values()) {
                long j10 = sharedPreferences.getLong("nextAd" + adType.name(), 0L);
                if (j10 > 0) {
                    AdHandler.nextAdAllowed.put(adType, new Date(j10));
                }
            }
        }

        public final void whenAdsInitialized(Context context, pc.a<w> aVar) {
            q.i(context, "context");
            q.i(aVar, "onComplete");
            int i10 = WhenMappings.$EnumSwitchMapping$0[AdHandler.currentAdStatus.ordinal()];
            if (i10 != 1) {
                if (i10 == 3) {
                    initialize(context, new AdHandler$Companion$whenAdsInitialized$1(aVar));
                    return;
                }
                return;
            }
            aVar.invoke();
        }
    }

    /* compiled from: AdHandler.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Companion.AdStatus.values().length];
            try {
                iArr[Companion.AdStatus.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Companion.AdStatus.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Companion.AdStatus.UNINITIALIZED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Companion.AdStatus.INITIALIZING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdHandler(Activity activity, AdType adType, l<? super Boolean, w> lVar) {
        q.i(activity, "activity");
        q.i(adType, TaskFormActivity.TASK_TYPE_KEY);
        q.i(lVar, "rewardAction");
        this.activity = activity;
        this.type = adType;
        this.rewardAction = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void prepare$default(AdHandler adHandler, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = null;
        }
        adHandler.prepare(lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showRewardedAd() {
        Companion companion = Companion;
        Date nextAdAllowedDate = companion.nextAdAllowedDate(this.type);
        boolean z10 = false;
        if (nextAdAllowedDate != null && nextAdAllowedDate.after(new Date())) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        RewardedAd rewardedAd = this.rewardedAd;
        if (rewardedAd != null) {
            if (rewardedAd != null) {
                rewardedAd.show(this.activity, this);
            }
            companion.setNextAllowedDate(this.type);
            return;
        }
        Log.d(TAG, "The rewarded ad wasn't ready yet.");
    }

    public final Activity getActivity() {
        return this.activity;
    }

    public final l<Boolean, w> getRewardAction() {
        return this.rewardAction;
    }

    public final AdType getType() {
        return this.type;
    }

    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
    public void onUserEarnedReward(RewardItem rewardItem) {
        Map e10;
        q.i(rewardItem, "rewardItem");
        Analytics analytics = Analytics.INSTANCE;
        EventCategory eventCategory = EventCategory.BEHAVIOUR;
        HitType hitType = HitType.EVENT;
        e10 = m0.e(r.a(TaskFormActivity.TASK_TYPE_KEY, this.type.name()));
        Analytics.sendEvent$default(analytics, "adRewardEarned", eventCategory, hitType, e10, null, 16, null);
        FirebaseAnalytics.getInstance(this.activity).a("adRewardEarned", androidx.core.os.e.a(new dc.l(TaskFormActivity.TASK_TYPE_KEY, this.type.name())));
        this.rewardAction.invoke(Boolean.TRUE);
    }

    public final void prepare(l<? super Boolean, w> lVar) {
        Companion.whenAdsInitialized(this.activity, new AdHandler$prepare$1(this, lVar));
    }

    public final void show() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[currentAdStatus.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    Companion.initialize(this.activity, new AdHandler$show$1(this));
                    return;
                }
                return;
            }
            this.rewardAction.invoke(Boolean.FALSE);
            return;
        }
        showRewardedAd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureReward() {
    }
}
