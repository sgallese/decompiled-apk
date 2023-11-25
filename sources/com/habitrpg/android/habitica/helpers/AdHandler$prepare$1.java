package com.habitrpg.android.habitica.helpers;

import android.app.Activity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import dc.w;
import pc.l;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AdHandler.kt */
/* loaded from: classes4.dex */
public final class AdHandler$prepare$1 extends r implements pc.a<w> {
    final /* synthetic */ l<Boolean, w> $onComplete;
    final /* synthetic */ AdHandler this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AdHandler$prepare$1(AdHandler adHandler, l<? super Boolean, w> lVar) {
        super(0);
        this.this$0 = adHandler;
        this.$onComplete = lVar;
    }

    @Override // pc.a
    public /* bridge */ /* synthetic */ w invoke() {
        invoke2();
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AdRequest build = new AdRequest.Builder().build();
        q.h(build, "build(...)");
        Activity activity = this.this$0.getActivity();
        String adUnitID = this.this$0.getType().getAdUnitID();
        final AdHandler adHandler = this.this$0;
        final l<Boolean, w> lVar = this.$onComplete;
        RewardedAd.load(activity, adUnitID, build, new RewardedAdLoadCallback() { // from class: com.habitrpg.android.habitica.helpers.AdHandler$prepare$1.1
            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                q.i(loadAdError, "adError");
                com.google.firebase.crashlytics.a.a().d(new Throwable(loadAdError.getMessage()));
                l<Boolean, w> rewardAction = AdHandler.this.getRewardAction();
                Boolean bool = Boolean.FALSE;
                rewardAction.invoke(bool);
                l<Boolean, w> lVar2 = lVar;
                if (lVar2 != null) {
                    lVar2.invoke(bool);
                }
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(RewardedAd rewardedAd) {
                q.i(rewardedAd, "rewardedAd");
                AdHandler.this.rewardedAd = rewardedAd;
                AdHandler.this.configureReward();
                l<Boolean, w> lVar2 = lVar;
                if (lVar2 != null) {
                    lVar2.invoke(Boolean.TRUE);
                }
            }
        });
    }
}
